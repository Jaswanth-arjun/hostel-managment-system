CREATE DATABASE IF NOT EXISTS hostel;
USE hostel;

-- 1. Create room table
CREATE TABLE IF NOT EXISTS room (
    number VARCHAR(10) PRIMARY KEY,
    activate VARCHAR(5) DEFAULT 'No',
    roomStatus VARCHAR(20) DEFAULT 'Not Booked'
);

-- 2. Create student table
CREATE TABLE IF NOT EXISTS student (
    mobileNo VARCHAR(15) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    father VARCHAR(50),
    mother VARCHAR(50),
    email VARCHAR(50),
    address VARCHAR(100),
    collage VARCHAR(100), -- College name (matches the spelling 'collage' in the source code)
    aadhar VARCHAR(15),
    roomNo VARCHAR(10),
    status VARCHAR(20) DEFAULT 'living'
);

-- 3. Create fees table
CREATE TABLE IF NOT EXISTS fees (
    mobileNo VARCHAR(15),
    month VARCHAR(20),
    amount VARCHAR(15)
);

-- 4. Create employee table
CREATE TABLE IF NOT EXISTS employee (
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

-- 5. Create payment table
CREATE TABLE IF NOT EXISTS payment (
    mobileNo VARCHAR(15),
    month VARCHAR(20),
    amount VARCHAR(15)
);
