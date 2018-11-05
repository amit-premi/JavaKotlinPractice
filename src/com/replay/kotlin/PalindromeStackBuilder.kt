package com.replay.kotlin

import java.util.*

/**
 * Created by Amit PREMI on 04-Nov-18.
 */
fun main(args: Array<String>) {

    val inputArray = arrayOf("A", "b", "$", "D", "#", "@", "#", "d", "$", "B", "a")

    val strBuilder = StringBuilder()
    val strStack = Stack<String>()

    for (value in inputArray) {
        strBuilder.append(value)
        strStack.push(value)
    }

    var isPalindrome = true
    for (j in inputArray.indices) {
        val strValue = strBuilder[j].toString()
        if (!strValue.equals(strStack.pop(), ignoreCase = true)) {
            isPalindrome = false
        }
    }

    println("Is String Palindrome: $isPalindrome")
}
