package com.ryan;

public class Drinks {
    String name;
    double price;
    String cup;
    String remark;
    boolean ice;
    int count;


    public Drinks() {
    }

    public void showInfo(){
        System.out.println("订单信息：您购买了:" + remark + "，购买的" + cup + "，购买数量" + count + "杯，价格" + price + "元");
    }

}
