package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Company> companiesMap = new HashMap<>();
        companiesMap.put("MTS-Armenia", new Company("MTS-Armenia", "City Yerevan,Argishti 4/1", 1500, "https://www.google.com/maps/place/VivaCell-MTS+HQ/@40.17418,44.500265,17z/data=!3m1!4b1!4m5!3m4!1s0x406abc5692d86427:0x5589e8a6c43b9a18!8m2!3d40.17418!4d44.502459", "https://www.mts.am"));
        companiesMap.put("Oracle", new Company("Oracle", "500 Oracle Parkway Redwood Shores, CA 94065", 137000, "https://www.google.com/maps/place/Oracle/@37.5274522,-122.2669462,17z/data=!3m1!4b1!4m5!3m4!1s0x808f99fbe9afaf67:0xf857269ae563db32!8m2!3d37.5274522!4d-122.2647522", "www.oracle.com"));
        companiesMap.put("Amazon", new Company("Amazon", "410 Terry Ave. North Seattle", 647500, "https://www.google.com/maps/place/%D0%A1%D0%B8%D1%8D%D1%82%D0%BB,+%D0%92%D0%B0%D1%88%D0%B8%D0%BD%D0%B3%D1%82%D0%BE%D0%BD,+%D0%A1%D0%A8%D0%90/@47.6129428,-122.4824899,11z/data=!3m1!4b1!4m5!3m4!1s0x5490102c93e83355:0x102565466944d59a!8m2!3d47.6062095!4d-122.3320708", "http://www.amazon.com"));
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter company name");
        String companyName = input.nextLine();
        if (companiesMap.containsKey(companyName)) {
            System.out.println("Company name : " + companiesMap.get(companyName).getName());
            System.out.println("Company Adress : " + companiesMap.get(companyName).getAdress());
            System.out.println("Number of employees : " + companiesMap.get(companyName).getNumberOfEmployees());
            System.out.println("Google Map Pin link : " + companiesMap.get(companyName).getGoogleMapPinLink());
            System.out.println("Website URL : " + companiesMap.get(companyName).getWebsiteUrl());
        } else {
            System.out.println("There is no information for company " + companyName);
        }
    }
}
