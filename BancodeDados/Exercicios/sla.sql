-- MySQL Script generated by MySQL Workbench
-- Fri Nov 23 00:21:31 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`uf`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`uf` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `uf` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cidade` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `uf_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cidade_uf_idx` (`uf_id` ASC) VISIBLE,
  CONSTRAINT `fk_cidade_uf`
    FOREIGN KEY (`uf_id`)
    REFERENCES `mydb`.`uf` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Endereço`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Endereço` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipoLogradouro` VARCHAR(10) NOT NULL,
  `logradouro` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `complemento` VARCHAR(45) NOT NULL,
  `cep` INT NOT NULL,
  `tipo` INT NULL,
  `cidade_id` INT NOT NULL,
  `pessoa_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Endereço_cidade1_idx` (`cidade_id` ASC) VISIBLE,
  INDEX `fk_Endereço_pessoa1_idx` (`pessoa_id` ASC) VISIBLE,
  CONSTRAINT `fk_Endereço_cidade1`
    FOREIGN KEY (`cidade_id`)
    REFERENCES `mydb`.`cidade` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Endereço_pessoa1`
    FOREIGN KEY (`pessoa_id`)
    REFERENCES `mydb`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`pessoa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `documento` VARCHAR(45) NULL,
  `Endereço_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_pessoa_Endereço1_idx` (`Endereço_id` ASC) VISIBLE,
  CONSTRAINT `fk_pessoa_Endereço1`
    FOREIGN KEY (`Endereço_id`)
    REFERENCES `mydb`.`Endereço` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`recibo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`recibo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `valor` VARCHAR(45) NOT NULL,
  `dataEmissao` DATE NOT NULL,
  `cliente_id` INT NOT NULL,
  `emissario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_recibo_pessoa1_idx` (`cliente_id` ASC) VISIBLE,
  INDEX `fk_recibo_pessoa2_idx` (`emissario_id` ASC) VISIBLE,
  CONSTRAINT `fk_recibo_pessoa1`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `mydb`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_recibo_pessoa2`
    FOREIGN KEY (`emissario_id`)
    REFERENCES `mydb`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
