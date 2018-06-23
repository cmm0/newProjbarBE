package com.xjin.projbar.controller;

import com.xjin.projbar.VO.ResultVO;
import com.xjin.projbar.dataobject.Project;
import com.xjin.projbar.service.ProjectService;
import com.xjin.projbar.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public ResultVO list(HttpServletResponse response) {
        List<Project> projectList = projectService.findUpAll();
        response.setHeader("Access-Control-Allow-Origin", "*");
        return ResultVOUtil.success(projectList);
    }
}
