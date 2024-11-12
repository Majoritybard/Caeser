public class Caeser {
   private String Kt;
    private String Gt;
    private int S;

    public Caeser(){
        Kt="";
        Gt="";


    }
    public void verschlüsseln() {

        for (int i = 0; i < Kt.length(); i++) {
            Gt =Gt + (char) (Kt.charAt(i) + S);
        }


    }

    private void entschlüsseln(){


    }
    private int getASCII(char pWert){
    return(int)pWert;

    }

    private char getChar(int pWert){
    return(char)pWert;

    }

    public void setKt(String pWert){
        this.Kt=pWert;


    }

    private String getKt(){
        return Kt;

    }


    private void setS(int pWert){
    this.S=pWert;

    }

}
