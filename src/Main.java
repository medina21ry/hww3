public class Main {
    public static void main(String[] args) {
       double[] num = {1.0, 2.0, -37.89, 12.34, 76.23, -44.56, 0.12, -98.76, 55.43, 33.33, -11.11, 88.88, 22.22, -66.66, 5.69 };
       double sum = 0;
       int num2 = 0;
       boolean flag = false;
        for (double num1:num
             ) {
            if (num1<0){
                flag=true;
            }
            if (num1>0&&flag){
                sum+=num1;
                num2+=1;
            }

        }
        System.out.println("Количества чисел: " +num2);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее арифметическое: " + sum/num2);

    }
}