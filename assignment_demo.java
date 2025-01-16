import java.util.Scanner;

public class assignment_demo {
    //assignment demo brighe lab day 1

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose the operation ");
        int num = sc.nextInt();
        System.out.println("Give the 2 numbers");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(operation(num, val1, val2));
    }
    public static int operation(int num , int val1 , int val2){
        int ans = 0;
        switch (num) {
            case 1:
                ans = val1 + val2;
                break;
            case 2:
                ans = val1 - val2;
                break;
            case 3:
                ans = val1 * val2;
                break;
            default:
                ans = val1 / val2;
                break;

            
        }
        return ans;
    }
}
