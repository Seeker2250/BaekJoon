import java.io.IOException;
import java.util.Scanner;

public class ExTest {
    // 3003번 문제
    // https://www.acmicpc.net/problem/3003
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        // int chess = Integer.parseInt(br.readLine());
        
        int[] arr = {1, 1 , 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            String sChess = sc.next();
            int chess = Integer.parseInt(sChess);
            System.out.print(arr[i]-chess + " ");

        }

    }
}
