# CLGOPJP84

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - 29

What will be the output of this code?

```
class Codechef {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a >= b) {
            System.out.println("a is greater or equal to b.");
        }
        if (a == 0) {
            System.out.println("a is 0.");
        }
        if (a <= 5) {
            System.out.print("a is not more than 5.");
        }
        System.out.println(" Program ends.");
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:10:10.166Z  

```cpp
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in the code given below
	    Scanner read= new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a >= b && a>=c ) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Try Again");
        }

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        if (a >= b && a>=c ) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Try Again");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP84)