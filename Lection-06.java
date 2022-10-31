// Задача 1 

import java.util.*;

public class Main {
    public static void print() {
     for(int i = 0; i < 4; i++) {
      System.out.println("5 5 5 5 5 5");
      } 
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 6-1");
      print(); 
      
  }
}


// Задача 2

import java.util.*;

public class Main {
    public static void print2() {
     for(int i = 0; i < 5; i++) {
       for(int j = 0; j <= i; j++) {
       System.out.print("5 ");
       }
       System.out.println();
      } 
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 6-2");
      print2();
  }
}


// Задача 3

import java.util.*;

public class Main {
  
    public static void printElement(int a, int b) {
      System.out.printf("%d + %d = %d\t", a, b, a+b);
    }
    
    public static void printLine(int n) {
      for (int i = 1; i < 10; i++) {
      printElement(n,i);
      }
      System.out.println();
    }
    
    public static void print3() {
      for (int i = 1; i < 10; i++) {
      printLine(i);
      }
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 6-3");
      print3();
  }
}


// Задача 4.1 (Фибоначчи)
//найти k-й член

import java.util.Scanner;

public class Main {
  
    public static int Fibo(int n) {
      if (n==1 || n==2) {
        return 1;
      }
      else 
        return Fibo(n-1) + Fibo(n-2);
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Задача 6-4.1 (Фибоначчи)");
      int a = sc.nextInt();
      System.out.println(Fibo(a));
  }
}


// Задача 4.2 (Фибоначчи)
//получить первые n членов

import java.util.Scanner;

public class Main {
   
    public static int Fibo(int n) {
      if (n==1 || n==2) {
        return 1;
      }
      else 
        return Fibo(n-1) + Fibo(n-2);
    }
    
    public static void FiboPrint(int n) {
      for(int i=1; i<=n; i++) {
        System.out.print(Fibo(i)+" ");
      }
    }
  
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Задача 6-4.2 (Фибоначчи)");
      int a = sc.nextInt();
      FiboPrint(a);
  }
}

// Задача 5

import java.util.Scanner;

public class Main {
  
    public static long Fact(int n) {
      if (n==1) 
        return 1;
      else
        return n*Fact(n-1);
    }
    
    public static void FactPrint(int n) {
      for (int i=1;i<=n;i++) {
        System.out.print(Fact(i)+" ");
      }
    }
  
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Задача 6-5");
      int a = sc.nextInt();
      FactPrint(a);
  }
}


// Задача 6.1

import java.util.Scanner;

public class Main {
  
    public static double Min(double a, double b) {
      if (a<b) 
        return a;
      else
        return b;
    }
    
    public static double Min(double a, double b, double c) {
      return Min(Min(a,b),c);
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Задача 6-6.1");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      System.out.println(Min (a,b,c));
  }
}


// Задача 6.2

import java.util.Scanner;

public class Main {
  
    public static double Min(double a, double b) {
      if (a<b) 
        return a;
      else
        return b;
    }
    
    public static double Min(double a, double b, double c, double d) {
      return Min(Min(a,b),Min(c,d));
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Задача 6-6.2");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double d = sc.nextDouble();
      System.out.println(Min (a,b,c,d));
  }
}


// Задача 7

import java.util.Scanner;

public class Main {
  
    public static boolean Triangle(double a, double b, double c) {
      if ((a>0)&&(b>0)&&(c>0)&&(a+b>c)&&(a+c>b)&&(b+c>a)) 
        return true;
      else
        return false;
    }
    
    public static double Perim(double a, double b, double c) {
      if (Triangle(a,b,c)==true) 
        return a+b+c;
      else
        return 0;
    }
    
    public static double Square(double a, double b, double c) {
      if (Triangle(a,b,c)==true) {
        double p = Perim(a,b,c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
      }
      else
        return 0;
    }
    
    public static void Print(double a, double b, double c) {
      if (Triangle(a,b,c)==true) {
        System.out.println("Треугольник существует.");
        System.out.printf("Его периметр равен %.3f.\n", Perim(a,b,c));
        System.out.printf("Его площадь равна %.3f.\n", Square(a,b,c));
      }
      else
        System.out.println("Треугольник не существует!\n");
    }
    
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Задача 6-7");
      double g = sc.nextDouble();
      double f = sc.nextDouble();
      double d = sc.nextDouble();
      double e = sc.nextDouble();
      double r = sc.nextDouble();
      double t = sc.nextDouble();
      System.out.printf("Стороны тругольника: %.1f, %.1f, %.1f\n",g,f,d);
      Print(g,f,d);
      System.out.println();
      System.out.printf("Стороны тругольника: %.1f, %.1f, %.1f\n",e,r,t);
      Print(e,r,t);
  }
}

