package com.example.myrog.cabtaxirider.Model;

/**
 * Created by My Rog on 12/2/2017.
 */

public class Result {
    public String message_id;

    public Result(String message_id) {
        this.message_id = message_id;
    }

    public Result() {
    }



    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }
}
