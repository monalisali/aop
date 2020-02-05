package com.github.hcsp;

import javafx.scene.chart.PieChart;

public class Main {
    //1. 直接调用DataServiceImpl
    //static DataService service = new DataServiceImpl();

    //2. 装饰模式，用LogDecorator把DataServiceImp包了一层
    static DataService service = new LogDecorator(new DataServiceImpl());
    public static void main(String[] args) {
        System.out.println(service.a(1));
        System.out.println(service.b(1));
    }
}
