import java.util.HashMap;
import java.util.Map;

public class P01{


    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,7};
        int sum=9;

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(sum-arr[i])){
                System.out.println(" i= " +i+" and j="+map.get(sum-arr[i]));
                return;
            }
        }

    }




}