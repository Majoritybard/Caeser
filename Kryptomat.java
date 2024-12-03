public abstract class Kryptomat {
    protected String Gt;
    protected String Kt;


    public Kryptomat(){
        Gt="";
        Kt="";

    }

    public abstract void verschluesseln();
    public abstract void entschluesseln();
    public  char getChar(int pWert) {
        return (char) pWert;
    }
    public  int getASCII(char pWert) {
        return pWert;  // Gibt den ASCII-Wert des Zeichens zurück
    }

    public String getGt(){
        return Gt;

    }
    public void setGt(String pWert){
        this.Gt=pWert;

    }
    public void setKt(String pWert){
        this.Kt=pWert;


    }

    public  String  getKt(){
        return Kt;

    }

}
