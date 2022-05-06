package com.msb.dongbao.common.base.result;

import com.msb.dongbao.common.base.enums.StateCodeEnum;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author HeJie
 * @Date 2022/4/29
 * @Time 9:08
 */
@Data
@Builder
public class ResultWrapper<T> implements Serializable {
    // 状态码
    private int code;

    // 提示信息
    private String msg;

    private T data;

    /**
     * 返回成功的包装
     * @return
     */
    public static ResultWrapper.ResultWrapperBuilder getSuccessBuilder(){
        return ResultWrapper.builder().code(StateCodeEnum.SUCCESS.getCode()).msg(StateCodeEnum.SUCCESS.getMsg());
    }
    /**
     * 返回失败的包装
     * @return
     */
    public static ResultWrapper.ResultWrapperBuilder getFailBuilder(){
        return ResultWrapper.builder().code(StateCodeEnum.FAIL.getCode()).msg(StateCodeEnum.FAIL.getMsg());
    }
}
