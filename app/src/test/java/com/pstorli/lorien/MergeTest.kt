package com.pstorli.lorien

import org.junit.Test

/**
 * Example Input + Output:
 *
 * Input:
 *   List/Array a: ["A", "B", "C"]
 *   List/Array b: ["1", "2", "3", "4", "5"]
 *
 * Output:
 *   List/Array: ["A", "1", "B", "2", "C", "3", "4", "5"]
 */
class MergeTest {

    @Test
    fun mergeTest () {
        val a1 = arrayOf<String> ("A", "B", "C")
        val a2 = arrayOf<String> ("1", "2", "3", "4", "5")
        merge (a1,a2).toString().sys() // Output to console.
    }

    /**
     * Merge these two arrays.
     */
    fun merge (a1:Array<String>, a2: Array<String>): Array<String> {
        var result: Array<String> = Array(a1.size+a2.size) {""}
        var pos  = 0
        var pos1 = 0
        var pos2 = 0
        while (pos1>=0 || pos2>=0) {
            // pos1
            if (pos1>=0) {
                result[pos] = a1[pos1]

                pos++

                pos1++
                if (pos1 > a1.size - 1) {
                    pos1 = -1
                }
            }

            // pos2
            if (pos2>=0) {
                result[pos] = a2[pos2]

                pos++

                pos2++
                if (pos2 > a2.size - 1) {
                    pos2 = -1
                }
            }
        }
        return result
    }
}