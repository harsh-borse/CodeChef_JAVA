# CLGOPJP130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factorial of any number

Write a program that does the following:

- Declare an integer variable num and initialize it to a user defined input.
- Output to the console the factorial of num: Remember to use loops for this problem. Factorial of a number n is the product of all the numbers from 1 to n. Factorial of a number(n) = 1  *2*  3  *.....*  (n-1) * n.

Hint: You have to use another variable to store the answer.

### Sample 1:
Input
Output

```
6
```

```
720
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T16:26:47.345Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		int fact = 1;
		for(int i = 1; i <= num; i++){
		    fact = fact * i;
		    
		    
		}
		    System.out.println(fact);
		//  Write your code here
		
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP130)