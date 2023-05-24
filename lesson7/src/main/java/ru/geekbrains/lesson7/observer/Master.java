package ru.geekbrains.lesson7.observer;

public class Master implements Observer {
    private  String name;
    private double salary;
    private VacancyType vacancyType;

    public Master(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (vacancyType == VacancyType.DESIGNER || vacancyType == VacancyType.DEVELOPER) {
            if (this.salary < salary) {
                System.out.printf("%s >>> Мне нужна эта работа! [%s - %.2f]\n", name, companyName, salary);
                this.salary = salary;
            } else {
                System.out.printf("%s >>> Я найду работу получше! [%s - %.2f]\n", name, companyName, salary);
            }
        }
    }
}
