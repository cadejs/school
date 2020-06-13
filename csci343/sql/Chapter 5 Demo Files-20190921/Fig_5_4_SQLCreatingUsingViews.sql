set echo on 

drop view HISTMAJ;
drop view ClassLoc; 
drop view ClassList; 
drop view ClassLoc2; 
drop view ClassCount; 
drop view ClassCount2; 
drop view StudentV1; 
drop view StudentV2; 
-- creating and using views

--1 Create a view with IDs and names of all History majors. 
CREATE VIEW HISTMAJ (last, first, StudentId) AS SELECT lastName, firstName, stuId
FROM	Student
WHERE  major = 'History';

--2 Create a view with classes  with their schedules and room
CREATE VIEW	ClassLoc
AS SELECT	classNumber, schedule, room
FROM	Class;

-- 3 Create a view containing the IDs and names of all students in course class CSC101. 
CREATE VIEW ClassList
AS SELECT	Student.stuId,lastName, firstName
FROM	Enroll, Student
WHERE	classNumber = 'CSC101'
AND Enroll.stuId = Student.stuId;

--4 Create a view of a view
CREATE VIEW ClassLoc2
AS SELECT	classNumber, room
FROM	ClassLoc;

--5 Create a view of Enroll that gives classNumber and the number of students enrolled in each class
CREATE VIEW ClassCount (classNumber, TotCount) AS SELECT	classNumber, COUNT(*)
FROM	Enroll
GROUP BY classNumber;
-- or
CREATE VIEW ClassCount2
AS SELECT	classNumber, COUNT(*) AS Totcount
FROM	Enroll
GROUP BY classNumber;

-- SELECT on a view
SELECT  *
FROM	ClassLoc
WHERE	room LIKE 'H%';

-- 7 Attempt to into a view without a primary key

CREATE VIEW StudentV1 
AS SELECT lastName, firstName, major, credits
FROM Student;

INSERT INTO StudentV1
VALUES('Sample','Bad',null,12);

-- 8 Create an updatable view and insert a record using the view

CREATE VIEW StudentV2
AS SELECT stuId, lastName, firstName, credits
FROM Student;

INSERT
INTO	StudentV2
VALUES  ('S1040', 'Levine', 'Adam', 30);

-- 9 Attempt to insert a record into ClassCount;
INSERT INTO CLASSCOUNT(classNumber, TotCount)
VALUES('INV100A',100);


-- 10 Modifying a view definition

CREATE OR REPLACE VIEW StudentV2
AS (SELECT stuid, firstName, lastName
FROM Student);


