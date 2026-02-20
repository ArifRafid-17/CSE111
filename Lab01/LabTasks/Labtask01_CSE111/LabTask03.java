import java.util.Scanner;
import java.util.Arrays;
public class LabTask03 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N= ");
    int N = sc.nextInt();
    
    int [] nums= new int [N];
    int k=1;

    System.out.println("Please enter the elements of the array: ");
    for(int i=0; i<N; i++){
       
        nums[i]= sc.nextInt();

    }

    for(int i=1; i<N; i++){
        if(k<N)
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
    }

    int [] finalNums = new int[k];

    for(int i =0; i<k-1; i++){
        finalNums[i]=nums[i];
    }

    System.out.println(Arrays.toString(finalNums));

   }
}
