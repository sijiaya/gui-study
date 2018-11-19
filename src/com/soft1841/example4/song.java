package com.soft1841.example4;

public class song {
    private String songName;
    private String singer;
    private String songUrl;
    private String logo;
    private String time;

    public song(String songName, String singer, String songUrl, String logo, String time) {
        this.songName = songName;
        this.singer = singer;
        this.songUrl = songUrl;
        this.logo = logo;
        this.time = time;
    }
    public song(){
    }

    public String getSongName() { return songName; }

    public String getSinger() { return singer; }

    public String getSongUrl() { return songUrl; }

    public String getLogo() { return logo; }

    public String getTime() { return time; }

    public void setSongName(String songName) { this.songName = songName; }

    public void setSinger(String singer) { this.singer = singer; }

    public void setSongUrl(String songUrl) { this.songUrl = songUrl; }

    public void setLogo(String logo) { this.logo = logo; }

    public void setTime(String time) { this.time = time; }

    @Override
    public String toString() {
        return "song{" +
                "songName='" + songName + '\'' +
                ", singer='" + singer + '\'' +
                ", songUrl='" + songUrl + '\'' +
                ", logo='" + logo + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
