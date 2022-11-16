// https://onecompiler.com/java/3ynvg49e3
/*Лекция 9 № 1. 
Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры 
в ходе выполнения программы.*/

import java.util.Scanner;

public class Main {
  
    public static double[] scanArray(int length) {
      double[] array = new double [length];
      Scanner sc= new Scanner (System.in);
        for (int i = 0; i < array.length; i++)
          array[i] = sc.nextDouble();
        return array;
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-1");
      double[] array = scanArray(10);
      printArray(array);
  }
}


// https://onecompiler.com/java/3ynvjtuqn
/*Лекция 9 № 2. 
Используя датчик случайных чисел, заполнить массив из двадцати элементов
неповторяющимися числами. Вывести полученные массивы на экран.*/

import java.util.Random;

public class Main {
    public static double[] generArray(int length) {
      double[] array = new double [length];
      Random r = new Random();
        for (int i = 0; i < array.length; i++) 
          array[i] = r.nextDouble(100);
        return array;
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%.3f ", array[i]);
        if ((i+1) % 4 == 0)
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-2");
      double[] array = generArray(20);
      printArray(array);
  }
}


// https://onecompiler.com/java/3ynvpkd5b
/*Лекция 9 № 3. 
Дан массив. Составить программу:
1. расчета квадратного корня из любого элемента массива;
2. расчета среднего арифметического двух любых элементов массива
Предусмотреть возможность ошибочных обращений вне границ массива. */

import java.util.*;
import java.util.Scanner;

public class Main {
  
    public static double[] scanArray(int length) {
      double[] array = new double [length];
      Scanner sc= new Scanner (System.in);
        for (int i = 0; i < array.length; i++)
          array[i] = sc.nextDouble();
        return array;
    }
    
    public static void squareElemArray(double[] array, int n) {
      if (n >= 0 && n <= array.length)
        System.out.printf("Квадратный корень %d элемента массива: √%.2f = %.3f\n", n, array[n], Math.sqrt(array[n]));
      else
        System.out.println("Некорректный номер элемента массива");
    }
    
    public static void srednTwoElemArray(double[] array, int n, int m) {
      if (n >= 0 && n <= array.length && m >= 0 && m <= array.length)
        System.out.printf("Среднее арифметическое %d и %d элементов массива: %.2f и %.2f = %.2f\n", n, m, array[n], array[m], (array[n]+array[m])/2);
      else
        System.out.println("Некорректные номера элементов массива");
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-3");
      double[] array = scanArray(10);
      printArray(array);
      squareElemArray(array,4);
      srednTwoElemArray(array,1,5);
  }
}


// https://onecompiler.com/java/3ynvwu985
/*Лекция 9 № 4. 
Дан массив. Все его элементы:
1. увеличить в 2 раза
2. уменьшить на число А
3. разделить на первый элемент. */

import java.util.*;
import java.util.Scanner;

public class Main {
  
    public static double[] scanArray(int length) {
      double[] array = new double [length];
      Scanner sc= new Scanner (System.in);
        for (int i = 0; i < array.length; i++)
          array[i] = sc.nextDouble();
        return array;
    }
    
    public static double[] increaseArray(double[] array) {   //увеличить
      for (int i = 0; i < array.length; i++)
        array[i] = 2 * array[i];
      return array;
    }
    
    public static double[] reduceArray(double[] array, double a) {   //уменьшить
      for (int i = 0; i < array.length; i++)
        array[i] = array[i] - a;
      return array;
    }
    
    public static double[] divideArray(double[] array) {   //разделить
      double elem1 = array[0];
      for (int i = 0; i < array.length; i++)
        array[i] = array[i] / elem1;
      return array;
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-4");
      double[] array = scanArray(10);
      printArray(array);
      increaseArray(array);
      printArray(array);
      reduceArray(array,5);
      printArray(array);
      divideArray(array);
      printArray(array);
  }
}


// https://onecompiler.com/java/3ynvyk5t8
/*Лекция 9 № 5. 
Дан массив. Напечатать:
1. все неотрицательные элементы;
2. все элементы, не превышающие число 100. */

import java.util.*;
import java.util.Scanner;

public class Main {
    public static double[] scanArray(int length) {
      double[] array = new double [length];
      Scanner sc= new Scanner (System.in);
        for (int i = 0; i < array.length; i++)
          array[i] = sc.nextDouble();
        return array;
    }
    
    public static void printPositivArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        if (array[i] >= 0)
          System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void printHundredArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        if (array[i] <= 100)
          System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-5");
      double[] array = scanArray(12);
      printArray(array);
      printPositivArray(array);
      printHundredArray(array);
  }
}


