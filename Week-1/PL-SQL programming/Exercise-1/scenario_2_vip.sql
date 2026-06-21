BEGIN
    FOR r_customer IN (SELECT customer_id, balance FROM customers) LOOP
        IF r_customer.balance > 10000 THEN
            UPDATE customers
            SET IsVIP = 'TRUE'
            WHERE customer_id = r_customer.customer_id;
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP statuses have been updated based on account balances.');
END;
/