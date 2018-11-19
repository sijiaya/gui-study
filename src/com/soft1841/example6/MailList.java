package com.soft1841.example6;

import javafx.scene.layout.HBox;

public class MailList extends HBox {
    //封装姓名
    private String name;
    //封装头像
    private String avatar;
    //封装性别
    private String gender;
    //封装手机号
    private String phoneNumber;
    //封装民族
    private String nation;
    //封装宿舍号
    private String dormitoryId;
    //封装学号
    private String studentId;
    //封装家庭住址
    private String homeAddress;

    public MailList() {
    }

    public MailList(String name, String avatar, String gender, String phoneNumber, String nation, String dormitoryId, String studentId, String homeAddress) {
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.nation = nation;
        this.dormitoryId = dormitoryId;
        this.studentId = studentId;
        this.homeAddress = homeAddress;
    }

    public String getName() { return name; }

    public String getAvatar() { return avatar; }

    public String getGender() { return gender; }

    public String getPhoneNumber() { return phoneNumber; }

    public String getNation() { return nation; }

    public String getDormitoryId() { return dormitoryId; }

    public String getStudentId() { return studentId; }

    public String getHomeAddress() { return homeAddress; }

    public void setName(String name) { this.name = name; }

    public void setAvatar(String avatar) { this.avatar = avatar; }

    public void setGender(String gender) { this.gender = gender; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void setNation(String nation) { this.nation = nation; }

    public void setDormitoryId(String dormitoryId) { this.dormitoryId = dormitoryId; }

    public void setStudentId(String studentId) { this.studentId = studentId; }

    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }

    @Override
    public String toString() {
        return "MailList{" +
                "name'" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nation='" + nation + '\'' +
                ", dormitoryId='" + dormitoryId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
