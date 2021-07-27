import java.util.Scanner;
import java.util.Arrays;

public class PakuriProgram {
    public static void printMenu() {
        System.out.println();
        System.out.println("Pakudex Main Menu");
        System.out.println("-----------------");
        System.out.println("1. List Pakuri");
        System.out.println("2. Show Pakuri");
        System.out.println("3. Add Pakuri");
        System.out.println("4. Evolve Pakuri");
        System.out.println("5. Sort Pakuri");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("What would you like to do? ");
    }
    public static int getMenuOption(String menuOption) {
        int menuChoice = 0;
        try {
            menuChoice = Integer.parseInt(menuOption);
        }
        catch (NumberFormatException e) {
            return -1;
        }
        return menuChoice;
    }
    public static int getMaxCap(String maxCap) {
        int capacity = 0;
        try {
            capacity = Integer.parseInt(maxCap);
        }
        catch (NumberFormatException e) {
            return -1;
        }
        return capacity;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String species = "";
        String maxCap = null;

        System.out.println("Welcome to Pakudex: Tracker Extraordinaire!");
        System.out.print("Enter max capacity of the Pakudex: ");
        maxCap = scnr.next();
        while ((getMaxCap(maxCap) == -1)|| (maxCap.charAt(0) == '-')) {
            System.out.println("Please enter a valid size.");
            System.out.print("Enter max capacity of the Pakudex: ");
            maxCap = scnr.next();
        }
        Pakudex pakudex = new Pakudex(getMaxCap(maxCap));
        System.out.println("The Pakudex can hold " + maxCap + " species of Pakuri.");
        System.out.println();
        System.out.println("Pakudex Main Menu");
        System.out.println("-----------------");
        System.out.println("1. List Pakuri");
        System.out.println("2. Show Pakuri");
        System.out.println("3. Add Pakuri");
        System.out.println("4. Evolve Pakuri");
        System.out.println("5. Sort Pakuri");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("What would you like to do? ");
        String menuOption = scnr.next();
        while (getMenuOption(menuOption) != 6) {
            // list pakuri
            if (getMenuOption(menuOption) == 1) {
                String[] speciesArray = pakudex.getSpeciesArray();
                pakudex.sortPakuri();
                if (speciesArray == null) {
                    System.out.println("No Pakuri in Pakudex yet!");
                } else {
                    System.out.println("Pakuri In Pakudex: ");
                    for (int i = 0; i < speciesArray.length; i++) {
                        if (speciesArray[i] != null) {
                            System.out.println(i + 1 + ". " + speciesArray[i]);
                        } else {
                            break;
                        }
                    }
                }
                printMenu();
                menuOption = scnr.next();

            }
            // show pakuri
            else if (getMenuOption(menuOption) == 2) {
                int[] statsArray = new int[3];
                System.out.print("Enter the name of the species to display: ");
                species = scnr.next();
                statsArray = pakudex.getStats(species);

                if (statsArray == null) {
                    System.out.println("Error: No such Pakuri!");
                } else {
                    System.out.println();
                    System.out.println("Species: " + species);
                    System.out.println("Attack: " + statsArray[0]);
                    System.out.println("Defense: " + statsArray[1]);
                    System.out.println("Speed: " + statsArray[2]);
                }
                printMenu();
                menuOption = scnr.next();

            }
            // add pakuri
            else if (getMenuOption(menuOption) == 3) {
                if (pakudex.getCapacity() == pakudex.getSize()) {
                    System.out.println("Error: Pakudex is full!");
                    printMenu();
                    menuOption = scnr.next();
                    continue;
                }
                System.out.print("Enter the name of the species to add: ");
                species = scnr.next();
                boolean x = pakudex.addPakuri(species);
                if (x) {
                    System.out.println("Pakuri species " + species + " successfully added!");
            }
            printMenu();
            menuOption = scnr.next();
        }
            // evolve pakuri
            else if (getMenuOption(menuOption) == 4) {
                System.out.print("Enter the name of the species to evolve: ");
                species = scnr.next();
                boolean evolved = pakudex.evolveSpecies(species);
                if (!evolved) {
                    System.out.println("Error: No such Pakuri!");
                } else {
                    System.out.println(species + " has evolved!");
                }
                printMenu();
                menuOption = scnr.next();
            }
            // sort pakuri
            else if (getMenuOption(menuOption) == 5) {
                pakudex.sortPakuri();
                System.out.println("Pakuri have been sorted!");
                printMenu();
                menuOption = scnr.next();
            }
            else if ((getMenuOption(menuOption) == -1)
                    || (menuOption.charAt(0) == '-')
                    || (getMenuOption(menuOption) > 6) || getMenuOption(menuOption) <= 0) {
                System.out.println("Unrecognized menu selection!");
                printMenu();
                menuOption = scnr.next();
            }
        }
        System.out.println("Thanks for using Pakudex! Bye!");
    }
}
