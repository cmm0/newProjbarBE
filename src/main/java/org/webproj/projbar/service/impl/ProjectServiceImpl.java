package org.webproj.projbar.service.impl;

import org.webproj.projbar.dataobject.Project;
import org.webproj.projbar.enums.ProjectStatusEnum;
import org.webproj.projbar.repository.ProjectRepository;
import org.webproj.projbar.service.ProjectService;
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
