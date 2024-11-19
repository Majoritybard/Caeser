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

for (int i=0;i<Kt.length();i++){
 Kt="";
    int h=this.buchstabenzuZahlen(Kt.charAt(i));
 int j=this.buchstabenzuZahlen(S.charAt(i%S.length()));
 Gt= Gt + this.zahlenZuBuchstaben(h+j);
}
}

public void entschlüsseln(){
  Gt="";
    for (int i=0;i<Gt.length();i++){
       int h=this.buchstabenzuZahlen(Gt.charAt(i));
       int j=this.buchstabenzuZahlen(S.charAt(i%S.length()));
       Kt=Kt + this.zahlenZuBuchstaben(h-j);

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