package com.jwj.pojo;

/**
 * Created by Administrator on 2019/7/14.
 */
public class ResponseBody {
    int status;
    String message;
    Object date;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
