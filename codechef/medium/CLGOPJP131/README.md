# CLGOPJP131

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fibonacci Series

You are given an integer $N$.

You need to output the first $N$ numbers of the Fibonacci Series.
Check the sample output given below.

 **Note:**  A Fibonacci number is a series of numbers in which each number is obtained by adding the two preceding numbers.

F1 = 0, F2 = 1
FN = FN-2 + FN-1

### Sample 1:
Input
Output

```
5
```

```
0 1 1 2 3
```

### Sample 2:
Input
Output

```
8
```

```
0 1 1 2 3 5 8 13
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:18:49.906Z  

```java
import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N;
        N = scanner.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= N; i++) {
            System.out.println(a + " ");

            int next = a + b;
            a = b;
            b = next;


        }

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP131)