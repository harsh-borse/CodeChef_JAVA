# CLGOPJP85

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### And Statement

Till now we used only one condition in our  **if**  or  **else if**  statements. But what if we want to use multiple conditions? Say we want to check if a person is female and older than 18 years of age, how can we do that in Java?

To achieve that, we have to learn about  **logical operators**.

The  **&&**  (pronounced  **"and"**) keyword is a logical operator that allows you to combine multiple conditions.
It returns  **`true`**  if all the conditions are true, and  **`false`**  if at least one condition is false.

Let's start with a simple example.
Suppose you have two variables:  **`x`**  and  **`y`**. You want to check if both  **`x`**  and  **`y`**  are greater than 5. Here's how you would use the  **`&&`**  operator to combine these conditions:

```
int x = 8;
int y = 10;

if (x > 5 && y > 5) {
    System.out.println("Both are greater than 5");
} else {
    System.out.println("At least one of them is less than 5");
}

// Output
// Both are greater than 5

```

### Task

Write a program which does the following:

- Declare a variable a and initialize it to the values $15$.
- Compute if a is completely divisible by both 7 and 5.
- Depending on the result above - output the following to the console: The number is divisible by both 5 & 7 The number is not divisible by both 5 & 7
- Re-assign a with number 35, and check for above again.

 **Note:**  The  *%*  (modulo operator) gives remainder when  **x**  is divided by  **y**  and is written as  **x % y**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:13:54.761Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below
		int a = 15;
        
        if (a % 7 == 0 && a % 5 == 0) {
            System.out.println("The number is divisible by both 5 & 7");
        }
            else {
            System.out.println("The number is not divisible by both 5 & 7");
        }
        
        a = 35;
        
        if (a % 7 == 0 && a % 5 == 0) {
            System.out.println("The number is divisible by both 5 & 7");
        }
        else {
            System.out.println("The number is not divisible by both 5 & 7");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP85)