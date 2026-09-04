# CLGOPJP145

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding problem - 2

Given an integer $N$ - you need to generate a diamond pattern.
Check the sample input below for $N = 4$.

```
   *
  ***
   *
  ***
   *
  ***
   *

```

### Sample 1:
Input
Output

```
4

```

```
     *
   ***
    *
  ***
    *
   ***
    *
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T08:11:14.481Z  

```java
import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n ; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
                
            }
            for(int j = 1; j <= 2* i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i = n - 1; i >= 1; i--)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= 2*i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP145)