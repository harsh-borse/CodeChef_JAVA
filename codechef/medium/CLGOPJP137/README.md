# CLGOPJP137

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Break Statement

You have already seen the  **`break`**  statement used in an earlier module of this learning path.
It was used to  **jump out**  of a `switch` statement.
The  **`break`**  statement can also be used to jump out of a `loop`.

```
for (int i = 0; i < 6; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}

```

 **Output** 

```
0
1
2
3

```

### Task

Write a program which does the following:

- Initialize an integer variable i to $0$.
- Output to the console i from $0$ to $15$ using a for loop. Stop execution when the value of i reaches $13$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:40:09.291Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
		//  Replace the underscores(__) and complete the code
		for (int i = 0; i <= 15; i++) {
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP137)