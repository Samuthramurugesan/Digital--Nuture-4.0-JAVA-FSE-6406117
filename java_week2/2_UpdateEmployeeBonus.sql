-- Scenario 2: Update Employee Bonus

CREATE TABLE IF NOT EXISTS employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DECIMAL(10, 2)
);

INSERT INTO employees VALUES (1, 'Alice', 'Sales', 50000), (2, 'Bob', 'IT', 60000);

DELIMITER //
CREATE PROCEDURE UpdateEmployeeBonus(
    IN deptName VARCHAR(50),
    IN bonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonusPercent / 100)
    WHERE department = deptName;
END //
DELIMITER ;

-- Call the procedure
CALL UpdateEmployeeBonus('Sales', 10);

-- Check updated salaries
SELECT * FROM employees;
