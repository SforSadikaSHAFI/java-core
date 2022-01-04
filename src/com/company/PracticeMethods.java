package com.company;

public class PracticeMethods {
      int a,b,c,max,min;
    public PracticeMethods(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Max(){


        if (a>b){
            if(a>c){
                max = a;
            }
            else max = c;
        }
        else{
            if(b>c){
                max = b;
            }
            else max = c;
        }
        System.out.println("Maximum Number : "+max);
    }


    public void Min(){
        if (a<b){
            if(a<c){
                min = a;
            }
            else min = c;
        }
        else{
            if(b<c){
                min = b;
            }
            else min = c;
        }
        System.out.println("Minimum Number : "+min);
    }

}
