# Write your MySQL query statement below
SELECT max(salary) as SecondHighestSalary FROM Employee e1 WHERE salary < (SELECT MAX(salary) FROM Employee); 