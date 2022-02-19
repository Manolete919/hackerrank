package com.hacker.rank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HowSumDynamic {
    public static void main(String[] args) {
        List<Integer> res = solve(7, new int[] {5,3,4});
        System.out.println(res);
    }
    private static List<Integer> solve(int targetSum, int[] numbers) {
        //List<Integer>[] dt = (List<Integer>[]) new ArrayList<?>[targetSum+1];
        
        List<Integer>[] dt = (ArrayList<Integer>[]) new ArrayList[targetSum+1];

        Arrays.fill(dt, null);
        dt[0] = new ArrayList<Integer>();
        for(int i= 0; i < dt.length; i++) {
                for(int j = 0; j < numbers.length; j ++) {
                    if(dt[i] != null) { 
                        if((i  + numbers[j]) <= targetSum) {
                            dt[i  + numbers[j]] =  new ArrayList<Integer>(dt[i]);                            
                            dt[i  + numbers[j]].add(numbers[j]);
                        }
                    }                       
                }
        }
        for(int i= 0; i < dt.length; i++) {
            System.out.println("INDICE " + i + " -> "+ dt[i]);
        }
        return dt[numbers.length];
    }
}
