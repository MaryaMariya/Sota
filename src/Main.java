//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balans = 500; // начальная сумма на счете
        int amount = 1100; // сумма пополнения счета

        int bonus;

        if (amount >= 1000) {
            bonus = amount / 100; // колличество бонусов 1/100

        } else {
            bonus = 0;
        }

        int total = balans + bonus + amount; // итоговая сумма на счете

        System.out.println(" Вы пополнили счет на " + amount + " руб." );
        System.out.println( " Ваш бонус составил " + bonus + " руб.");
        System.out.println( " Ваш баланс " + total + " руб.");
    }
}