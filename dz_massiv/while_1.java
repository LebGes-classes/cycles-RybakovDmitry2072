import java.util.Scanner;
import java.lang.Math;
public class while_1 {
    public static void main(String[] args) {
        //задание 1, 1 вариант
        /*Scanner s=new Scanner(System.in);
        double x=-9;
        double r=3;
        double y=0;
        System.out.println("Значение аргумента  Значение функции ");
        while (x<10){
            if (x>=-9&&x<=-6) {
                y = -(Math.pow(r * r - x * x +2*x*(-6)-36, 0.5));
            }
            else if(x>=-6 && x<=-3){
                y=(x*0-(-6)*0-x*(-3)+(-6)*(-3))/(-3-(-6))+(-3);
            }
            else if(x>=-3&&x<=0){
                y = (Math.pow(r * r - x * x , 0.5));
            }
            else if(x>=0&&x<=3){
                y=(x*0-0*0-x*3+0*3)/(3-0)+3;
            }
            else if(x>=3&&x<=9){
                y=(x*3-3*3-x*0+3*0)/(9-3)+0;
            }
            System.out.println("x = "+x+"            "+"y = "+y);
            x++;
        }

         */
        //задание 2
        System.out.println("ответ на 2 задачу 1 вариант");
        for (int i = 10; i <= 99; i++) {
            int Sum_1 = i / 10 + i % 10;
            //int Sum_2 = (i * 2) / 10 + (i * 2) % 10;
            int Sum_2 =i*2>=100?(i * 2)%10+(i * 2)/10%10+(i * 2)/100:(i * 2) / 10 + (i * 2) % 10;
            if (Sum_1 == Sum_2) {
                System.out.println(i);
            }
        }
    }
}