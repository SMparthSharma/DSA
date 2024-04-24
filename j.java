import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter");
        int well=sc.nextInt();
        sc.close();
        int day=0 , night=0,hight=0;
        for(int i=0;i<well;i++){
            if (hight<=well) {
                hight=hight+3;
                day++;
                hight=hight-1;
                night++;

            }
            
        }
        System.out.println(day);
        System.out.println(night);
    }
}
