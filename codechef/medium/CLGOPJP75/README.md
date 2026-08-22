# CLGOPJP75

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Else If Statement

In cases where you have to check for multiple conditions and run some code based on each, you have to use  **else if**.

The  **else if**  keyword means "if the previous conditions were not true, then try this condition"

The following example illustrates usage of  **else if**.

```
grade = 85;
if (grade >= 90) {
    System.out.println("You got an A");
} else if (grade >= 80) {
    System.out.println("You got a B");
}

// Output
// You got a B

```

The code above works as follows

- If grade >= 90, then it will output: You got an A
- If grade is between 80 and 90 - it will output: You got a B
- If grade is less than 80 - there will be no output
### Task

Write a program which does the following

- Declare two integers variables b and r and initialize them with some values.
- Print "Rob scored higher marks than Bob", if r is greater than b
- Print "Bob & Rob both scored the same", if both b and r are equal

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:00:06.735Z  

```java
class Codechef
{
    public static void main (String[] args)
    {
        // Update the blank in the code given below
        int b = 23;
        int r = 45;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }
        
         r= 15;
         b= 15;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP75)