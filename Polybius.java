public class Polybius extends Kryptomat{

int[][] alphabetQuadrat;
    Polybius(){


    }

    @Override
    public void verschluesseln() {
   this.bfms();
    Gt="";
    for (int i=0;i<Kt.length();i++){
     for (int j=1;j<alphabetQuadrat.length;j++) {
         for (int h = 1; h < alphabetQuadrat.length;h++){
             if (Kt.charAt(i)==alphabetQuadrat[j][h]){
                 Gt=Gt+j+h;

             }
         }


     }
    }
    }

    @Override
    public void entschluesseln() {
    this.bfms();
    Kt="";
    for (int i=0;i<Gt.length()-1;i++){
      int k=Gt.charAt(i);
      int g=Gt.charAt(i+1);
      k=k-48;
      g=g-48;
        for (int j=1; j<alphabetQuadrat.length;j++){
            for (int h=1;h<alphabetQuadrat.length;h++){
               if (k==j && g==h){
                   String s= String.valueOf(alphabetQuadrat[h][j]);
                   Kt=Kt+s;
               }

            }
        }
    }
    }
    public void bfms(){
        char  a=97;
        alphabetQuadrat= new int[6][6];
       for (int zeile=1;zeile<alphabetQuadrat.length;zeile++){
           for (int spalte=1;spalte<alphabetQuadrat.length;spalte++){
              alphabetQuadrat[zeile][spalte]=a;
                if (a == 105){
                    a++;

                }
               a++;

           }
       }

    }
}
