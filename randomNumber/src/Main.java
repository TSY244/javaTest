
import java.util.Scanner;
import java.math.MathContext;
public class Main {
    public static void main(String[]arg){
        Scanner scanf=new Scanner(System.in);
        System.out.println("please input a num, if the num is 0 will exit it\n");
        int option=scanf.nextInt();
        int num;
        while(option!=0){
            num= (int) (Math.random()*10);
            System.out.println("this random number is "+num);
            option=scanf.nextInt();
        }
    }
}


//part 2

/*import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        Scanner scanf=new Scanner(System.in);
        Random random=new Random();
        System.out.println("please input a num, if the num is 0 will exit it\n");
        int option=scanf.nextInt(),num;
        while(option!=0){
            num=(int) random.nextInt(10);
            System.out.println("this random number is "+num);
            option=scanf.nextInt();
        }
    }
}*/




//part 1

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanf=new Scanner(System.in);
        System.out.println("please input a num, if the num is 0, exit it\n");
        int option=scanf.nextInt(),num;
        while(option!=0){
            System.out.println("this random number is "+System.currentTimeMillis()%10);
            option=scanf.nextInt();
        }
    }
}*/
