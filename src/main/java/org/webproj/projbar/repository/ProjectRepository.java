package org.webproj.projbar.repository;

import org.webproj.projbar.dataobject.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findAllByStatus(Integer status);
}
