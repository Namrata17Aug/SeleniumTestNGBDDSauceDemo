package InterviewCoreJavaGSPANN;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        char[] arrTest = {'a', 'b', 'c','d','e'};
        reverseCharArray(arrTest);
        swapTwoNos(5,10);
        dupString("namrata takes effort and stress");
        System.out.println("given no is prime " +checkIfPrime(13));
        System.out.println("sum of digits is " +sumOfDigits(451));
        convertIntToAlphabet("a2b3c4");


    }


    public static void reverseCharArray(char[] arrTest){
        List<Character> reversedArr = new ArrayList<>();
        for(int i=arrTest.length-1; i>=0; i--){
            reversedArr.add(arrTest[i]);
        }
        System.out.println(reversedArr);
    }

    //Write a Java Program for swapping of 2 numbers.
    public static void swapTwoNos(int a, int b){
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println("no a is " + a);
        System.out.println("no b is " + b);

    }

    //Write a Java Program to find the duplicates of a given String.
    public static void dupString(String testStr){
        char[] ch = testStr.toCharArray();

        Map<Character, Integer> countChar = new HashMap<Character, Integer>();
        List<Character> dupChar = new ArrayList<Character>();



        for(char c : ch){
            if(Character.isAlphabetic(c)){
                if(countChar.containsKey(c)){
                    countChar.put(c, countChar.get(c) + 1);
                }else{
                    countChar.put(c,1);}
            }
        }
        ///System.out.println(dupChar);
        for(char key: countChar.keySet()){
            if(countChar.get(key) > 1){
                dupChar.add(key);

            }
        }
        System.out.println(dupChar);
    }

    public static boolean checkIfPrime(int number) {
        //boolean isNotPrime = false;
        if (number <= 1) {
          return false;
        }else{
           // return true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }

            }
            return true;
        }

    }

    //Write a Java Program to print the sum of digits of a given integer
    public static int sumOfDigits(int numberToSum){

        int sum = 0;
        while(numberToSum !=0){
            int remainder = numberToSum % 10;
            sum = sum + remainder;
            numberToSum = numberToSum/10;
        }


        return sum;
    }

    //Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
    public static void convertIntToAlphabet(String s){
        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                System.out.print(s.charAt(i));
            }else{
                int j = Character.getNumericValue(s.charAt(i));

                for(int k =1; k<j; k++ ){
                    System.out.print(s.charAt(i-1));
                }
            }
        }

    }


}
