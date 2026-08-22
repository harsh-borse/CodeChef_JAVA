# CLGOPJP93

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - 34

What will be the output of this code when the input is 3?

```
class Codechef {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int binary = read.nextInt();

    switch (binary) {
        case 0:
            System.out.println("Zero");
            break;
        case 1:
            System.out.println("One");
            break;
        default:
            System.out.println("Not valid");
    }
  }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T13:38:26.759Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP93)