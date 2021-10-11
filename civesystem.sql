-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 25, 2020 at 07:40 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `civesystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `Fname` varchar(50) NOT NULL,
  `Lname` varchar(50) NOT NULL,
  `ID` varchar(17) NOT NULL,
  `DEPARTMENT` varchar(6) NOT NULL,
  `COURSE` varchar(6) NOT NULL,
  `GENDER` varchar(6) NOT NULL,
  `EMAIL` varchar(60) NOT NULL,
  `PHONENUMBER` varchar(13) NOT NULL,
  `PASSWORD` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`Fname`, `Lname`, `ID`, `DEPARTMENT`, `COURSE`, `GENDER`, `EMAIL`, `PHONENUMBER`, `PASSWORD`) VALUES
('saidi', 'macho', '1122', 'CSE', 'HIS', 'Male', 'machio@gmail.com', '0675-109-641', '1122'),
('salum', 'mpapa', 'T/UDOM/2019/0050', 'TE', 'CNISE', 'Male', 'saluum@gmail.com', '0725-144-896', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Fname` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `ID` varchar(17) NOT NULL,
  `FACULTY` varchar(13) NOT NULL,
  `GENDER` varchar(6) NOT NULL,
  `PHONENUMBER` varchar(24) NOT NULL,
  `EMAIL` varchar(35) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Fname`, `Lname`, `ID`, `FACULTY`, `GENDER`, `PHONENUMBER`, `EMAIL`, `PASSWORD`) VALUES
('humphrey', 'jonas', '112233', 'SE', 'Male', 'jonas@gmail.com', '0745-123-646', 'jonas');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
