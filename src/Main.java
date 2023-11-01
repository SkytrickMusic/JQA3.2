public class Main {
    public static void main(String[] args) {

        int incomingAmount = 100;
        int depositAmount = 1100;
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }
        int account = incomingAmount + depositAmount + bonusAmount;

        System.out.println("Баланс: " + account + " ₽");
        System.out.println("Бонус за пополнение: " + bonusAmount + " ₽");
    }
}
