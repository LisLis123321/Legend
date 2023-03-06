public class Main {
    public static void main(String[] args) {
        int defaultMoney = 100;
        int bonus = 0;
        int check = 1100;
        if(check > 1000) {
            bonus = check / defaultMoney;
            System.out.println("Ваш бонус = " + bonus + " руб");
        }
        else {
            System.out.println("Пополи счет, обезьяна");
        }

    }
}