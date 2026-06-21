DECLARE
    CURSOR c_customers IS
        SELECT customer_id, age FROM customers;

BEGIN
    FOR r_customer IN c_customers LOOP
        IF r_customer.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 1.00
            WHERE customer_id = r_customer.customer_id;
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Senior citizen interest rate discounts applied successfully.');
END;
/