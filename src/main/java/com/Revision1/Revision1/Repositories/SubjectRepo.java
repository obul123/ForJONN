package com.Revision1.Revision1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Revision1.Revision1.Entities.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer> {

}
