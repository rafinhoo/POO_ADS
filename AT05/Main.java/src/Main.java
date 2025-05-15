import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudante> estudantes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - cadastrar estudante");
            System.out.println("2 - buscar estudante por matrícula");
            System.out.println("3 - Calcular média e mostrar se foi aprovado");
            System.out.println("0 - Sair");
            System.out.print("escolha uma opca: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    int mat = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Nota 1: ");
                    double nota1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = sc.nextDouble();
                    estudantes.add(new Estudante(mat, nome, nota1, nota2));
                    System.out.println("estudante cadastrado.");
                    break;

                case 2:
                    System.out.print("Digite a matrícula: ");
                    int matriculaBusca = sc.nextInt();
                    boolean achou = false;
                    for (Estudante e : estudantes) {
                        if (e.getMatricula() == matriculaBusca) {
                            System.out.println("Nome: " + e.getNome());
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("estudante nao foi encontrado");
                    }
                    break;
                case 3:
                    System.out.print("digite a matricula: ");
                    int matriculaMedia = sc.nextInt();
                    boolean encontrado = false;
                    for (Estudante e : estudantes) {
                        if (e.getMatricula() == matriculaMedia) {
                            double media = e.calcularMedia();
                            System.out.println("media: " + media);
                            System.out.println(e.aprovado() ? "aprovado" : "reprovado");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("estudante nao encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("fechando o programa");
                    break;

            }

        } while (opcao != 0);

        sc.close();
    }
}