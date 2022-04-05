package com.Revision1.Revision1.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Revision1.Revision1.Entities.Subject;
import com.Revision1.Revision1.Entities.Teacher1;
import com.Revision1.Revision1.Repositories.SubjectRepo;
import com.Revision1.Revision1.Repositories.TeacherRepo;

@Component
public class SchoolsOps {
	
	@Autowired
	private TeacherRepo tr;
	
	@Autowired
	private SubjectRepo sr;

	public Teacher1 createTeacher(Teacher1 t1) {
		// TODO Auto-generated method stub
		return tr.save(t1);
	}

	public List<Subject> getAllSubs() {
		
		return sr.findAll();
	}

}
