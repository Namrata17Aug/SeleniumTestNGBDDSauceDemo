package InterviewCoreJavaGSPANN;

import java.util.*;

public class findUnqueCharacters {
    public static void main(String[] args) {
        getUniqueChares("hi hello");

    }

    public static void getUniqueChares(String myStr){
        char[] ch = myStr.toCharArray();

        Map<Character, Integer> myUniqueChar = new TreeMap<>();

        for(char c:ch){
            if(Character.isAlphabetic(c)){
                if(myUniqueChar.containsKey(c)){
                    myUniqueChar.put(c, myUniqueChar.get(c) + 1);
                }
                else{
                    myUniqueChar.put(c, 1);
                }

            }
        }
        System.out.println(myUniqueChar);

        List<Character> uniqueCharList = new ArrayList<>();
        String uniqWord ="";

        for(char key : myUniqueChar.keySet()){
            if(myUniqueChar.get(key) == 1){
                uniqueCharList.add(key);
                uniqWord = uniqWord + key;
            }
        }
        System.out.println("my unique word is " +uniqWord);
    }
}
