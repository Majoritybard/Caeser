public class Veginere extends Kryptomat {


    private String S;

public Veginere(){
    S="";


}
public void verschlüsseln(){
    Gt="";
for (int i=0;i<Kt.length();i++){

    int c=this.getASCII((S.charAt(i % S.length())));
    int h=this.getASCII(Kt.charAt(i));
    int j = ((c - 97) % 26);
    Gt= Gt + this.getChar(h+j);
    j=j+97;
}
}

public void entschlüsseln(){
  Kt="";
    for (int i=0;i<Gt.length();i++){
       int c=this.getASCII((S.charAt(i % S.length())));
       int h=this.getASCII(Gt.charAt(i));
       int j=c-97;
       if (h-j<97){
          Kt=Kt+this.getChar(h-j+26);
       }
       else {       Kt=Kt + this.getChar(h-j);
       }


    }

}

   public String getS(){
    return S;

   }

    public void setS(String pWert){
        this.S=pWert;

    }

}