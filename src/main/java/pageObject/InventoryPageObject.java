package pageObject;

import java.util.*;

public class InventoryPageObject {
    public static void main(String[] args) {
        String testData = "Namrata is doing hard to get her job changed";
      System.out.println(testData);
       System.out.println(reverseString(testData));
       reverseAlternateWord(testData);
        reverseEachWord(testData);
        int[] testArr = {1, 2, 3, 4, 4, 6, 6};

        findUniqueNo(testArr);
    }

    public static String reverseString(String testStr) {
        char[] ch = testStr.toCharArray();
        String reverseString = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            reverseString = reverseString + ch[i];
        }
        return reverseString;
    }


//    public static void reverseEachWord(String testStr) {
//        String[] words = testStr.split("//");
//        //char[] ch = str.toCharArray();
//        //String reverseSting = "";
//        String reverseWord = "";
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            for (int j = word.length() - 1; j >= 0; j--) {

    public static void reverseAlternateWord(String testStr){
        String[] splittedString = testStr.split(" ");
       //char[] ch = str.toCharArray();
        //String reverseSting = "";
        String reverseWord = "";

        for(int i=0; i< splittedString.length; i++){
            if(i%2==0) {
                String word = splittedString[i];
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reverseWord = reverseWord + " ";
            } else{
                reverseWord= reverseWord  + splittedString[i] + " ";
            }

        }
        System.out.println(reverseWord);
    }


    public static void reverseEachWord(String testStr){
        String[] splittedStr = testStr.split(" ");

        String reverseWord = "";

        for(int i=0; i<splittedStr.length; i++ ){
            String word = splittedStr[i];

            for(int j=word.length()-1; j>=0; j--){

                reverseWord = reverseWord + word.charAt(j);
            }
            reverseWord = reverseWord + " ";
        }
        System.out.println(reverseWord);
    }

    public static void findUniqueNo(int[] noArr) {



        List<Integer> output = new ArrayList<Integer>();
        boolean isUnique = false;

        HashSet<Integer> countUnique =  new HashSet<Integer>();

        for(int i=0;i< noArr.length; i++){
            if(!countUnique.contains(noArr[i])){
                countUnique.add(noArr[i]);
            } else{
                //countUnique.put(i, 1);
            }


        }
        System.out.println(countUnique);
       // for (int i = 0; i < noArr.length; i++) {

//            for (int j = i; j < noArr.length; j++) {
//
//                if (noArr[i] != noArr[j]) {
//                    isUnique = true;
//
//
//                }else{
//                    System.out.println("not unique");
//                }
//                output.add(noArr[j]);
//
//            }

//        }
//        System.out.println(output);
//        System.out.println(isUnique);

        //return output;
    }

}
