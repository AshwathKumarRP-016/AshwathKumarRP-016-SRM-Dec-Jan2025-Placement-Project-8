# Username Display Servlet - Personalized Greeting System

CLICK Username Display --> CLICK src --> CLICK main --> CLICK java --> username --> SERVLET Username.java FILE  | CLICK webapp ---> Gretting.html


## 📋 Project Overview
A Java Servlet-based web application that displays personalized welcome greetings. Users enter their username through an HTML form, and the servlet responds with a customized welcome message. This project demonstrates basic client-server communication using HTTP requests and responses without database operations.

## 🎯 Features
- **Personalized Greeting**: Displays "Welcome, [username]!" with user input
- **Time-based Messages**: Changes greeting based on time of day (Morning/Afternoon/Evening/Night)
- **Clean UI**: Modern, responsive interface with gradient backgrounds
- **Input Validation**: Handles empty or invalid username inputs
- **No Database**: Uses only request/response objects as specified
- **Easy Navigation**: Back button to enter another username
- **Additional Info**: Shows current date, time, and username statistics


## 💻 How to Use

### Step 1: Access the Application
1. Start Tomcat server in Eclipse
2. Open web browser
3. Navigate to: `http://localhost:8080/UsernameDisplay/`

### Step 2: Enter Username
1. You'll see a welcome form with input field
2. Enter your username in the text box
   - Example: "John"
   - Example: "Alice_Smith"
   - Example: "User123"
3. Click **"Get Welcome Message"** button

### Step 3: View Personalized Greeting
The result page displays:
- Time-based greeting (Good Morning/Afternoon/Evening/Night)
- Personalized welcome message: "Welcome, [username]!"
- Current date and time
- Username length in characters
- Option to enter another username

### Step 4: Enter Another Username
1. Click **"Enter Another Username"** button
2. Returns to input form
3. Enter new username and repeat process

## 🧪 Test Examples

### Test Case 1: Normal Input
- **Input**: "John"
- **Output**: 
  ```
  Good Morning!
  Welcome, John!
  Current Time: 09:30 AM
  Date: December 25, 2024
  Username Length: 4 characters
  ```

### Test Case 2: Empty Input
- **Input**: (leave empty)
- **Output**: "No Username Provided" error message

### Test Case 3: Spaces Only
- **Input**: "   "
- **Output**: "No Username Provided" error message

### Test Case 4: Special Characters
- **Input**: "John_Doe123"
- **Output**: "Welcome, John_Doe123!" (displays correctly)

### Test Case 5: Different Times
- **Morning (before 12 PM)**: "Good Morning!"
- **Afternoon (12 PM - 5 PM)**: "Good Afternoon!"
- **Evening (5 PM - 8 PM)**: "Good Evening!"
- **Night (after 8 PM)**: "Good Night!"


## 🎨 Design Features

### UI/UX Elements
1. **Gradient Backgrounds**: Modern color schemes
2. **Responsive Design**: Works on mobile and desktop
3. **Icons**: Font Awesome icons for better visual appeal
4. **Animations**: Smooth hover effects and transitions
5. **Card Layout**: Content organized in visually appealing cards

### Color Scheme
- **Primary**: Purple gradient (#667eea to #764ba2)
- **Secondary**: Pink gradient (#f093fb to #f5576c)
- **Background**: Light gradients for contrast
- **Text**: Dark gray for readability

