-- a join
SELECT
    s.sname,
    s.city,
    p.pname,
    p.city,
    sp.qty 
FROM
    s,
    p,
    sp
WHERE
    s.snum = sp.snum
    AND p.pnum = sp.pnum; -- 12 rows
    
select * from s, p, sp; -- 360 rows? A catesian product! Usually very bad. 