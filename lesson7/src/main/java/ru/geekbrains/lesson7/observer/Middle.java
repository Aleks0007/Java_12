package ru.geekbrains.lesson7.observer;

public class Middle implements Observer {

    private String name;
    private double salary;
    private VacancyType vacancyType;

    public Middle(String name, VacancyType vacancyType) {
        this.name = name;
        this.salary = 90000;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (vacancyType == VacancyType.TESTER) {
            if (this.salary < salary) {
                System.out.printf("%s >>> Мне нужна эта работа! [%s - %.2f]\n", name, companyName, salary);
                this.salary = salary;
            } else {
                System.out.printf("%s >>> Я найду работу получше! [%s - %.2f]\n", name, companyName, salary);
            }
        }
    }
}