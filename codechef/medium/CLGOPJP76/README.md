# CLGOPJP76

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Else Statement

The  **`else`**  keyword includes anything which isn't included in the previous conditions.

### Task

Some code is written in the editor.

- Two variables r and k are defined.
- Output based on these conditions: If r is greater than k, output "Ram is heavier than Karan" If r is less than k, output "Karan is heavier than Ram" Otherwise, output "Ram & Karan have the same weight!"

Your task is to complete the blanks in the code.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:01:20.361Z  

```java
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below
	    int r;
        int k;
        r = 24;
        k = 32;
        if (r > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (r < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }

        r = 78;
        k = 78;
        if (r > k) {
            System.out.println("Ram is heavier than Karan.");
        } else if (r < k) {
            System.out.println("Karan is heavier than Ram");
        } else {
            System.out.println("Ram & Karan have the same weight!");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP76)