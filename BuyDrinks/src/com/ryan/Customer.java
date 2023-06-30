package com.ryan;

public class Customer {
    public static void main(String[] args) {
        //1. 选择饮品
        int type = Seller.chooseDrinks();
        Drinks dr = Seller.crtDrinks(type);
        int age = 20;
        int choose = 1;

        //2.录入备注
        Seller.inputRemark(dr);

        //3.选择大中小杯
        Seller.chooseCup(dr);

        //4.购买数量
        Seller.chooseCount(dr);

        dr.showInfo();
    }
}
