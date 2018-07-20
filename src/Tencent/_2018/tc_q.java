package Tencent._2018;

import java.util.Scanner;

public class tc_q {
    public static long M=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        M = in.nextLong();
        long mid = M;
        long left =1;
        long right = mid;
        while(left<right-1){
            if(numOfLive(mid,n)){
                left = mid;
                mid = (right+left)/2;
            }else{
                right = mid;
                mid = (right+left)/2;
            }
        }
        System.out.println(mid);
    }
    public static Boolean numOfLive(long num, long day){
        long sum=0;
        long area=0;
        while(day>0){
            if(num==1){
                sum+=day;
                day=0;
                break;
            }
            day--;
            sum+=num;
            if(num%2==1){
                if(num!=1)
                    area++;
                num=num/2+1;
            }else{
                num=num/2;
            }
        }
        if(M>=sum){
            return true;
        }
        return false;
    }
}
