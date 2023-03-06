public class Main {
    public static void main(String[] args) {
        int defaultMoney = 100;
        int bonus = 0;
        int check = 1300;
        if(check > 1000) {
            bonus = (check - 100) / defaultMoney;
            System.out.println("Ваш бонус = " + bonus + " руб");
        }
        else {
            System.out.println("Пополи счет, обезьяна");
        }

    }
}