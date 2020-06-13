-- THIS WILL CHANGE THE UNIVERSITY TABLES !!!!! 
-- 
-- Run the university example again to put them back again. 

set echo on
drop table enrollment; 
drop table employee CASCADE CONSTRAINTS; 
drop table t1;
drop table t2; 
drop table employee2 CASCADE CONSTRAINTS;
drop table assign2;

-- UPDATE, INSERT and DELETE Examples

--UPDATE Examples

--1 Change the major of S1020 to Music
UPDATE student
SET
    major ='Music'
WHERE
    stuid ='S1020'; 

--2 Change Tanaka's department to MIS and rank to Assistant.

UPDATE faculty
SET
    department ='MIS',
    rank ='Assistant'
WHERE
    name ='Tanaka';

--3 Change the major of S1013 from Math to NULL

UPDATE student
SET
    major = NULL
WHERE
    stuid ='S1013';

--4 Change grades of all students in CSC201A to A.

UPDATE enroll
SET
    grade ='A'
WHERE
    classnumber ='CSC201A';

-- Give all students three extra credits

UPDATE student
SET
    credits = credits + 3;

-- Change the room to B220 for all classes  taught by Tanaka.

UPDATE class
SET
    room ='B220'
WHERE
    facid = (
        SELECT
            facid
        FROM
            faculty
        WHERE
            name ='Tanaka'
    );

-- INSERT Examples

-- 1 Insert a new Faculty record with ID of F330, name of
--Jones, department of CSC, and rank of Instructor.

INSERT INTO faculty (
    facid,
    name,
    department,
    rank
) VALUES (
   'F330',
   'Jones',
   'CSC',
   'Instructor'
);

-- 2 Insert a new student record with ID of S1030, name of
--Alice Hunt, major of art, and 12 credits.

INSERT INTO student VALUES (
   'S1030',
   'Hunt',
   'Alice',
   'Art',
    12
);

--3 Insert a new student record with ID of S1031, name of
-- Maria Bono, zero credits, and no major

INSERT INTO student (
    lastname,
    firstname,
    stuid,
    credits
) VALUES (
   'Bono',
   'Maria',
   'S1031',
    0
);

-- or

INSERT INTO student VALUES (
   'S1032',
   'Bono',
   'Maria',
    NULL,
    0
);

--4 Create and fill a new table that shows each class and the number of students enrolled in it.

CREATE TABLE enrollment (
    classnumber   VARCHAR2(7) NOT NULL,
    students      NUMBER(3)
);

INSERT INTO enrollment (
    classnumber,
    students
)
    SELECT
        classnumber,
        COUNT(*)
    FROM
        enroll
    GROUP BY
        classnumber;

--5 Create a new Employee table with DATE columns and insert a record 
-- First we create the Employee table

CREATE TABLE employee (
    empid       NUMBER(6) PRIMARY KEY,
    lastname    VARCHAR2(15),
    firstname   VARCHAR2(15),
    birthdate   DATE,
    hiredate    DATE
);

-- 5a Insert a new Employee record for Susan Hayes, birthdate Oct 15, 1985, hired on June 1,2015

INSERT INTO employee VALUES (
    1001,
   'Hynes',
   'Susan',
   '15-OCT-1985',
   '01-JUN-2015'
);

-- 5b Insert a new record for William Hayes, born Oct 15, 1985, hired today, using SYSDATE

INSERT INTO employee VALUES (
    1002,
   'Hynes',
   'William',
   '15-OCT-1985',
    trunc(SYSDATE)
);

-- view both records

SELECT
    *
FROM
    employee;

-- 5C Find the employee name and the year part of the birthDate field for employee E1001 as a string
-- using TO_CHAR witn a format string for the year part

SELECT
    firstname,
    lastname,
    TO_CHAR(birthdate,'YYYY') AS year
FROM
    employee
WHERE
    empid = 1001;

-- 5d Insert a record for employee Scott Kane, converting a string to a date using TO_DATE with a format string

INSERT INTO employee (
    empid,
    firstname,
    lastname,
    hiredate
) VALUES (
    1003,
   'Scott',
   'Kane',
    TO_DATE('01/01/2015','MM/DD/YYYY')
);

