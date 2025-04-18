# This project contains manual test cases and bug report.

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
