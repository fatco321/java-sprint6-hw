package ru.yandex.practicum.tasktraker.controller.exception;

public class HttpException extends Exception {
    public HttpException(String message) {
        super(message);
    }
}
