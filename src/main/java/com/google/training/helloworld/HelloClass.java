package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    

    public HelloClass(String name, String period) {
		// TODO Auto-generated constructor stub
    	this.message = "Good " + period + " "+ name + "!";
	}

	public HelloClass(Integer age) {
		// TODO Auto-generated constructor stub
		this.message = "Oh, it seems that you are born in "+(2015-age)+". Hello!";
	}

	public String getMessage() {
        return message;
    }
}
