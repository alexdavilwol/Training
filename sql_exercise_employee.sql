-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: sql_exercise
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EmpId` int NOT NULL AUTO_INCREMENT,
  `FName` varchar(50) NOT NULL,
  `LName` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `Sex` varchar(6) DEFAULT NULL,
  `Email` varchar(50) NOT NULL,
  `Sal` int NOT NULL,
  `MgrId` int DEFAULT NULL,
  `DeptId` int NOT NULL,
  PRIMARY KEY (`EmpId`),
  UNIQUE KEY `MgrId` (`MgrId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Abirami','Bob','1990-01-10','Female','Abirami@hcl.com',1000,2,10),(2,'Bhuvi','Rob','1991-02-10','Female','Bhuvi@xyz',500,3,20),(3,'Chandrima','Derek','1992-03-10','Female','@abc.com',2000,4,30),(4,'Debasis','Pringle','1993-04-10','Male','Debasis@hcl.com',3000,5,40),(5,'Enigma','Gefree','1995-05-10','Female','Enigma@gmail.com',4500,6,10),(6,'Funnel','Samas','1999-06-10','Male','Funnel@hcl.com',5500,7,20),(7,'Gabriel','Lal','1997-07-10','Male','Gabriel@xyz.com',6500,8,30),(8,'Hari','Fedrik','1998-08-10','Male','Hari@hcl.com',7900,9,40),(9,'Inia','Gunjan','1999-09-10','Female','Inia@hcl.com',8900,10,10),(10,'Jaisna','Singh','2000-10-10','Female','Jaisna@hcl.com',1000,NULL,20);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-06 13:31:16
