package com.Revision1.Revision1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Revision1.Revision1.Entities.Teacher1;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher1,Integer>{

}
