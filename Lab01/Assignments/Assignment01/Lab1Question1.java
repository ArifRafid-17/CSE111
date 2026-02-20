import java.util.Scanner;
public class Lab1Question1 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int PrimeNum=0;
    boolean flag = false;

    if(num1>num2){
        int temp = num1;
        num1=num2;
        num2 = temp;
    }

    for(int i = num1; i<=num2; i++){
        if(i!=0 || i!=1){
          
            for(int j=2; j<i ; j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                PrimeNum++;
            }

            flag=false;
                
        }
    }

       System.out.println("There are "+ PrimeNum+" prime numbers between "+num1+" and "+ num2);
  }
}