-- 5e Convert the hiredate column to TIMESTAMP type

ALTER TABLE employee MODIFY (
    hiredate TIMESTAMP
);

-- 5f insert a new record using SYSTIMESTAMP for the hiredate

INSERT INTO employee (
    empid,
    firstname,
    lastname,
    hiredate
) VALUES (
    1004,
   'Mary',
   'Kane',
    systimestamp
);

-- 5g Enter a new employee record using TO_TIMESTAMP to convert a string showing a date and exact time to a timestamp value.

INSERT INTO employee (
    empid,
    firstname,
    lastname,
    birthdate,
    hiredate
) VALUES (
    1005,
   'Mary',
   'Smith',
    TO_DATE('01/15/1990','MM/DD/YYYY'),
    to_timestamp('01/01/2015:09:15:20.528123','MM/DD/YYYY:HH:MI:SS.FF')
);

--6a Create a table with an always IDENTITY column
-- requires Oracle 12c

CREATE TABLE t1 (
    id     NUMBER
        GENERATED AS IDENTITY,
    name   VARCHAR2(15)
);

-- 6b Attempt to insert a value for the IDENTITY column
-- the following gives an error message

INSERT INTO t1 VALUES (
    1,
   'SMITH'
);

-- 6c Insert a new record in the T1 table, with system-generated id
-- name and give values for the non-identity columns

INSERT INTO t1 ( name ) VALUES ('SMITH' );

SELECT
    *
FROM
    t1;

-- 6d Create a table with a default-only identity column
-- default only identity column

CREATE TABLE t2 (
    id      NUMBER
        GENERATED BY DEFAULT AS IDENTITY ( START WITH 100 INCREMENT BY 10 ),
    color   VARCHAR2(10)
);

-- 6(e) Insert a record, giving a value for the id column-  no error this time

INSERT INTO t2 VALUES (
    1,
   'red'
);

--6(f) Insert a record without giving a value for the id column - system provides one
-- and view both records

INSERT INTO t2 ( color ) VALUES ('blue' );

-- view both records

SELECT
    *
FROM
    t2;

--7(a) Create a table and create a sequence to use to generate primary key values.

CREATE TABLE Employee2 (
empId		NUMBER(6) PRIMARY KEY , 
lastName		VARCHAR2(15), 
firstName		VARCHAR2(15), 
birthdate		DATE, 
hireDate 		DATE);

CREATE SEQUENCE empId_seq START WITH 2001 INCREMENT BY 1;

--7(b) Insert two records,  using NEXTVAL
INSERT
INTO Employee2
VALUES (empId_seq.NEXTVAL,'Manley','Michael','10-OCT-1985',SYSDATE);

INSERT
INTO Employee2(empId, firstName, lastName, hireDate) 
VALUES (empId_seq.NEXTVAL,
'Quinn','Elizabeth',TO_DATE('01/01/2015','MM/DD/YYYY'));

 --7(c)to use CURRVAL to create a dependent record, first create the table with the foreign key 
 
CREATE TABLE Assign2( empid NUMBER(6) NOT NULL
    references employee2(empid),projno NUMBER(6) NOT NULL,hoursassigned NUMBER(3),
primary key(empid,projno) );
INSERT INTO assign2 (
    empid,
    projno,
    hoursassigned
) VALUES (
    empid_seq.CURRVAL,
    1001,
    30
);

-- 7(d) to see the current value and next value of the sequence

SELECT
    empid_seq.CURRVAL
FROM
    dual;

SELECT
    empid_seq.NEXTVAL
FROM
    dual;

-- to drop the sequence

DROP SEQUENCE empid_seq;

-- DELETE Examples

--1. Erase the record of student S1020. 

DELETE FROM student
WHERE
    stuid ='S1020';

--2 Erase all enrollment records for student S1020.

DELETE FROM enroll
WHERE
    stuid ='S1020';

--3 Erase all the class records

DELETE FROM class;

--4 Erase all enrollment records for Owen McCarthy.

DELETE FROM enroll
WHERE
    stuid = (
        SELECT
            stuid
        FROM
            student
        WHERE
            lastname ='McCarthy'
            AND firstname ='Owen'
    );

