# CLGOPJP142

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Nested loops continued

Ok - try out a problem yourself.

### Task

Given an integer $N$ - create a square pattern of side $N$.

Check the sample output given below for $N$ = 4.

### Sample 1:
Input
Output

```
4
```

```
 **   ** 
 **   ** 
 **   ** 
 **   ** 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T12:22:02.676Z  

```java
// Update the code below to solve the problem.
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=1 ; i <=n ; i++)
        {
            for(int j=1; j<= n; j++)
            {
                System.out.print("* ");
                
                
            }
            System.out.println("");
          
        }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP142)