# CLGOPJP73

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Curly braces

Let's take a look at the code from last problem:

```
int age = 25;
int voting_age = 18;

if (age >= voting_age) {
    System.out.println("Old enough to vote!");
} else {
    System.out.println("Not old enough to vote.");
}

```

To things to note here:

- The condition age >= voting_age is inside parentheses ().
- The System.out.println() statements are inside curly brackets { }.

The parentheses are mandatory after  **if**  statement, and the condition comes inside them. We use curly brackets in Java to define scope. Because of the curly braces, Java knows that it has to execute the print statement if the condition becomes true.

### Task

You need to do the following:

- Run the code as it is and read the error that you get.
- Add curly braces around the condition and then re-run the code.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:51:41.891Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
	   // Debug the code given below
	    int age = 25;
        int voting_age = 18;

        if (age < voting_age){
            System.out.println("Not old enough to vote.");
            System.out.println("Wait for " + (voting_age - age) + " years");

        }else {
            System.out.println("Old enough to vote!");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP73)