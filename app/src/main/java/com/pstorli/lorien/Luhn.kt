package com.pstorli.lorien
class Luhn {
    /**
     * Test if this is a valid LUHN number.
     */
    fun valid (num: String): Boolean {
        var sum = 0
        var double = false
        for (pos in num.length-1 downTo 0) {
            var dig: Int = num[pos].code-ASCII_ZERO

            // Double?
            if (double) {
                var newNum = 2*dig

                // Reduce?
                if (newNum>9){
                    // Reduce this integer to the sum of its digits.
                    newNum = newNum.reduce ()
                }

                sum += newNum
            }
            // Nope, just give me a single.
            else {
                sum+= dig
            }

            // Switch the doubling.
            double = !double
        }

        return 0 == sum % 10
    }
}