# CLGOPJP108

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug the code - 12

Write a program which does the following:

- Initialize a string variable word and assign the value "Ocygen" to it.
- You now want to fix the typo in the given string.
- Replace 'c' with 'x' in the variable word. Output the updated word to console.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T14:08:40.418Z  

```java
// Debug the given code
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		char[] word = "Ocygen".toCharArray();
        word[1] = 'x';
        System.out.println(word);
	}
}

/*Note:

The java string toCharArray() method converts this string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.

*/
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP108)