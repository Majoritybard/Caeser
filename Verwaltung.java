import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caeser caeser;

    private Veginere veginere;

    public static void main(String[] args){
        new Verwaltung();

    }
    public Verwaltung() {
        veginere= new Veginere();
        caeser=new Caeser();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Verschlüsseln (Verschlüsselt ein vom User angegebenes Wort)(Caeser)" );
            System.out.println("[2] Entschlüsseln (Entschlüsselt ein vom User angegebenes Wort)(Caeser)");
            System.out.println("[3] Verschlüsseln (Verschlüsselt ein vom User angegebenes Wort)(Viginere)");
            System.out.println("[4] Entschlüsseln (Entschlüsselt ein vom User angegebenes Wort)(Viginere)");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Welches Wort soll Verschlüsselt werden?");
                String optionString = scanner.nextLine();
                caeser.setKt(optionString);
                System.out.println("Gib den Schlüssel an (verschiebt das angegebene Wort um den Schlüssel nach links im Alphabet)");
                option = scanner.nextInt();
                caeser.setS(option);
                caeser.verschlüsseln();
            System.out.println("Das verschlüsselte Wort ist " + caeser.getGt());
            } else if (option == 2) {
                System.out.println("Welches Wort soll entschlüsselt werden?");
                String optionString = scanner.nextLine();
                caeser.setGt(optionString);
                System.out.println("Was ist der Schlüssel? (Entschlüsselt das Wort mit dem Schlüssel indem es im Aphabet nach links geht)");
                option = scanner.nextInt();
                caeser.setS(option);
                caeser.entschlüsseln();
                System.out.println("Das entschlüsselte wort ist " + caeser.getKt());


            }

            else if (option == 3) {
                System.out.println("Welches Wort soll Verschlüsselt werden?");
                String optionString = scanner.nextLine();
                veginere.setKt(optionString);
                System.out.println("Gib den Schlüssel an (verschiebt das angegebene Wort um den Schlüssel nach links im Alphabet)");
                optionString= scanner.nextLine();
                veginere.setS(optionString);
                veginere.verschlüsseln();
                System.out.println("Das verschlüsselte Wort ist " + veginere.getGt());
            }
             else if (option == 4) {
                System.out.println("Welches Wort soll entschlüsselt werden?");
                String optionString = scanner.nextLine();
                veginere.setGt(optionString);
                System.out.println("Was ist der Schlüssel? (Entschlüsselt das Wort mit dem Schlüssel indem es im Aphabet nach links geht)");
                optionString= scanner.nextLine();
                veginere.setS(optionString);
                veginere.entschlüsseln();
                System.out.println("Das entschlüsselte wort ist " + veginere.getKt());


           }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }


    }
    }

