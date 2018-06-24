package org.webproj.projbar.enums;

public enum ProjectStatusEnum {
    NORMAL(0, "正常"),
    FORBIDDEN(1, "禁用")
    ;
    private Integer code;
    private String msg;

    ProjectStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
