package InterviewCoreJavaGSPANN;

import java.util.ArrayList;
import java.util.*;

public class FindLargestInArray {
    public static void main(String[] args) {
        int[] noArr = {1,13,4,54,63,7,8,92};
        List<Integer> reversedArr = new ArrayList<>();

        for(int i= 0; i<noArr.length; i++){
            for(int j =0; j<noArr.length; j++){
                if(noArr[i] > noArr[j]){
                   int temp = noArr[i];
                    noArr[i] = noArr[j];
                    noArr[j] = temp;
                }
            }
        }

        //Arrays.sort(noArr);
        //System.out.println(Arrays.toString(noArr));
        //System.out.println(noArr[noArr.length - 2]);


        char[] charArr = {'a', 'm','p', 'g', 'u','s'};
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(charArr));



        //army -mary
        String word = "army";
        char[] ch = word.toCharArray();
        char temp = ch[0];
        ch[0]=ch[1];  //rmy
        ch[1] = ch[3];
        ch[3] = temp;
        System.out.println(Arrays.toString(ch));

        String words = "army";
        char[] letters = word.toCharArray();

        // Rearranging manually to form "mary"
        char temps = letters[0];
        char temp2  = letters[1];// 'a' -> 'r'   mary   ma
        letters[1]=temps;// Store 'a'    army
        letters[0] = letters[2];

       letters[2] = temp2;   // 'r' -> 'y'
      //letters[2] = temp;       // 'y' -> 'a'

        // Convert back to string and print result
        String rearrangedWord = new String(letters);
        System.out.println(rearrangedWord); // Output: mary



    }





}
