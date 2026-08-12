import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            System.out.print("Xin chào Đài số: " + i + "\n");
        }
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(tinhTong(a,b));
    }

    public static int tinhTong(int a, int b){
        return a + b;
    }
}


