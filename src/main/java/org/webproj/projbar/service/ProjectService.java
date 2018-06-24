package org.webproj.projbar.service;

import org.webproj.projbar.dataobject.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    List<Project> findUpAll();

    Page<Project> findUpAllByPage(Pageable pageable);
}
