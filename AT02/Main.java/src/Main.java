import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU");
            System.out.println("1 - criar retangulo ");
            System.out.println("2 - calcular perimetro");
            System.out.println("3 - calcular area");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    retangulo = criarRetangulo(sc);
                    System.out.println("Retangulo criado");
                    break;

                case 2:
                    if (retangulo != null) {
                        System.out.println("o perimetro eh: " + retangulo.calcularPerimetro());
                    } else {
                        System.out.println("o retangulo ainda nao existe");
                    }
                    break;

                case 3:
                    if (retangulo != null) {
                        System.out.println("a area eh: " + retangulo.calcularArea());
                    } else {
                        System.out.println("o retangulo ainda nao existe");
                    }
                    break;

                case 0:
                    System.out.println("fechando a aplicacao");
                    opcao = 0;
                    break;
            }
        }
    }

    public static Retangulo criarRetangulo(Scanner sc) {
        System.out.println("diga a base do seu retangulo: ");
        double base = sc.nextDouble();
        System.out.println("diga a altura do seu retangulo: ");
        double altura = sc.nextDouble();
        return new Retangulo(base, altura);
    }
}