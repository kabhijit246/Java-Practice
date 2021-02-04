package com.jetbrains;

//When a class have multiple methods by same name but different parameters i.e called method overloading.
//If superclass and subclass both have same method name then i.e called method overriding.
public class Polymorphism {
    public static void main(String[] args) {
        
        Bank sbi = new Bank_SBI();
        Bank hdfc = new Bank_HDFC();
        Bank pnb = new Bank_PNB();
        Adding add = new Adding();

        sbi.setValues(15000,4,2);
        hdfc.setValues(10000,4.6,3);
        pnb.setValues(5000,6.2,5);

        System.out.println(add.sum(5,6));
        System.out.println(add.sum(25.07,14.67));
        System.out.println("Simple Interest of SBI is Rs"+ sbi.simpleInterest());
        System.out.println("Simple Interest of HDFC is Rs"+ hdfc.simpleInterest());
        System.out.println("Simple Interest of PNB is Rs"+ pnb.simpleInterest());
    }
}

//example of overloading

class Adding{    //"Adding" class having two methods of same name "sum" but returning value of different data types

    static int sum(int a,int b){     //sum is a method returning int value.
        return (a+b);
    }

    static double sum(double a, double b){     //here also method is sum but returning double value.
        return (a+b);
    }

}

//example of overriding

class Bank {            //This is the superclass
    double principal, rate;
    int time;
    void setValues(double p, double r, int t){
        principal = p;
        rate = r;
        time = t;
    }
    double simpleInterest(){             //this is the method which is present in every sublass.
        return (principal*rate*time)/100;
    }
}

class Bank_SBI extends Bank{         // this is one of the subclass
    double simpleInterest() {
        return super.simpleInterest();
    }
}

class Bank_HDFC extends Bank{      // this is another subclass
    double simpleInterest(){
        return super.simpleInterest();
    }
}

class Bank_PNB extends Bank{      // this is again another sublass which is having same method name
    double simpleInterest(){
        return super.simpleInterest();
    }
}


