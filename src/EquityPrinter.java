import java.util.Scanner;
public class EquityPrinter {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = n1.nextInt();

        Scanner n2 = new Scanner(System.in);
        System.out.println("Enter 2nd number: ");
        int num2 = n2.nextInt();

        Scanner n3 = new Scanner(System.in);
        System.out.println("Enter 3rd number: ");
        int num3 = n3.nextInt();

        printEqual(num1,num2,num3);

    }
    public static void printEqual(int num1,int num2,int num3){
        if((num1<0)||(num2<0)||(num3<0)){
            System.out.println("Invalid Value");
        }
        else if((num1==num2)&&(num1==num3)){
            System.out.println("All numbers are Equal");
        }
        else{
            System.out.println("All numbers are different");
        }
    }
}

