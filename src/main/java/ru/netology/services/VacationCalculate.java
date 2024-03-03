package ru.netology.services;

public class VacationCalculate {
    public int calculate(int income, int expenses, int threshold) {
        int countVacation = 0; // счётчик месяцев отдыха
        int money = 0;// количество денег на счету

        for (int month = 1; month <= 12; month++) {

            if (money < threshold) { // можем ли отдыхать?
                System.out.println("Месяц " + month + "." + " Денег " + money + ". " + "Придётся работать. Заработал +" + income + " потратил -" + expenses);
                money = money + income - expenses;

            } else {
                int vacMoneyBalance = money - expenses;
                int vacMoney = vacMoneyBalance - ((money - expenses) / 3);
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + vacMoney);
                money = (money - expenses) / 3;
                countVacation++;
            }
        }
        return countVacation;
    }
}







