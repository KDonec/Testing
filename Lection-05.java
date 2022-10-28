//Задачи 1-5

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Задача 1");
      for(int i=0;i<10;i++) {
        System.out.printf("20 ");
      }
      
      System.out.println(" \n");
      
      System.out.println("Задача 2");
      for(double i=10;i<=25;i++) {
        System.out.printf("%.0f %.1f\n",i,i+.4);
      }
      
      System.out.println(" ");
      
      System.out.println("Задача 3");
      for(int i=1;i<11;i++) {
        System.out.printf("7 x %d = %d\n",i,i*7);
      }
      
      System.out.println(" ");
      
      System.out.println("Задача 4.1");
      int sum = 0;
      for(int i=100;i<=500;i++) {
        sum=sum+i;
      }
      System.out.println("Сумма чисел от 100 до 500 = "+sum);
      
      System.out.println("Задача 4.2");
      Scanner sc = new Scanner(System.in);
      int summ = 0;
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (b>a) {
      for(int i=a;i<=b;i++) {
        summ=summ+i;
      }
      System.out.printf("Сумма чисел от %d до %d = %d\n",a,b,summ);
      }
      else {
        System.out.println("Ошибка. Задайте второе число больше первого");
      }
      
      System.out.println(" ");
      
      System.out.println("Задача 5");
      int n = sc.nextInt();
      double summa = 0;
      for (double i=0;i<n;i++) {
        double temp = sc.nextDouble();
        System.out.print(temp+" ");
        summa=summa+temp;
      }
      System.out.printf("\nСумма = %f\n",summa);
      System.out.printf("Среднее арифметическое %d чисел = %.3f\n",n,summa/n);
      
      System.out.println(" ");
           
  }
}

//Задача 6. "Фибоначчи"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
     
     System.out.println("Задача 6.1");
     int kFibo= sc.nextInt();
     long Fibo=0L;
     long temp1Fibo=1L;
     long temp2Fibo=1L;
     if (kFibo>2){
        for (long i=3; i<=kFibo; i++) {
          Fibo=temp1Fibo+temp2Fibo;
          temp1Fibo=temp2Fibo;
          temp2Fibo=Fibo;
        }
     System.out.printf("%d-й член Фибоначчи = %d\n",kFibo,Fibo); 
      } 
    else
      System.out.printf("%d-й член Фибоначчи = 1\n",kFibo);
    
    
      System.out.println(" ");
      
      System.out.println("Задача 6.2");
      int n1Fibo = sc.nextInt();
      long Fibon=0L;
      long temp1Fibon=1L;
      long temp2Fibon=1L;
      if (n1Fibo>1) {
      System.out.printf("Первые %d члена/ов Фибоначчи: 1 1 ", n1Fibo);
      for (long i=3; i<=n1Fibo; i++) {
        Fibon=temp1Fibon+temp2Fibon;
        temp1Fibon=temp2Fibon;
        temp2Fibon=Fibon;
        System.out.printf("%d ", Fibon);
      }
      }
      else 
        System.out.print("Первый член Фибоначчи: 1");
      
      
      System.out.println(" \n");
      
      System.out.println("Задача 6.3");
      int n2Fibo = sc.nextInt();
      long Fibon2=0L;
      long temp1Fibon2=1L;
      long temp2Fibon2=1L;
      long sumFibo=2L;
      if (n2Fibo>2){
      for (long i=3; i<=n2Fibo; i++) {
        Fibon2=temp1Fibon2+temp2Fibon2;
        temp1Fibon2=temp2Fibon2;
        temp2Fibon2=Fibon2;
        sumFibo=sumFibo+Fibon2;
      }
      System.out.printf("Сумма первых %d членов Фибоначчи: %d\n", n2Fibo, sumFibo);
      }
      else {
      if (n2Fibo==2) {
        sumFibo = 2;
        System.out.println("Сумма первых 2 членов Фибоначчи: 2");
      }
      else {
        sumFibo = 1;
        System.out.println("Первый член Фибоначчи: 1");
      }
      }
      long sum = sumFibo%2;
      if (sum==0) 
        System.out.println("Это четное число");
      else 
        System.out.println("Это нечетное число");
     
  }
}


