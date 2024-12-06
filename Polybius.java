public class Polybius extends Kryptomat {

    // Zwei-dimensionale Matrix, die das Polybius-Quadrat darstellt.
    // Hier wird ein 6x6-Quadrat verwendet, um alle Zeichen zu speichern.
    int[][] alphabetQuadrat;

    // Konstruktor der Klasse. Wird hier nicht benötigt, da keine spezielle Initialisierung erfolgt.
    Polybius(){
    }

    // Überschreibt die abstrakte Methode 'verschluesseln' aus der Kryptomat-Klasse.
    @Override
    public void verschluesseln() {
        // Initialisiert das Polybius-Quadrat.
        this.bfms();

        // Setzt den Geheimtext (Gt) auf einen leeren String.
        Gt = "";

        // Durchläuft jeden Buchstaben im Klartext (Kt) und verschlüsselt ihn.
        for (int i = 0; i < Kt.length(); i++) {
            for (int j = 1; j < alphabetQuadrat.length; j++) {
                for (int h = 1; h < alphabetQuadrat.length; h++) {
                    // Vergleicht den aktuellen Buchstaben mit den Zeichen im Quadrat.
                    if (Kt.charAt(i) == alphabetQuadrat[j][h]) {
                        // Wenn der Buchstabe gefunden wird, wird seine Position (j, h) im Geheimtext gespeichert.
                        Gt = Gt + j + h;  // j und h werden an den Geheimtext angehängt.
                    }
                }
            }
        }
    }

    // Überschreibt die abstrakte Methode 'entschluesseln' aus der Kryptomat-Klasse.
    @Override
    public void entschluesseln() {
        // Initialisiert das Polybius-Quadrat.
        this.bfms();

        // Setzt den Klartext (Kt) auf einen leeren String.
        Kt = "";

        // Durchläuft den Geheimtext und entschlüsselt ihn.
        for (int i = 0; i < Gt.length() - 1; i++) {
            // Holt sich die beiden Ziffern des Geheimtextes, die jeweils eine Position im Polybius-Quadrat darstellen.
            int k = Gt.charAt(i);
            int g = Gt.charAt(i + 1);

            // Wandelt die ASCII-Werte der Ziffern in die tatsächlichen Werte um.
            k = k - 48;  // ASCII-Wert für '0' ist 48
            g = g - 48;  // ASCII-Wert für '0' ist 48

            // Sucht nach der entsprechenden Position im Polybius-Quadrat.
            for (int j = 1; j < alphabetQuadrat.length; j++) {
                for (int h = 1; h < alphabetQuadrat.length; h++) {
                    // Wenn die Koordinaten j und h mit k und g übereinstimmen, wird der entsprechende Buchstabe entschlüsselt.
                    if (k == j && g == h) {
                        Kt += getChar(alphabetQuadrat[j][h]);  // Das entschlüsselte Zeichen wird zum Klartext hinzugefügt.
                    }
                }
            }
        }
    }

    // Methode zur Initialisierung des Polybius-Quadrats mit den ASCII-Zeichen.
    public void bfms() {
        // Startwert für das Alphabet (ASCII-Wert von 'a' = 97).
        char a = 97;

        // Initialisiert das 6x6-Polybius-Quadrat.
        alphabetQuadrat = new int[6][6];

        // Durchläuft das Quadrat und füllt es mit den Zeichen des Alphabets.
        for (int zeile = 1; zeile < alphabetQuadrat.length; zeile++) {
            for (int spalte = 1; spalte < alphabetQuadrat.length; spalte++) {
                alphabetQuadrat[zeile][spalte] = a;  // Setzt das Zeichen an die entsprechende Position im Quadrat.

                // Wenn das Zeichen 'i' erreicht wird, überspringt die Schleife den Buchstaben 'j',
                // da in der Polybius-Quadrat-Methode oft 'i' und 'j' zusammengelegt werden.
                if (a == 105) {  // 'i' im ASCII ist 105
                    a++;
                }

                // Erhöht den Wert von 'a' für das nächste Zeichen im Alphabet.
                a++;
            }
        }
    }
}
