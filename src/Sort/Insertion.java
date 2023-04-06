package Sort;

public class Insertion {
    public static void InsertionSort(int[] numList){
        for(int i=1; i<numList.length; i++){
            for(int j=i; j>0 ; j--){
                if(numList[j-1] > numList[j]){
                    int temp = numList[j];
                    numList[j] = numList[j-1];
                    numList[j-1] = temp;
                }
            }
        }

        for(int b: numList){
            System.out.print(b+", ");
        }
    }
}
