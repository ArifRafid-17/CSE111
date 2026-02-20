import java.util.Scanner;
public class Lab1Question2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        String result ="";

        for(int i=0; i<words.length(); i++){
            char c1= words.charAt(i);
            char c2;
            if(c1=='a'){
                c2='z';
            }
            else{
                int ascii= (int)c1;
                int newAscii= ascii-1;
                c2 = (char)newAscii;
                
            }
            result+=c2;
            
        }

        System.out.println(result);
    }
}
