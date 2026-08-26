# CLGOPJP138

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Continue Statement

Recall that  **`break`**  exit the `loop` entirely when its condition was met - ignoring all subsequent iterations.
The  **`continue`**  statement skips one iteration (in the `loop`), if a specified condition occurs, and continues with the next iteration in the `loop`.

Example:

```
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.println(i);
}

```

Output:

```
1
3
5
7
9

```

In this example, the `for loop` iterates from $0$ to $9$.
Inside the `loop`, there is an `'if'` statement that checks if the current number is even (divisible by $2$).
If the condition is true, the `'continue'` statement is executed, and the remaining code block for that iteration is skipped.
As a result, when an even number is encountered, the `'continue'` statement is triggered, and the program jumps back to the beginning of the `loop` for the next iteration, without executing the `'print'` statement.
Therefore, only the odd numbers in the list will be printed.

### Task

Write a program that does the following

- Declare a variable n and set it to a user defined input
- Output to the console a series of numbers from $0$ to $12$ with the following condition Skips the number inserted by the user.
### Sample 1:
Input
Output

```
5
```

```
0
1
2
3
4
6
7
8
9
10
11
12
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:43:17.309Z  

```java
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		// Replace the underscores(__) and complete the code
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for (int i = 0; i <= 12; i++){
		    if(i == n){
		        continue;
		    }
		    System.out.println(i);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP138)