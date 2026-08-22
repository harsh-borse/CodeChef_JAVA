# CLGOPJP68

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Cubes and Squares

Write a program which does the following:

- Declare an integer variable a.
- Accept a user input and store it in the variable a.
- Declare 2 variables square and cube - compute and store the square and cube of a in them.
- Output square and cube to the console on separate lines.
- Note: Square of an integer N = N  *N. Cube of an integer N = N*  N * N.
### Sample 1:
Input
Output

```
3
```

```
Square is: 9
Cube is: 27
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:40:38.793Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// Update the blank in the code given below
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Square is: " + (num * num));
		System.out.println("Cube is: " + (num * num * num));
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP68)