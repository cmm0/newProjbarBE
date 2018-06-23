package com.xjin.projbar.service.impl;

import com.xjin.projbar.dataobject.Project;
import com.xjin.projbar.enums.ProjectStatusEnum;
import com.xjin.projbar.repository.ProjectRepository;
import com.xjin.projbar.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> findUpAll() {
        return projectRepository.findAllByStatus(ProjectStatusEnum.NORMAL.getCode());
    }

    @Override
    public Page<Project> findUpAllByPage(Pageable pageable) {
        return null;
    }
}
