package pageObject;

import java.util.*;

public class InventoryPageObject {
    public static void main(String[] args) {
        String testData = "Namrata is doing hard to get her job changed";
//        System.out.println(testData);
//        System.out.println(reverseString(testData));
        reverseEachWord(testData);
    }

    public static String reverseString(String testStr){
        char[] ch = testStr.toCharArray();
        String reverseString = "";

        for(int i = ch.length-1; i>=0; i--){
            reverseString = reverseString + ch[i];
        }
        return reverseString;
    }

    public static void reverseEachWord(String testStr){
        String[] words = testStr.split("//");
       //char[] ch = str.toCharArray();
        String reverseSting = "";
        String reverseWord = "";
        for(int i=0; i< words.length; i++){
            String word = words[i];
            for(int j =word.length()-1; j>=0;j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            //reverseSting= reverseWord + reverseSting + "";
        }
        System.out.println(reverseWord);
    }


}
