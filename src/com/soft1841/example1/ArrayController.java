package com.soft1841.example1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.Random;

public class ArrayController {
    @FXML
    private ListView arrayList;
    @FXML
    private Label maxLabel;

    int[] numbers = new int[10];

    public  void listAll() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i ++){
            //随机产生100以内的随机数
            numbers[i] = random.nextInt(100);
            //将整型转换为字符串，加入ListView中
            arrayList.getItems().add(String.valueOf(numbers[i]));
        }
    }

    public  void getMax(){
        //以数组第一个为最大
        int max = numbers[0];
        //
        for (int i = 1;i < numbers.length; i ++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        maxLabel.setText("最大值是：" + String.valueOf(max));
    }
}
