package InterviewCoreJavaGSPANN;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElementOfArray {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,5,6,8,9};
        System.out.println(getMissingElement(myArr, 9));
    }
    public static List<Integer> getMissingElement(int[] myArr, int n){
        Set<Integer> mySet = new HashSet<>();
        for(int i=1; i <=n; i++){
            mySet.add(i);
        }

        for(int ele: myArr){
            mySet.remove(ele);
        }

        return new ArrayList<>(mySet);
    }
}
