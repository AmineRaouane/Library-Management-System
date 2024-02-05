# Library Management System - Java Project
<link rel="stylesheet" type="text/css" href="styles.css">
<center>
  <h1>Data_Science_Salaries</h1>
  <div class="card">
  <img src="https://i.pinimg.com/564x/d2/6a/2f/d26a2f5d77b89365b8fecd1e9652526a.jpg" alt="Image Description" style="width: 100%;height:100%; object-fit: cover; border-radius: 10px 10px 0 0;">
  <div class="card__content">
    <h2 class="card__title">Created by : Raouane Amine</h2>
    <p class="card__description">This is a Data_Science_Salary prediction project using a Us dataset , Python libraries and machine learning models</p>
  </div>
</div></center>

<style>
  /* Additional styles or overrides go here */
  .card {
  position: relative;
  width: 500px;
  height: 300px;
  background-color: #f2f2f2;
  border-radius: 10px;
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: hidden;
  perspective: 1000px;
  box-shadow: 0 0 0 5px #ffffff80;
  transition: all 0.6s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.card svg {
  width: 48px;
  fill: #333;
  transition: all 0.6s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.card:hover {
  transform: scale(1.05);
  box-shadow: 0 8px 16px rgba(255, 255, 255, 0.2);
}

.card__content {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  padding: 20px;
  box-sizing: border-box;
  background-color: #f2f2f2;
  transform: rotateX(-90deg);
  transform-origin: bottom;
  transition: all 0.6s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.card:hover .card__content {
  transform: rotateX(0deg);
}

.card__title {
  margin: 0;
  font-size: 24px;
  color: #333;
  font-weight: 7000;
}

.card:hover svg {
  scale: 0;
}

.card__description {
  margin: 10px 0 0;
  font-size: 20px;
  color: #000000;
  line-height: 1.4;
  display: flex;
  align-items: center;
  justify-content: center;
  text-align: center;
  margin-top: 80px;
}
</style>
## Overview
This is a simple Library Management System implemented in Java, using JDBC for database connectivity and MySQL as the backend database. Maven is used as the build tool for managing dependencies and project structure.

## Features
- Book management (Search ,add, delete, update)
- Borrow and return books
- View user and book information

## Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL Database
- Maven

## Prerequisites
- Java Development Kit (JDK)
- MySQL Database Server
- Maven

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/AmineRaouane/Library-Management-System.git
