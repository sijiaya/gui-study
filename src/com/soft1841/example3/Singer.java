package com.soft1841.example3;

public class Singer {
        //分装歌手的姓名属性
        private  String name;
        //分装歌手的头像属性
        private String avatar;

        public Singer(String name, String avatar) {
            this.name = name;
            this.avatar = avatar;
        }

        public Singer() {

        }
        public String getName() { return name; }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvatar() { return avatar; }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        @Override
        //显示出主程序的字符串
        public String toString() {
            return "Singer{" +
                    "name='" + name + '\'' +
                    ", avatar='" + avatar + '\'' +
                    '}';
        }

    }
