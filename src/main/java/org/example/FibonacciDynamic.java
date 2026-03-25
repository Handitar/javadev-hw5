package org.example;
//Часова складність: O(n)
//Просторова складність:
//    O(n) з масивом.
//    O(1) із просторовою оптимізацією.
public class FibonacciDynamic {
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10)); // = 55
    }
}


/*
UML діаграма для динамічного підходу:

+--------------------+
| Class: FibonacciDP |
+--------------------+
| - int[] dp         |  // Зберігає проміжні значення
+--------------------+
| + int fibonacci(n) |  // Основна функція
| + void fillCache() |  // Заповнення результатів
+--------------------+

*/
