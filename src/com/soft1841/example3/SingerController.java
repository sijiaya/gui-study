package com.soft1841.example3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

    public class SingerController {
        @FXML
        private FlowPane singerPane;

        public void showAll() {
            //控制台上显示名称和图片
            Singer[] singers = new Singer[]{
                    new Singer("歌手榜", "0.png"),
                    new Singer("薛之谦", "1.png"),
                    new Singer("花粥",   "2.png"),
                    new Singer("陈奕迅", "3.png"),
                    new Singer("林俊杰", "4.png"),
                    new Singer("邓紫棋", "5.png"),
                    new Singer("林宥嘉", "6.png"),
                    new Singer("王贰浪", "7.png")
            };
            //初始化数据
            for (Singer s : singers) {
                //给每个歌手对象创建一个容器，放名字和头像
                BorderPane borderPane = new BorderPane();
                //创建一个文本组件，同时将歌手的姓名作为文本的内容
                Label nameLabe1 = new Label(s.getName());
                //创建图片组件，将歌手头像作为图片内容
                Image image = new Image("/img/" + s.getAvatar());
                ImageView imageView = new ImageView(image);
                borderPane.setCenter(imageView);//头像加到中间
                borderPane.setBottom(nameLabe1);//名字加到下面
                //将每个歌手的borderPane面板加入singerPane
                singerPane.getChildren().add(borderPane);
            }
        }
    }
