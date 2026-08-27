# CLGOPJP140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Displaying the count of elements

How many times will `"Java"` be printed by this code?

```
class Codechef {
  public static void main(String[] args) {
    for (int i = 0; i <= 5; i += 2) {
        System.out.println("Java");
        if (i == 4) {
            break;
        }
    }
  }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:45:30.523Z  

```cpp
import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		// Replace the underscores(__) and complete the code
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for (int i = 0; i <= 12; i++){
		    if(i == n){
		        continue;
		    }
		    System.out.println(i);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP140)