package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1157 { 
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String test = bf.readLine().toLowerCase();
        int [] arr = new int[26];
        int max = 0;
        char result = 0;
        for (int i = 0; i < test.length(); i++) {
            char letter = test.charAt(i);
            if(letter>='a'&& letter<='z'){
                arr[(int)(letter -'a')]++;
            }//if
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
                result = (char) (i + 'A');
            }else if(arr[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
