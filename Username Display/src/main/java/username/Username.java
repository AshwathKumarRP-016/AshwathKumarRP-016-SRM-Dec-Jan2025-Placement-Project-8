package username;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet("/greet")
public class Username extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
      
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        
        
        String username = request.getParameter("username");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome Message</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<style>");
        out.println("body {");
        out.println("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        out.println("    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);");
        out.println("    height: 100vh;");
        out.println("    display: flex;");
        out.println("    justify-content: center;");
        out.println("    align-items: center;");
        out.println("    margin: 0;");
        out.println("}");
        out.println(".container {");
        out.println("    background: white;");
        out.println("    padding: 50px;");
        out.println("    border-radius: 20px;");
        out.println("    box-shadow: 0 25px 50px rgba(0, 0, 0, 0.2);");
        out.println("    text-align: center;");
        out.println("    width: 450px;");
        out.println("}");
        out.println("h1 {");
        out.println("    color: #333;");
        out.println("    margin-bottom: 20px;");
        out.println("    font-size: 32px;");
        out.println("}");
        out.println(".welcome-message {");
        out.println("    background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);");
        out.println("    -webkit-background-clip: text;");
        out.println("    -webkit-text-fill-color: transparent;");
        out.println("    background-clip: text;");
        out.println("    font-size: 36px;");
        out.println("    font-weight: 700;");
        out.println("    margin: 30px 0;");
        out.println("    padding: 20px;");
        out.println("    border-radius: 10px;");
        out.println("    background-color: #f8f9fa;");
        out.println("}");
        out.println(".username {");
        out.println("    color: #667eea;");
        out.println("    font-weight: 800;");
        out.println("    text-transform: capitalize;");
        out.println("}");
        out.println(".message-box {");
        out.println("    background: #f8f9fa;");
        out.println("    padding: 25px;");
        out.println("    border-radius: 12px;");
        out.println("    margin: 30px 0;");
        out.println("    border-left: 5px solid #667eea;");
        out.println("}");
        out.println(".icon {");
        out.println("    font-size: 60px;");
        out.println("    color: #667eea;");
        out.println("    margin-bottom: 20px;");
        out.println("}");
        out.println(".time-info {");
        out.println("    color: #666;");
        out.println("    font-size: 14px;");
        out.println("    margin: 15px 0;");
        out.println("}");
        out.println(".back-btn {");
        out.println("    background: linear-gradient(to right, #667eea, #764ba2);");
        out.println("    color: white;");
        out.println("    border: none;");
        out.println("    padding: 15px 40px;");
        out.println("    border-radius: 8px;");
        out.println("    font-size: 16px;");
        out.println("    font-weight: 600;");
        out.println("    cursor: pointer;");
        out.println("    text-decoration: none;");
        out.println("    display: inline-block;");
        out.println("    margin-top: 20px;");
        out.println("    transition: all 0.3s;");
        out.println("}");
        out.println(".back-btn:hover {");
        out.println("    transform: translateY(-3px);");
        out.println("    box-shadow: 0 10px 25px rgba(102, 126, 234, 0.4);");
        out.println("}");
        out.println(".details {");
        out.println("    background: #eef2ff;");
        out.println("    padding: 15px;");
        out.println("    border-radius: 8px;");
        out.println("    margin-top: 25px;");
        out.println("    font-size: 14px;");
        out.println("    color: #555;");
        out.println("}");
        out.println("</style>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        
        out.println("<div class='icon'>");
        out.println("<i class='fas fa-hand-peace'></i>");
        out.println("</div>");
        
        out.println("<h1>Welcome Message</h1>");
        
        
        if (username != null && !username.trim().isEmpty()) {
            String trimmedUsername = username.trim();
            
          
            java.time.LocalTime currentTime = java.time.LocalTime.now();
            String timeGreeting = "";
            
            if (currentTime.isBefore(java.time.LocalTime.NOON)) {
                timeGreeting = "Good Morning";
            } else if (currentTime.isBefore(java.time.LocalTime.of(17, 0))) {
                timeGreeting = "Good Afternoon";
            } else if (currentTime.isBefore(java.time.LocalTime.of(20, 0))) {
                timeGreeting = "Good Evening";
            } else {
                timeGreeting = "Good Night";
            }
            
            out.println("<div class='message-box'>");
            out.println("<p class='time-info'>" + timeGreeting + "!</p>");
            
            out.println("<div class='welcome-message'>");
            out.println("Welcome, <span class='username'>" + trimmedUsername + "</span>!");
            out.println("</div>");
            
            out.println("<p style='color: #666; margin-top: 20px;'>");
            out.println("We're glad to have you here. Hope you have a wonderful experience!");
            out.println("</p>");
            out.println("</div>");
            
            
            out.println("<div class='details'>");
            out.println("<p><i class='fas fa-clock'></i> Current Time: " + 
                       java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("hh:mm a")) + "</p>");
            out.println("<p><i class='fas fa-calendar'></i> Date: " + 
                       java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy")) + "</p>");
            
            out.println("</div>");
            
        } else {
            
            out.println("<div style='background: #ffeaa7; padding: 25px; border-radius: 10px;'>");
            out.println("<h3 style='color: #d63031;'><i class='fas fa-exclamation-triangle'></i> No Username Provided</h3>");
            out.println("<p>Please go back and enter your username to receive a personalized greeting.</p>");
            out.println("</div>");
        }
        
        
        out.println("<a href='Gretting.html' class='back-btn'>");
        out.println("<i class='fas fa-arrow-left'></i> Enter Another Username");
        out.println("</a>");
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
}
