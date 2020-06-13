set echo on 
-- DDL FOR UNIVERSITY EXAMPLE
drop table Enroll; 
drop table Class; -- is "class" a reserved work in Oracle?
drop table Student;
drop table Faculty cascade CONSTRAINTS ; 
commit; 


CREATE TABLE Student	(
stuId       VARCHAR2(6) PRIMARY KEY,
lastName    VARCHAR2(20)  NOT NULL, 
firstName   VARCHAR2(20)  NOT NULL, 
major       VARCHAR2(10),
credits     NUMBER(3) DEFAULT 0,
CONSTRAINT Student_credits_cc CHECK ((credits>=0) AND (credits < 150)));

CREATE TABLE Faculty	(
facId       VARCHAR2(6),
name	VARCHAR2(20)	NOT NULL, 
department	VARCHAR2(20),
rank        VARCHAR2(10),
CONSTRAINT Faculty_facId_pk PRIMARY KEY (facId));

CREATE TABLE Class	(
classNumber VARCHAR2(8),
facId	VARCHAR2(6) REFERENCES Faculty (facId) ON DELETE SET NULL, 
schedule	VARCHAR2(8),
room        VARCHAR2(6),
CONSTRAINT Class_classNumber_pk PRIMARY KEY (classNumber), 
CONSTRAINT Class_schedule_room_uk UNIQUE (schedule, room));

CREATE TABLE Enroll	(
stuId VARCHAR2(6), 
classNumber VARCHAR2(8), 
grade       VARCHAR2(2),
CONSTRAINT Enroll_classNumber_stuId_pk PRIMARY KEY (classNumber, stuId),
CONSTRAINT Enroll_classNumber_fk FOREIGN KEY (classNumber) REFERENCES Class (classNumber) ON DELETE CASCADE,
CONSTRAINT Enroll_stuId_fk FOREIGN KEY (stuId) REFERENCES Student(stuId) ON DELETE CASCADE);

INSERT INTO STUDENT VALUES('S1001','Smith','Tom','History',90);
INSERT INTO STUDENT VALUES('S1002','Chin','Ann','Math',36);
INSERT INTO STUDENT VALUES('S1005','Lee','Perry','History',3);
INSERT INTO STUDENT VALUES('S1010','Burns','Edward','Art',63);
INSERT INTO STUDENT VALUES('S1013','McCarthy','Owen','Math',0);
INSERT INTO STUDENT VALUES('S1015','Jones','Mary','Math',42);
INSERT INTO STUDENT VALUES('S1020','Rivera','Jane','CSC',15);
commit;

INSERT INTO FACULTY VALUES('F101','Adams','Art','Professor');
INSERT INTO FACULTY VALUES('F105','Tanaka','CSC','Instructor');
INSERT INTO FACULTY VALUES('F110','Byrne','Math','Assistant');
INSERT INTO FACULTY VALUES('F115','Smith','History','Associate');
INSERT INTO FACULTY VALUES('F221','Smith','CSC','Professor');
commit;

INSERT INTO CLASS VALUES('ART103A','F101','MWF9','H221');
INSERT INTO CLASS VALUES('CSC201A','F105','uThF10','M110');
INSERT INTO CLASS VALUES('CSC203A','F105','MThF12','M110');
INSERT INTO CLASS VALUES('HST205A','F115','MWF11','H221');
INSERT INTO CLASS VALUES('MTH101B','F110','MTuTh9','H225');
INSERT INTO CLASS VALUES('MTH103C','F110','MWF11','H225');
commit;

INSERT INTO ENROLL VALUES('S1001','ART103A','A');
INSERT INTO ENROLL VALUES('S1001','HST205A','C');
INSERT INTO ENROLL VALUES('S1002','ART103A','D');
INSERT INTO ENROLL VALUES('S1002','CSC201A','F');
INSERT INTO ENROLL VALUES('S1002','MTH103C','B');
INSERT INTO ENROLL(stuId,classNumber) VALUES('S1010','ART103A');
INSERT INTO ENROLL(stuId,classNumber) VALUES('S1010','MTH103C');	
INSERT INTO ENROLL VALUES('S1020','CSC201A','B');
INSERT INTO ENROLL VALUES('S1020','MTH101B','A');
commit; 
--Figure 5.2