# CLGOPJP128

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### For Loop

When you know exactly how many times you want to `loop` through a block of code, use the  **`for`**  `loop` instead of a  **`while`**  `loop`:

```
for (statement 1; statement 2; statement 3) {
    // code block to be executed
}

```

- Statement 1 is executed (one time) before the execution of the code block. Its called Initialization statement.
- Statement 2 defines the condition for executing the code block. Its called condition statement.
- Statement 3 is executed (every time) after the code block has been executed. Its called update statement.

Example

```
for (int i = 0; i < 5; i++) 
    System.out.println(i);
}

```

 **Explanation of the code** :

- int i = 0; - This declares an integer variable i and initializes it to 0. It's the starting point of the loop.
- i < 5; - This is the loop's condition. The loop will continue to execute as long as this condition is true. In this case, as long as i is less than 5.
- i++ - This is the increment operation. After each iteration of the loop, i is increased by 1.

 **Loop Execution Flow** :

- In the first iteration, i is 0, so 0 is printed.
- i is incremented to 1, and since 1 is less than 5, the loop continues. 1 is printed.
- This process repeats until i becomes 4 and 4 is printed.
- When i is incremented to 5, the condition i < 5 becomes false, so the loop stops.

 **Output** 

```
0
1
2
3
4

```

### Task

Write a program which does the following:

- Initialise a variable n and accept a user defined input from the console.
- Output "Java" to the console n number of times.
### Sample 1:
Input
Output

```
4
```

```
Java
Java
Java
Java
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T16:20:33.021Z  

```java
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		// Upate the blank given below.
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for(int i = 0; i < n; i++){
		    System.out.println("Java");
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP128)