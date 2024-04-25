import java.util.Scanner;

public class j {
    static void jackpoat(int w,int d,int n,int h,int i){
        if (h<=w) {
            h=h+3;
                d++;
                h=h-1;
                n++;
        }
        if (i<w) {
            jackpoat(w, d, n, h,i);
            i++;
        }
        System.out.println(d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter");
        int well=sc.nextInt();
        sc.close();
        int day=0 , night=0,hight=0;
        // for(int i=0;i<well;i++){
        //     if (hight<=well) {
        //         hight=hight+3;
        //         day++;
        //         hight=hight-1;
        //         night++;

        //     }}
            jackpoat(well, day, night, hight,0);
        }
        

    }

