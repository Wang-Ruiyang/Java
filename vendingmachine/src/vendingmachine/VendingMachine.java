package vendingmachine;

public class VendingMachine {
    int price = 80;
    int balance;
    int total;

    void showPrompt() {
        System.out.println("Welcome");
    }

    void insertMoney(int amount) {
        balance = balance + amount;
    }

    void showBalance() {
        System.out.println(balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are.");
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        VendingMachine vm1 = new VendingMachine();     //每个对象的属性一样但是值不一样
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();

        vm1.showPrompt();
        vm1.showBalance();
    }
}
