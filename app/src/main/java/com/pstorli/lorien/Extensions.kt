package com.pstorli.lorien

import android.util.Log

/**
 * This file, Extensions.kt, is a set of methods added
 * to existing classes to add new functionalities, in a kotlin way.
 */

val OPEN_CHARS  = "({["
val CLOSE_CHARS = ")}]"

// *********************************************************************************************
// Log Tags. Get em while there hot!
// *********************************************************************************************
val TAG = "Lorien"

/**
 * Log a message.
 */
fun String.log () {
    this.log (TAG)
}

/**
 * Log a message and specify the TAG to log message as.
 */
fun String.log (tag: String) {
    Log.i (tag, this)
}

/**
 * Log a message.
 */
fun String.sys () {
    this.sys (TAG)
}

/**
 * Log a message and specify the TAG to log message as.
 */
fun String.sys (tag: String) {
    System.out.println (tag + ": " + this)
}

/**
 * Is this an opening bracket? ({[
 */
fun Char.opening (): Boolean {
    return OPEN_CHARS.indexOf(this)>=0
}

/**
 * Is this a closing bracket? )}]
 */
fun Char.closing (): Boolean {
    return CLOSE_CHARS.indexOf(this)>=0
}

/**
 * Does this character match an opening char?
 */
fun Char.mismatch (num:Int): Boolean {
    val pos = CLOSE_CHARS.indexOf(this)
    return num != OPEN_CHARS [pos].code
}