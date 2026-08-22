# CLGOPJP72

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### If & Else Statements

We use conditions in code for decision making and controlling the flow of a program.

 **`if`**  and  **`else`**  keywords can be used together to create conditions.

The syntax for this:

```
if (condition) {
    // code to run if the condition is true
} else {
    // code to run if the above condition is false
}

```

Condition can be any expression which you are trying to evaluate. A simple condition can be:

```
int a = 4;
int b = 5;
if (a == b) {
    System.out.println("a and b are equal");
} else {
    System.out.println("a and b are not equal");
}

// Output:
// a and b are not equal

```

`a == b` is used to check whether the values of variables `a` and `b` are equal. `==` is called a equal to operator.

Here's a table of common operators used in Java conditions:

Operator	Description	Example
`==`	Equal to	`a == b`
`!=`	Not equal to	`a != b`
`>`	Greater than	`a > b`
`<`	Less than	`a < b`
`>=`	Greater than or equal to	`a >= b`
`<=`	Less than or equal to	`a <= b`
### Task

Write a program which does the following:

- Let's think of a real-life example where we need to find out if a person is old enough to vote.
- Find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18.
- Declare the variables age and voting_age - and initialize them to the values 25 and 18 - i.e. the age and the voting age respectively.
- Compare age and voting_age using the syntax given above and output the following "Old enough to vote!" if age is greater than or equal to voting_age "Not old enough to vote." if age is lesser than voting_age

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:49:05.595Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below
		int Age = 25;
        int Vage = 18;

        if (Age >= Vage) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP72)