package Shorting;

public class InsertionShort {
    static void print(int a[]){
        for ( int e : a) {
            System.out.print(e+",");
        }System.out.println();
    }
    public static void main(String[] args) {
        int []arr={2,5,7,4,25,5,9,23,1,0};
        for(int i=1;i<arr.length;i++){//3
            int current=arr[i];//4
            int j=i-1;//2
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }print(arr);
    }
}
