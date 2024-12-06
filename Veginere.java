public class Veginere extends Kryptomat {

    // Instanzvariable, die das Schlüsselwort für die Verschlüsselung und Entschlüsselung enthält.
    private String S;

    // Konstruktor der Klasse. Initialisiert das Schlüsselwort S mit einem leeren String.
    public Veginere(){
        S = "";
    }

    // Überschreibt die abstrakte Methode 'verschluesseln' aus der Kryptomat-Klasse.
    @Override
    public void verschluesseln(){
        // Setzt den Geheimtext (Gt) auf einen leeren String.
        Gt = "";

        // Durchläuft jeden Buchstaben im Klartext (Kt) und verschlüsselt ihn.
        for (int i = 0; i < Kt.length(); i++) {
            // Bestimmt den ASCII-Wert des aktuellen Buchstabens im Schlüsselwort S, unter Berücksichtigung des Modulus.
            int c = this.getASCII((S.charAt(i % S.length())));

            // Bestimmt den ASCII-Wert des aktuellen Buchstabens im Klartext (Kt).
            int h = this.getASCII(Kt.charAt(i));

            // Berechnet den Index im Vigenère-Alphabet, wobei 97 der ASCII-Wert für 'a' ist.
            int j = ((c - 97) % 26);

            // Fügt das verschlüsselte Zeichen zum Geheimtext (Gt) hinzu.
            Gt = Gt + this.getChar(h + j);

            // Inkrementiert den Wert von j, um die Verschiebung für den nächsten Buchstaben vorzubereiten.
            j = j + 97;
        }
    }

    // Überschreibt die abstrakte Methode 'entschluesseln' aus der Kryptomat-Klasse.
    @Override
    public void entschluesseln(){
        // Setzt den Klartext (Kt) auf einen leeren String.
        Kt = "";

        // Durchläuft jeden Buchstaben im Geheimtext (Gt) und entschlüsselt ihn.
        for (int i = 0; i < Gt.length(); i++) {
            // Bestimmt den ASCII-Wert des aktuellen Buchstabens im Schlüsselwort S.
            int c = this.getASCII((S.charAt(i % S.length())));

            // Bestimmt den ASCII-Wert des aktuellen Buchstabens im Geheimtext (Gt).
            int h = this.getASCII(Gt.charAt(i));

            // Berechnet den Index für die Entschlüsselung.
            int j = c - 97;

            // Wenn der resultierende Wert kleiner als der ASCII-Wert für 'a' ist, wird der Wert "über das Ende des Alphabets" hinaus korrigiert.
            if (h - j < 97) {
                Kt = Kt + this.getChar(h - j + 26);  // Korrektur für negative Werte.
            } else {
                Kt = Kt + this.getChar(h - j);  // Normalfall, wenn der resultierende Wert innerhalb des Alphabets bleibt.
            }
        }
    }

    // Getter-Methode für das Schlüsselwort S.
    public String getS(){
        return S;
    }

    // Setter-Methode für das Schlüsselwort S.
    public void setS(String pWert){
        this.S = pWert;
    }
}
