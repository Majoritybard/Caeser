public class Caeser {

        private String Kt;
        private String Gt;
        private int S;

    public Caeser(){
        Kt="";
        Gt="";
        S=0;


    }
    public void verschlüsseln() {
        Gt="";
        for (int i = 0; i < Kt.length(); i++) {
            int h = this.getASCII(Kt.charAt(i));
            Gt =Gt + this.getChar(h + S);
        }


    }

    public void entschlüsseln(){
     Kt="";
      for (int i=0;i<Gt.length();i++ ){
          int h= this.getASCII(Gt.charAt(i));
          Kt=Kt + this.getChar(h - S);

      }

    }
    private int getASCII(char pWert){
    return pWert;

    }

    private char getChar(int pWert){
    return(char)pWert;

    }

    public void setKt(String pWert){
        this.Kt=pWert;


    }

    public String getKt(){
        return Kt;

    }


    public void setS(int pWert){
    this.S=pWert;

    }
    public String getGt(){
        return Gt;

    }
    public void setGt(String pWert){
        this.Gt=pWert;

    }
}
