import java.util.Scanner;

public class StairCase
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int cnt=0;

        for(int i=1;i<=number;i++){

            if(i<number){
                number=number-i;

                cnt++;
            }
            else {

                break;
            }
        }
        System.out.println(cnt);
    }
}
