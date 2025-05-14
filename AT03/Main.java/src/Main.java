import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudante estudante = null;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Calcular média");
            System.out.println("3 - Obter número de matrícula");
            System.out.println("4 - Obter endereço");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: //case para criar estudante
                    estudante = criarEstudante(sc);
                    break;

                case 2: //case para verificar a media do estudante
                    if (estudante != null) {
                        double media = estudante.calcularMedia();
                        System.out.printf("media: %,2f\n", media);
                    } else {
                        System.out.println("estudante nao cadastrado");
                    }
                    break;

                case 3: //case para obter a matricula do aluno
                    if (estudante != null) {
                        System.out.println("matricula: " + estudante.getMatricula());
                    } else {
                        System.out.println("nenhum estudante cadastrado");
                    }
                    break;

                case 4: //case para obter o endereco do aluno
                    if (estudante != null) {
                        System.out.println("endereco: " + estudante.getEndereco());
                    } else {
                        System.out.println("nenhum estudante cadastrado");
                    }
                    break;

                case 0: //case para sair do loop
                    System.out.println("fechando a aplicacao");
                    opcao = 0;
                    break;
            }
        }
    }
    public static Estudante
    criarEstudante(Scanner sc) {
        System.out.println("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Matricula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.println("Endereco: ");
        String endereco = sc.nextLine();
        sc.nextLine();

        System.out.println("Notas: ");
        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        return new Estudante(nome, matricula, endereco, notas);
    }
}


