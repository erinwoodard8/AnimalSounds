package com.tts;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String animal = "";



         while (!animal.equals("0")) {
             System.out.println("Name an animal. (0 to exit)");
             animal = input.nextLine().toLowerCase();

                switch (animal) {
                    case "cow":
                        System.out.println("Moo");
                        break;
                    case "cat":
                        System.out.println("Meow");
                        break;
                    case "dog":
                        System.out.println("Woof");
                        break;
                    case "bird":
                        System.out.println("Tweet-tweet");
                        break;
                    case "t-rex":
                        System.out.println("Rawr");
                        break;
                    case "0":
                        System.out.println("You quitter...");
                        break;
                    default:
                        System.out.println("Idk");
            }

        }
    }
}

//    String modeOfTransportation;
//        System.out.println("Mode of transportation:");
//                switch (favoriteColor) {
//                case "red" -> modeOfTransportation = "helicopter";
//                case "orange" -> modeOfTransportation = "subways";
//                case "yellow" -> modeOfTransportation = "boats";
//                case "green" -> modeOfTransportation = "buses";
//                case "blue" -> modeOfTransportation = "trains";
//                case "indigo" -> modeOfTransportation = "cars";
//                case "violet" -> modeOfTransportation = "biking";
//default -> modeOfTransportation = "foot";
//        }

