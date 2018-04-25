-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: kammode
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `idcustomers` int(11) NOT NULL AUTO_INCREMENT,
  `customerfirstname` varchar(45) NOT NULL,
  `customerlastname` varchar(45) NOT NULL,
  `customerage` int(11) NOT NULL,
  PRIMARY KEY (`idcustomers`),
  UNIQUE KEY `idcustomers_UNIQUE` (`idcustomers`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (5,'Lasse','Munk',21),(6,'Iben','Foldager',22),(7,'Lucas','Weje',23),(8,'Daniel','Gutfeld',24);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `idorders` int(11) NOT NULL AUTO_INCREMENT,
  `customers_idcustomers` int(11) NOT NULL,
  `order_sent` tinyint(4) NOT NULL,
  PRIMARY KEY (`idorders`,`customers_idcustomers`),
  UNIQUE KEY `idorders_UNIQUE` (`idorders`),
  KEY `fk_orders_customers_idx` (`customers_idcustomers`),
  CONSTRAINT `fk_orders_customers` FOREIGN KEY (`customers_idcustomers`) REFERENCES `customers` (`idcustomers`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (2,5,0);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_category`
--

DROP TABLE IF EXISTS `product_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_category` (
  `idproduct_category` int(11) NOT NULL AUTO_INCREMENT,
  `productname` varchar(45) NOT NULL,
  `productdescription` varchar(45) NOT NULL,
  `productprice` int(11) NOT NULL,
  `productstock` int(11) NOT NULL,
  PRIMARY KEY (`idproduct_category`),
  UNIQUE KEY `idproduct_category_UNIQUE` (`idproduct_category`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_category`
--

LOCK TABLES `product_category` WRITE;
/*!40000 ALTER TABLE `product_category` DISABLE KEYS */;
INSERT INTO `product_category` VALUES (1,'Copenhagen Long Pant','Men\"s Long Pant Slim Fit',999,50);
/*!40000 ALTER TABLE `product_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products_chosen`
--

DROP TABLE IF EXISTS `products_chosen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products_chosen` (
  `idproducts` int(11) NOT NULL AUTO_INCREMENT,
  `amount_chosen` int(11) NOT NULL,
  `orders_idorders` int(11) NOT NULL,
  `orders_customers_idcustomers` int(11) NOT NULL,
  `product_category_idproduct_category` int(11) NOT NULL,
  PRIMARY KEY (`idproducts`,`orders_idorders`,`orders_customers_idcustomers`,`product_category_idproduct_category`),
  UNIQUE KEY `idproducts_UNIQUE` (`idproducts`),
  KEY `fk_products_orders1_idx` (`orders_idorders`,`orders_customers_idcustomers`),
  KEY `fk_products_chosen_product_category1_idx` (`product_category_idproduct_category`),
  CONSTRAINT `fk_products_chosen_product_category1` FOREIGN KEY (`product_category_idproduct_category`) REFERENCES `product_category` (`idproduct_category`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_products_orders1` FOREIGN KEY (`orders_idorders`, `orders_customers_idcustomers`) REFERENCES `orders` (`idorders`, `customers_idcustomers`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products_chosen`
--

LOCK TABLES `products_chosen` WRITE;
/*!40000 ALTER TABLE `products_chosen` DISABLE KEYS */;
INSERT INTO `products_chosen` VALUES (2,3,2,5,1);
/*!40000 ALTER TABLE `products_chosen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-25 13:44:58
