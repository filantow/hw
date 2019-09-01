package com.trainKt

import com.train.CalcuTicket
import java.util.*

fun main() {
    var scannerNum = Scanner(System.`in`)
    println("Please enter number of tickets :");
    var num = scannerNum.nextInt()
    var scannerReturnNum = Scanner(System.`in`)
    println("How many round-trip tickets :")
    val returnNum = scannerReturnNum.nextInt()
    var calResult = CalcuTicketKt(num, returnNum)
    println("Total tickets:" + num + " Round-trip: " + returnNum + "Total:" + calResult.getPrice())
}