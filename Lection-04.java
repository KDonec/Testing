import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      System.out.println("Задача 1");
      int r = 4;
      System.out.println("Радиус = " + r);
      System.out.println("Длина окружности = " + 2*Math.PI*r);      // 25.13274
      
      System.out.println(" ");
      
      System.out.println("Задача 2");
      double t = 36.6;
      double f = t *9/5 + 32;
      double k = t + 273.15;
      System.out.printf("Температура в Цельсиях = %.3f\n", t);
      System.out.printf("В Фаренгейтах = %.3f\n", f);               // 97.88
      System.out.printf("В Кельвинах = %.3f\n", k);                 // 309.75
      
      System.out.println(" ");
      
      System.out.println("Задача 3");
      int number = 752;
      int e = number % 10;
      int d = number / 10 % 10;
      int sum = number/100 + d + e;
      int p = number/100 * d * e;
      System.out.println("Число = " + number);
      System.out.println("Единицы = " + e);              // 2
      System.out.println("Десятки = " + d);              // 5 
      System.out.println("Сумма цифр = " + sum);         // 14
      System.out.println("Произведение цифр = " + p);    // 70
      
      System.out.println(" ");
      
      System.out.println("Задача 4");
      double Skr = 78.54;
      double Skv = 16;
      double Radius = Math.sqrt(Skr/Math.PI);
      double Storona = Math.sqrt(Skv);
      double Gipotenusa = Math.sqrt(Skv*2);
      boolean krVkv = 2*Radius < Storona || 2*Radius == Storona;      // 10>4
      boolean kvVkr = Gipotenusa < 2*Radius || Gipotenusa == 2*Radius;    // 5.65<10
      System.out.printf("Площадь круга = %.2f, Площадь квадрата = %.2f\n", Skr, Skv);
      System.out.println("Круг уместится в квадрате? " + krVkv);
      System.out.println("Квадрат уместится в круге? " + kvVkr);
      
      System.out.println(" ");
      
      System.out.println("Задача 5");
      int x = 5823;
      boolean Chet = (x % 2 == 0);
      boolean EndSeven = (x % 10 == 7);
      System.out.println("Число = " + x);
      System.out.println("Число четное? " + Chet);
      System.out.println("Число оканчивается на 7? " + EndSeven);
      
      System.out.println(" ");
      
      System.out.println("Задача 6");
      int a = 100;
      int b = -50;
      System.out.printf("a = %d, b = %d\n", a, b);
      if(Math.abs(a) > Math.abs(b)) {
      a = a / 2;
      }
      System.out.printf("a = %d, b = %d\n", a, b);
      
      System.out.println(" ");
      
      System.out.println("Задача 7");
      System.out.println("Решение для большинства легковесов");
      double w1 = 52.7;
      System.out.printf("Вес боксера - %.1f кг\n", w1);
      if(w1<60) {
        System.out.println("Боксер выступает в легком весе");
      }
      else {
        if(w1<75) {
          System.out.println("Боксер выступает в среднем весе");
        }
        else {
          if(w1<91) {
            System.out.println("Боксер выступает в тяжелом весе");
          }
          else {
            System.out.println("Боксер выступает в супертяжелом весе");
          }
        }
      }
      
      System.out.println("  Решение для большинства супертяжеловесов");
      double w2 = 110.8;
      System.out.printf("  Вес боксера - %.1f кг\n", w2);
      if(w2>=91) {
        System.out.println("  Боксер выступает в супертяжелом весе");
      }
      else {
        if(w2>=75) {
          System.out.println("  Боксер выступает в тяжелом весе");
        }
        else {
          if(w2>=60) {
            System.out.println("  Боксер выступает в среднем весе");
          }
          else {
            System.out.println("  Боксер выступает в легком весе");
          }
        }
      }
      
      System.out.println("Решение для равномерного распределения");
      double w3 = 73.5;
      System.out.printf("Вес боксера - %.1f кг\n", w3);
      if(w3>=75) {
        if(w3>=91) {
          System.out.println("Боксер выступает в супертяжелом весе");
        }
          else {
            System.out.println("Боксер выступает в тяжелом весе");
          }
      }
      else {
        if(w3>=60) {
          System.out.println("Боксер выступает в среднем весе");
        }
        else {
          System.out.println("Боксер выступает в легком весе");
        }
      }
        
      
      System.out.println(" ");
      
      System.out.println("Задача 8");
      int day = 5;
      System.out.printf("Номер дня - %d\n", day);
      System.out.print("День недели - ");
      switch(day) {
        case 1:
          System.out.println("Понедельник");
          break;
        case 2:
          System.out.println("Вторник");
          break;
        case 3:
          System.out.println("Среда");
          break;
        case 4:
          System.out.println("Четверг");
          break;
        case 5:
          System.out.println("Пятница");
          break;
        case 6:
          System.out.println("Суббота");
          break;
        case 7:
          System.out.println("Воскресенье");
          break;
        default:
          System.out.println("Некорректный день недели");
          break;
      }
  }
}
