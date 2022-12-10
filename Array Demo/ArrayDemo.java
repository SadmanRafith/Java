import java.lang.*;

public class ArrayDemo{
    public static void main(String[] args){
        int arr1[] = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        
        for(int i=0; i<arr1.length;i++){
            System.out.println("arr1["+i+"]:"+arr1[i]);
        }
        
        int arr2[];
        int size = arr1[1]/arr1[0];
        arr2 = new int[size];
        arr2[0] = 40;
        arr2[1] = 50;
        int j=0;

        while(j<arr2.length){
            System.out.println("arr2["+j+"]:"+arr2[j]);
            j++;
        }
        
        int arr3[] = new int[] {60, 70, 80};
        int k = 0;

        do{
            System.out.println("arr3["+k+"]:"+arr3[k]);
            k++;
        }while(k<arr3.length);
        
        int []arr4 = {100, 200, 300};

        for(int i = 0; i<arr4.length;i++){
            System.out.println("arr4["+i+"]:"+arr4[i]);
        }
    }
}