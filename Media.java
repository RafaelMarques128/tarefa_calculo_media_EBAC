import java.util.Scanner;

class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int n3 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int n4 = scanner.nextInt();

        scanner.close();

        double media = (double) (n1 + n2 + n3 + n4) / 4;

        System.out.println("A soma da média é: " + media);
    }


}