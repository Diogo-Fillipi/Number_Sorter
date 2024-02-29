public class Main {
    public static void main(String args[]){
        int [] numberSorter = {9, 5, 6, 2, 1, 10};
        for(int i = 0; i < numberSorter.length; i++ ){
            for(int j = 0; j < numberSorter.length - 1; j++ ){
                if(numberSorter[j] > numberSorter[j+1]){
                    int aux = numberSorter[j];
                    numberSorter[j] = numberSorter[j+1];
                    numberSorter[j+1] = aux;
                }
            }

        }

        for(int k = 0; k< numberSorter.length; k++){
            System.out.println(numberSorter[k]);
        }
    }
}


