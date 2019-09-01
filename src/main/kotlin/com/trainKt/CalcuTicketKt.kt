package com.trainKt

class CalcuTicketKt(var num: Int, var returnNum: Int) {
    fun getPrice(): Float {
        var totalPrice = 0f
        if (returnNum == 0) {
            totalPrice = num.toFloat()*1000
        } else {
            totalPrice = ((num - returnNum).toFloat()*1000 + (returnNum.toFloat()*2000*(0.9))).toFloat()
        }
        return totalPrice
    }
}
