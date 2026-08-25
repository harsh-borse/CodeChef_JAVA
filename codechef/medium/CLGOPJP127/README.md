# CLGOPJP127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Prime Number

The last challenge of the while loop.

Chef wants to write a code which checks if a given number is prime.

- You are given a whole number N.
- Your task is to determine if N is a prime number or not and print "Yes" if it is prime, or "No" if it is not.
### Sample 1:
Input
Output

```
14635
```

```
No
```

### Sample 2:
Input
Output

```
13
```

```
Yes
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T16:16:28.368Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 2;
        boolean isPrime = true; // Assum n is prime.

        while (i < n) {
           if( n % i == 0){
               isPrime = false;
           } 
            i++;
            // Update your code below this line.
            
        }
        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP127)