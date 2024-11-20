import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Banco {

    String name;
    String accNum;
    String password;
    private double cash = 0;

    public Banco (String name, String accNum, String password, double cash){
        this.name = name;
        this.accNum = accNum;
        this.password = password;
        this.cash = cash;
    }

    public void showAll() {
        System.out.printf("Titular: %s, Número: %s, Saldo: R$ %.2f%n\n", name, accNum, cash);
    }

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    static void create(ArrayList<Banco> contas) {
        System.out.printf("Digite o nome da contas: ");
        String name = scanner.nextLine();
        System.out.printf("Digite a senha da sua conta: ");
        String password = scanner.nextLine();
        int AccInt = random.nextInt(0,10001);
        String accNum = Integer.toString(AccInt);
        System.out.println("Conta criada com sucesso!");
        contas.add(new Banco(name, accNum, password, 0));
        contas.get(contas.size() - 1).showAll();
    }

    void cashOut(double amount) {

        if (amount > 0 && amount <= this.cash) {
            this.cash -= amount;
            System.out.printf("Saque de: R$ %.2f realizado, Saldo atual é de: R$ %.2f.\n", amount, this.cash);
        }
        else
            System.out.println("Saldo insuficiente para essa operação");


    }

    void deposit(double amount) {
        if (amount > 0) {
            this.cash += amount;
            System.out.printf("Deposito de: R$ %.2f realizado com sucesso!, Saldo atual é de: R$ %.2f.\n", amount, this.cash);
        }
        else
            System.out.println("Deposite um valor maior que 0(zero).");
    }

    void transfer(double amount, int index, ArrayList<Banco> contas) {
        if (amount > 0 && amount <= this.cash) {
            this.cash -= amount;
            contas.get(index).cash += amount;
            System.out.printf("Valor transferido com sucesso (R$ %.2f), saldo atual da conta: %.2f.\n", amount, this.cash);
        }
        else
            System.out.printf("Valor indisponivel!\n");
    }
}
