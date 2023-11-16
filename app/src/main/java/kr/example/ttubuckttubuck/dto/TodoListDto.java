package kr.example.ttubuckttubuck.dto;

import com.google.gson.annotations.SerializedName;

public class TodoListDto {

    @SerializedName("id")
    private Long id;
    @SerializedName("member")
    private Long member;
    @SerializedName("place")
    private Long place;
    @SerializedName("content")
    private String content;
    @SerializedName("date")
    private String date;
    @SerializedName("done")
    private Boolean done;

    public String getContent() { return content; }
    public String getDate() { return date; }
    public Long getPlace() { return place; }
    public Long getId() { return id; }
    public Long getMember() { return member; }
    public boolean getDone() { return done; }
}
