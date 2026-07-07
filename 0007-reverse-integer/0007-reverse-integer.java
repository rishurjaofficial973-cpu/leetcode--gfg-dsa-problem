import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        int revnum = 0;
        int sign = x<0?-1:1;
         x = Math.abs(x);
        while(x>0){
            int ld =x%10;
            if (revnum > (Integer.MAX_VALUE - ld) / 10) {
                return 0; 
            }
            revnum=(revnum*10)+ld;
            x=x/10;
        }
       return revnum*sign;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in);
        int x = sc.nextInt();
        sc.close ();
       Solution obj = new Solution(); 
        System.out.println(obj.reverse(x));
    }
}