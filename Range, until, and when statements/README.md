# Range, until, and when statements

Here you will find my practice programs on range (`..`), `unitl` and `when` statements. (`..`) is known as `range operator`, and 
is used to implement the range in kotlin.
Here is a short intro of each along with their syntax

## Range

This is used to avoid multiple if-else statements, it is used like this:

```kotlin
fun main(){
  var num : Int  = 10
  if(num in 1..10){
    println("Number is in the range from 1 to 10")
  }else{
    println("Number is not in the range from 1 to 10")
  }
}
```

## Until

This is also used to avoid multiple if-else statements, but there is a key difference in [Range](#Range) and [Until](#Until). It is given after this section. In
order to implement the until in Kotlin `until` key word is used.
Here is an example of `until` in Kotlin:

```kotlin
fun main(){
  var num : Int = 19

  if(num in 1 until 20){
    println("Number is in the range of 1 until 20")
  }else{
   println("Number is not in the range of 1 until 20") 
  }
}
```

**Difference between range and until:**  The key difference in range and until is that: In the range (..) the upper bound is included 
(i.e if you use `num in 1..10` it means `1 <= num <= 10`), while in until the upper bound is excluded 
(i.e if you use `num in 1 until 10` it means `1 <= num < 10`).

## When statement

`when` statement is similar to `Java`'s `switch-case` statement the only difference is of syntax. Use of `when` statement.

```kotlin
fun main(){
  var num : Int = 18

  when(num){
    1 -> println("Number is 1")
    2 -> println("Number is 2")
    3 -> println("Number is 3")
    4 -> println("Number is 4")
    5 -> println("Number is 5")
    else -> println("Number is greater than 5")
  }
}
```
