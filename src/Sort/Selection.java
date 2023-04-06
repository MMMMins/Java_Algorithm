package Sort;

import java.util.Random;

public class Selection {
    public static void main(String[] args) {
        final int number = 1000;
        int[] numList = new int[number];

        Random ran = new Random();
        for(int i=0; i<number; i++){
            numList[i] = 0;
        }

        for(int i=0; i<number; i++){
            int temp = ran.nextInt(number)+1;
            if(numList[i] == temp){
                i--;
            }else if(numList[i] == 0){
                numList[i] = temp;
            }
        }
        for(int a : numList){
            System.out.print(a+", ");
        }
        System.out.println();
        for(int i=0; i<number; i++){
            int minIndex = i;
            for(int j=i+1; j<number; j++){
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
