package com.xjin.projbar.dataobject;

import com.xjin.projbar.enums.ProjectStatusEnum;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DynamicUpdate
@Table(name = "project", schema = "newprojbar")
public class Project {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer cateId;
    private Integer status = ProjectStatusEnum.NORMAL.getCode();
    private String intro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
