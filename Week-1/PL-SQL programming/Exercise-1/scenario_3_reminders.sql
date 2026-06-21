BEGIN
    FOR r_loan IN (
        SELECT c.first_name, c.last_name, l.loan_id, l.due_date
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND (SYSDATE + 30)
    ) LOOP
        
        DBMS_OUTPUT.PUT_LINE(
            'REMINDER: Dear ' || r_loan.first_name || ' ' || r_loan.last_name || 
            ', your loan (ID: ' || r_loan.loan_id || 
            ') is due soon on ' || TO_CHAR(r_loan.due_date, 'YYYY-MM-DD') || '.'
        );
        
    END LOOP;
END;
/