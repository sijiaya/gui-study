package com.soft1841.example4;
/**
*实体类
 */
public class TaoBao {
    //分装名称
   private String name;
   //分装图片
   private String avatar;


    public TaoBao(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public TaoBao(){

    }

    public String getName() { return name; }

    public String getAvatar() { return avatar; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    //显示出主程序的字符串
    @Override
    public String toString() {
        return "TaoBao{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}





