package com.exercise;

public class MyService {
    private ExternalApi api;

    // Injecting the API dependency via the constructor
    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}