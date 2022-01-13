//Lection 2 Hometask 2.2 about bonus for each full 100 Rub adding
public class Main {
    public static void main(String[] args) {
        int balance = 99 ;
        int addingFunds = 100;
        int bonus  =0;

        System.out.println("Ваш старый баланс " + balance);

        if (addingFunds >= 100) {
            bonus = addingFunds / 100;
        }
        //Иначе бонус не меняется, а он объявлен 0

        balance = balance + addingFunds + bonus;
        System.out.println("При пополнении счета на " + addingFunds + " рублей Вы получили " + bonus + " Бонус");
        System.out.println("Теперь Ваш баланс составляет " + balance + " рублей");
    }
}
