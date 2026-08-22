# CLGOPJP91

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Switch, Break and Default statement

We can use the  **`switch`**  statement to select one of many code blocks to be executed.
We can use the  **`break`**  statement to end the execution of code at a specific point.

The Syntax is as follows:

```
switch(expression) {
  case x:
    // code 
    break;
  case y:
    // code 
    break;
  default:
    // code 
}

```

- The switch expression is evaluated once and the value of the expression is compared with the values of each case. If there is a match, the associated block of code is executed.
- When Java reaches a break keyword, it breaks out of the switch block. This will stop the execution of more code and case testing inside the block.
- The default keyword specifies some code to run if there is no case match.
### Task

Write a program which does the following:

- Take input from the user with value between 1 and 7.
- Compute and output to the console the day associated with that number.
### Sample 1:
Input
Output

```
4
```

```
Thursday
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:36:10.065Z  

```java
// Update the blank in the code given below
import java.util.Scanner;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		switch(a) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
		}
	}
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP91)