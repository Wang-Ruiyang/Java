import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        boolean isFind = false;
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            isFind = false;
            m = m > 13 ? 13 : m;
            for (int i = 2; i <= m; i++) {
                if (n%i != i-1) {
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
