import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            
        }

        Scanner sc  = new Scanner(System.in);

        
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b  = sc.nextInt();

        System.out.print(tinhTong(a,b) + "\n");
    }
    //
    //
///
    public static int tinhTong(int a, int b){
        return a + b;
    }

}
