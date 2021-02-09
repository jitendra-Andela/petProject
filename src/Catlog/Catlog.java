package Catlog;
import Birds.Bird;
import Cats.Cat;
import Dogs.Dog;
import Fish.Fish;
import Reptile.Reptile;

import java.util.Scanner;

public class Catlog {
         static Scanner scanner = new Scanner(System.in);
        public static void petStore() {

        while (true) {
            System.out.printf("1.Fish \n  SaltWater,  FreshWater\n");
            System.out.println("----------------------------------- ");
            System.out.printf("2.Dogs \n  Various Breeds\n");
            System.out.println("----------------------------------- ");
            System.out.printf("3.Cats \n  Various Breeds , Exotic Varities\n");
            System.out.println("----------------------------------- ");
            System.out.printf("4.Reptiles \n Lizards, Turtles,  Snakes\n");
            System.out.println("----------------------------------- ");
            System.out.printf("5.Birds \n  Exotic Varities\n");
            System.out.println("----------------------------------- ");
            System.out.println("Enter Your choice :");
            processUserChoice(scanner.nextInt());

        }
    }

    public static void processUserChoice(int userChoice) {
        switch (userChoice) {
            case 1:
                Fish.chooseFishOption();
                break;
            case 2:
                Dog.chooseDogOption();
                break;
            case 3:
                Cat.chooseCatOption();
                break;
            case 4:
                Reptile.chooseReptileOption();
                break;
            case 5:
                Bird.chooseBirdsOption();
                break;
        }
    }

    }

