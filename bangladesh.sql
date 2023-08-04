-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: bangladesh
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
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `district` (
  `id` varchar(45) NOT NULL,
  `division_id` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK78g8m793eebrogjuuey668ihu` (`division_id`),
  CONSTRAINT `FK78g8m793eebrogjuuey668ihu` FOREIGN KEY (`division_id`) REFERENCES `division` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
INSERT INTO `district` VALUES ('bar1','bar','Barisal'),('bar2','bar','Jhalkathi'),('bar3','bar','Patuakhali'),('bar4','bar','Bhola'),('dh1','dh','Dhaka'),('dh2','dh','Narayanganj'),('dh3','dh','Gazipur'),('dh4','dh','Manikganj'),('dh5','dh','Narshingdi'),('dh6','dh','Cumilla'),('raj1','raj','Rajshahi'),('raj2','raj','Natore'),('raj3','raj','Chapainababganj'),('raj4','raj','Bagura');
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `division`
--

DROP TABLE IF EXISTS `division`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `division` (
  `id` varchar(45) NOT NULL,
  `division` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `division`
--

LOCK TABLES `division` WRITE;
/*!40000 ALTER TABLE `division` DISABLE KEYS */;
INSERT INTO `division` VALUES ('bar','Barishal'),('ctg','Chittagong'),('dh','Dhaka'),('kh','Khulna'),('mymn','Mymensingh'),('raj','Rajshahi'),('rang','Rangpur'),('syl','Sylhet');
/*!40000 ALTER TABLE `division` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drop_down`
--

DROP TABLE IF EXISTS `drop_down`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drop_down` (
  `id` bigint NOT NULL,
  `district` varchar(255) DEFAULT NULL,
  `division` varchar(255) DEFAULT NULL,
  `thana` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drop_down`
--

LOCK TABLES `drop_down` WRITE;
/*!40000 ALTER TABLE `drop_down` DISABLE KEYS */;
/*!40000 ALTER TABLE `drop_down` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thana`
--

DROP TABLE IF EXISTS `thana`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thana` (
  `id` varchar(50) NOT NULL,
  `district_id` varchar(45) DEFAULT NULL,
  `thana` varchar(45) DEFAULT NULL,
  `division_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6pk12vu9lhvni5qyqsw1jlom5` (`district_id`),
  KEY `FKfc60od8moatyvspcn11g347fm` (`division_id`),
  CONSTRAINT `FK6pk12vu9lhvni5qyqsw1jlom5` FOREIGN KEY (`district_id`) REFERENCES `district` (`id`),
  CONSTRAINT `FKfc60od8moatyvspcn11g347fm` FOREIGN KEY (`division_id`) REFERENCES `district` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thana`
--

LOCK TABLES `thana` WRITE;
/*!40000 ALTER TABLE `thana` DISABLE KEYS */;
INSERT INTO `thana` VALUES ('basabo','dh1','Basabo',NULL),('fatulla','dh2','Fatulla',NULL),('gouronodi','bar1','Gouronodi',NULL),('jatrabari','dh1','Jatrabari',NULL),('kashipur','bar1','Kashipur',NULL),('mugdapara','dh1','Mugdapara',NULL),('paltan','dh1','Paltan',NULL),('rahmatpur','bar1','Rahmatpur',NULL),('rupganj','dh2','Rupganj',NULL);
/*!40000 ALTER TABLE `thana` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-03 12:43:33
