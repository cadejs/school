set echo on
-- Warning! It needs a fresh copy of the UNIVERSITY tables! 

-- DML Examples Chapter 5 - University

-- 1.Get names, IDs, and number of credits of all Math majors.
SELECT
    lastname, 
    firstname,
    stuid,
    credits
FROM
    student
WHERE
    major = 'Math';

-- 2 Get all information about CSC Faculty

SELECT
    *
FROM
    faculty
WHERE
    department = 'CSC';
 
	-- or

SELECT
    facid,
    name,
    department,
    rank
FROM
    faculty
WHERE
    department = 'CSC';

-- 3 Get the class number of all classes  in which students are enrolled

SELECT
    classnumber
FROM
    enroll;

	-- to eliminate repeats, use

SELECT DISTINCT
    classnumber
FROM
    enroll;

-- 4 Get all information about all students.

SELECT
    *
FROM
    student;
 
-- 5 Get names and IDs of all Faculty members, arranged in alphabetical order by name. 
--  Call the resulting columns Faculty- Name and FacultyNumber.

SELECT
    name    AS facultyname,
    facid   AS facultynumber
FROM
    faculty
ORDER BY
    name;  	

	-- or

SELECT
    name    AS facultyname,
    facid   AS facultynumber
FROM
    faculty
ORDER BY
    name,
    department;

-- 6 Get names of all math majors who have more than 30 credits.

SELECT
    lastname,
    firstname
FROM
    student
WHERE
    major = 'Math'
    AND credits > 30;

-- 7 Find IDs and names of all students taking ART103A

SELECT
    enroll.stuid,
    lastname,
    firstname
FROM
    student,
    enroll
WHERE
    classnumber = 'ART103A'
    AND enroll.stuid = student.stuid;

-- 8 Find stuId and grade of all students taking any class taught by the Faculty member whose facId is F110. 
--  Arrange in order by stuId

SELECT
    stuid,
    grade
FROM
    class,
    enroll
WHERE
    facid = 'F110'
    AND class.classnumber = enroll.classnumber
ORDER BY
    stuid ASC;

-- 9 Find class numbers and the names and majors of all students enrolled in the classes taught by Faculty member F110.

SELECT
    enroll.classnumber,
    lastname,
    firstname,
    major
FROM
    class,
    enroll,
    student
WHERE
    facid = 'F110'
    AND class.classnumber = enroll.classnumber
    AND enroll.stuid = student.stuid;

-- 10 Get a list of all classes  that meet in the same room, with their schedules and room numbers.

SELECT
    a.classnumber,
    a.schedule,
    a.room,
    b.classnumber,
    b.schedule
FROM
    class a,
    class b
WHERE
    a.room = b.room
    AND a.classnumber < b.classnumber;

-- 11 (a)Find all combinations of students and faculty where the student's major is different from the faculty member's department.

SELECT
    stuid,
    s.lastname,
    s.firstname,
    major,
    facid,
    f.name,
    department
FROM
    student s,
    faculty f
WHERE
    s.major <> f.department;

--11 (b) Find the left outerjoin of Student and Enroll

SELECT
    s.stuid,
    s.lastname,
    s.firstname,
    e.classnumber
FROM
    student s
    LEFT OUTER JOIN enroll e ON s.stuid = e.stuid;   

-- 12 Find the numbers of all the classes taught by Byrne of the Math department

SELECT
    classnumber
FROM
    class
WHERE
    facid = (
        SELECT
            facid
        FROM
            faculty
        WHERE
            name = 'Byrne'
            AND department = 'Math'
    );

-- 13 Find the names and IDs of all Faculty members who teach a class in Room H221

SELECT
    name,
    facid
FROM
    faculty
WHERE
    facid IN (
        SELECT
            facid
        FROM
            class
        WHERE
            room = 'H221'
    );

-- 14 Get an alphabetical list of names and IDs of all students in any class taught by F110.

SELECT
    lastname,
    firstname,
    stuid
FROM
    student
WHERE
    stuid IN (
        SELECT
            stuid
        FROM
            enroll
        WHERE
            classnumber IN (
                SELECT
                    classnumber
                FROM
                    class
                WHERE
                    facid = 'F110'
            )
    )
ORDER BY
    lastname,
    firstname ASC;

-- 15 Find the names of all students enrolled in CSC201A

