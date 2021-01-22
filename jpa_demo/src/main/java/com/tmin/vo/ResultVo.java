package com.tmin.vo;

import lombok.Data;

/**
 * @author
 * @date 2021-01-21 16:54
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T obj;

    public ResultVo() {

    }

    public ResultVo(Integer code, String msg, T obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public static <T> ResultVo<T> of(Integer code, String msg, T obj) {
        return new ResultVo<>(code, msg, obj);
    }

    public static <T> ResultVo<T> of(T obj) {
        return new ResultVo<>(null, null, obj);
    }

    public static <T> ResultVo<T>  of(Integer code, String msg) {
        return new ResultVo<>(code, msg, null);
    }
}
