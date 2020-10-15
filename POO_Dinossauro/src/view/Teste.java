package view;

import java.util.Scanner;

import controller.Dinossauro;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dinossauro skeep = new Dinossauro(0,0,35,false);
        int option;

        do{
            System.out.println("Os dados do " +
                    skeep.toString() + "\n");
            System.out.println("" +
                    "        [1]Pular\n" +
                    "        [2]Acelerar\n" +
                    "        [3]Comer\n" +
                    "        [4]Disparar\n" +
                    "        [5]Tomar Sol\n" +
                    "        [6]Ficar na Sombra\n" +
                    "        [9]Encerrar");
            System.out.println("Você está no controle de Skeep, o dinossauro, digite a ação que deseja fazer\n");
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("PULAR");
                    skeep.pular();
                    break;
                case 2:
                    skeep.correr();
                    System.out.println("ACELERAR");
                    break;
                case 3:
                    skeep.comer();
                    System.out.println("COMER");
                    break;
                case 4:
                    skeep.atirar();
                    System.out.println("DISPARAR");
                    break;
                case 5:
                    skeep.tomarSol();
                    System.out.println("TOMAR SOL");
                    break;
                case 6:
                    skeep.ficarNaSombra();
                    System.out.println("FICAR NA SOMBRA");
                    break;
                case 9:
                    System.out.println("ENCERRAR");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while (option!= 9);
    }
}
