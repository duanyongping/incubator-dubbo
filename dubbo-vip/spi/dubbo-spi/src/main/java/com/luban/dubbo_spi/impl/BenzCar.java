package com.luban.dubbo_spi.impl;

import com.luban.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class BenzCar implements CarInterface{

    private CarInterface carInterface;  // ?

    public void setBlack(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getSize() {

    }

    @Override
    public void getColor(URL url) {
        System.out.println("干啥呢");
        carInterface.getColor(url);
    }
}
