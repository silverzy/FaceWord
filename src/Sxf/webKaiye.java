package Sxf;


import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class webKaiye {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map id = new HashMap();
        long n;
        int temp=0;
        ArrayList huojiang = new ArrayList();
        int point = 0;
        n = in.nextLong();
        while(n-->0){
            temp = in.nextInt();
            if(id.get(temp)==null) {
                huojiang.add(String.valueOf(temp));
                id.put(temp, 1);
            }
        }
        for(Object s :huojiang){
            if(s.equals(null)) break;
            System.out.println((String)s);
        }
    }
}
