package Sort;


public class Selection {
    public static void SelectionSort(int[] numList){
        for(int i=0; i<numList.length; i++){
            int minIndex = i;
            for(int j=i+1; j<numList.length; j++){
                if(numList[j] < numList[minIndex]){
                    minIndex = j;
                }
            }
            int minValue = numList[minIndex];
            numList[minIndex] = numList[i];
            numList[i] = minValue;
        }

        for(int b: numList){
            System.out.print(b+", ");
        }
    }
}
