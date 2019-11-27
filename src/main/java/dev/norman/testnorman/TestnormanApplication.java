package dev.norman.testnorman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TestnormanApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The World's Finest Calculator!");

        double zahl1;
        do{
            System.out.println("Geben Sie bitte Zahl 1 ein (0 nicht erlaubt):");
            zahl1 = scanner.nextDouble();
        } while (zahl1 == 0);


        double zahl2 = 0;

        do{
            System.out.println("Geben Sie bitte Zahl 2 ein (0 nicht erlaubt):");
            zahl2 = scanner.nextDouble();
        } while (zahl2 == 0);


        double ergebnis =  (zahl1 + zahl2) / (zahl1 * zahl2);

        System.out.println("Ergebnis (z1+z2)/(z1*z2):" + ergebnis);

        //SpringApplication.run(TestnormanApplication.class, args);
    }
}
