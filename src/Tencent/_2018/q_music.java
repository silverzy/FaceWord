package Tencent._2018;

import java.util.Scanner;

public class q_music {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int a = in.nextInt();
        int xa = in.nextInt();
        int b = in.nextInt();
        int xb = in.nextInt();
        int ta = 0;
        int tb = 0;
        long sum =0;
        for(;ta<xa;ta++){
            if(ta*a>length) break;
            if((length-ta*a)%b==0){
                tb = (length-ta*a)/b;
                sum += choose(xa,ta,xb,tb);
            }
            sum%=1000000007;
        }
        System.out.println(sum);
    }

    private static long choose(int xa, int ta, int xb, int tb) {
        long a = funcation(xa,ta);
        long b = funcation(xb,tb);

        return (a*b)%1000000007;
    }

    private static long funcation(int x, int t) {
        long num;
        long fengzi =1;
        for(int i=0;i<t;i++){
            fengzi*=(x-i);
            fengzi%=1000000007;
        }
        long fengmu =1;
        for(int i=t;i>0;i--){
            fengmu*=i;
            fengmu%=1000000007;
        }
        if(fengmu==0) return 1;
        return fengzi/fengmu;
    }


}
