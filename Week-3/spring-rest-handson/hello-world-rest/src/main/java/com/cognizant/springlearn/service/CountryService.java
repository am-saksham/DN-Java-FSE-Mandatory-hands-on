package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {
        // Load the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        // Fetch the list of countries we defined
        List<Country> countryList = context.getBean("countryList", java.util.ArrayList.class);

        // Iterate using a Lambda stream to find a case-insensitive match
        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}