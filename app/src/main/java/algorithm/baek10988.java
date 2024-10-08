package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baek10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine();
        int left = 0;
        int right = test.length() - 1;
        boolean check = true;

        while (left < right) {
            if (test.charAt(left) != test.charAt(right)) {
                check = false;
            }
            left++;
            right--;
        }
        
        if(check){System.out.println("1");}
        else{System.out.println("0");}
    }
    

}
