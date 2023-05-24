package ru.geekbrains.lesson7.observer;

public class Program {

    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", VacancyType.TESTER);
        Master sidorov = new Master("Sidorov", VacancyType.DESIGNER);
        Student petrov = new Student("Petrov", VacancyType.DATASCIENTIST);
        Middle sergeev = new Middle("Sergeev", VacancyType.DEVELOPER);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sergeev);

        for (int i = 0; i < 10; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }
}