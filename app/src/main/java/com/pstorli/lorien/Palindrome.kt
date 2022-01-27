package com.pstorli.lorien

class Palindrome {
    fun palin (str1: String, str2: String): Boolean {
        var pos1 = 0
        var pos2 = str2.length
        var valid = true

        while (pos1<pos2) {
            if (str1[pos1] != str1[pos2]) {
                valid=false
                break
            }
            else {
                pos1++
                pos2--
            }
        }
        return valid
    }
}