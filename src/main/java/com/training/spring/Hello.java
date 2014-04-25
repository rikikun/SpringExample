package com.training.spring;

/**
 * User: assanai.manurat
 * Date: 4/20/2014
 * Time: 4:09 PM
 */
public class Hello {


    String message = "";

    public Hello() {

    }

    public Hello(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
