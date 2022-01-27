package com.pstorli.lorien

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PalinTest {
    lateinit var palin: Palindrome

    @Before
    fun init ()
    {
        palin = Palindrome ()
    }

    @Test
    fun palinTest () {
        assertTrue (palin.palin("defied","defied"))
        assertFalse (palin.palin("abccba","abcabc"))
    }
}