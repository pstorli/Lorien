package com.pstorli.lorien

import java.lang.Integer.MAX_VALUE
import java.util.*
import kotlin.collections.ArrayDeque

/**
 * This class operates as a LIFO (Last In First Out) queue.
 */

class MinStack {

    // The min value stored in this stack.
    var minValue = MAX_VALUE

    // Our "Stack"
    private var stack = ArrayDeque<Int>()

    /**
     * This function pushes an integer onto the top of the stack.
     */
    fun push (num:Int) {
        if (num<minValue) {
            minValue = num
        }
        stack.addFirst(num)
    }

    /**
     * This function pops an integer off the top of the stack.
     */
    fun pop (): Int {
        val result = stack.removeFirstOrNull()?:0
        if (result<=minValue) {
            minValue = findMin ()
        }
        return result
    }

    /**
     * This function returns the integer at the top of the stack.
     */
    fun top (): Int {
        return stack.first()
    }

    /**
     * This function returns the current known min value
     */
    fun getMin (): Int {
        return minValue
    }

    /**
     * This function finds the actual minimum value.
     */
    fun findMin (): Int {
        var newValue = MAX_VALUE
        for (num in stack) {
            if (num<newValue) {
                newValue = num
            }
        }
        return newValue
    }
}