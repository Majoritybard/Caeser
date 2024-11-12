import java.util.Scanner;

public class Verwaltung {
    public Verwaltung() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Bubblesort");
            System.out.println("[2] Selectionsort");
            System.out.println("[3] Insertionsort");
            System.out.println("[4] Selectionsort");
            System.out.println("[5] Quicksort");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Wieviele Zahlen sollen sortiert werden?");
                String zeichenkette = scanner.nextLine();
                int groesse = Integer.parseInt(zeichenkette);
                sort = new Sortieren(groesse);
                System.out.println("=======unsortierte Menge=======");
                this.sort.Ausgabe();
                this.sort.bubblesort();
                System.out.println("=======sortierte Menge=======");
                this.sort.Ausgabe();

            } else if (option == 2) {
                System.out.println("Wieviele Zahlen sollen sortiert werden?");
                String zeichenkette = scanner.nextLine();
                int groesse = Integer.parseInt(zeichenkette);
                sort = new Sortieren(groesse);
                System.out.println("=======unsortierte Menge=======");
                this.sort.Ausgabe();
                this.sort.selectionSort();
                System.out.println("=======sortierte Menge=======");
                this.sort.Ausgabe();
            }
            else if (option == 3) {
                System.out.println("Wieviele Zahlen sollen sortiert werden?");
                String zeichenkette = scanner.nextLine();
                int groesse = Integer.parseInt(zeichenkette);
                sort = new Sortieren(groesse);
                System.out.println("=======unsortierte Menge=======");
                this.sort.Ausgabe();
                this.sort.insertionsort();
                System.out.println("=======sortierte Menge=======");
                this.sort.Ausgabe();
            }
            if (option == 4) {
                System.out.println("Wieviele Zahlen sollen sortiert werden?");
                String zeichenkette = scanner.nextLine();
                int groesse = Integer.parseInt(zeichenkette);
                sort = new Sortieren(groesse);
                System.out.println("=======unsortierte Menge=======");
                this.sort.Ausgabe();
                this.sort.selectionSort();
                System.out.println("=======sortierte Menge=======");
                this.sort.Ausgabe();
            }
            if (option == 5) {
                System.out.println("Wieviele Zahlen sollen sortiert werden?");
                String zeichenkette = scanner.nextLine();
                int groesse = Integer.parseInt(zeichenkette);
                sort = new Sortieren(groesse);
                System.out.println("=======unsortierte Menge=======");
                this.sort.Ausgabe();
                this.sort.quickSort();
                System.out.println("=======sortierte Menge=======");
                this.sort.Ausgabe();

            }else if (option == 0) {
                break;
            }
            System.out.println();
        }

}