public class Main {
    public static void main(String[] args) {

        int account = 100; //сумма начального счета клиента
        int convers = 2000; //сумма пополнения
        int limit = 1000; // лимит пополнения после которого начисляется +1 рубль
        int ammount; // количество бонусных рублей
        int balance; // итоговый баланс

        if (convers > limit) {
            balance = account + convers + convers / 100 + 1; //условный оператор для подсчета итогового баланса
        } else {
            balance = account + convers;
        }

        if (convers > limit) {
            ammount = convers / 100 + 1; //условный оператор для подсчета количества начисляемых бонусов
        } else {
            ammount = 0;
        }
        System.out.println(balance); //Вывод итогового баланса
        System.out.println(ammount); // Вывод количества бонусов

    }
}