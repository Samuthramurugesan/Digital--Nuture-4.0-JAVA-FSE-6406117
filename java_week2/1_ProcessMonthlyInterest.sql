-- Scenario 1: Process Monthly Interest

CREATE TABLE IF NOT EXISTS savings_accounts (
    account_id INT PRIMARY KEY,
    customer_id INT,
    balance DECIMAL(10, 2)
);

INSERT INTO savings_accounts VALUES (1, 101, 1000.00), (2, 102, 2000.00);

DELIMITER //
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE savings_accounts
    SET balance = balance + (balance * 0.01);
END //
DELIMITER ;

-- Call the procedure
CALL ProcessMonthlyInterest();

-- Check updated balances
SELECT * FROM savings_accounts;
