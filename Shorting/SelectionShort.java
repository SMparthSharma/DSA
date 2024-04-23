package Shorting;

public class SelectionShort {
    static void print(int a[]){
        for ( int e : a) {
            System.out.print(e+",");
        }System.out.println();
    }
    public static void main(String[] args) {
        int []arr={2,5,7,4,25,5,9,23,1,0};
        //decending order
        for(int i=0;i<arr.length-1;i++){
            int shortest=i;
            for(int j=0;j<arr.length;j++){
                if (arr[shortest]>arr[j]) {
                    shortest=j;
                }
                int temp=arr[shortest];
                arr[shortest]=arr[i];
                arr[i]=temp;
            }
        }print(arr);
        //Assanding order
        for(int i=arr.length-1;i>-1;i--){
            int shortest=i;
            for(int j=arr.length-1;j>0;j--){
                if (arr[shortest]>arr[j]) {
                    shortest=j;
                }
                int temp=arr[shortest];
                arr[shortest]=arr[i];
                arr[i]=temp;
            }
        }print(arr);
    }
}
