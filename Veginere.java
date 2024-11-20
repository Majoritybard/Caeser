public class Veginere {

    private String Kt;
    private String Gt;
    private String S;

public Veginere(){
    Kt="";
    Gt="";
    S="";


}
public void verschlüsseln(){
    Gt="";
for (int i=0;i<Kt.length();i++){

    int c=this.buchstabenzuZahlen((S.charAt(i % S.length())));
    int h=this.buchstabenzuZahlen(Kt.charAt(i));
    int j = ((c - 97) % 26);
    Gt= Gt + this.zahlenZuBuchstaben(h+j);
    j=j+97;
}
}

public void entschlüsseln(){
  Kt="";
    for (int i=0;i<Gt.length();i++){
       int c=this.buchstabenzuZahlen((S.charAt(i % S.length())));
       int h=this.buchstabenzuZahlen(Gt.charAt(i));
       int j=((c-26)%26);
       Kt=Kt + this.zahlenZuBuchstaben(h-j);
       j=j+26;
    }

}
  public char zahlenZuBuchstaben(int pWert){
 return (char)pWert;

  }

  public int buchstabenzuZahlen(char pWert){
 return pWert;

  }
    public void setKt(String pWert){
        this.Kt=pWert;


    }

    public String getKt(){
        return Kt;

    }
   public String getS(){
    return S;

   }

    public void setS(String pWert){
        this.S=pWert;

    }
    public String getGt(){
        return Gt;

    }
    public void setGt(String pWert){
        this.Gt=pWert;

    }

}