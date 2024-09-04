import java.util.*;



public class BubbleSort {
    public static void main(String[] args)  {
       Scanner scan = new Scanner(System.in);
       System.out.println("Dizinin boyutunu giriniz: ");
       int size = scan.nextInt();
       System.out.println("Dizinin elemanlarını giriniz: ");
       int[] eleman = new int[size];
       int temp;
       boolean swapped;
       int count=0;
       for(int i=0; i<size; i++){
           eleman[i] = scan.nextInt();
           //System.out.println(eleman[i]);
       }
       for(int i=0; i<size-1; i++){
           count = i+1;
           swapped = false;
           for(int j=0; j<(size-1)-i; j++){
               count++;
               if(eleman[j] > eleman[j+1]){
                   temp = eleman[j];
                   eleman[j]=eleman[j+1];
                   eleman[j+1]=temp;
                   swapped = true;
               }
           }
           if (swapped == false) {
               count = i;
               break;
           }
       }
       System.out.println("Array is sorted in " + count + " swaps.");
       System.out.println("First Element: " + eleman[0]);
       System.out.println("Last Element: " + eleman[2]);
    }
}

