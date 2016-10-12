package com.taylor.validation.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by wangquan on 16/7/26.
 */

@Data
public class ResultBase<T> implements Serializable {

    protected static final long serialVersionUID = -3434272908589805662L;

    // 结果码
    protected String code;

    // 执行信息
    protected String message;

    // 返回的数据
    protected T data;

    public ResultBase() {
    }

    public ResultBase(String key, T data) {
        this.code = key;
        this.message = BaseResultCode.getValueWithKey(key);
        this.data = data;
    }

    public ResultBase(T data, String errCode) {
        this.code = BaseResultCode.ERROR;
        this.message = BaseResultCode.getValueWithKey(errCode);
        this.data = data;
    }


    public ResultBase(T data, Boolean result) {
        if (result) {
            this.data = data;
            this.code = BaseResultCode.TRUE;
            this.message = BaseResultCode.getValueWithKey(BaseResultCode.TRUE);
        } else {
            this.data = data;
            this.code = BaseResultCode.ERROR;
            this.message = BaseResultCode.getValueWithKey(BaseResultCode.ERROR);
        }
    }

    public ResultBase(T data, Integer result) {
        if (result == 1) {
            this.data = data;
            this.code = BaseResultCode.TRUE;
            this.message = BaseResultCode.getValueWithKey(BaseResultCode.TRUE);
        } else {
            this.data = data;
            this.code = BaseResultCode.ERROR;
            this.message = BaseResultCode.getValueWithKey(BaseResultCode.ERROR_ID);
        }
    }

    public static <T> ResultBase<T> getResult(T data, Boolean result) {
        return new ResultBase<T>(data, result);
    }

    public static <T> ResultBase<T> getResult(T data, Integer result) {
        return new ResultBase<T>(data, result);
    }

    public static <T> ResultBase<T> getNullResult(T data, String errCode) {
        return new ResultBase<T>(data, errCode);
    }

}
