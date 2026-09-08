# Write your MySQL query statement below

SELECT
    e.name AS Employee,
    e.salary AS Salary,
    d.name AS Department
From Employee e
JOIN Department d
ON e.departmentID = d.id
WHERE 3> (SELECT COUNT(DISTINCT salary) FROM Employee e1 WHERE e1.departmentID = e.departmentID AND e1.salary>e.salary);