
/* Drop Tables */

DROP TABLE Diner_Page CASCADE CONSTRAINTS;
DROP TABLE FindID_Page CASCADE CONSTRAINTS;
DROP TABLE Login_Page CASCADE CONSTRAINTS;
DROP TABLE Member_Page CASCADE CONSTRAINTS;
DROP TABLE Signup_Page CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Diner_Page
(
	DINER_NO  NOT NULL,
	DINER_NAME varchar2(64) NOT NULL,
	ADDRESS varchar2(256) NOT NULL,
	OPEN_HOUR date,
	CLOSE_HOUR date,
	STAR number,
	MENU varchar2(64),
	PHONE_NUMBER varchar2(32),
	PRIMARY KEY (DINER_NO)
);


CREATE TABLE Login_Page
(
	ID varchar2(32) NOT NULL,
	PASSWORD varchar2(32) NOT NULL,
	NAME varchar2(32) NOT NULL,
	EMAIL varchar2(32) NOT NULL,
	BIRTHDAY date,
	PRIMARY KEY (ID)
);


CREATE TABLE Member_Page
(
	ID varchar2(32) NOT NULL,
	PASSWORD varchar2(32) NOT NULL,
	FAVORITES varchar2(64),
	REVIEWS varchar2(1024),
	RECENTS varchar2(64),
	STAR number,
	PRIMARY KEY (ID)
);


CREATE TABLE Signup_Page
(
	ID varchar2(32) NOT NULL,
	PASSWORD varchar2(32) NOT NULL,
	NAME varchar2(32) NOT NULL,
	EMAIL varchar2(32),
	BIRTHDAY date,
	Password_Search_Q varchar2(128),
	Password_Search_A varchar2(64),
	PRIMARY KEY (ID)
);



