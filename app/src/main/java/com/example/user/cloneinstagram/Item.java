package com.example.user.cloneinstagram;

/**
 * Created by USER on 15-Sep-18.
 */

public class Item {

    private String user_id;
    private int thubmail;

    public Item(String user_id, int thubmail) {
        this.user_id = user_id;
        this.thubmail = thubmail;
    }

    public String getUser_id() {
        return user_id;
    }

    public int getThubmail() {
        return thubmail;
    }
}
