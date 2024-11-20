import java.util.ArrayList;

public class Agenda{
    String name;
    String phone;
    int age;


    Agenda(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    static public void showData(ArrayList<Agenda> dados) {
        Methods.sort(dados);
        for (Agenda i : dados) {
            System.out.printf("Nome:\t %s\nTelefone:\t %s\nIdade:\t %d", i.name, i.phone, i.age);
            System.out.println("\n ------------------------------------ \n");
        }

    }
    static public void showData(ArrayList<Agenda> dados, int index) {

        System.out.printf("Nome:\t %s\nTelefone:\t %s\nIdade:\t %d", dados.get(index).name, dados.get(index).phone, dados.get(index).age);
        System.out.println("\n ----------------------------------------- \n");
    }

}
