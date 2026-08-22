# CLGOPJP90

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Problems on Conditional Statements

Write a program which does the following:

- Make an auto-reply program that takes input from the user as an integer variable x.
- Compute and output the following to the console: Print "Order Confirmed" only if x < 70. else Print "Order Limit reached". In both cases, the program must print "Thank YOU!" on a separate line.
### Sample 1:
Input
Output

```
69

```

```
Order Confirmed
Thank YOU!

```

### Sample 2:
Input
Output

```
70
```

```
Order Limit reached
Thank YOU!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:30:41.069Z  

```java
import java.util.*;


class Codechef
{
    public static void main (String[] args)
    {
        // Complete the code
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if( x < 70){
            System.out.println("Order Confirmed");
        }else{
            System.out.println("Order Limit reached");
        }
        
        System.out.println("Thank YOU!");
        
            
        

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP90)