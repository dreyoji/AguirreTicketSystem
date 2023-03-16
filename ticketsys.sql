-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ticketsys
-- ------------------------------------------------------
-- Server version	8.0.31


--
-- Table structure for table `alltickets`
--
USE ticketsys;
DROP TABLE IF EXISTS `alltickets`;

CREATE TABLE `alltickets` (
  `Number` int NOT NULL AUTO_INCREMENT,
  `TicketID` varchar(12) NOT NULL,
  `RevisionCount` int NOT NULL,
  `SubjectTitle` varchar(500) DEFAULT NULL,
  `SubjectDesc` varchar(2000) DEFAULT NULL,
  `TicketType` varchar(45) DEFAULT NULL,
  `PriorityLevel` varchar(45) DEFAULT NULL,
  `AssignedDepartment` varchar(45) DEFAULT NULL,
  `AssignedPersonnel` varchar(45) DEFAULT NULL,
  `DateCreated` varchar(45) DEFAULT NULL,
  `DateUpdated` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Creator` varchar(45) DEFAULT NULL,
  `Notes` varchar(300) DEFAULT NULL,
  `FollowUp` tinyint DEFAULT NULL,
  PRIMARY KEY (`Number`),
  UNIQUE KEY `new_tablecol_UNIQUE` (`TicketID`),
  UNIQUE KEY `Number_UNIQUE` (`Number`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `alltickets`
--

LOCK TABLES `alltickets` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `credentials`
--

DROP TABLE IF EXISTS `credentials`;

CREATE TABLE `credentials` (
  `num` int NOT NULL AUTO_INCREMENT,
  `empnum` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email_add` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) NOT NULL,
  `middlename` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `age` int DEFAULT NULL,
  `birthday` date NOT NULL,
  `phonenum` varchar(20) DEFAULT NULL,
  `gender` varchar(30) NOT NULL,
  `residence` varchar(150) DEFAULT NULL,
  `acctype` varchar(20) NOT NULL,
  `startdate` date DEFAULT NULL,
  `department` varchar(45) NOT NULL,
  `position` varchar(45) NOT NULL,
  PRIMARY KEY (`num`),
  UNIQUE KEY `num_UNIQUE` (`num`),
  UNIQUE KEY `empnum_UNIQUE` (`empnum`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `credcombi_UNIQUE` (`username`,`password`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb3;


--
-- Dumping data for table `credentials`
--

LOCK TABLES `credentials` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `followup`
--

DROP TABLE IF EXISTS `followup`;

CREATE TABLE `followup` (
  `Number` int NOT NULL AUTO_INCREMENT,
  `TicketID` varchar(12) NOT NULL,
  `RevisionCount` varchar(5) NOT NULL,
  `SubjectTitle` varchar(45) DEFAULT NULL,
  `SubjectDesc` varchar(300) DEFAULT NULL,
  `TicketType` varchar(45) DEFAULT NULL,
  `PriorityLevel` varchar(45) DEFAULT NULL,
  `AssignedDepartment` varchar(45) DEFAULT NULL,
  `AssignedPersonnel` varchar(45) DEFAULT NULL,
  `DateCreated` varchar(45) DEFAULT NULL,
  `DateUpdated` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Creator` varchar(45) DEFAULT NULL,
  `Notes` varchar(300) DEFAULT NULL,
  `Followup` tinyint DEFAULT NULL,
  PRIMARY KEY (`Number`),
  UNIQUE KEY `new_tablecol_UNIQUE` (`TicketID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


--
-- Dumping data for table `followup`
--

LOCK TABLES `followup` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `masterrecord`
--

DROP TABLE IF EXISTS `masterrecord`;

CREATE TABLE `masterrecord` (
  `Number` int NOT NULL AUTO_INCREMENT,
  `TicketID` varchar(12) NOT NULL,
  `RevisionCount` int NOT NULL,
  `SubjectTitle` varchar(500) DEFAULT NULL,
  `SubjectDesc` varchar(2000) DEFAULT NULL,
  `TicketType` varchar(45) DEFAULT NULL,
  `PriorityLevel` varchar(45) DEFAULT NULL,
  `AssignedDepartment` varchar(45) DEFAULT NULL,
  `AssignedPersonnel` varchar(45) DEFAULT NULL,
  `DateCreated` varchar(45) DEFAULT NULL,
  `DateUpdated` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Creator` varchar(45) DEFAULT NULL,
  `Notes` varchar(300) DEFAULT NULL,
  `FollowUp` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Number`),
  UNIQUE KEY `Number_UNIQUE` (`Number`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb3;


--
-- Dumping data for table `masterrecord`
--

LOCK TABLES `masterrecord` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `readme`
--

DROP TABLE IF EXISTS `readme`;

CREATE TABLE `readme` (
  `id` int NOT NULL,
  `readme` text CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci,
  `BTC_address` text CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci,
  `email` text CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


--
-- Dumping data for table `readme`
--

LOCK TABLES `readme` WRITE;

UNLOCK TABLES;


-- Dump completed on 2023-02-23 21:18:34
