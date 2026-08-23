# CLGOPJP110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug the code - 2

Chef considers the climate `HOT` if the temperature is above 20, otherwise he considers it `COLD`.
The given code is supposed to find whether the climate is `HOT` or `COLD` based user's input temperature  **C**.

### Task
- Debug the given code in IDE and fix it.
### Input Format
- The first and only line of each test case contains a single integer, the temperature C.
### Output Format

print on a new line whether the climate is `HOT` or `COLD`.

You may print each character of the `string` in either uppercase or lowercase (for example, the `strings` `hOt`, `hot`, `Hot`, and `HOT` will all be treated as identical).

### Constraints
- 0≤C≤40
### Sample 1:
Input
Output

```
21
```

```
HOT
```

### Explanation:

The temperature is 21, which is more than 20. So, `Chef` considers the climate `HOT`.

### Sample 2:
Input
Output

```
16
```

```
COLD
```

### Explanation:

The temperature is 16, which is not more than 20. So, Chef considers the climate `COLD`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T06:52:22.859Z  

```java
import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C;
        C = scanner.nextInt();
        if (C > 20) {
            System.out.println("HOT");
        } else {
            System.out.println("COLD");
        }
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP110)