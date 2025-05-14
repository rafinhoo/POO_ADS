import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU");
            System.out.println("1 - criar circulo");
            System.out.println("2 - calcular area");
            System.out.println("3 - calcular perimetro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    circulo = criarCirculo(sc);
                    System.out.println("circulo criado");
                    break;

                case 2:
                    if (circulo != null) {
                        System.out.println("a area eh: " + circulo.calcularArea());
                    } else {
                        System.out.println("circulo nao existente");
                    }
                    break;
                case 3:
                    if (circulo != null) {
                        System.out.println("o perimetro eh: " + circulo.calcularPerimetro());
                    } else {
                        System.out.println("circulo nao existente");
                    }
                    break;

                case 0:
                    System.out.println("fechando a aplicacao");
                    opcao = 0;
                    break;
            }
        }
        sc.close();
    }
public static Circulo
criarCirculo(Scanner sc) {
    System.out.println("informe o raio");
    double raio = sc.nextDouble();
    return new Circulo(raio);
    }
}
