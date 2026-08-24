# CLGOPJP119

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### User input Loop

Let us change the problem a bit.

### Task

Write a program which does the following:

- Declare a variable num and store a user defined input from the console in it.
- Declare a variable a and initialize it to $0$.
- Use the syntax above to create a loop, output the following to the console: Print a in separate lines as long as it is less than num. Increment a by $1$ in each iteration.
### Sample 1:
Input
Output

```
10
```

```
0
1
2
3
4
5
6
7
8
9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T13:22:39.803Z  

```java
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		int a = 0;
		
		while( a < num){
		    System.out.println(a);
		    a++;
		    
		}
		// Update your code below this line


	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP119)