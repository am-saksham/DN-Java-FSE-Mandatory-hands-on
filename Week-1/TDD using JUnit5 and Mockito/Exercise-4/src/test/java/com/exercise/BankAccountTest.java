package com.exercise;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    // SETUP: Runs exactly once before EACH @Test method
    @Before
    public void setUp() {
        System.out.println("--- @Before: Initializing fresh BankAccount ---");
        account = new BankAccount(100); // Start every test with exactly $100
    }

    // TEARDOWN: Runs exactly once after EACH @Test method
    @After
    public void tearDown() {
        System.out.println("--- @After: Cleaning up test data ---\n");
        account = null; 
    }

    @Test
    public void testDepositUsingAAAPattern() {
        System.out.println("Running testDepositUsingAAAPattern...");
        
        // 1. ARRANGE (Set up the specific variables for this test)
        int depositAmount = 50;
        int expectedBalance = 150;

        // 2. ACT (Execute the actual method we are testing)
        account.deposit(depositAmount);

        // 3. ASSERT (Verify the results match our expectations)
        assertEquals("Balance should be 150 after depositing 50", expectedBalance, account.getBalance());
    }
}