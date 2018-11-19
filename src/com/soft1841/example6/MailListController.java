package com.soft1841.example6;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MailListController implements Initializable {
    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private ListView<HBox> studentMessageListView;
    @FXML
    private ListView<HBox> searchLater;
    @FXML
    private TextField keywordsField;

    MailList[] students = new MailList[]{
            new MailList("姚思佳", "姚思佳.jpg", "女", "18801582811", "汉", "347", "1802343336", "浙江丽水"),
            new MailList("刘恋", "刘恋.jpg", "女", "18386294658", "回", "347", "1802343336", "贵州毕节"),
            new MailList("亢悦昕", "亢悦昕.jpg", "女", "18805160378", "汉", "347", "1802343330", "山西忻州"),
            new MailList("黄屏", "黄屏.jpg", "女", "13207779643", "汉", "347", "1802343329", "广西钦州"),
            new MailList("朝鲁蒙", "朝鲁蒙.jpg", "女", "15292778391", "蒙古族", "347", "1802343235", "新疆伊犁"),
            new MailList("孟妮", "孟妮.jpg", "女", "12855562248", "汉", "346", "1802343332", "安微宿州"),
            new MailList("王欢乐", "王欢乐.jpg", "女", "18805162678", "汉", "346", "1802343334", "甘肃平凉"),
            new MailList("林斌涛", "林斌涛.jpg", "男", "18851853611", "汉", "116", "1802343312", "浙江温州"),
            new MailList("杨俣韬", "杨俣韬.jpg", "男", "18852050969", "汉", "113", "1802343322", "江苏苏州"),
            new MailList("蔡一帆", "蔡一帆.jpg", "男", "19825088721", "汉", "114", "1802343302", "江苏南通"),
            new MailList("李启鹏", "李启鹏.jpg", "男", "17384592163", "汉", "116", "1802343310", "江苏连云港"),
            new MailList("王龙傲", "王龙傲.jpg", "男", "15152089434", "汉", "113", "1802343316", "江苏徐州"),
            new MailList("白建坤", "白建坤.jpg", "男", "15162220791", "汉", "113", "1802343301", "江苏徐州")
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //初始化性别下拉框
        genderComboBox.getItems().setAll("男", "女");
        //初始化学生数据
        for (MailList s : students) {
            HBox hBox = new HBox();
            Image image = new Image("/img/" + s.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox.getChildren().add(imageView);
            Label labelName = new Label("\t姓名：" + s.getName());
            hBox.getChildren().add(labelName);
            Label labelGender = new Label("性别：" + s.getGender());
            String hiddenPhone = s.getPhoneNumber().replaceAll("(\\d{3}) \\d{4} (\\d{4})",
                    "$1****$2");
            Label labelNumber = new Label("手机号：" + hiddenPhone);
            Label labelNation = new Label("民族：" + s.getNation());
            Label labelDormitory = new Label("宿舍号：" + s.getDormitoryId());
            Label labelStudentId = new Label("学号：" + s.getStudentId());
            Label labelAddress = new Label("住址：" + s.getHomeAddress());
            hBox.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                BorderPane borderPane = new BorderPane();
                HBox hBox2 = new HBox();
                Image image1 = new Image("/img/" + s.getAvatar());
                ImageView imageView1 = new ImageView(image1);
                imageView1.setFitWidth(80);
                imageView1.setFitHeight(80);
                hBox2.getChildren().add(imageView1);
                Label labelName1 = new Label("姓名：" + s.getName());
                hBox2.getChildren().add(labelName1);
                Label labelGender1 = new Label("性别：" + s.getGender());
                hBox2.getChildren().add(labelGender1);
                String hiddenPhone1 = s.getPhoneNumber().replaceAll("(\\d{3}) \\d{4} (\\d{4})",
                        "$1****$2");
                Label labelNumber1 = new Label("手机号：" + hiddenPhone1);
                hBox2.getChildren().add(labelNumber1);
                Label labelNation1 = new Label("民族：" + s.getNation());
                hBox2.getChildren().add(labelNation1);
                Label labelDormitory1 = new Label("宿舍号：" + s.getDormitoryId());
                hBox2.getChildren().add(labelDormitory1);
                Label labelStudentId1 = new Label("学号：" + s.getStudentId());
                hBox2.getChildren().add(labelStudentId1);
                Label labelAddress1 = new Label("住址：" + s.getHomeAddress());
                hBox2.getChildren().add(labelAddress1);
                borderPane.setCenter(hBox2);
                Scene scene = new Scene(borderPane);
                stage.setScene(scene);
                stage.show();
            });
            studentMessageListView.getItems().add(hBox);
        }


        genderComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                searchSex(newValue);
            }
        });
    }

    public void searchSex(String keywords) {
        ObservableList<HBox> list = studentMessageListView.getItems();
        studentMessageListView.getItems().removeAll(list);
        for (MailList student : students) {
            HBox hBox1 = new HBox();
            Image image = new Image("/img/" + student.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox1.getChildren().add(imageView);
            Label labelName = new Label("\n姓名：" + student.getName());
            hBox1.getChildren().add(labelName);
            Label labelGender = new Label("\n性别：" + student.getGender());
            hBox1.getChildren().add(labelGender);
            String hiddenPhone = student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                    "$1****$2");
            Label labelNumber = new Label("\n手机号：" + hiddenPhone);
            Label labelNation = new Label("\n民族：" + student.getNation());
            Label labelDormitory = new Label("\n宿舍号：" + student.getDormitoryId());
            Label labelStudentId = new Label("\n学号：" + student.getStudentId());
            Label labelAddress = new Label("\n地区：" + student.getHomeAddress());
            if (student.getGender().contains(keywords)) {
                studentMessageListView.getItems().add(hBox1);
            }
            if (student.getDormitoryId().contains(keywords)) {
                studentMessageListView.getItems().add(hBox1);
            }
        }
    }

        public void enter() {
            //清空文本框内容
            keywordsField.setText("");
        }

        //关键词查找
    public void searchByKeywords() {
        ObservableList<HBox> list = searchLater.getItems();
        searchLater.getItems().removeAll(list);
        //获取文本框中的关键词，并去除无用空格
        String keywords = keywordsField.getText().trim();
        //遍历students数组，并将符合条件的学生数据加入listView中
        for (MailList student : students) {
            HBox hBox1 = new HBox();
            Image image = new Image("/img/" + student.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(80);
            imageView.setFitHeight(80);
            hBox1.getChildren().add(imageView);
            Label labelName = new Label("姓名：" + student.getName());
            hBox1.getChildren().add(labelName);
            Label labelGender = new Label("\t性别：" + student.getGender());
            String hiddenPhone = student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                    "$1****$2");
            Label labelNumber = new Label("\t手机号：" + hiddenPhone);
            Label labelNation = new Label("\t民族：" + student.getNation());
            Label labelDormitory = new Label("\t宿舍号：" + student.getDormitoryId());
            Label labelStudentId = new Label("\t学号：" + student.getStudentId());
            Label labelAddress = new Label("\t地区：" + student.getHomeAddress());
            hBox1.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                BorderPane borderPane = new BorderPane();
                HBox hBox2 = new HBox();
                Image image1 = new Image("/img/" + student.getAvatar());
                ImageView imageView1 = new ImageView(image1);
                imageView1.setFitWidth(80);
                imageView1.setFitHeight(80);
                hBox2.getChildren().add(imageView1);
                Label labelName1 = new Label("\n姓名：" + student.getName());
                hBox2.getChildren().add(labelName1);
                Label labelGender1 = new Label("\n性别：" + student.getGender());
                hBox2.getChildren().add(labelGender1);
                String hiddenPhone1 = student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                        "$1****$2");
                Label labelNumber1 = new Label("\n手机号：" + hiddenPhone1);
                hBox2.getChildren().add(labelNumber1);
                Label labelNation1 = new Label("\n民族：" + student.getNation());
                hBox2.getChildren().add(labelNation1);
                Label labelDormitory1 = new Label("\n宿舍号：" + student.getDormitoryId());
                hBox2.getChildren().add(labelDormitory1);
                Label labelStudentId1 = new Label("\n学号：" + student.getStudentId());
                hBox2.getChildren().add(labelStudentId1);
                Label labelAddress1 = new Label("\n地区：" + student.getHomeAddress());
                hBox2.getChildren().add(labelAddress1);
                borderPane.setCenter(hBox2);
                Scene scene = new Scene(borderPane);
                stage.setScene(scene);
                stage.show();
            });
            if (student.getHomeAddress().contains(keywords)) {
                searchLater.getItems().add(hBox1);
            }
            if (student.getName().contains(keywords)) {
                searchLater.getItems().add(hBox1);
            }
        }
    }

}
