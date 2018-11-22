-- MySQL Script generated by MySQL Workbench
-- Thu Nov 22 16:57:08 2018
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
-- Table `mydb`.`Emitente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Emitente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Emitente` VARCHAR(45) NOT NULL,
  `Documento` VARCHAR(45) NOT NULL,
  `Assinatura` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Nome_Cliente` VARCHAR(45) NOT NULL,
  `Endereco` VARCHAR(45) NOT NULL,
  `Cidade` VARCHAR(45) NOT NULL,
  `Estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Recibo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Recibo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Clareza_firm` VARCHAR(45) NOT NULL,
  `Emitente_id` INT NOT NULL,
  `Cliente_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Recibo_Emitente1_idx` (`Emitente_id` ASC) VISIBLE,
  INDEX `fk_Recibo_Cliente1_idx` (`Cliente_id` ASC) VISIBLE,
  CONSTRAINT `fk_Recibo_Emitente1`
    FOREIGN KEY (`Emitente_id`)
    REFERENCES `mydb`.`Emitente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Recibo_Cliente1`
    FOREIGN KEY (`Cliente_id`)
    REFERENCES `mydb`.`Cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Servico` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Servico` INT NOT NULL,
  `Data` DATE NOT NULL,
  `Valor` DECIMAL(14,2) NOT NULL,
  `Recibo_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Referente_Recibo1_idx` (`Recibo_id` ASC) VISIBLE,
  CONSTRAINT `fk_Referente_Recibo1`
    FOREIGN KEY (`Recibo_id`)
    REFERENCES `mydb`.`Recibo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tipo_Servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tipo_Servico` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Servico` VARCHAR(45) NOT NULL,
  `Cod` INT NOT NULL,
  `Valor` VARCHAR(45) NOT NULL,
  `Tempo` VARCHAR(45) NOT NULL,
  `Servico_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Tipo_Servico_Servico1_idx` (`Servico_id` ASC) VISIBLE,
  CONSTRAINT `fk_Tipo_Servico_Servico1`
    FOREIGN KEY (`Servico_id`)
    REFERENCES `mydb`.`Servico` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Uf`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Uf` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cidade` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Uf_id` INT NOT NULL,
  `Nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Cidade_Uf1_idx` (`Uf_id` ASC) VISIBLE,
  CONSTRAINT `fk_Cidade_Uf1`
    FOREIGN KEY (`Uf_id`)
    REFERENCES `mydb`.`Uf` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