// https://onecompiler.com/java/3ynvzx3kr
/*Лекция 9 № 6. 
Дан массив. Определить:
1. максимальный элемент
2. минимальный элемент
3. на сколько максимальный элемент больше минимального
4. индекс максимального элемента
5. индекс минимального элемента. */

import java.util.*;
import java.util.Scanner;

public class Main {
    public static double[] scanArray(int length) {
      double[] array = new double [length];
      Scanner sc= new Scanner (System.in);
        for (int i = 0; i < array.length; i++)
          array[i] = sc.nextDouble();
        return array;
    }
    
    public static double maxElemArray(double[] array) {
      double max = array[0];
      for (int i = 0; i < array.length; i++)
        if (array[i] > max) 
          max = array[i];
      return max;
    }
    
    public static double minElemArray(double[] array) {
      double min = array[0];
      for (int i = 0; i < array.length; i++)
        if (array[i] < min) 
          min = array[i];
      return min;
    }
    
    public static double differenElemArray(double[] array) {
      double diff = maxElemArray(array) - minElemArray(array);
      return diff;
    }
    
    public static int indexMaxElemArray(double[] array) {
      int indmax = 0;
      double max = maxElemArray(array);
      for (int i = 0; i < array.length; i++)
        if (array[i] == max)
          indmax = i;               
      return indmax;
    }
    
    public static int indexMinElemArray(double[] array) {
      int indmin = 0;
      double min = minElemArray(array);
      for (int a = 0; a < array.length; a++) 
        if (array[a] == min)
          indmin = a;               
      return indmin;
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-6");
      double[] array = scanArray(10);
      printArray(array);
      System.out.println("Максимальный элемент массива = " + maxElemArray(array));
      System.out.println("Минимальный элемент массива = " + minElemArray(array));
      System.out.println("Максимальный элемент больше минимального на " + differenElemArray(array));
      System.out.println("Индекс максимального элемента = " + indexMaxElemArray(array));
      System.out.println("Индекс минимального элемента = " + indexMinElemArray(array));
  }
}


// https://onecompiler.com/java/3ynw7ebgc
/*Лекция 9 № 7. 
Дан массив. Поменять местами:
1. второй и пятый элементы;
2. третий и максимальный элементы. Если элементов с максимальным значением
несколько, то в обмене должен участвовать первый из них. */

import java.util.Random;

public class Main {
    public static double[] generArray(int length) {
      double[] array = new double [length];
      Random r = new Random();
        for (int i = 0; i < array.length; i++) 
          array[i] = r.nextDouble(100);
        return array;
    }
    
    public static double[] swap2and5Array(double[] array) {
      double temp2 = array[1];
      array[1] = array[4];
      array[4] = temp2;
      return array;
    }
    
    public static double maxElemArray(double[] array) {
      double max = array[0];
      for (int i = 0; i < array.length; i++)
        if (array[i] > max) 
          max = array[i];
      return max;
    }
    
    public static int indexMaxElemArray(double[] array) {
      int indmax = 0;
      double max = maxElemArray(array);
      for (int i = 0; i < array.length; i++)
        if (array[i] == max) {
          indmax = i;
          break;
        }
      return indmax;
    }
    
    public static double[] swap3andMaxArray(double[] array) {
      double temp3 = array[2];
      int max = indexMaxElemArray(array);
      array[2] = array[max];
      array[max] = temp3;
      return array;
    }
    
    public static void printArray(double[] array) {
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%.3f ", array[i]);
        if ((i+1) % 4 == 0)
        System.out.println();
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-7");
      double[] array = generArray(10);
      printArray(array);
      swap2and5Array(array);
      printArray(array);
      swap3andMaxArray(array);
      printArray(array);
  }
}


// https://onecompiler.com/java/3ynwb22xe
/*Лекция 9 № 8. 
Дан двумерный массив.
1. Вывести на экран элемент, расположенный в правом верхнем углу массива;
2. Вывести на экран элемент, расположенный в левом нижнем углу массива. */

import java.util.Random;

public class Main {
    public static double[][] generArray(int n, int m) {
      double[][] array = new double [n][m];
      Random r = new Random();
        for (int i = 0; i < array.length; i++) 
          for (int j = 0; j < array[i].length; j++)
            array[i][j] = r.nextDouble(100);
        return array;
    }
    
    public static double printPravVerhArray(double[][] array) {
      int j = array[0].length;
      return array[0][j-1];
    }
    
    public static double printLevNizArray(double[][] array) {
      int i = array.length;
      return array[i-1][0];
    }
    
