package test;

public class Solution {

    public static String run(String startPosition, int R, int C) {
        String [] alp = {"a", "b", "c", "d",
                "e", "f", "g", "h"};
        int [] num = {1,2,3,4,5,6,7,8};
        String endC = "";
        int set1 = num.length;
        int set2 = alp.length;
        int x=0,y=0;


        int a = Integer.parseInt(startPosition.substring(0, startPosition.length()-1));
        String b = startPosition.substring(1);
        int endR = 0;
        for (int i = 0; i <set1 ; i++) {
            if(num[i]==a){
                x = (i+R);
                while(x>set1){
                    x = x-set1;
                }
                endR = num[x];
            }

        }
        for (int i = 0; i <set2 ; i++) {
            if(alp[i].equals(b)){
                y = (i+C);
                while(y>=set2){
                    y = y-set2;
                }
                endC = alp[y];

            }

        }

        String s=String.valueOf(endR);
        String endPosition = endR + endC;
        return endPosition;
    }


    public static void main(String[] args) {
        System.out.println(run("2b", 3, 2));
    }
}
