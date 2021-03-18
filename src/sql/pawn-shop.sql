CREATE TABLE `client` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `identity_number` varchar(20) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `contract_item_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `contract` (
  `id` int NOT NULL AUTO_INCREMENT,
  `client_id` int NOT NULL,
  `amount` decimal(8,2) NOT NULL,
  `release_date` date NOT NULL,
  `released` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_contract_client_clientId_idx` (`client_id`),
  CONSTRAINT `fk_contract_client_client_id` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`)
);

CREATE TABLE `contract_item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `contract_id` int NOT NULL,
  `type` int NOT NULL,
  `value` decimal(8,2) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_contractitem_contract_contractId_idx` (`contract_id`),
  KEY `fk_contract_item_contract_item_type_type_idx` (`type`),
  CONSTRAINT `fk_contract_item_contract_contract_id` FOREIGN KEY (`contract_id`) REFERENCES `contract` (`id`),
  CONSTRAINT `fk_contract_item_contract_item_type_type` FOREIGN KEY (`type`) REFERENCES `contract_item_type` (`id`)
);