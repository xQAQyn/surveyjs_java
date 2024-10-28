package com.xqaqyn.survey.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalResponse<T> {
    private Integer status;
    private String msg;
    private T data;
    private String timestamp;

    public GlobalResponse<T> success(T data){
        GlobalResponse<T> r = new GlobalResponse<>();
        r.setData(data);
        r.setStatus(200);
        r.setMsg("success");
        r.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return r;
    }

    public static <T> GlobalResponse<T> success(){
        GlobalResponse<T> r = new GlobalResponse<>();
        r.setStatus(200);
        r.setMsg("success");
        r.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return r;
    }

    public static <T> GlobalResponse<T> error(String msg){
        GlobalResponse<T> r = new GlobalResponse<>();
        r.setMsg(msg);
        r.setStatus(500);
        r.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return r;
    }

    public static <T> GlobalResponse<T> error(){
        GlobalResponse<T> r = new GlobalResponse<>();
        r.setMsg("Unknown error");
        r.setStatus(500);
        r.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return r;
    }

}
