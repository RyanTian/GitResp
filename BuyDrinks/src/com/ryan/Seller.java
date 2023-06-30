package com.ryan;

import java.util.Scanner;

public class Seller {

    //创建具体的饮品
    public static Drinks crtDrinks(int drinkType){
        Drinks dr = new Drinks();
        switch (drinkType){
            case 1 : /*可乐*/ dr = new Cola();
            dr.name = "可乐";
            dr.price = 3;
            break;
            case 2 : /*咖啡*/ dr = new Coffee();
            dr.name = "咖啡";
            dr.price = 8;
            break;
            case 3 : /*奶茶*/ dr = new MilkTea();
            dr.name = "奶茶";
            dr.price = 12;
            break;
        }
        return dr;
    }

    //选择饮品
    public static int chooseDrinks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要购买的饮品：1.可乐 2.咖啡 3.奶茶");
        int type = sc.nextInt();
        return type;
    }

    //录入饮品备注
    public static void inputRemark(Drinks dr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要的"+dr.name+"信息：");
        if("可乐".equals(dr.name)){
            System.out.println("备注可口可乐还是百事可乐，是否加冰：");
        }else if ("咖啡".equals(dr.name)) {
            System.out.println("备注咖啡加糖，加奶，还是什么都不加，是否加冰：");
        }else if ("奶茶".equals(dr.name)) {
            System.out.println("备注奶茶加椰果，红豆，还是布丁，是否加冰：");
        }
        String remark = sc.next();
        if("可乐".equals(dr.name)){
            boolean a = remark.contains("可口可乐");
            if(a == true){
                ((Cola) dr).brand = "可口";
            }else{
                ((Cola) dr).brand = "百事";
            }
            boolean b = remark.contains("不加冰");
            String addIce;
            if(b == true){
                dr.ice = false;
                addIce = "不加冰";
            }else{
                dr.ice = true;
                addIce = "加冰";
                dr.price = dr.price + 1;
            }
            dr.remark = ((Cola) dr).brand + "可乐，" + addIce;
        }else if ("咖啡".equals(dr.name)) {
            boolean a = remark.contains("加糖");
            boolean b = remark.contains("加奶");
            if(a == true){
                ((Coffee) dr).addItem = "加糖";
                dr.price = dr.price + 2;
            }
            if(b == true){
                ((Coffee) dr).addItem = ((Coffee) dr).addItem + "加奶";
                dr.price = dr.price + 2;
            }
            if(a == false && b == false){
                ((Coffee) dr).addItem = "";
            }
            boolean c = remark.contains("不加冰");
            String addIce;
            if(c == true){
                dr.ice = false;
                addIce = "不加冰";
            }else{
                dr.ice = true;
                addIce = "加冰";
                dr.price = dr.price + 1;
            }
            dr.remark = ((Coffee) dr).addItem + "咖啡，" + addIce;
        }else if ("奶茶".equals(dr.name)) {
            boolean a = remark.contains("椰果");
            boolean b = remark.contains("红豆");
            boolean c = remark.contains("布丁");
            if(a == true){
                ((MilkTea) dr).addItem = "椰果";
                dr.price = dr.price + 2;
            }
            if(b == true){
                ((MilkTea) dr).addItem = ((MilkTea) dr).addItem + "红豆";
                dr.price = dr.price + 2;
            }
            if(c == true){
                ((MilkTea) dr).addItem = ((MilkTea) dr).addItem + "布丁";
                dr.price = dr.price + 2;
            }
            if(a == false && b == false && c == false){
                ((MilkTea) dr).addItem = "";
            }
            boolean d = remark.contains("不加冰");
            String addIce;
            if(d == true){
                dr.ice = false;
                addIce = "不加冰";
            }else{
                dr.ice = true;
                addIce = "加冰";
                dr.price = dr.price + 1;
            }
            dr.remark = ((MilkTea) dr).addItem + "奶茶，" + addIce;
        }

    }

    public static void chooseCup(Drinks dr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择1.中杯 2.大杯 3.超大杯");
        int cup = sc.nextInt();
        switch (cup){
            case 1 :
                dr.cup = "中杯";
                break;
            case 2 :
                dr.cup = "大杯";
                dr.price = dr.price * 1.5;
                break;
            case 3 :
                dr.cup = "超大杯";
                dr.price = dr.price * 2;
                break;
            default:
                System.out.println("请输入有效数字");
        }
    }

    public static void chooseCount(Drinks dr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买数量：");
        int count = sc.nextInt();
        dr.count = count;
        dr.price = dr.price * count;
    }
}
