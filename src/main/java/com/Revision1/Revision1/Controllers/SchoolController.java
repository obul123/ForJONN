package com.Revision1.Revision1.Controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Revision1.Revision1.Entities.Subject;
import com.Revision1.Revision1.Entities.Teacher1;
@RestController
public class SchoolController {
	
	@Autowired
	private SchoolsOps so;
	
	@RequestMapping(method = RequestMethod.POST , path = "/teacher" )
	public ResponseEntity<Object> createTeacher(@RequestBody Teacher1 t1)
	{
		Teacher1 t= so.createTeacher(t1);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(t.getTeacherid()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(method=RequestMethod.GET , path="/subjects")
	public List<Subject> getAllSubs()
	{
		return so.getAllSubs();
	}
}
