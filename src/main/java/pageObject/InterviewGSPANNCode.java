package pageObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewGSPANNCode {
    public static void main(String[] args) {
        int[] noArrTest = {1,2,3,4,5,1,2,3,7,8};
        filterDuplicate(noArrTest);

    }

    public static void filterDuplicate(int[] noArray){

        Map<Integer, Integer> filDup = new HashMap<Integer, Integer>();

        for(int num: noArray){
            if(filDup.containsKey(num)){
                filDup.put(num, filDup.get(num) + 1 );
            }else{
                filDup.put(num, 1);
            }
        }
        //System.out.println(filDup);
       List<Integer> duplicateNosList = new ArrayList<Integer>();
        List<Integer> uniqueNosList = new ArrayList<Integer>();

        for(int key:filDup.keySet() ){
            if(filDup.get(key)> 1){
                duplicateNosList.add(key);
                System.out.println(key);

            }
        }

        for(int key: filDup.keySet()){
            if(filDup.get(key) == 1){
                uniqueNosList.add(key);
                System.out.println();
            }

        }

        System.out.println("List of duplicate no is " +duplicateNosList);
        System.out.println("List of unique no is " +uniqueNosList);


    }
}
