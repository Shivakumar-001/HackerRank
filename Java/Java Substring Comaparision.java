import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
         int len=s.length();
         for(int i=0;i<=len-k;i++)
         {
            String sub=s.substring(i,i+k);
            if(smallest.equals(""))
                smallest=sub;
            if(smallest.compareTo(sub)>0)
                smallest=sub;
            if(largest.equals(""))
                largest=sub;
            if(largest.compareTo(sub)<0)
            largest=sub;
         }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}