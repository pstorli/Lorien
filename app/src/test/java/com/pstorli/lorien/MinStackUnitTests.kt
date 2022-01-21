package com.pstorli.lorien

import org.junit.Test
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 * NOTE: Below and in Extensions.kt, .sys() is the same as .log() in that a message is logged.
 *  Difference is that junit cannot use Log.i (tag, message), needs to use System.out.println (tag + ": " + message)
 *  There should be a way to mock the log using Mockk (https://mockk.io/), but that needs further investigation.
 */
class MinStackUnitTests {

    lateinit var tinyStack: MinStack

    @Before
    fun init ()
    {
        tinyStack = MinStack ()
    }

    /** ********************************************************************************************
     *
     * Coding part 1 - Min Stack
     *
     * *********************************************************************************************
     *
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     * Implement the MinStack class:
     *  • MinStack() initializes the stack object.
     *  • void push(val) pushes the element val onto the stack.
     *  • void pop() removes the element on the top of the stack.
     *  • int top() gets the top element of the stack.
     *  • int getMin() retrieves the minimum element in the stack.
     *
     * Example 1:
     *  Input
     *  ["MinStack","push","push","push","getMin","pop","top","getMin"]
     *  [[],[-2],[0],[-3],[],[],[],[]]
     *
     * Output
     *  [null,null,null,null,-3,null,0,-2]
     *
     * Explanation
     *  MinStack minStack = new MinStack();
     *  minStack.push(-2);
     *  minStack.push(0);
     *  minStack.push(-3);
     *  minStack.getMin(); // return -3
     *  minStack.pop();
     *  minStack.top();    // return 0
     *  minStack.getMin(); // return -2
     *
     * Constraints:
     *  • -2^31 <= val <= 2^31 - 1
     *  • Methods pop, top and getMin operations will always be called on non-empty stacks.
     *  • At most 3 * 10^4 calls will be made to push, pop, top, and getMin.
     *
     */
    @Test
    fun minStackSeqTest () {

        // We want a fresh copy of Solution for every test.
        "[MinStack:null".sys()
        tinyStack = MinStack ()

        // Do some pushes, and log as we go.
        add(-2)
        add(0)
        add(-3)

        var num = tinyStack.getMin()
        ",getMin:min".sys()
        assert (-3 == num)

        num = tinyStack.pop()
        ",pop:$num".sys()

        num = tinyStack.top()
        ",top:$num".sys()
        assert (0 == num)

        num = tinyStack.getMin()
        ",getMin:min".sys()
        assert (-2 == num)
    }

    /**
     * Helper function to push to stack as well as log what we are doing.
     */
    fun add (num:Int) {
        ",push:$num".sys()
        tinyStack.push(num)
    }
}

