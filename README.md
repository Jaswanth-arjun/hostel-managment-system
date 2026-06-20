# Hostel Management System

A desktop-based **Hostel Management System** application built using **Java Swing** and **MySQL**. This application is designed to streamline day-to-day operations in a hostel, including managing rooms, registering and tracking students, monitoring fee payments, managing employees, and handling staff salaries.

---

## 🚀 Features

### 🔑 Authentication & Dashboard
- **Admin Authentication:** Secure login screen (credentials: Username: `hostel` / Password: `admin`).
- **Control Dashboard:** A central navigation hub (`Home.java`) providing one-click access to all modules.

### 🛏️ Room Management
- **Room Registry:** Add new rooms to the hostel database.
- **Status Control:** Activate or deactivate rooms for booking.
- **Real-Time Tracking:** Track whether rooms are *Booked* or *Not Booked*.
- **Search & Update:** Modify room availability and delete room records.

### 🎓 Student Management
- **Student Admissions:** Register new students with extensive details (name, father/mother name, email, permanent address, college name, Aadhar number, and contact info).
- **Room Allocation:** Assign active and unbooked rooms directly from a dropdown during registration.
- **Admissions Registry:** View lists of all active students currently living in the hostel, as well as students who have checked out.
- **Profile Maintenance:** Update existing student profiles or delete records.

### 💰 Student Fees Tracker
- **Monthly Fee Payments:** Record fee collections with date and amount details.
- **Payment Verification:** Search and verify if a student has already paid their fees for the current month.
- **Payment Logs:** Maintain a history of all payments made by students.

### 💼 Employee & Payroll Management
- **Staff Registration:** Hire and register employees under various roles (e.g., Maintenance, Cook, Housekeeping, Accounting, Quality Control).
- **Profile Updates:** Edit employee roles, active status, or contact details.
- **Salary Payments:** Record monthly salary payouts, preventing double payments for the same month.
- **Staff Logs:** Separate listings for active/working staff and former/leaved employees.

---

## 🛠️ Technology Stack

- **GUI Framework:** Java Swing & AWT (NetBeans GUI Form Builder)
- **Database:** MySQL
- **Connectivity:** JDBC (Java Database Connectivity API)
- **Build Tool:** Apache Ant / NetBeans Project Builder

---

## 📋 Database Schema Configuration

The application connects to a MySQL database named `hostel`. The connection parameters are defined in `src/Project/ConnectionProvider.java`.

### Default Configuration:
- **JDBC Driver:** `com.mysql.cj.jdbc.Driver`
- **Database URL:** `jdbc:mysql://localhost:3306/hostel`
- **Username:** `root`
- **Password:** `202122`

The tables can be set up by executing the SQL statements in the [hostel.sql](./hostel.sql) file:

```sql
CREATE DATABASE IF NOT EXISTS hostel;
USE hostel;

-- Room table
CREATE TABLE room (
    number VARCHAR(10) PRIMARY KEY,
    activate VARCHAR(5) DEFAULT 'No',
    roomStatus VARCHAR(20) DEFAULT 'Not Booked'
);

-- Student table
CREATE TABLE student (
    mobileNo VARCHAR(15) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    father VARCHAR(50),
    mother VARCHAR(50),
    email VARCHAR(50),
    address VARCHAR(100),
    collage VARCHAR(100), -- College name
    aadhar VARCHAR(15),
    roomNo VARCHAR(10),
    status VARCHAR(20) DEFAULT 'living'
);

-- Fees table
CREATE TABLE fees (
    mobileNo VARCHAR(15),
    month VARCHAR(20),
    amount VARCHAR(15)
);

-- Employee table
CREATE TABLE employee (
    mobileNo VARCHAR(15) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    father VARCHAR(50),
    mother VARCHAR(50),
    email VARCHAR(50),
    address VARCHAR(100),
    aadhaar VARCHAR(15),
    designation VARCHAR(50),
    status VARCHAR(20) DEFAULT 'Working'
);

-- Payment table (Employee salaries)
CREATE TABLE payment (
    mobileNo VARCHAR(15),
    month VARCHAR(20),
    amount VARCHAR(15)
);
```

---

## ⚙️ How to Setup and Run

### Prerequisites
1. **Java SE Development Kit (JDK):** Version 8 or higher.
2. **MySQL Server:** Installed and running locally.
3. **MySQL JDBC Driver:** `mysql-connector-j-9.1.0.jar` (or compatible version).
4. **IDE:** NetBeans IDE (recommended for GUI editing) or Eclipse/IntelliJ IDEA.

### Execution Steps
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Jaswanth-arjun/hostel-managment-system.git
   cd hostel-managment-system
   ```

2. **Database Import:**
   - Log in to your MySQL command line client or tool (like phpMyAdmin or MySQL Workbench).
   - Source the `hostel.sql` script:
     ```sql
     SOURCE /path/to/hostel.sql;
     ```
   - Ensure the password in `src/Project/ConnectionProvider.java` matches your MySQL root account password.

3. **Open and Run in NetBeans:**
   - Open NetBeans IDE.
   - Go to **File -> Open Project** and select the cloned repository folder.
   - Right-click the project, select **Properties**, go to **Libraries**, and make sure the MySQL Connector JAR path is correctly mapped.
   - Right-click `src/login.java` and click **Run File** to launch the login window.
   - Log in using the admin credentials:
     - **Username:** `hostel`
     - **Password:** `admin`
