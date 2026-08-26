# CLGOPJP132

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Power of a Number

You are given 2 space separated integers $N$ and $m$.

You need to output the value $N^m$.
Check the sample output given below.

### Sample 1:
Input
Output

```
5 3
```

```
125
```

### Sample 2:
Input
Output

```
8 4
```

```
4096
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:33:54.883Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);

        int N, M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        
        int ans = 1;
        for( int i = 1; i<=M;i++)
        {
            ans = ans * N;
            
        }
        System.out.println(ans);
        // Update your code below this line.

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP132)