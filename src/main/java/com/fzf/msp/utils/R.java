package com.fzf.msp.utils;

import com.fzf.msp.system.code.SystemCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fanZhiFei
 * @create 2022/7/6
 */
@AllArgsConstructor
@Data
public class R<T> {
    /**
     * 返回码
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回对象
     */
    private T  obj;

    public static R ok(){
        return new R(SystemCode.MSP_SYSTEM_SUCCESS,null,null);
    }

    public static R ok(String code){
        return new R(code,null,null);
    }

    public static <T>R ok(T  obj){
        return new R(SystemCode.MSP_SYSTEM_SUCCESS,null,obj);
    }
    public static <T>R ok(String code,T  obj){
        return new R(code,null,obj);
    }
    public static <T>R ok(String code,T  obj,String msg){
        return new R(code,msg,obj);
    }

    public static R fail(){
        return new R(SystemCode.MSP_SYSTEM_FAIL,null,null);
    }

    public static R fail(String code){
        return new R(code,null,null);
    }

    public static <T>R fail(T  obj){
        return new R(SystemCode.MSP_SYSTEM_FAIL,null,obj);
    }
    public static <T>R fail(String code,T  obj){
        return new R(code,null,obj);
    }
    public static <T>R fail(String code,T  obj,String msg){
        return new R(code,msg,obj);
    }
}
