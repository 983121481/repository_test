package com.vo;

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


}
