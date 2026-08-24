# CLGOPJP121

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Do While Loop

The  **`do/while`**  loop is a variation of the  **`while`**  loop. In this loop, the code block is executed once before checking the condition. After the initial execution, it will continue to repeat the loop as long as the condition remains true.

```
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 3);

/*
Output:
0
1
2
*/

```

### Task

Write a program which does the following:

- Declare an integer variable i and initialise it to $0$.
- Use the do/while loop to output i to the console as long as i is less than $6$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T13:52:08.004Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below.
		int i = 0;
		do{
		    System.out.println(i);
		    i++;
		}
	    while(i < 6);
		
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP121)