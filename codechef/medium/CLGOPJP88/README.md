# CLGOPJP88

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - 32

What will be the output of this code?

```
class Codechef {
  public static void main(String[] args) {
    int a = 0;
    int b = -10;

    if (a >= b) {
       System.out.print("a is greater or equal to b. ");
    }

    if (a == 0 || b == 0) {
       System.out.print("At least one is 0. ");
    }

    if (a == 0 && b == 0) {
       System.out.print("Both are 0. ");
    }

    System.out.print("Program ends");
  }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:17:50.528Z  

```cpp
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blanks in the code given below
		Scanner read = new Scanner(System.in);

        int z;
        int x;
        int c;
        z = read.nextInt();
        x = read.nextInt();
        c = read.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        z = read.nextInt();
        x = read.nextInt();
        c = read.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP88)