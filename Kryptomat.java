// Abstrakte Klasse Kryptomat, die als Grundlage für kryptografische Maschinen oder Algorithmen dient.
public abstract class Kryptomat {

    // Geschützte Instanzvariablen, die die verschlüsselten und entschlüsselten Texte repräsentieren.
    protected String Gt;  // Gt steht für "Geheimtext" oder "Verschlüsselter Text"
    protected String Kt;  // Kt steht für "Klartext" oder "Unverschlüsselter Text"

    // Konstruktor der Klasse. Initialisiert Gt und Kt als leere Strings.
    public Kryptomat(){
        Gt = "";  // Initialisierung des Geheimtextes als leerer String
        Kt = "";  // Initialisierung des Klartextes als leerer String
    }

    // Abstrakte Methode für die Verschlüsselung, die von einer konkreten Unterklasse implementiert werden muss.
    public abstract void verschluesseln();

    // Abstrakte Methode für die Entschlüsselung, die ebenfalls von einer konkreten Unterklasse implementiert werden muss.
    public abstract void entschluesseln();

    // Methode, die einen int-Wert (ASCII-Wert) in das entsprechende Zeichen umwandelt.
    // Diese Methode wird verwendet, um ASCII-Werte in Zeichen zu konvertieren.
    public char getChar(int pWert) {
        return (char) pWert;  // Wandelt den übergebenen int-Wert in das entsprechende Zeichen um
    }

    // Methode, die ein Zeichen in den entsprechenden ASCII-Wert umwandelt.
    // Diese Methode gibt den ASCII-Wert des übergebenen Zeichens zurück.
    public int getASCII(char pWert) {
        return pWert;  // Gibt den ASCII-Wert des Zeichens zurück
    }

    // Getter-Methode für das Attribut Gt (Geheimtext).
    public String getGt(){
        return Gt;  // Gibt den Geheimtext zurück
    }

    // Setter-Methode für das Attribut Gt (Geheimtext).
    public void setGt(String pWert){
        this.Gt = pWert;  // Setzt den Wert von Gt auf den übergebenen Wert
    }

    // Setter-Methode für das Attribut Kt (Klartext).
    public void setKt(String pWert){
        this.Kt = pWert;  // Setzt den Wert von Kt auf den übergebenen Wert
    }

    // Getter-Methode für das Attribut Kt (Klartext).
    public String getKt(){
        return Kt;  // Gibt den Klartext zurück
    }

}
