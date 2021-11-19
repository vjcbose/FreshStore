DROP DATABASE if exists `freshmart`;
CREATE DATABASE `freshmart`;
USE `freshmart`;
/* Users table to store users data where Is_Admin = 1 denotes admin is logged into the system*/
CREATE TABLE `users` (
   `User_ID` int NOT NULL ,
   `First_Name` varchar(20) NOT NULL,
   `Last_Name` varchar(20) NOT NULL,
   `Email` varchar(30) NOT NULL,
   `CountryCode` varchar(20) NOT NULL,
   `Phone_Number` varchar(15) DEFAULT NULL,
   `Date_Of_Birth` DATE,
   `Gender` varchar(10) NOT NULL,
   `Date_Created` datetime DEFAULT CURRENT_TIMESTAMP,
   `Is_Admin` int DEFAULT '0',
   `Subscription` int DEFAULT 0,
   PRIMARY KEY (`User_ID`),
   UNIQUE KEY `Email` (`Email`),
   UNIQUE KEY `Phone_Number` (`Phone_Number`)
   )DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
   
    CREATE TABLE `products` (
   `Product_ID` int NOT NULL ,
   `Product_Name` varchar(20) NOT NULL,
   `Description` varchar(50) DEFAULT NULL,
   `Category` varchar(10) NOT NULL,
   `Available_Quantity` int NOT NULL,
   `Price` long NOT NULL,
   
   PRIMARY KEY (`Product_ID`),
   UNIQUE KEY `Product_Name` (`Product_Name`)
   
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 
 
  CREATE TABLE `orders` (
   `Order_ID` int NOT NULL AUTO_INCREMENT,
   `Date_Placed` datetime DEFAULT CURRENT_TIMESTAMP,
   `Delivery_Expected` timestamp NOT NULL DEFAULT (CURRENT_TIMESTAMP + 3),
   `Payment_Confirmation` varchar(10) NOT NULL,
   `Total Price` long NOT NULL,
   `User_ID` INT NOT NULL,
   `Phone_No` varchar(15) DEFAULT NULL,
   PRIMARY KEY (`Order_ID`),
   KEY `User_ID`(`User_ID`),
   FOREIGN KEY(`User_ID`) REFERENCES `users` (`User_ID`),
   FOREIGN KEY (`Phone_No`) REFERENCES `users` (`Phone_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

  CREATE TABLE `items_table` (
   `Rand_ID` int NOT NULL AUTO_INCREMENT,
   `Product_ID` int NOT NULL,
   `Quantity` timestamp NOT NULL DEFAULT (CURRENT_TIMESTAMP + 3),
   `Order_ID` INT NOT NULL,
   PRIMARY KEY (`Rand_ID`),
   FOREIGN KEY(`Product_ID`) REFERENCES `products` (`Product_ID`),
   FOREIGN KEY(`Order_ID`) REFERENCES `orders` (`Order_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into users values(rand(),'jagadeesh','viswanadhuni', 
'jagadeeshbose567@gmail.com','canada', 5145726116 ,date(19980516), 'male',current_timestamp(), 1 , 0 );

insert into products values(rand(),'half_kilo_apples','apples at cheap', 
'fruits', 1000 , 4.05); 