SELECT
    lastname,
    firstname
FROM
    student
WHERE
    EXISTS (
        SELECT
            *
        FROM
            enroll
        WHERE
            enroll.stuid = student.stuid
            AND classnumber = 'CSC201A'
    );

-- 16 Find the names of all students who are not enrolled in CSC201A

SELECT
    lastname,
    firstname
FROM
    student
WHERE
    NOT EXISTS (
        SELECT
            *
        FROM
            enroll
        WHERE
            student.stuid = enroll.stuid
            AND classnumber = 'CSC201A'
    );

-- 17  Get IDs of all Faculty who are assigned to the History department or who teach in Room H221.

SELECT
    facid
FROM
    faculty
WHERE
    department = 'History'
UNION
SELECT
    facid
FROM
    class
WHERE
    room = 'H221';

-- 18a Find the total number of students enrolled in ART103A

SELECT
    COUNT(DISTINCT stuid)
FROM
    enroll
WHERE
    classnumber = 'ART103A';

-- 18b Find the number of departments that have faculty in them.

SELECT
    COUNT(DISTINCT department)
FROM
    faculty;

-- 18c Find the sum of all the credits that history majors have

SELECT
    SUM(credits)
FROM
    student
WHERE
    major = 'History';

-- 18d Find the average number of credits students have. 

SELECT
    AVG(credits)
FROM
    student;

-- 18e Find the student with the largest number of credits

SELECT
    stuid,
    lastname,
    firstname
FROM
    student
WHERE
    credits = (
        SELECT
            MAX(credits)
        FROM
            student
    );

-- 18f Question: Find the ID of the student(s) with the highest grade in any course

SELECT
    stuid
FROM
    enroll
WHERE
    grade = (
        SELECT
            MIN(grade)
        FROM
            enroll
    );

-- 18g Find names and IDs of students who have less than the average number of credits

SELECT
    lastname,
    firstname,
    stuid
FROM
    student
WHERE
    credits < (
        SELECT
            AVG(credits)
        FROM
            student
    );

-- 19a Assuming each course course is three credits list, for each student, the number of courses he or she has completed.

SELECT
    stuid,
    'Number of courses =',
    credits / 3
FROM
    student;

-- 19b For the same query as in Example 19(a) order students by number of courses and limit the rows to 50% , but include ties if two students have the same number of courses.
-- requires Oracle 12c 

SELECT
    stuid,
    'Number of courses =',
    credits / 3
FROM
    student
ORDER BY
    credits / 3
FETCH FIRST 50 PERCENT ROWS WITH TIES;

-- 19c For the same query as in Example 19(a) order students by number of courses and limit the returned rows to 2, but do not include the first three records and do not include ties.
-- requires Oracle 12c 

SELECT
    stuid,
    'Number of courses  = ',
    credits / 3
FROM
    student
ORDER BY
    credits / 3
OFFSET 3 ROWS FETCH NEXT 2 ROWS ONLY;

-- 20a For each major, find the sum of all the credits the students with that major have.

SELECT
    major,
    SUM(credits)
FROM
    student
GROUP BY
    major;

-- 20b For each class, show the number of students enrolled

SELECT
    classnumber,
    COUNT(*)
FROM
    enroll
GROUP BY
    classnumber;

-- 21a Find all classes  in which fewer than three students are enrolled. Also show the number enrolled in those classes

SELECT
    classnumber,
    COUNT(*)
FROM
    enroll
GROUP BY
    classnumber
HAVING
    COUNT(*) < 3;

-- 21b Find all major departments where the average of students� credits is less than the average number of credits all students have

SELECT
    major,
    AVG(credits)
FROM
    student
GROUP BY
    major
HAVING
    AVG(credits) < (
        SELECT
            AVG(credits)
        FROM
            student
    );

--22(a) Get details of all MTH classes 

SELECT
    *
FROM
    class
WHERE
    classnumber LIKE 'MTH%';

--22(b) Find all faculty named Smith or Smith using REGEXP Like

SELECT
    *
FROM
    faculty
WHERE
    REGEXP_LIKE ( name,
                  '^Sm(i|y)th$' );


--23 Find the stuId and classNumber of all students whose grades in that course class are missing

SELECT
    classnumber,
    stuid
FROM
    enroll
WHERE
    grade IS NULL;