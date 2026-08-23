# CLGOPJP109

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug the code - 1

`Chef` defines a pair of positive integers  **(a,b)**  to be a `Oneful Pair`, if  **a + b + (a x b)**  = $111$
For example, $(1,55)$ is a `Oneful Pair`, since $1$ + $55$ + ($1$ x $55$) = $56$ + $55$ = $111$.
But $(1,56)$ is not a `Oneful Pair`, since $1$ + $56$ + ($1$ x $56$) = $57$ + $56$ = $113$ not equal to $111$.
Given two positive integers $a$ and $b$, output `Yes` if they are a `Oneful Pair`, and `No` otherwise.

### Input Format

The only line of input contains two space-separated integers  **a**  and  **b**.

### Output Format

Output `Yes`, if  **(a,b)**  form a `Oneful Pair`. Output `No` if they do not.

### Constraints
- 1 ≤ a,b ≤ 1000
### Sample 1:
Input
Output

```
1 55
```

```
Yes
```

### Sample 2:
Input
Output

```
1 56
```

```
No
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T06:48:35.138Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        // Read input values
        a = scanner.nextInt();
        b = scanner.nextInt();

        if ((a + b + (a * b)) == 111) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP109)