    public static void printArray(double[][] array) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) 
          System.out.printf("%.3f ", array[i][j]);
        System.out.println();
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-8");
      double[][] array = generArray(3,5);
      printArray(array);
      System.out.printf("Число в правом верхнем углу = %.3f\n", printPravVerhArray(array));
      System.out.printf("Число в левом нижнем углу = %.3f\n", printLevNizArray(array));
  }
}


// https://onecompiler.com/java/3ynyeh8xv
/*Лекция 9 № 9. 
Дан двумерный массив из m строк и n столбцов.
Заполнить его значениями, вводимыми с консоли.
Заполнение проводить по строкам, начиная с первой 
(а в ней — начиная с первого элемента). */

import java.util.Scanner;

public class Main {
    public static double[][] scanArray(int m, int n) {
      double[][] array = new double [m][n];
      Scanner sc= new Scanner (System.in);
        for (int i = 0; i < array.length; i++)
          for (int j = 0; j < array[i].length; j++)
            array[i][j] = sc.nextDouble();
        return array;
    }
    
    public static void printArray(double[][] array) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) 
          System.out.printf("%.2f ", array[i][j]);
        System.out.println();
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-9");
      double[][] array = scanArray(6,3);
      printArray(array);
  }
}


// https://onecompiler.com/java/3ynyf9bss
/*Лекция 9 № 10. 
Дан двумерный массив. Определить:
1. сумму всех элементов третьей строки массива;
2. сумму всех элементов второго столбца массива. */

import java.util.Random;

public class Main {
    public static double[][] generArray(int n, int m) {
      double[][] array = new double [n][m];
      Random r = new Random();
        for (int i = 0; i < array.length; i++) 
          for (int j = 0; j < array[i].length; j++)
            array[i][j] = r.nextDouble(100);
        return array;
    }
    
    public static double sumElem3LineArray(double[][] array) {
      if (array.length>2) {
        double sum = 0;
          for (int j = 0; j < array[2].length; j++)
            sum = sum + array[2][j];
        return sum;
      }
      else 
      return 0;
    }
    
    public static double sumElem2ColumnArray(double[][] array) {
      if (array[0].length>1) {
        double sum = 0;
          for (int i = 0; i < array.length; i++)
            sum = sum + array[i][1];
        return sum;
      }
      else 
      return 0;
    }
    
    public static void printArray(double[][] array) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) 
          System.out.printf("%.3f ", array[i][j]);
        System.out.println();
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-10");
      double[][] array = generArray(6,3);
      printArray(array);
      System.out.printf("Сумма всех элементов третьей строки = %.3f\n", sumElem3LineArray(array));
      System.out.printf("Сумма всех элементов второго столбца = %.3f\n", sumElem2ColumnArray(array));
  }
}


// https://onecompiler.com/java/3ynyjzju4
/*Лекция 9 № 11. 
Дан двумерный массив.
1. поменять местами первую и третью строки;
2. поменять местами второй и последний столбцы. */

import java.util.Random;

public class Main {
    public static double[][] generArray(int n, int m) {
      double[][] array = new double [n][m];
      Random r = new Random();
        for (int i = 0; i < array.length; i++) 
          for (int j = 0; j < array[i].length; j++)
            array[i][j] = r.nextDouble(100);
        return array;
    }
    
    public static double[][] swap1and3LineArray(double[][] array) {
      if (array.length>2) {
        for (int j = 0; j < array[2].length; j++) {
          double temp3Line = array[2][j];
          array[2][j] = array[0][j];
          array[0][j] = temp3Line;
        }
        return array;
      }
      else {
        for (int i = 0; i < array.length; i++) 
          for (int j = 0; j < array[i].length; j++)
            array[i][j] = 0;
        return array; 
      }
    }
    
    public static double[][] swap2andEndColumnArray(double[][] array) {
      if (array[0].length>1) {
        
        for (int i = 0; i < array.length; i++) {
          int end = array[i].length-1;
          double tempEndColumn = array[i][end];
          array[i][end] = array[i][1];
          array[i][1] = tempEndColumn;
        }
        return array;
      }
      else {
        for (int i = 0; i < array.length; i++) 
          for (int j = 0; j < array[i].length; j++)
            array[i][j] = 0;
        return array; 
      }
    }
    
    public static void printArray(double[][] array) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) 
          System.out.printf("%.3f ", array[i][j]);
        System.out.println();
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Задача 9-11");
      double[][] array = generArray(4,5);
      printArray(array);
      swap1and3LineArray(array);
      printArray(array);
      swap2andEndColumnArray(array);
      printArray(array);
  }
}
