package com.pstorli.lorien

import org.junit.Assert.assertFalse
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 * NOTE: Below and in Extensions.kt, .sys() is the same as .log() in that a message is logged.
 *  Difference is that junit cannot use Log.i (tag, message), needs to use System.out.println (tag + ": " + message)
 *  There should be a way to mock the log using Mockk (https://mockk.io/), but that needs further investigation.
 */
class ValidParenthesisUnitTests {

    lateinit var vp: ValidParentheses

    @Before
    fun init ()
    {
        vp = ValidParentheses ()
    }

    /**
     * Given a strings containing just the characters
     * '(',')','{','}','['and']', determine if the input string is valid.
     * *
     * An input string is valid if:
     *   1. Open brackets must be closed by the same type of brackets.
     *   2. Open brackets must be closed in the correct order.
     *
     * Example 1:
     * Input: s = "()"
     * Output: true
     * Example 2:
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     * Input: s = "(]"
     * Output: false
     * Example 4:
     * Input: s = "([)]"
     * Output: false
     * Example 5:
     * Input: s = "{[]}"
     * Output: true
     *
     * Constraints:
     * • 1 <= s.length <= 10^4
     * • s consists of parentheses only '()[]{}'.
     */

    @Test
    fun validParenthesesTest1 () {
        var result = vp.valid("()")
        assert(result) // Should be true

        result = vp.valid("()[]{}")
        assert(result) // Should be true

        result = vp.valid("(]")
        assertFalse(result) // Will be false

        result = vp.valid("([)]")
        assertFalse(result) // Will be false

        result = vp.valid("{[]}")
        assert(result) // Should be true
    }

}

