package com.GenericsExceptionHandling.ExceptionHandling;

public class ExceptionHandlingTheory {

    /** 1. What is Exception Handling?
     Exception handling in Java is a mechanism to gracefully handle runtime errors
     so the normal flow of the application is not disrupted.
     Without exception handling, your program crashes on errors.
     With it, you can handle and recover or fail meaningfully.

     * Hierarchy --> All exceptions are objects in Java
       and are inherited from the Throwable class.

     * Object
     *    ↳ Throwable
     *         ↳ Error            // JVM errors (don’t catch)
     *         ↳ Exception
     *              ↳ checked
     *              ↳ Un-checked
     *              ↳ RuntimeException

     * 🧨 Types of Exceptions

     * Checked	exception is a type of Exception Handled at compile-time	Examples---> IOException, SQLException
     * Unchecked  Occur at runtime; not checked by compiler	Examples--->  NullPointerException, ArrayIndexOutOfBoundsException
     * Errors	Irrecoverable; Examples--->  JVM-related	OutOfMemoryError, StackOverflowError

     * ----------------> Syntax ----------->

     * try{
     *     // risky code in  errors
     * } catch{
     *     // error handling code
     * } finally{
     *     // finally block is always runs
     * }
     ***/
}
