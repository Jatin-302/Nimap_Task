### 🧪 Automation Testing

This section covers the **Automation Testing** tasks performed using **Selenium WebDriver**, **TestNG**, and **Maven** for the [Nimap Task Web Application](https://testffc.nimapinfotech.com/auth/login).

#### ✅ Test Cases Automated:
1. **Login Functionality**
   - Valid credentials: Verify successful login and toast message.
   - Invalid credentials: Validate toast message error.

2.  **Punch In **
   - Verify & validthe Toast/Popup message after the PunchIn
   
3. **Customer Addition**
   - After successful login, fill the customer form.
   - Verify the customer is added to the list.

#### 🛠️ Tech Stack:
- **Language**: Java  
- **Framework**: TestNG  
- **Automation Tool**: Selenium WebDriver  
- **Build Tool**: Maven  
- **IDE**: IntelliJ IDEA 

#### 📁 Project Structure:

#### ⚙️ How to Run:
1. Clone the repository:
   ```bash
   git clone https://github.com/Jatin-302/Nimap_Task.git
2. Navigate to the project:
   ```bash
   cd Nimap_Task
   
3. Run tests using Maven:
   ``` bash
   mvn clean test


# manual test cases and bug report.

## 🔧 Setup

1. Open the web application: [https://testffc.nimapinfotech.com/](https://testffc.nimapinfotech.com/)
2. Use the provided Excel files for detailed test case tracking and bug reporting:

## ✅ Test Scenarios

### Sign Up
- Field validation for email, password, confirm password
- Matching confirm password
- Invalid email format
- Password length check
- Bug:No validation for mail & password has linked to the other account

### Login
- Valid credentials
- Empty fields validation
- Invalid credentials
- Password visibility toggle
- UI inconsistency (e.g., left-aligned “Forgot Password” link)

### Sign In with OTP
- Should only require email or mobile
- Bug:  for moblie number it's doesn't send the otp

### Forgot Password
- Blank input validation
- Invalid format handling
- Button alignment check

## 🧪 Tools Used
- Manual Testing
- Google Chrome (Desktop)
- Excel (for documenting test cases and bugs)
"""

# Nimap API Postman Test

This project contains Postman tests for the NimapInfotech API.

## 🔧 Setup

1. Import the environment file (`Nimap API Test.postman_environment.json`)
2. Import the collection file (`Nimap API Authentication & Customer Test.postman_collection.json`)
3. Set the environment in Postman

## ✅ Test Scenarios

### Authentication
- Valid Login (`POST /api/account/authenticate`)
- Invalid Login with wrong password

### Customer Management
- Get Customer List (`GET /api/customer/list`)
- Add New Customer (`POST /api/customer/add`)

Token is saved in environment automatically after successful login.

## 🧪 Tools Used
- Postman
- JSON
