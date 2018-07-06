select b.* , (SELECT count(*) from emp a WHERE a.sal > b.sal) as RNK  from emp b;

SELECT DISTINCT(sal) FROM emp ORDER BY sal DESC LIMIT 2,1;
 
SELECT ename, sal FROM emp e1 WHERE 2 = (SELECT COUNT(DISTINCT sal) FROM emp e2 WHERE e2.sal > e1.sal)

SELECT    A.*, 
(SELECT COUNT(distinct(B.sal)) FROM emp B  WHERE B.sal >= A.sal and a.deptno=b.deptno) as Rank 
FROM  emp A where rank = 1;


select ek.* , d.dname from (
  SELECT ename, 
       sal, 
       deptno,
       (SELECT COUNT(DISTINCT sal) FROM emp e2 WHERE e2.sal > e1.sal and e1.deptno = e2.deptno) as rank  
FROM emp e1 ) 

as ek join dept d on ek.deptno = d.deptno and ek.rank =3
