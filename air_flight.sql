-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: air_flight
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `air_credit_card_details`
--

DROP TABLE IF EXISTS `air_credit_card_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `air_credit_card_details` (
  `profile_id` varchar(10) NOT NULL,
  `card_number` bigint(20) DEFAULT NULL,
  `card_type` varchar(45) DEFAULT NULL,
  `expiration_month` int(11) DEFAULT NULL,
  `expiration_year` int(11) DEFAULT NULL,
  KEY `fk_pro_id_idx` (`profile_id`),
  CONSTRAINT `fk_profile_id` FOREIGN KEY (`profile_id`) REFERENCES `air_passenger_profile` (`profile_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `air_credit_card_details`
--

LOCK TABLES `air_credit_card_details` WRITE;
/*!40000 ALTER TABLE `air_credit_card_details` DISABLE KEYS */;
INSERT INTO `air_credit_card_details` VALUES ('1',622098761234,'debit',5,2013),('2',652362563625,'credit',1,2013),('1',765432345678,'credit',2,2013),('3',654378561234,'debit',6,2013),('4',625417895623,'debit',2,2013),('5',865478956325,'debit',3,2013),('2',543267895432,'credit',8,2013),('1',256369856321,'debit',1,2013);
/*!40000 ALTER TABLE `air_credit_card_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `air_flight`
--

DROP TABLE IF EXISTS `air_flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `air_flight` (
  `flight_id` varchar(45) NOT NULL,
  `airline_id` varchar(45) DEFAULT NULL,
  `airline_name` varchar(45) DEFAULT NULL,
  `from_location` varchar(45) DEFAULT NULL,
  `to_location` varchar(45) DEFAULT NULL,
  `departure_time` time DEFAULT NULL,
  `arrival_time` time DEFAULT NULL,
  `duration` time DEFAULT NULL,
  `total_seats` int(11) DEFAULT NULL,
  KEY `fk_f_id_idx` (`flight_id`),
  CONSTRAINT `fk_f_id` FOREIGN KEY (`flight_id`) REFERENCES `air_flight_details` (`flight_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `air_flight`
--

LOCK TABLES `air_flight` WRITE;
/*!40000 ALTER TABLE `air_flight` DISABLE KEYS */;
INSERT INTO `air_flight` VALUES ('3173','MH370','abc','hyderabad','chennai','06:30:00','07:15:00','00:45:00',100),('3178','MH17','def','chennai','hyderabad','08:00:00','09:00:00','01:00:00',200),('3172','AR342','fgh','kolkata','chennai','11:30:00','13:00:00','01:30:00',100),('3171','JT564','jkl','chennai','delhi','08:00:00','10:00:00','02:00:00',100),('3170','DT345','xyz','delhi','kolkata','21:00:00','22:30:00','01:30:00',100),('3175','MJ654','abc','chennai','hyderabad','15:00:00','16:00:00','01:00:00',200),('3176','MH370','def','kochi','chennai','18:00:00','19:05:00','01:05:00',100),('3177','MH45','fgh','delhi','kochi','19:00:00','21:00:00','02:00:00',200),('3174','MH321','xyz','kolkata','delhi','00:00:00','02:00:00','02:00:00',100),('3179','JT435','abc','chennai','kolkata','14:00:00','15:00:00','01:00:00',100),('3180','JT456','ijk','kolkata','kochi','05:00:00','05:45:00','00:45:00',200);
/*!40000 ALTER TABLE `air_flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `air_flight_details`
--

DROP TABLE IF EXISTS `air_flight_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `air_flight_details` (
  `flight_id` varchar(45) NOT NULL,
  `flight_departure_date` date DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `available_seats` int(11) DEFAULT NULL,
  PRIMARY KEY (`flight_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `air_flight_details`
--

LOCK TABLES `air_flight_details` WRITE;
/*!40000 ALTER TABLE `air_flight_details` DISABLE KEYS */;
INSERT INTO `air_flight_details` VALUES ('3170','2013-02-14',1000.00,10),('3171','2013-03-15',5000.00,0),('3172','2013-02-05',3000.00,32),('3173','2013-04-07',2000.00,12),('3174','2013-04-05',3800.00,3),('3175','2013-05-25',3500.00,10),('3176','2013-03-14',8000.00,2),('3177','2013-06-15',1500.00,0),('3178','2013-05-06',3000.00,5),('3179','2013-04-03',4000.00,15),('3180','2013-04-02',3000.00,14);
/*!40000 ALTER TABLE `air_flight_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `air_passenger_profile`
--

DROP TABLE IF EXISTS `air_passenger_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `air_passenger_profile` (
  `profile_id` varchar(10) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `mobile_number` bigint(20) DEFAULT NULL,
  `email_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`profile_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `air_passenger_profile`
--

LOCK TABLES `air_passenger_profile` WRITE;
/*!40000 ALTER TABLE `air_passenger_profile` DISABLE KEYS */;
INSERT INTO `air_passenger_profile` VALUES ('1','godbless','John','Stuart','Street 21, Near Bus Stop-Hyderabad-432126',9865263251,'john@gmail.com'),('2','heyyaa','Robert','Clive','Sector 3, Technopolis-Kolkata-700102',9733015875,'robert@yahoo.com'),('3','hello123','Raj','Sharma','House No. 3, Anna Nagar-Kochi-452314',9775470232,'raj3452@hotmail.com'),('4','yesboss','Sanjay','Mittal','21 Cauunaught Place-Delhi-144985',9856856321,'sanjay@yahoo.com'),('5','imhere','Tony','Stark','51A, Greams Lane-Chennai-144587',9832015785,'tony@gmail.com');
/*!40000 ALTER TABLE `air_passenger_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `air_ticket_info`
--

DROP TABLE IF EXISTS `air_ticket_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `air_ticket_info` (
  `ticket_id` varchar(45) NOT NULL,
  `profile_id` varchar(10) DEFAULT NULL,
  `flight_id` varchar(45) DEFAULT NULL,
  `flight_departure_date` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  KEY `fk_profile_id_idx` (`profile_id`),
  KEY `fk_fli_id_idx` (`flight_id`),
  CONSTRAINT `fk_fli_id` FOREIGN KEY (`flight_id`) REFERENCES `air_flight_details` (`flight_id`),
  CONSTRAINT `fk_pro_id` FOREIGN KEY (`profile_id`) REFERENCES `air_passenger_profile` (`profile_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `air_ticket_info`
--

LOCK TABLES `air_ticket_info` WRITE;
/*!40000 ALTER TABLE `air_ticket_info` DISABLE KEYS */;
INSERT INTO `air_ticket_info` VALUES ('1','1','3178','2013-05-06','delayed'),('2','5','3179','2013-04-03','on time'),('2','4','3180','2013-04-02','on time'),('1','2','3177','2013-06-15','on time'),('1','3','3176','2013-03-14','on time'),('3','1','3171','2013-03-15','on time'),('4','4','3172','2013-02-06','delayed'),('5','2','3178','2013-06-05','on time'),('4','3','3171','2013-03-15','on time'),('5','1','3175','2013-05-25','on time'),('6','3','3177','2013-06-15','on time');
/*!40000 ALTER TABLE `air_ticket_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-08 12:06:03
