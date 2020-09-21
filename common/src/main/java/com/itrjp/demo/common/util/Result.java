package com.itrjp.demo.common.util;

import lombok.Data;

/**
 * @author renjp
 * @date 2020/9/21 14:16
 */
@Data
public class Result<T> {
    private int code;
    private String message;
    private boolean success;
    public T data;

    private Result() {
    }

    private Result(int code, String message, boolean success, T data) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(1, "success", true, null);
    }

    public static <T> Result<T> success(int code, String message) {
        return new Result<>(code, message, true, null);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(1, message, true, data);
    }

    public static <T> Result<T> success(int code, String message, T data) {
        return new Result<>(code, message, true, data);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(1, "success", true, data);
    }

    public static <T> Result<T> error() {
        return new Result<>(-1, "error", false, null);
    }

    public static <T> Result<T> error(int code, String message) {
        return new Result<>(code, message, false, null);
    }

    public static <T> Result<T> error(String message) {
        return new Result<>(-1, message, false, null);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", success=" + success +
                ", data=" + data +
                '}';
    }
}
