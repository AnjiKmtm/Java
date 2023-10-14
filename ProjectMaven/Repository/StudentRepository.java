package com.ProjectMaven.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectMaven.StudentInfo.StudentInfo;

public interface StudentRepository extends JpaRepository<StudentInfo, Long>{

}
