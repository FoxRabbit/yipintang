--
-- Table structure for table `admin`
--
create database huitongsys;

use huitongsys;

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `admin_role` int(1) default 0,
  `form_role`  int(1) default 0,
  `cash_role`  int(1) default 0,
  `account_role`  int(1) default 0,
  `service_role`  int(1) default 0,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

select * from admin;

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`username`,`password`) VALUES ('admin','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customername` varchar(50) DEFAULT NULL,
  `identity_card` varchar(18) DEFAULT NULL,
  `bank_card` varchar(38) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customername`,`identity_card`,`bank_card`,`mobile`,`email`) VALUES ('李四','123456789123456789','1234567891234567890','13913845678','123@163.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

select * from customer;

--
-- Table structure for table `declare`
--

DROP TABLE IF EXISTS `declaration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `declaration` (
  `declare_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `cash_num` int NOT NULL,
  `pre_declare_id` int(11) DEFAULT 0,
  PRIMARY KEY (`declare_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `declaration` WRITE;
/*!40000 ALTER TABLE `declaration` DISABLE KEYS */;
INSERT INTO `declaration` (`user_id`,`cash_num`,`pre_declare_id`) VALUES (1, 8000000, 0);
/*!40000 ALTER TABLE `declaration` ENABLE KEYS */;
UNLOCK TABLES;

select * from declaration;


