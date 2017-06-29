package com.exemple.convertisseur;

import java.util.Scanner;

/**
 * Created by Doudou on 29/06/2017.
 */
public class Convertisseur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char reponse = ' ';


        do {
            System.out.println("Convertisseur degrés Celsius et Fahrenheit\nChoisissez un mode de conversion:\n1 - Convertisseur Celsius en Fahrenheit\n2 - Convertisseur Fahrenheit en Celsius");
            int t = sc.nextInt();
            if (t == 1) {
                System.out.println("Veuillez entrer une température:");
                sc.nextLine();
                double c = sc.nextDouble();
                double cf = c * 9/5 +32;
                System.out.println("Cela correspond à une température de " + cf + " degrés Fahrenheit");

                do {
                    System.out.println("Voulez vous recommencer? O/N");
                    sc.nextLine();
                    reponse = sc.nextLine().charAt(0);

                }while ( reponse != 'O' && reponse !='N');





            }
            else if (t==2) {
                System.out.println("Veuillez entrer une température:");
                sc.nextLine();
                double f = sc.nextDouble();
                double fc = ((f-32) * 5)/9;
                System.out.println("Cela correspond à une température de " + fc + " degrés Celsius");

                do {
                    System.out.println("Voulez vous recommencer? O/N");
                    sc.nextLine();
                    reponse = sc.nextLine().charAt(0);

                }while ( reponse != 'O' && reponse !='N');

            }
            else
                System.out.println("Veuillez saisir 1 ou 2");
        }while (reponse == 'O');
        System.out.println("Merci d'avoir utilisé ce programme, à bientôt!");
    }
}
