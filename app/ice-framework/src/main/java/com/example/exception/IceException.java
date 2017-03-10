package com.example.exception;

public class IceException extends RuntimeException{
	public IceException(String message,Throwable cause){
		super(message,cause);
	}
	public IceException(String message){
		super(message);
	}
}
