package com.practice.kotlin.common

class ThreadTest {

    private inner class OddNumber : Runnable {
        internal var oddNumb = 1

        override fun run() {
            try {
                while (oddNumb < 200) {
                    println(oddNumb)
                    oddNumb += 2
                    Thread.sleep(50)
                }
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
    }

    private inner class EvenNumber : Runnable {
        internal var evenNumb = 2
        override fun run() {
            try {
                while (evenNumb <= 200) {
                    println(evenNumb)
                    evenNumb += 2
                    Thread.sleep(50)
                }
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val oddNumber = ThreadTest().OddNumber()
            val tOdd = Thread(oddNumber)
            tOdd.start()

            val evenNumber = ThreadTest().EvenNumber()
            val tEven = Thread(evenNumber)
            tEven.start()
        }
    }
}
