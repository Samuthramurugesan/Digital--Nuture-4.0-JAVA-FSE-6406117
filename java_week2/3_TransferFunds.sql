-- Scenario 3: Transfer Funds Between Accounts

CREATE TABLE IF NOT EXISTS accounts (
    account_id INT PRIMARY KEY,
    customer_id INT,
    balance DECIMAL(10, 2)
);

INSERT INTO accounts VALUES (101, 201, 1500.00), (102, 202, 1000.00);

DELIMITER //
CREATE PROCEDURE TransferFunds(
    IN fromAcc INT,
    IN toAcc INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE current_balance DECIMAL(10,2);

    SELECT balance INTO current_balance
    FROM accounts
    WHERE account_id = fromAcc;

    IF current_balance >= amount THEN
        UPDATE accounts SET balance = balance - amount WHERE account_id = fromAcc;
        UPDATE accounts SET balance = balance + amount WHERE account_id = toAcc;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient funds in source account.';
    END IF;
END //
DELIMITER ;

-- Call the procedure
CALL TransferFunds(101, 102, 500.00);

-- Check balances
SELECT * FROM accounts;
