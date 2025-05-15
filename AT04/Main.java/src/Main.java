import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU");
            System.out.println("1 - cadastrar funcionario ");
            System.out.println("2 - exibir alta renda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                System.out.println("Digite o nome");
                String nome = sc.nextLine();
                System.out.println("Digite o salario");
                double salario = sc.nextDouble();
                funcionarios.add(new Funcionarios(nome, salario));
                System.out.println("funcionario cadastrado");
                break;

                case 2:
                    System.out.println("Salarios acima de 5k");
                    for (Funcionarios a: funcionarios) {
                        if (a.getSalario() > 5000) {
                            System.out.println(a.getNome() + "recebe " +a.getSalario());
                        }
                    }
                    break;

                case 0:
                    System.out.println("fechando a aplicacao");
                    opcao = 0;
                    break;

                default:
                    System.out.println("Escolha entre as opcao dadas");
            }
        }
        sc.close();
    }
}