//Задачи 7-12
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      
     System.out.println("Задача 7.1");
     int temp = sc.nextInt();
     int sum = 0;
        while (temp!=0) {
        sum = sum + temp;
        temp = sc.nextInt();
      }
      System.out.println("Сумма всех чисел последовательности = "+sum); //334
      
      System.out.println(" ");
      
      System.out.println("Задача 7.2");
      int temp2 = sc.nextInt();
      int counter = 0;
      while (temp2!=0) {
        counter++;
        temp2 = sc.nextInt();
      }
      System.out.println("Количество всех чисел последовательности = "+counter); //13
     
      System.out.println(" ");
      
      System.out.println("Задача 8.1");
      int chislo81 = sc.nextInt();
      int origchislo81 = chislo81;
      int counter81 = 0;
      while (chislo81>0) {
        int ostChislo81 = chislo81%10;
        if (ostChislo81==3) {
        counter81++;
        }
        chislo81 = chislo81/10;
      }
      System.out.printf("В числе %d содержит цифру 3 - %d раз(а)\n", origchislo81, counter81);
      
      System.out.println(" ");
      
      System.out.println("Задача 8.2");
      int chislo82 = sc.nextInt();
      int origchislo82 = chislo82;
      int poslChislo82 = chislo82%10;
      int counter82 = 0;
      while (chislo82>0) {
        int ostChislo82 = chislo82%10;
        if (ostChislo82 == poslChislo82) {
          counter82++;
        }
        chislo82 = chislo82/10;
      }
      System.out.printf("В числе %d последняя цифра %d, встречается %d раз(а)\n", origchislo82, poslChislo82, counter82);
      
      System.out.println(" ");
      
      System.out.println("Задача 8.3");
      int chislo83 = sc.nextInt();
      int origchislo83 = chislo83;
      int counter83 = 0;
      while (chislo83>0) {
        int ostChislo83 = chislo83%10;
        if (ostChislo83%2 == 0) {
          counter83++;
        }
        chislo83 = chislo83/10;
      }
      System.out.printf("В числе %d количество чётных цифр - %d\n", origchislo83, counter83);
      
      System.out.println(" ");
      
      System.out.println("Задача 8.4");
      int chislo84 = sc.nextInt();
      int origchislo84 = chislo84;
      int sumOfFive84 = 0;
      while (chislo84>0) {
        int ostChislo84 = chislo84%10;
        if (ostChislo84 > 5) {
          sumOfFive84 = sumOfFive84+ostChislo84;
        }
        chislo84 = chislo84/10;
      }
      System.out.printf("В числе %d сумма цифр (больше 5) = %d\n", origchislo84, sumOfFive84);
      
      System.out.println(" ");
      
      System.out.println("Задача 8.5");
      int chislo85 = sc.nextInt();
      int origchislo85 = chislo85;
      int proizOfSeven85 = 1;
      while (chislo85>0) {
        int ostChislo85 = chislo85%10;
        if (ostChislo85 > 7) {
          proizOfSeven85 = proizOfSeven85*ostChislo85;
        }
        chislo85 = chislo85/10;
      }
      System.out.printf("В числе %d произведение цифр (больше 7) = %d\n", origchislo85, proizOfSeven85);
      
      System.out.println(" ");
      
      System.out.println("Задача 8.6");
      int chislo86 = sc.nextInt();
      int origchislo86 = chislo86;
      int counter86 = 0;
      while (chislo86>0) {
        int ostChislo86 = chislo86%10;
        if (ostChislo86 == 0 || ostChislo86 == 5) {
          counter86++;
        }
        chislo86 = chislo86/10;
      }
      System.out.printf("Число %d содержит цифры 0 и 5 - %d раз(а)\n", origchislo86, counter86);
      
      System.out.println(" ");
      
      System.out.println("Задача 9.1");
      int counter91 = 10;
      while (counter91<31) {
        System.out.println(counter91);
        counter91++;
      }
      
      System.out.println(" ");
      
      System.out.println("Задача 9.2");
      int counter92 = 10;
      do {
        System.out.println(counter92);
        counter92++;
      }
      while (counter92<31);
      
      System.out.println(" ");
      
      System.out.println("Задача 10.1");
      int chislo101 = sc.nextInt();
      int origchislo101 = chislo101;
      int max = 0;
      while (chislo101>0) {
        int ostChislo101 = chislo101%10;
        if (ostChislo101 > max) {
          max = ostChislo101;
          if (max==9) 
          break;
        }
        chislo101 = chislo101/10;
      } 
      System.out.printf("В числе %d максимальная цифра - %d\n", origchislo101, max);
      
      System.out.println(" ");
      
      System.out.println("Задача 10.2");
      int chislo102 = sc.nextInt();
      int origchislo102 = chislo102;
      int min = 9;
      while (chislo102>0) {
        int ostChislo102 = chislo102%10;
        if (ostChislo102 < min) {
          min = ostChislo102;
          if (min==0) 
          break;
        }
        chislo102 = chislo102/10;
      } 
      System.out.printf("В числе %d минимальная цифра - %d\n", origchislo102, min);
      
      System.out.println(" ");
      
      System.out.println("Задача 11");
      for (int a=5000; a>0; a--) {
          if (a%39 == 0) {
            System.out.println("максимальное число, делящееся на 39 = " + a);
            break;
          }
      }
      
      System.out.println(" ");
      
      System.out.println("Задача 12.1");
      double vklad1 = 1000;
      double percVklad1 = 0;
      int mes1 = 0;
      while (percVklad1<30) {
        vklad1 = vklad1+percVklad1;
        percVklad1 = vklad1*0.02;
        System.out.printf("%.5f\n", percVklad1);
        mes1++;
      }
      System.out.printf("Проценты по вкладу превысят 30 руб. за %d месяц\n", mes1);
      
      
      System.out.println(" ");
      
      System.out.println("Задача 12.2");
      double vklad2 = 1000;
      double percVklad2 = 0;
      int mes2 = 0;
      while (vklad2<1200) {
        percVklad2 = vklad2*0.02;
        vklad2 = vklad2+percVklad2;
        System.out.printf("%.5f\n", vklad2);
        mes2++;
      }
      System.out.printf("Вклад превысит 1200 руб. через %d месяцев\n", mes2);
            
  }
}      
