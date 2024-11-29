/**
 * Die Klasse `Caeser` implementiert die Caesar-Verschlüsselung, auch bekannt als Caesar Cipher.
 * Diese Methode verschlüsselt und entschlüsselt Text mithilfe einer Verschiebung (Shift-Wert).
 * Die Verschlüsselung verschiebt die Zeichen im Text um einen bestimmten Wert im Alphabet.
 */
public class Caeser extends Kryptomat {

    // Die Variable speichert den Klartext (unverschlüsselter Text)


    // Die Verschiebung, um die die Zeichen verschoben werden (Shift-Wert)
    private int S;

    /**
     * Konstruktor der Klasse `Caeser`.
     * Initialisiert die Variablen `Kt` und `Gt` als leere Strings und `S` als 0.
     */
    public Caeser() {
        S = 0;     // Verschiebung ist anfangs 0
    }

    /**
     * Verschlüsselt den Klartext (`Kt`) mit der Caesar-Verschlüsselung und speichert das Ergebnis in `Gt`.
     * Jedes Zeichen des Klartexts wird um den Wert von `S` verschoben.
     */
    public void verschlüsseln() {
        Gt = "";  // Leert den Geheimtext vor der Verschlüsselung

        // Durchläuft jedes Zeichen des Klartexts und verschlüsselt es
        for (int i = 0; i < Kt.length(); i++) {
            int h = this.getASCII(Kt.charAt(i));  // Konvertiert das Zeichen in seinen ASCII-Wert
            Gt = Gt + this.getChar((((h + S) - 97) % 26) + 97);  // Verschiebt den ASCII-Wert und fügt das Ergebnis zum Geheimtext hinzu
        }
    }

    /**
     * Entschlüsselt den Geheimtext (`Gt`) mit der Caesar-Verschlüsselung und speichert das Ergebnis in `Kt`.
     * Jedes Zeichen des Geheimtexts wird um den Wert von `S` rückwärts verschoben.
     */
    public void entschlüsseln () {
        Kt = "";  // Leert den Klartext vor der Entschlüsselung

        // Durchläuft jedes Zeichen des Geheimtexts und entschlüsselt es
        for (int i = 0; i < Gt.length(); i++) {
            int h = this.getASCII(Gt.charAt(i));  // Konvertiert das Zeichen in seinen ASCII-Wert
            Kt = Kt + this.getChar((((h - S) - 97) % 26) + 97);  // Verschiebt den ASCII-Wert rückwärts und fügt das Ergebnis zum Klartext hinzu
        }  //-97)%25)+97) Verhindert, dass ein Wert außerhalb des kleinen Alphabets aufgeruft wird
    }

    /**
     * Gibt den ASCII-Wert eines Zeichens zurück.
     * @param pWert Das Zeichen, dessen ASCII-Wert ermittelt werden soll.
     * @return Der ASCII-Wert des übergebenen Zeichens.
     */

    /**
     * Gibt das Zeichen zurück, das dem übergebenen ASCII-Wert entspricht.
     * @param pWert Der ASCII-Wert, der in ein Zeichen umgewandelt werden soll.
     * @return Das Zeichen, das dem ASCII-Wert entspricht.
     */

    /**
     * Setzt den Klartext (`Kt`), der verschlüsselt oder entschlüsselt werden soll.
     *
     * @param pWert Der Klartext, der gesetzt werden soll.
     */


    public void setS(int pWert) {
        this.S = pWert;  // Setzt die Verschiebung
    }

    /**
     * Gibt die aktuelle Verschiebung (`S`) zurück.
     *
     * @return Die aktuelle Verschiebung.
     */
    public int getS() {
        return S;  // Gibt die Verschiebung zurück
    }

    /**
     * Gibt den aktuellen Geheimtext (`Gt`) zurück.
     * @return Der aktuelle Geheimtext.
     */
}
