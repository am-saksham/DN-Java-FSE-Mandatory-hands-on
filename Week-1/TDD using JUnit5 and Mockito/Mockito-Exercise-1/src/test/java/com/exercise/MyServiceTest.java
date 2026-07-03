package com.exercise;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create a mock object for the external API
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        // 2. Stub the method to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");
        
        // 3. Inject the mock into our service
        MyService service = new MyService(mockApi);
        
        // 4. Act: call the method
        String result = service.fetchData();
        
        // 5. Assert: check that the service successfully returned our mocked data
        assertEquals("Mock Data", result);
        
        System.out.println("Mockito Test Passed! Stubbed data successfully injected.");
    }
}