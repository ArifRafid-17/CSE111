import java.util.Scanner;
public class LabTask02 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String finalString = s1+" "+s2;
        int sum=0;
         //int n ;
        for (int i=0; i<finalString.length(); i++){
            
           char c1 = finalString.charAt(i);
           //int n=-1;
 
          if((c1>='a' && c1<='z') || (c1>='A' && c1<='Z'))
              //n= (int)c1;
              sum+=(int) c1;
        }

        System.out.println(finalString);
        System.out.println(sum);
    }
}
