public class Polybius extends Kryptomat{

int[][] alphabetQuadrat;
    Polybius(){


    }

    @Override
    public void verschluesseln() {
   this.bfms();
    Gt="";
    int k=0;
    for (int i=1;i<Kt.length();i++){
     for (int j=1;j<Kt.length();j++){
         if (Kt.charAt(k)==alphabetQuadrat[i][j]){
          Gt=Gt+i*10+j;
            i=1;
            j=1;
            k++;
         }

     }
    }
    }

    @Override
    public void entschluesseln() {

    }
    public void bfms(){
        char  a=97;
        alphabetQuadrat= new int[5][5];
       for (int zeile=1;zeile<alphabetQuadrat.length-1;zeile++){
           for (int spalte=1;spalte<alphabetQuadrat.length-1;spalte++){
              alphabetQuadrat[zeile][spalte]=a;
                if (a == 105){
                    a++;

                }
               a++;

           }
       }

    }
}
