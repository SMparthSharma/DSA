package Shorting;
public class BubbleShort {
    static void print(int a[]){
        for (int e : a) {
            System.out.print(e+",");
        }System.out.println();
    }
    public static void main(String[] args) {
        int []arr={2,5,7,4,25,5,9,23,1,0};
        //Assanding order
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       print(arr);
       //Desending order
       for(int i=arr.length-1;i>-1;i--){
        for(int j=arr.length-1;j>0;j--){
            if (arr[j]>arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
       }print(arr);
    }
}
