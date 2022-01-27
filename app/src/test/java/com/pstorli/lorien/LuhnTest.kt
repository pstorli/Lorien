package com.pstorli.lorien
import junit.framework.Assert.assertTrue
import junit.framework.AssertionFailedError
import org.junit.Before
import org.junit.Test
class LuhnTest {
    lateinit var luhn: Luhn

    @Before
    fun init ()
    {
        "Beginning Tests".sys()
        luhn = Luhn ()
    }

    @Test
    fun palinTest () {
        testNum ("79927398713")
        testNum ("79627398713")
    }

    /**
     * Test if this is LUHN number.
     */
    fun testNum (num:String) {
        try {
            assertTrue(luhn.valid(num))
            "Number $num is valid.".sys()
        }
        catch (ex:AssertionFailedError) {
            "Number $num is invalid.".sys()
        }
    }
}