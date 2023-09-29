import java.util.Scanner;
public class dz_massiv_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //1 ЗАДАНИЕ
        /*System.out.println("1 задание");
        int scan=s.nextInt();
        //МАССИВ СОСТОЯЩИЙ ИЗ n ЭЛЕМЕНТОВ
        int[] n= new int [scan];
        //ЗАПОЛНЕНИЕ МАССИВА

        for (int i=0; i<n.length;i++){
            n[i]=s.nextInt();
        }
        System.out.print("Массив : ");
        for (int i=0; i<n.length;i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
        int sum_ch=0;
        for(int i=0;i<n.length;i+=2) {
            sum_ch += n[i];
        }
        System.out.println("ЗАДАНИЕ 1 ОТВЕТ№1: "+sum_ch);
        int n_1=-1;
        int n_2=-1;
        for (int i=0; i<n.length;i++){
            if (n[i]==0){
                if (n_1==-1){
                    n_1=i;
                }
                n_2=i;
            }
        }
        int otvet_1_2=0;
        if (n_1!=-1){
            for(int i=n_1;i<n_2;i++){
                otvet_1_2+=n[i];
            }
        }
        System.out.println("ЗАДАНИЕ 1 ОТВЕТ№2: "+otvet_1_2);


         */


        /*2.1
        int[] num=new int[s.nextInt()];
        int sum_num=0;
        for (int i=0;i<num.length; i++)
            num[i]=s.nextInt();
        for (int i=1;i<num.length;i+=2)
            sum_num+=num[i];
        System.out.println(sum_num);

         */

/*2.2        Scanner s=new Scanner(System.in);
        int[] num=new int[s.nextInt()];

        for (int i=0;i<num.length; i++)
            num[i]=s.nextInt();
        int otric_1=-1;
        int otric_2=-1;
        for (int i=0;i<num.length;i++){
            if (num[i]==-1){
                if(otric_1==-1){
                    otric_1=i;
                }
                otric_2=i;
            }
        }
        int sum_n=0;
        for (int i=otric_1+1;i<otric_2;i++){
            sum_n+=num[i];
        }
        System.out.println(sum_n);
*/
/*3.1        Scanner s=new Scanner(System.in);
        int[] num=new int[s.nextInt()];

        for (int i=0;i<num.length; i++)
            num[i]=s.nextInt();
        int max_n=-10000000;
        for (int i=0;i<num.length;i++){
            if (num[i]>max_n){
                max_n=num[i];
            }
        }
        System.out.println(max_n);
*/
/*3.2        Scanner s=new Scanner(System.in);
        int[] num=new int[s.nextInt()];

        for (int i=0;i<num.length; i++)
            num[i]=s.nextInt();
        System.out.print("МАССИВ: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        int lastPlus=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<0){
                lastPlus=i;
            }
        }
        int sum_num=0;
        for (int i=0;i<lastPlus; i++){
            sum_num+=num[i];
        }
        System.out.println("ОТВЕТ: "+sum_num);
*/
        //#1 2 задание(матрицы)

        /*int stroca=s.nextInt();
        int stolb=s.nextInt();
        int[][] matrix=new int[stroca][stolb];
        for (int i=0;i<stroca;i++){
            for (int j=0;j<stolb; j++){
                matrix[i][j]=s.nextInt();
            }
        }
        int count=0;
        System.out.println("Исходная матрица: ");
        for (int i=0;i<stroca;i++){
            int c_1=0;
            for (int j=0;j<stolb; j++){
                System.out.print(matrix[i][j]+ " ");
                if (matrix[i][j]!=0){
                    c_1++;
                }
                if (c_1==j){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("КОЛ-ВО НУЛЕВЫХ СТРОК: " + count);
        int temp;
        for (int i=0;i<matrix[0].length;i++){
            temp=matrix[0][i];
            matrix[0][i]=matrix[1][i];
            matrix[1][i]=temp;
        }
        System.out.println("СВАП-МАТРИЦА : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        */


        // задание 2 номер 8
//        Scanner s=new Scanner(System.in);
/*        int stroca=s.nextInt();
        int stolb=s.nextInt();
        int[][] matrix=new int[stroca][stolb];
        for (int i=0;i<stroca;i++){
            for (int j=0;j<stolb; j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("Исходная матрица: ");
        for (int i=0;i<stroca;i++){
            for (int j=0;j<stolb; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //int[] ot_st=new int[stroca];
        int stroca_pol=0;
        for (int i=0;i<stroca;i++){
            int count_1=0;
            int count=0;
            for (int j=0;j<stolb; j++){

                if (matrix[i][j]>0){
                    count_1++;
                }
                if(count_1==stolb){
                    for(int k=stroca_pol; k<stolb; k++){
                        count+=matrix[i][k];
                    }
                }

            }
            System.out.println("строка №"+i+" "+"Сумма эл-ов строки без отриц.эл. :"+ count);
        }
        for (int i=0; i<matrix.length;i++){
            int temp=matrix[i][stolb-2];
            matrix[i][stolb-2]=matrix[i][stolb-1];
            matrix[i][stolb-1]=temp;

        }
        System.out.println("СВАП-МАТРИЦА : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
 */


    }
}
