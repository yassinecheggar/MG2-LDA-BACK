-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: lda
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `activite`
--

DROP TABLE IF EXISTS `activite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `activite` (
  `id` int NOT NULL,
  `activite` varchar(255) DEFAULT NULL,
  `abreviation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activite`
--

LOCK TABLES `activite` WRITE;
/*!40000 ALTER TABLE `activite` DISABLE KEYS */;
INSERT INTO `activite` VALUES (3,'Générateur des livrables BVH','GLV BVH'),(4,'Générateur des livrables SILH','GLV  SILH'),(5,'Implantation SILH','IMP-SILH'),(6,'Implantation BVH','IMP-BVH'),(7,'Implantation SAPM','IMP-SAMP'),(8,'Archi prestation','ARICHI-Presnetation'),(9,'Assistant technique d\'homologation','AST-HMLG'),(10,'Pilote homologation','PILOT-HMLG');
/*!40000 ALTER TABLE `activite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `area` (
  `id` int NOT NULL,
  `areadesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
INSERT INTO `area` VALUES (213,'Caisse Assemblee Peint'),(214,'GMP'),(215,'Zone Face AV et AR'),(216,'Zone Poste de Conduite'),(217,'Zone Interieure'),(219,'Base Roulante'),(220,'Liaison au Sol'),(221,'Integration Electronique'),(222,'Integration de Securite'),(223,'Base Véhicule');
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `author` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (183,'cheggar143@gmail.com','Yassine','Cheggar'),(184,'kamich22@gmail.com','Karim','Cheggar'),(185,'nadaL@gmail.com','Nada','Lazrak'),(189,'cheggar13@gmail.com','cheggar','yassine');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `best_practice`
--

DROP TABLE IF EXISTS `best_practice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `best_practice` (
  `id` int NOT NULL,
  `categorie` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `description` text,
  `phase` varchar(255) DEFAULT NULL,
  `activite_best` int DEFAULT NULL,
  `delivrable_best` int DEFAULT NULL,
  `user_best_practice` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdk0kgwia435c09p5wdvja7mr3` (`activite_best`),
  KEY `FKou618jlqr0ry2gmlcfmcmbptk` (`delivrable_best`),
  KEY `FKsh4qh55v4k0uapit1sx7l902i` (`user_best_practice`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `best_practice`
--

LOCK TABLES `best_practice` WRITE;
/*!40000 ALTER TABLE `best_practice` DISABLE KEYS */;
INSERT INTO `best_practice` VALUES (210,'xxx','2021-02-28','the best  practice','yyyy',3,75,108),(212,'cat 5','2021-06-08','dffddfz','phase 2',5,82,109),(306,NULL,'2021-06-18','oal dcnd fvdvfdv','phase 1',5,75,109),(307,'cat 5','2021-06-18','dcsdcscdcs','phase 2',6,78,109),(308,'dcscds','2021-06-18','dcw<cscds','phase 5',8,79,109),(321,'cat 5','2021-06-18','mmmmm','phase 2',5,77,109),(489,'dcscdss','2021-07-01','ggg','phase ',4,76,109),(497,'dcscds','2021-07-02','444','phase ',4,77,109),(499,'dcscds','2021-07-02','888','phase ',5,77,109),(508,'dcscds','2021-07-02','jjjj','phase ',5,77,108),(510,'Outil','2021-07-02','Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la mise en page est achevée. Généralement, on utilise un texte en faux latin, le Lorem ipsum ou Lipsum.','phase ',4,76,107),(633,'dcscds','2021-07-15','Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la','phase ',3,76,108);
/*!40000 ALTER TABLE `best_practice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `id` int NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `document_comment` int DEFAULT NULL,
  `user_comment` int DEFAULT NULL,
  `date_comment` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2mk8cmtjy9ol2575eqxafjev6` (`document_comment`),
  KEY `FKpoi5bgf4do9goig57ocujw3h0` (`user_comment`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (125,'the work is shit try to do  better nextime',252,109,'2021-02-28 00:00:00'),(255,'e lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour clibrer une mise en page, le texte définitif venas',252,108,'2021-06-30 00:00:00'),(264,'Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le ',252,109,'2021-06-15 00:00:00'),(265,'Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à ti',252,110,'2021-06-07 00:00:00'),(266,'Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée ',252,108,'2021-06-21 00:00:00'),(267,'en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la',252,109,'2021-06-17 00:00:00'),(283,'test 007',252,109,'2021-06-14 01:00:00'),(282,'test1025',252,109,'2021-06-14 01:00:00'),(281,'teste ets ',252,109,'2021-06-14 01:00:00'),(285,'erdfs',252,176,'2021-06-14 01:00:00'),(286,'qfvqvqvq',252,176,'2021-06-14 01:00:00'),(287,'testets',263,176,'2021-06-14 01:00:00'),(289,'dscsdcdscs',288,176,'2021-06-15 01:00:00'),(290,'kkhclkc',252,176,'2021-06-15 01:00:00'),(294,'okjhngbv',252,176,'2021-06-16 01:00:00'),(295,'perfect',252,176,'2021-06-18 01:00:00'),(471,'tetst',252,176,'2021-06-30 01:00:00'),(548,'ytrtr',252,108,'2021-07-08 01:00:00'),(622,'remplacer le faux-texte dès qu\'il est prêt ou que la mise en page est achevée. Généralement, on utilise un texte en faux latin, le Lorem ipsum ou Lipsum.',262,619,'2021-07-15 00:00:00'),(626,'calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la',523,108,'2021-07-15 00:00:00'),(641,'age, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la mise en page est achevée. Généralemen',291,108,'2021-07-15 00:00:00');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivrable`
--

DROP TABLE IF EXISTS `delivrable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivrable` (
  `id` int NOT NULL,
  `delivrable` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivrable`
--

LOCK TABLES `delivrable` WRITE;
/*!40000 ALTER TABLE `delivrable` DISABLE KEYS */;
INSERT INTO `delivrable` VALUES (73,'L02:SOLS'),(74,'Remontage Numérique'),(75,'Robustesse'),(76,'Animation réunion RZ'),(77,'Animation réunion HH'),(78,'Analyse d\'implantation '),(79,'Création de volume de coffre'),(80,'Analyse dedébattement'),(81,'Animation réunion MLG'),(82,'Préparation d\'une scéne MLG'),(83,'Création des fichier pieces fixées'),(84,'Qualité MNU'),(85,'Fichier CCP BV'),(86,'plan d\'homologation'),(87,'L02:SOLS'),(88,'L03:Limites bases conception'),(89,'L15:Roues positionnees'),(90,'L05:LC & VRD AV'),(91,'L06:LC & VRD AR'),(92,'L08:Envoloppes de Transmission'),(93,'L02:SOLS');
/*!40000 ALTER TABLE `delivrable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direction`
--

DROP TABLE IF EXISTS `direction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direction` (
  `id` int NOT NULL,
  `directiondesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direction`
--

LOCK TABLES `direction` WRITE;
/*!40000 ALTER TABLE `direction` DISABLE KEYS */;
INSERT INTO `direction` VALUES (52,'Voiture');
/*!40000 ALTER TABLE `direction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document`
--

DROP TABLE IF EXISTS `document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `document` (
  `id` int NOT NULL,
  `pub_date` date DEFAULT NULL,
  `ref` varchar(255) DEFAULT NULL,
  `valideur` varchar(255) DEFAULT NULL,
  `langue` varchar(255) DEFAULT NULL,
  `lien` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `trainning` varchar(255) DEFAULT NULL,
  `version` int NOT NULL,
  `document_area` int DEFAULT NULL,
  `document_perimetre` int DEFAULT NULL,
  `documentdirection` int DEFAULT NULL,
  `docummentauthor` int DEFAULT NULL,
  `document_pole` int DEFAULT NULL,
  `document_zon` int DEFAULT NULL,
  `type_document` int DEFAULT NULL,
  `document_activite` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK15osop9ep5mu96ta56g54goa8` (`document_area`),
  KEY `FKghgt1qoinqi1m92c3mscbpgup` (`document_perimetre`),
  KEY `FK4px64v2g71bgd9xaeu8eij3yv` (`document_activite`),
  KEY `FK1vavm3s5whr7r53epj08ggm3n` (`document_pole`),
  KEY `FKlas2cflg2y1dboclfgil7tmq9` (`document_zon`),
  KEY `FKalnn1bhryiiuhdy6mw8jdikkq` (`documentdirection`),
  KEY `FKbl22v3vhvu0p5n0ncqn74m4im` (`docummentauthor`),
  KEY `FK8mw26apllttkw4duqo7t49utc` (`type_document`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document`
--

LOCK TABLES `document` WRITE;
/*!40000 ALTER TABLE `document` DISABLE KEYS */;
INSERT INTO `document` VALUES (252,'2021-06-10','CSMA-GLV  SILH-2','107','FR','http://localhost:3000/Home/Document','Doc1','in work','YES',2,NULL,227,52,184,251,NULL,44,4),(261,'2021-06-11','DMA-GLV BVH-1','176','FR','http://localhost:3000/Home/Document','Doc 2','in work','NO',1,NULL,225,52,184,24,NULL,45,3),(262,'2021-06-11','DMA-GLV  SILH-1','107','ENG','http://localhost:3000/Home/Document','lola','ok','NO',1,NULL,227,52,184,24,NULL,46,4),(263,'2021-06-12','CSMA-IMP-SILH-3','176','ENG','http://localhost:3000/Home/Document','lola','Nok','NO',3,NULL,231,52,184,251,NULL,46,5),(288,'2021-06-15','DMA-GLV BVH-3','107','FR',NULL,'docs008','in work','NO',3,NULL,225,52,183,24,NULL,36,3),(291,'2021-06-15','DMA-IMP-SILH-2','107','ENG',NULL,'doc x','in work','NO',2,NULL,224,52,183,24,NULL,41,5),(292,'2021-06-15','DMA-GLV BVH-2','107','ENG',NULL,'cheggar','in work','NO',2,NULL,224,52,183,24,NULL,41,3),(293,'2021-06-15','DMA-GLV  SILH-2','107','fr',NULL,'lola','in work','no',2,NULL,227,52,183,24,NULL,41,4),(470,'2021-06-30','DMA-IMP-SILH-1','107','fr','downloadFile/-278-hom.jpg.jpg','doc 9','in work','yes',1,NULL,224,52,183,24,NULL,42,5),(491,'2021-07-01','DMA-GLV  SILH-2','107','en','downloadFile/-495-pdfIcon.png','Doc 10','Nok','no',2,NULL,224,52,183,24,NULL,41,4),(523,'2021-07-07','DMA-GLV  SILH-2','107','fr','downloadFile/-552-document.png','doc 11','in work','no',2,NULL,224,52,185,24,NULL,41,4),(609,'2021-07-14','DMA-IMP-SILH-2','107','fr','downloadFile/-403-Test_PDF.pdf','Doc final','Nok','no',2,NULL,227,52,183,24,NULL,40,5);
/*!40000 ALTER TABLE `document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `id` int NOT NULL,
  `problem_type` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `feedback` varchar(255) DEFAULT NULL,
  `phase` varchar(255) DEFAULT NULL,
  `validation_date` date DEFAULT NULL,
  `activite_feed` int DEFAULT NULL,
  `delivrable_feed` int DEFAULT NULL,
  `user_feedback` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqdu398pqbv05f8avvmyjt5gwl` (`activite_feed`),
  KEY `FK3y5k5vluyb7237t4msh7b2b69` (`delivrable_feed`),
  KEY `FKiqcirowjx2u6n6n7iuueo036m` (`user_feedback`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (448,'Metier','2021-06-23','kill  yassine','phase 2','2021-06-23',4,86,109),(445,'Metier','2021-06-23','Lorem ipsum dolor sit amet, consectetur adipiscing elit','phase 2','2021-06-23',4,86,109),(457,'Point bloqant Urgent','2021-06-23','Lorem ipsum dolor sit amet, consectetur adipiscing elit','phase 1','2021-06-25',4,87,109),(454,'Outil','2021-06-23','kill  yassiLorem ipsum dolor sit amet, consectetur adipiscing elitne','phase 2','2021-07-01',5,88,109),(449,'Metier','2021-06-23','Lorem ipsum dolor sit amet, consectetur adipiscing elit','phase 2','2021-07-08',4,86,109),(459,'Metier','2021-06-23','kill  yassinLorem ipsum dolor sit amet, consectetur adipiscing elite','phase 2',NULL,4,87,109),(501,'Outil','2021-07-02','Lorem ipsum dolor sit amet, consectetur adipiscing elit','phase ',NULL,4,86,109),(506,'Outil','2021-07-02','kill  mLorem ipsum dolor sit amet, consectetur adipiscing elitm','phase ',NULL,3,85,108),(544,'Metier','2021-07-08','kill  Lorem ipsum dolor sit amet, consectetur adipiscing elit','phase ',NULL,3,87,108),(552,'Metier','2021-07-08','delete thiLorem ipsum dolor sit amet, consectetur adipiscing elits app','phase ',NULL,4,87,108),(612,'Outil','2021-07-14','kill  yassine','phase ',NULL,4,86,108),(635,'Point bloqant Urgent','2021-07-15','Lorem ipsum dolor sit amet, consectetur adipiscing elit','phase 2',NULL,3,87,108),(638,'Metier','2021-07-15','Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoir','phase 5',NULL,6,87,108);
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (646);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modif`
--

DROP TABLE IF EXISTS `modif`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modif` (
  `id` int NOT NULL,
  `date_modification` date DEFAULT NULL,
  `document_mod` int DEFAULT NULL,
  `user_mod` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4r9nea8fpkjhigcn9vil8fsp9` (`document_mod`),
  KEY `FKsbdagt2y2km3nxfq14vs5lt4l` (`user_mod`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modif`
--

LOCK TABLES `modif` WRITE;
/*!40000 ALTER TABLE `modif` DISABLE KEYS */;
INSERT INTO `modif` VALUES (126,'2021-02-28',252,109),(259,'2021-06-18',252,108),(268,'2021-06-02',252,109),(269,'2021-06-15',252,108),(270,'2021-06-17',252,108),(271,'2021-06-23',252,110),(516,'2021-07-06',470,107),(521,'2021-07-07',293,176),(610,'2021-07-14',470,176);
/*!40000 ALTER TABLE `modif` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perimetre`
--

DROP TABLE IF EXISTS `perimetre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perimetre` (
  `id` int NOT NULL,
  `perimetre` varchar(255) DEFAULT NULL,
  `perimetre_area` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcu93lop925syy0834kjx1f3ff` (`perimetre_area`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perimetre`
--

LOCK TABLES `perimetre` WRITE;
/*!40000 ALTER TABLE `perimetre` DISABLE KEYS */;
INSERT INTO `perimetre` VALUES (224,'SuperStructure',213),(225,'Soubassement',213),(226,'Peinture & Protection',219),(227,'Tolerie Ouvrants',214),(228,'Filte a Air\",\"perimetreArea',213),(229,'Transmissions Mecanique',220),(230,'Transmissions Automatique',223),(231,'Moteur',223),(232,'Accesiore Exterieurs',223),(233,'Bouclier & Signalisation',223),(234,'Essuyglace & lavage',223),(296,'tes12',213),(297,'test3',213),(298,'test 4',213),(299,'test 5 ',213);
/*!40000 ALTER TABLE `perimetre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `picture`
--

DROP TABLE IF EXISTS `picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `picture` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `best_practiceimage` int DEFAULT NULL,
  `feedback_image` int DEFAULT NULL,
  `questionimage` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKeg7sx7fpi6490s6a2rdc7wt1g` (`best_practiceimage`),
  KEY `FK18x56gmcy3vgo2vtpalf5tb5r` (`feedback_image`),
  KEY `FKgm3h95esmt2m1meni8m0q4vgx` (`questionimage`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `picture`
--

LOCK TABLES `picture` WRITE;
/*!40000 ALTER TABLE `picture` DISABLE KEYS */;
INSERT INTO `picture` VALUES (494,'','http://localhost:8080/downloadFile/-280-LDA Prototype.pptx',NULL,NULL,493),(496,'','http://localhost:8080/downloadFile/-78-Nouveau Document Microsoft Word.docx',NULL,NULL,495),(498,'','http://localhost:8080/downloadFile/-713-todo.txt',497,NULL,NULL),(500,'','http://localhost:8080/downloadFile/-223-pdfIcon.png',499,NULL,NULL),(505,'','http://localhost:8080/downloadFile/-236-save user.txt',NULL,NULL,504),(509,'','http://localhost:8080/downloadFile/-923-src3.rar',508,NULL,NULL),(511,'','http://localhost:8080/downloadFile/-312-nav.txt',510,NULL,NULL),(526,'','http://localhost:8080/downloadFile/-685-data (2).csv',NULL,NULL,525),(550,'','http://localhost:8080/downloadFile/-282-PikPng.com_sql-server-logo-png_4895877.png',NULL,NULL,549),(629,'','http://localhost:8080/downloadFile/-982-Test_PDF.pdf',NULL,NULL,628),(634,'','http://localhost:8080/downloadFile/-84-Test_PDF.pdf',633,NULL,NULL),(645,'','http://localhost:8080/downloadFile/-912-Test_PDF.pdf',NULL,NULL,644);
/*!40000 ALTER TABLE `picture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pole`
--

DROP TABLE IF EXISTS `pole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pole` (
  `id` int NOT NULL,
  `pole` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pole`
--

LOCK TABLES `pole` WRITE;
/*!40000 ALTER TABLE `pole` DISABLE KEYS */;
INSERT INTO `pole` VALUES (24,'DMA'),(251,'CSMA');
/*!40000 ALTER TABLE `pole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `id` int NOT NULL,
  `problem_type` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `decsiption` varchar(255) DEFAULT NULL,
  `phase` varchar(255) DEFAULT NULL,
  `activite_quest` int DEFAULT NULL,
  `user_quest` int DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `categorie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnh5s5wlm0944xva6ykiuc7lt5` (`activite_quest`),
  KEY `FKioxah27g60evodtduh63q8wf6` (`user_quest`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (195,'not  found','2021-06-29','description ','phase 1',5,110,'traitée ',NULL),(198,'Lag','2021-05-16','Plusieurs versions sont apparues avec le temps, parfois par accident, souvent intentionnellement (histoire d\'y rajouter de petits clins d\'oeil, voire des phrases embarassantes).','phase 2',8,110,'en cours de traitement',NULL),(200,'not  found','2021-09-09','Plusieurs versions sont apparues avec le temps, parfois par accident, souvent intentionnellement (histoire d\'y rajouter de petits clins d\'oeil, voire des phrases embarassantes).','phase 1',8,109,'resolue',NULL),(383,'erreur 404','2021-06-21','Plusieurs versions sont apparues avec le temps, parfois par accident, souvent intentionnellement (histoire d\'y rajouter de petits clins d\'oeil, voire des phrases embarassantes).','phase 5',3,NULL,'resolue','Point blocqunat non urgent'),(385,'erreur 404','2021-06-22','Pourquoi l\'utiliser?','phase 2',4,109,'pas de réponse','Outil'),(493,'gfg','2021-07-01','gffg','gf',4,109,'resolue','Metier'),(495,'Metier','2021-07-01','fgfgggggg','phase ',3,109,'resolue','Outil'),(504,'fff','2021-07-02','fff','ff',3,108,'pas de réponse','Metier'),(525,'Metier','2021-07-07','errrrr','phase ',3,108,'resolue','Outil'),(628,'Metier','2021-07-15','e lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre ','phase 2',3,108,'resolue','Outil'),(644,'Metier','2021-07-15','age, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la mise en page est achevée. Généralemen','phase 2',4,108,'pas de réponse','Metier');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reponse`
--

DROP TABLE IF EXISTS `reponse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reponse` (
  `id` int NOT NULL,
  `date` datetime DEFAULT NULL,
  `reponse` text,
  `repsonse_question` int DEFAULT NULL,
  `user_reponse` int DEFAULT NULL,
  `repsonse_feedback` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKp9uwbodtf6g9arf5s13sihcsm` (`repsonse_feedback`),
  KEY `FK6spx92ua0663kxkx4l8cx6ggc` (`repsonse_question`),
  KEY `FK8yx0jcmd9yasd5g1q4j7prah2` (`user_reponse`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reponse`
--

LOCK TABLES `reponse` WRITE;
/*!40000 ALTER TABLE `reponse` DISABLE KEYS */;
INSERT INTO `reponse` VALUES (339,'2021-06-02 00:00:00','On sait depuis longtemps que travailler avec du texte lisible et contenant du sens est source de distractions, et empêche de se concentrer sur la mise en page elle-même. L\'avantage du Lorem Ipsum sur un texte générique comme \'Du texte. Du texte. Du texte.\' est qu\'il possède une distribution de lettres plus ou moins normale, et en tout cas comparable avec celle du français standard. De nombreuses suites logicielles de mise en page ou éditeurs de sites Web ont fait du Lorem Ipsum leur faux texte par défaut, et une recherche pour \'Lorem Ipsum\' vous conduira vers de nombreux sites qui n\'en sont encore qu\'à leur phase de construction. Plusieurs versions sont apparues avec le temps, parfois par accident, souvent intentionnellement (histoire d\'y rajouter de petits clins d\'oeil, voire des phrases embarassantes',195,110,NULL),(458,'2021-06-23 01:00:00','Cras pretium non purus quis tristique. Vestibulum ultricies est dui, et malesuada nibh sodales vel. Sed quis luctus lacus. Fusce nec diam pulvinar, egestas libero ac, aliquet ante. Nunc eget convallis augue. Cras condimentum ac eros nec dapibus. Quisque scelerisque nisi in commodo commodo. Aliquam ut lacinia velit. Donec ac aliquam ante, eu tincidunt massa.',NULL,110,457),(456,'2021-06-23 01:00:00','Cras pretium non purus quis tristique. Vestibulum ultricies est dui, et malesuada nibh sodales vel. Sed quis luctus lacus. Fusce nec diam pulvinar, egestas libero ac, aliquet ante. Nunc eget convallis augue. Cras condimentum ac eros nec dapibus. Quisque scelerisque nisi in commodo commodo. Aliquam ut lacinia velit. Donec ac aliquam ante, eu tincidunt massa.',NULL,110,454),(455,'2021-06-23 01:00:00','Cras pretium non purus quis tristique. Vestibulum ultricies est dui, et malesuada nibh sodales vel. Sed quis luctus lacus. Fusce nec diam pulvinar, egestas libero ac, aliquet ante. Nunc eget convallis augue. Cras condimentum ac eros nec dapibus. Quisque scelerisque nisi in commodo commodo. Aliquam ut lacinia velit. Donec ac aliquam ante, eu tincidunt massa.',NULL,110,454),(453,'2021-06-23 01:00:00','Nullam lacinia tempor erat, condimentum iaculis nisl ornare at. Vestibulum eu quam suscipit dolor pharetra suscipit quis ut nunc. Donec convallis ornare lacinia. Nunc at laoreet justo. Nunc tempus pulvinar elementum. Ut a magna sem. Sed malesuada fermentum urna, in rutrum nisl fermentum quis. Donec ornare mi id rutrum tristique. Curabitur sit amet eros a urna sagittis pharetra. Phasellus eget laoreet quam. Duis eu venenatis turpis, vel aliquet sapien. Fusce nec libero congue, ornare velit sit amet, pulvinar arcu. In mattis a diam nec dapibus. Fusce maximus felis leo, ut porttitor sapien hendrerit sit amet. Donec condimentum tempus consequat. Sed accumsan pretium malesuada.',NULL,110,449),(452,'2021-06-23 01:00:00','Nullam lacinia tempor erat, condimentum iaculis nisl ornare at. Vestibulum eu quam suscipit dolor pharetra suscipit quis ut nunc. Donec convallis ornare lacinia. Nunc at laoreet justo. Nunc tempus pulvinar elementum. Ut a magna sem. Sed malesuada fermentum urna, in rutrum nisl fermentum quis. Donec ornare mi id rutrum tristique. Curabitur sit amet eros a urna sagittis pharetra. Phasellus eget laoreet quam. Duis eu venenatis turpis, vel aliquet sapien. Fusce nec libero congue, ornare velit sit amet, pulvinar arcu. In mattis a diam nec dapibus. Fusce maximus felis leo, ut porttitor sapien hendrerit sit amet. Donec condimentum tempus consequat. Sed accumsan pretium malesuada.',NULL,110,449),(502,'2021-07-02 01:00:00','dsdsdsdsdsd',NULL,110,501),(503,'2021-07-02 01:00:00','dsdsds',NULL,110,501),(507,'2021-07-02 01:00:00','rep 1',NULL,110,506),(524,'2021-07-07 01:00:00','gfcgdtgrdtrdt',195,110,NULL),(545,'2021-07-08 01:00:00','gfgfgfg',NULL,110,544),(546,'2021-07-08 01:00:00','jjjjjjj',NULL,110,544),(551,'2021-07-08 01:00:00',' gdjuy df',549,110,NULL),(553,'2021-07-08 01:00:00','hghghhghg',NULL,110,552),(554,'2021-07-08 01:00:00','ghgh',NULL,110,552),(579,'2021-07-12 01:00:00','lola',198,110,NULL),(580,'2021-07-12 01:00:00','test',200,110,NULL),(581,'2021-07-12 01:00:00','tes',525,110,NULL),(582,'2021-07-12 01:00:00','tr',525,110,NULL),(583,'2021-07-12 01:00:00','ddd',495,110,NULL),(584,'2021-07-12 01:00:00','dd',525,110,NULL),(585,'2021-07-12 01:00:00','dddd',383,110,NULL),(613,'2021-07-14 01:00:00','TRE',NULL,110,612),(624,'2021-07-15 01:00:00','remplacer le faux-texte dès qu\'il est prêt ou que la mise en page est achevée. Généralement, on utilise un texte en faux latin, le Lorem ipsum ou Lipsum.',383,110,NULL),(625,'2021-07-15 00:00:00','remplacer le faux-texte dès qu\'il est prêt ou que la mise en page est achevée. Généralement, on utilise un texte en faux latin, le Lorem ipsum ou Lipsum.',200,110,NULL),(630,'2021-07-15 00:00:00','e lorem ipsum est, en imprimerie, une suite de mots sans si',628,110,NULL),(631,'2021-07-15 00:00:00','test',493,108,NULL),(632,'2021-07-15 00:00:00','placer le faux-texte dès qu\'il est prêt ou que la mise en page est ac',200,108,NULL),(636,'2021-07-15 00:00:00','Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la',NULL,110,635),(637,'2021-07-15 00:00:00','Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la',NULL,110,635),(639,'2021-07-15 00:00:00','Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès qu\'il est prêt ou que la',NULL,108,638);
/*!40000 ALTER TABLE `reponse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM AUTO_INCREMENT=473 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (467,'admin'),(466,'user');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `type` (
  `id` int NOT NULL,
  `typedoc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` VALUES (36,'Culture technique automobile'),(39,'Retex & Capitalisation'),(40,'Manuels métier'),(41,'Essais et Plans de Validation'),(42,'Méthodologies'),(43,'Guide de connception'),(44,'Processus'),(45,'CDC'),(46,'Normes& Réglementations'),(47,'Tools'),(48,'Standards & RT');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (107,'yassine','Yassine','Cheggar','$2a$10$zxvEq8XzYEYtNjbkRsJEbukHeRx3XS6MDXHMu8cNuNsRfZJWwswDy',_binary ''),(108,'zakaria@gmail.com','Zakaria','Essbai','$2a$10$936TzgKtHC55LBjDxcFFTuWTpxKVKO27oeXPMKUtLaowMEGYbkb8y',_binary ''),(109,'karim@gmail.com','karim','Quada','$2a$10$Ybx7eCewtmaO8YJroxQTa.B0n.B1jmb0TqLeI4c0KFq6LRvvjDsYC',_binary ''),(110,'Sara@gmail.com','sara','Essbai','$2a$10$fcmARpiARkSJtnlmoBXZSu3QG/16FQsE4QkgNqpF0tDjsHJjpjWDS',_binary ''),(176,'admin','admin','admin','$2a$10$1FazL9kwuCDUb0CLqnkIY.NeRMdE6cau/RB0XTHJF.WH7o7MY7VFC',_binary '\0'),(619,'lola12','lola','lola','$2a$10$U8ERm2LPxwBz9l4VrrBTdesvI22sahn4WzaGvC6KXzIA0FjA1kiMe',_binary '');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_roles` (
  `id` int NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`id`,`role_id`),
  KEY `FKj6m8fwv7oqv74fcehir1a9ffy` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (107,467),(108,466),(109,466),(110,466),(176,467),(603,467),(616,466),(619,466);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `view`
--

DROP TABLE IF EXISTS `view`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `view` (
  `id` int NOT NULL,
  `date` date DEFAULT NULL,
  `visited` varchar(255) DEFAULT NULL,
  `user_visit` int DEFAULT NULL,
  `visitedid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjc9pmy5e2v5qvynqp6bv10jw6` (`user_visit`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `view`
--

LOCK TABLES `view` WRITE;
/*!40000 ALTER TABLE `view` DISABLE KEYS */;
INSERT INTO `view` VALUES (514,'2021-07-06','app',108,NULL),(515,'2021-07-06','app',107,NULL),(517,'2021-07-07','app',108,NULL),(518,'2021-07-07','app',176,NULL),(519,'2021-07-07','app',107,NULL),(520,'2021-07-07','app',176,NULL),(522,'2021-07-07','app',108,NULL),(527,'2021-07-08','app',108,NULL),(528,'2021-07-08','app',108,NULL),(529,'2021-07-08','app',108,NULL),(530,'2021-07-08','app',108,NULL),(531,'2021-07-08','app',108,NULL),(532,'2021-07-08','app',108,NULL),(533,'2021-07-08','app',108,NULL),(534,'2021-07-08','app',108,NULL),(535,'2021-07-08','app',108,NULL),(536,'2021-07-08','app',108,NULL),(537,'2021-07-08','app',108,NULL),(538,'2021-07-08','app',108,NULL),(539,'2021-07-08','app',108,NULL),(540,'2021-07-08','app',108,NULL),(541,'2021-07-08','app',176,NULL),(542,'2021-07-08','app',176,NULL),(543,'2021-07-08','app',108,NULL),(547,'2021-07-08','app',108,NULL),(555,'2021-07-08','app',176,NULL),(556,'2021-07-08','app',108,NULL),(557,'2021-07-08','app',108,NULL),(558,'2021-07-08','app',108,NULL),(559,'2021-07-08','Doc',108,NULL),(560,'2021-07-08','Doc',108,NULL),(561,'2021-07-08','Doc',108,491),(562,'2021-07-08','Doc',108,491),(563,'2021-07-08','Doc',108,523),(564,'2021-07-08','Doc',108,288),(565,'2021-07-09','app',108,NULL),(566,'2021-07-09','Doc',108,491),(567,'2021-07-09','Doc',108,491),(568,'2021-07-09','Doc',108,491),(569,'2021-07-09','Doc',108,491),(570,'2021-07-09','Doc',108,491),(571,'2021-07-09','Doc',108,491),(572,'2021-07-09','Doc',108,491),(573,'2021-07-09','app',108,NULL),(574,'2021-07-12','app',108,NULL),(575,'2021-07-12','app',176,NULL),(576,'2021-07-12','app',176,NULL),(577,'2021-07-12','app',176,NULL),(578,'2021-07-12','app',176,NULL),(586,'2021-07-13','app',176,NULL),(587,'2021-07-13','app',176,NULL),(588,'2021-07-13','app',108,NULL),(589,'2021-07-13','app',108,NULL),(590,'2021-07-13','app',176,NULL),(591,'2021-07-13','app',108,NULL),(592,'2021-07-13','app',176,NULL),(596,'2021-07-13','app',108,NULL),(604,'2021-07-13','app',176,NULL),(605,'2021-07-13','app',603,NULL),(606,'2021-07-13','app',108,NULL),(607,'2021-07-14','app',108,NULL),(608,'2021-07-14','app',176,NULL),(611,'2021-07-14','app',108,NULL),(614,'2021-07-14','app',176,NULL),(615,'2021-07-15','app',176,NULL),(621,'2021-07-15','app',619,NULL),(623,'2021-07-15','app',108,NULL),(627,'2021-07-15','Doc',108,523),(640,'2021-07-15','app',108,NULL),(642,'2021-07-15','Doc',108,609),(643,'2021-07-15','Doc',108,609);
/*!40000 ALTER TABLE `view` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zone`
--

DROP TABLE IF EXISTS `zone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zone` (
  `id` int NOT NULL,
  `zone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zone`
--

LOCK TABLES `zone` WRITE;
/*!40000 ALTER TABLE `zone` DISABLE KEYS */;
INSERT INTO `zone` VALUES (121,'n/a');
/*!40000 ALTER TABLE `zone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-15 16:55:49
