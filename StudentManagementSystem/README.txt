# Student Management System - Java + MySQL

## Setup Instructions

1. **Create MySQL Database**
```sql
CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(100),
    courses TEXT,
    balance INT
);
```

2. **Edit StudentDatabase.java**
- Replace `your_password` with your actual MySQL password.

3. **Add MySQL Connector JAR in Eclipse**
- Download: https://dev.mysql.com/downloads/connector/j/
- Eclipse → Right click project → Build Path → Add External JARs → Select MySQL Connector.

4. **Run Main.java**
- Use the console to add and enroll students, and save to MySQL.

Enjoy!
