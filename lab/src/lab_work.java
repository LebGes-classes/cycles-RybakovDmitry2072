import java.util.Scanner;
import java.lang.Math;
public class lab_work {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //вариант 18! лаб.работа

        //задача 1
        int n=s.nextInt();
        int k=s.nextInt();
        double x= s.nextDouble();
        double y=s.nextDouble();
        double a=(n+Math.pow(Math.tan(Math.toRadians(k)),2))/(Math.pow(x,4)+(y/2))+Math.pow(Math.abs((x+y)/Math.pow(Math.sin(Math.toRadians(n+k)),2)),2)+45.673/(Math.pow(Math.abs(x),0.2)+1);
        double b=(Math.pow(k,2)-Math.pow(y,2))/(Math.cos(Math.toRadians(1.25-3*n)))-Math.pow(Math.log((Math.tan(Math.toRadians(x)))+2)/(Math.pow(Math.E,k)-1),3);
        System.out.println("ответ а= "+a);
        System.out.println("ответ b= "+b);

        //задача 2

        /*double x= s.nextDouble();
        double y=s.nextDouble();
        boolean graf=((x>=-2 && x<=0 && y>=0 && y<=2)||(x>=0 && x<=3 && y>=0 && y<=1));
        System.out.println(graf);
         */

        /*
        int d=s.nextInt();
        double x=s.nextDouble();
        x*=10;
        x = (int)x;
        x=Math.round(x);
        d=(int)x%10;
        System.out.println("первая цифра дробной части из х "+ d);
         */
    }
}