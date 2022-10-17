import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Задача 1");
      int a = 234;
      int n = a / 7;
      System.out.println("Полных недель = " + n);      // 33
      int m = a / 30;
      System.out.println("Полных месяцев = " + m);     // 7
      
      System.out.println(" ");
      
      System.out.println("Задача 2");
      int b = 39;
      int d = b / 10;
      System.out.println("Десятки = " + d);        // 3
      int e = b % 10;
      System.out.println("Единицы = " + e);        // 9
      int s = d + e;
      System.out.println("Сумма = " + s);          //12
      int p = d * e;
      System.out.println("Произведение = " + p);   //27
  }
}
