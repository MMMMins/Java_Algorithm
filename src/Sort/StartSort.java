package Sort;

import java.util.Random;
import java.util.Scanner;

public class StartSort {
    public static void main(String[] args) {
        int[] numList = RandomNumberList(1000);

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 선택정렬 Selection");
        System.out.println("2. 버블정렬 Bubble");
        System.out.println("3. 삽입정렬 Insertion");
        System.out.println("4. 퀵정렬 Quick");
        System.out.println("5. 병합정렬 Merger");
        System.out.println("6. 힙정렬 Heap");
        System.out.print("번호 입력 : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                Selection.SelectionSort(numList);
                break;
            case 2:
                break;
            case 3:
                Insertion.InsertionSort(numList);
                break;
            case 4:
                break;
            case 5:
                Merge.solve(numList);
                break;
            case 6:
                break;
        }
    }

    public static int[] RandomNumberList(int NUMBER){
        int[] numList = new int[NUMBER];

        Random ran = new Random();
        for(int i=0; i<NUMBER; i++){
            numList[i] = 0;
        }

        for(int i=0; i<NUMBER; i++){
            int temp = ran.nextInt(NUMBER)+1;
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

        return numList;
    }
}
