import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caeser caeser;
    public static void main(String[] args){
        new Verwaltung();


    }
    public Verwaltung() {
        caeser=new Caeser();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Verschlüsseln");
            System.out.println("[2] Entschlüsseln");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Welches Wort soll Verschlüsselt werden?");
                String optionString = scanner.nextLine();
                caeser.setKt(optionString);
                System.out.println("Gib den Schlüssel an");
                option = scanner.nextInt();
                caeser.setS(option);
                caeser.verschlüsseln();
            System.out.println("Das verschlüsselte Wort ist " + caeser.getGt());
            } else if (option == 2) {
                caeser.verschlüsseln();
                System.out.println("Das entschlüsselte wort ist " + caeser.getKt());


            } else if (option == 0) {
                break;
            }
            System.out.println();
        }


    }
    }

