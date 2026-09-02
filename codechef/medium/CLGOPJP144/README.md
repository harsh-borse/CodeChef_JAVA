# CLGOPJP144

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding problem - 1

Let us solve some problems involving Nested loops.

Given an integer $N$ - you need to generate a pyramid pattern.
Check the sample input below for $N = 5$.

### Sample 1:
Input
Output

```
5
```

```
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
**Submitted:** 2026-09-02T07:13:54.282Z  

```java
// Update the code below to solve the problem.
import java.util.Scanner;


class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int i = 1; i <= N; i++)
        {
            for(int j = 1; j<= N - i; j++)
            {
                System.out.print(" ");
                
            }
            for(int j = 1; j<= 2*i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // Update the code below this line.

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP144)