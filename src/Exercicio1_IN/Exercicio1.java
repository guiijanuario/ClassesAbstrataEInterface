package Exercicio1_IN;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        FabricaLampada fabrica = new FabricaLampada();

        System.out.println("Qual tipo de lâmpada você deseja construir? (incandescente/fluorescente)");
        Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();

        Lampada lampada = fabrica.construir(tipo);

        boolean sair = false;
        int nav;
        do {
            System.out.println("\n[-----------------------------]");
            System.out.println("[--- 1 para ligar a lâmpada --]");
            System.out.println("[- 2 para desligar a lâmpada -]");
            System.out.println("[------ 3 para encerrar ------]");
            System.out.println("[-----------------------------]");
            nav = sc.nextInt();

         switch (nav){
            case 1:
                System.out.println("\n[-------------------------------]");
                lampada.ligar();
                System.out.println("[-------------------------------]");
                break;
            case 2:
                System.out.println("\n[-------------------------------]");
                lampada.desligar();
                System.out.println("[-------------------------------]");
                break;
            case 3:
                sair = true;
                System.out.println("\n[----------------------------------------------]");
                System.out.println(" Você encerrou o programa, obrigado e até mais!");
                System.out.println("[----------------------------------------------]");
                break;
            default:
                System.out.printf("Digite um número válido!");
            }
        }while(!sair);
    }
}
