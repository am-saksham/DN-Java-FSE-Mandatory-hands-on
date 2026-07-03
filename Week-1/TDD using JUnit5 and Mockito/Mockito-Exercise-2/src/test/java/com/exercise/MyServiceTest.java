package com.exercise;

// Import Mockito methods (mock, verify) and JUnit Jupiter Test
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // 1. Create the mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        // 2. Inject it into the service
        MyService service = new MyService(mockApi);
        
        // 3. Act: Call the method we are testing
        service.fetchData();
        
        // 4. Assert/Verify: Did the service actually call getData() on the mock?
        verify(mockApi).getData();
        
        System.out.println("Interaction Verification Passed! The method was called successfully.");
    }
}