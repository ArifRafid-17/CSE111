import java.util.Arrays;
import java.util.Scanner;
public class LabTask01{
    
    public static void main(String [] args){
        double Sum=0;
        int count =0;
        int [] arr = new int[10];

        for(int i=0; i<10; i++){
           Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();

           if(num%2!=0 && num>0){
            Sum+=num;
            arr[count]=num;
            count++;
            
           }


           

        }

        int [] finalNum = new int[count];
        
        for(int i=0; i<count; i++){
            finalNum[i]=arr[i];
        }
        Arrays.sort(finalNum);


        
        double avg = Sum / count;

        if(Sum!=0){
        System.out.println("Sum= "+(int)Sum);
        System.out.println("Minimum= "+finalNum[0]);
        System.out.println("Maximum= "+finalNum[count-1]);
        System.out.println("Average= "+avg);
        }
        else{
            System.out.println("No odd numbers found");
        }
    }
}