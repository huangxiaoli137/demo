package com.hxl.util;

public class RespBean {

    private Integer status;
    private String msg;
    private Object obj;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static com.hxl.util.RespBean success(String msg){
        return new com.hxl.util.RespBean(200,msg,null);
    }

    public static com.hxl.util.RespBean success(String msg, Object obj){
        return new com.hxl.util.RespBean(200,msg,obj);
    }

    public static com.hxl.util.RespBean error(String msg){
        return new com.hxl.util.RespBean(500,msg,null);
    }

    public static com.hxl.util.RespBean error(String msg, Object obj){
        return new com.hxl.util.RespBean(500,msg,obj);
    }

    public RespBean() {
    }

    public RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }


}
