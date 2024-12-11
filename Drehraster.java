public class Drehraster extends Kryptomat {
    int S;

    @Override
    public void verschluesseln() {
        int k=0;
        for (int i=0;i<S;i++){
            k=i;
         for (int j=0; j<S;j++){
             if (i!=0){
             Gt=Gt+Kt.charAt(k);
             k=k+S;
             }
             else {
                 Gt=Gt+Kt.charAt(S*k);
             }

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
