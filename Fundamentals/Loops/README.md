# Loops

This folder contains my Kotlin programs on loops created as a part of learning. Here we will take a brief introduction to `Kotlin loops`.

## Kotlin Loops

There are three types of loops in Kotlin which are:

- `for` Loop
- `while` Loop
- `do-while` Loop

Let's have a brief introduction to each of them.

### 1. `for` loop

This loop is used when number of iterations are known. The syntax is a little bit different from `Java` loops, here is an example of `for` loop in Kotlin:

_Example:_

```kotlin
fun main(){
  for(i in 1..10){
    println(i)
  }
}
```

_Output:_
```text
1
2
3
4
5
6
7
8
9
10
```

**Explanation:** In the above program, `i` in the body of loop was neither declared `var` not `val`, that's because of internal working of kotlin. Kotlin itself
declares `i` as `val i`, and we didn't specify the steps (i.e `i++` in java), the steps are also the responsibility of `for` loop in kotlin, it increases the 
value itself. But what if we don't want to increase the value by 1? Here is the solution for that:

**The `step` keyword**

The `step` keyword is used to specify the steps (i.e value to be added in the `i` variable of `for` loop). The for loop increases the value specified with the `step`
keyword. Here is an example of it:

```kotlin
fun main(){
  for(i in 1..10 step 2){
    println(i)
  }
}
```

_Output:_
```text
1
3
5
7
9
```

## `while` loop

The `while` loop is used when we don't know the number of iterations like if a program says take input from the user until the user enters -1, here we don't know
the exact number of iterations. Maybe, the user enters -1 after 2 iterations, or after 10 iterations or after 100 iterations. So the suitable loop for this purpose is not `for` loop. Here we will take a look at how we use `while` loop in Kotlin:

***Note:***   `while` loop in kotlin is the same as in `Java`.

```kotlin
fun main(){
  var i = 1
  while(i <= 10){
    println(i);
    i++
  }
}
```

_Output:_
```text
1
2
3
4
5
6
7
8
9
10
```

**Explanation:** The working of this loop is the same as that of `Java's while` loop. If you want to increase `i` by `2` instead of `1`, the `i++` statement 
should be changed like this `i = i+2` or `i+=2`. That's it. Try it on your own. 

**IF YOU KNOW THE JAVA'S DO-WHILE SAME GOES FOR THE ON IN KOTLIN NO SYNTAX CHANGES OR WHATEVER...**
