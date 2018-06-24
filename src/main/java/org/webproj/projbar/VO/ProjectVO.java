package org.webproj.projbar.VO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectVO {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("cateId")
    private Integer cateId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("intro")
    private String intro;
    @JsonProperty("status")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
