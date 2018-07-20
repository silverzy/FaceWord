package Tencent._2018;

import java.util.Arrays;
import java.util.Scanner;

public class zpys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[100005];
        for (int i=0;i<n;i++){
            num[i] = in.nextInt();
        }
        Arrays.sort(num,0,n);
        long sum = 0;
        int flag = -1;
        for(int i=n-1;i>=0;i--){
            if(flag<0){
                sum+=num[i];
            }else{
                sum-=num[i];
            }
            flag=-flag;
        }
        System.out.println(sum);
    }
}
