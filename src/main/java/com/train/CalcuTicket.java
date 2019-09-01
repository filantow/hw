package com.train;

public class CalcuTicket {
    int mNum;
    int mReturnNum;
    public CalcuTicket(int num, int returnNum){
        this.mNum = num;
        this.mReturnNum = returnNum;
    }
    public float getPrice() {
        float price = 0;
        if (mReturnNum == 0) {
            price = mNum*1000;
        } else {
            price = ((mNum - mReturnNum)*1000) + (float) (mReturnNum*2000*(0.9));
        }
        return price;
    }
}
