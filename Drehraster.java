public class Drehraster extends Kryptomat {
    int S;

    @Override
    public void verschluesseln() {
        Gt="";
        int k=0;
        int g=Kt.length()/S;
        for (int i=0;i<S;i++){
            k=i;
         for (int j=0; j<g;j++){

             Gt=Gt +Kt.charAt(k);
             k=k+S;



         }

     }
    }

    @Override
    public void entschluesseln() {

    }
    public void setS(int pWert){
        this.S=pWert;

    }
}
