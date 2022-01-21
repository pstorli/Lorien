package com.pstorli.lorien


class ValidParentheses {

    // Help save us tiny stack from these coding problems.
    val tinyStack = MinStack()

    /**
     * An input string is valid if:
     *   1. Open brackets must be closed by the same type of brackets.
     *   2. Open brackets must be closed in the correct order.
     */
    fun valid (str: String) : Boolean {
        var valid = true
        for (ch in str) {
            // Open or close?
            if (ch.opening()) {
                // Opening
                // Add to stack
                tinyStack.push(ch.code)
            }
            else if (ch.closing()) {
                // Closing
                // Pop off last item.
                if (ch.mismatch (tinyStack.pop())) {
                    // Oops, these were supposed to match.
                    "Out of order $ch".sys()
                    valid = false
                    break
                }
            }
            else {
                // WTF!
                // Invalid Chars.
                "Invalid chacters encountered $ch".sys()
                valid = false
                break
            }
        }
        return valid
    }
}