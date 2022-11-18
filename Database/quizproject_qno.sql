-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: quizproject
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `qno`
--

DROP TABLE IF EXISTS `qno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qno` (
  `Questions` varchar(255) DEFAULT NULL,
  `Option_1` varchar(255) DEFAULT NULL,
  `Option_2` varchar(255) DEFAULT NULL,
  `Option_3` varchar(255) DEFAULT NULL,
  `Option_4` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qno`
--

LOCK TABLES `qno` WRITE;
/*!40000 ALTER TABLE `qno` DISABLE KEYS */;
INSERT INTO `qno` VALUES ('Q.1) Number of primitive data types in java are?','a.8','b.7','c.9','d.5'),('Q.2) What is the size of float in java?','a.8bytes','b.4 bytes','c.2 bytes','d.16bytes'),('Q.3) What is the initial capacity of Set','a.32','b.16','c.28','d.4'),('Q.4) How many number of OOPs concept in java ?','a.4','b.5','c.6','d.3'),('Q.5) In which of the package toString() method is defined?','a.java.lang.object','b.java.lang.String','c.java.lang.util','d.none'),('Q.6) In which version vector class is inrtoduced ?','a.java1.0','b.java1.2','c.java1.3','d.java1.6'),('Q.7) Which method is used to add an element in HashSet ?','a.put','b.add','c.push','d.none of above'),('Q.8) In which memory object is stored ? ','a.Stack','b.Heap','c.RAM','d.Native'),('Q.9) Which keyword is use to make method as static?','a.static','b.final','c.transient','d.none'),('Q.10) What are the number of types in inheritance?','a.3','b.6','c.5','d.4');
/*!40000 ALTER TABLE `qno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 22:26:18
