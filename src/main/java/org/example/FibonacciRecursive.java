package org.example;

// Часова складність:
// Рекурсивний алгоритм для обчислення n-го числа Фібоначчі має експоненційну складність O(2^n) через те,
// що кожен виклик функції породжує два додаткових виклики (fibonacci(n-1) та fibonacci(n-2)), що призводить до великої кількості повторних обчислень для однакових значень n.
// Отже, часова складність цього алгоритму O(2n). <- pow n

// Просторова складність:
// Пам’ять використовується для підтримки стеку викликів.
// Максимальна глибина рекурсії відповідає  O(n).

public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));// = 55
    }
}

//UML діаграма для рекурсивного підходу:
/*
+-------------+                +-------------+
| User        |                | Fibonacci   |
+-------------+                +-------------+
      |                             |
      | Call fibonacci(n)           |
      |---------------------------->|--> fibonacci(n-1)
      |                             |--> fibonacci(n-2)
      :                             |
   Return value of F(n)             |<-- Result of F(n-1) + F(n-2)
      |<----------------------------|
 */