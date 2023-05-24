package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public void needEmployee() {
        double salary = random.nextDouble() * (maxSalary - 3000) + 3000;
        String companyName = nameCompany;
        jobAgency.sendOffer(companyName, salary);
    }
}
