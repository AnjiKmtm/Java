package com.ProjectMaven.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ProjectMaven.Repository.StudentRepository;
import com.ProjectMaven.StudentInfo.StudentInfo;

@Controller
public class StudentController {

	@Autowired
	StudentRepository studentRepo;

	@GetMapping("/allData")
	public ResponseEntity<List<StudentInfo>> getData() {
		return new ResponseEntity<>(studentRepo.findAll(), HttpStatus.OK);
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<StudentInfo> getStudentData(@PathVariable long id) {
		Optional<StudentInfo> o = studentRepo.findById(id);
		if (o.isPresent()) {
			return new ResponseEntity<>(o.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/PostData")
	public ResponseEntity<StudentInfo> postData(@RequestBody StudentInfo student) {

		return new ResponseEntity<>(studentRepo.save(student), HttpStatus.CREATED);
	}

	@PutMapping("/modify/{id}")
	public ResponseEntity<StudentInfo> modifyData(@PathVariable long id, @RequestBody StudentInfo Student) {

		return new ResponseEntity<>(studentRepo.save(Student), HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<StudentInfo> deleteStudent(@PathVariable long id){
		Optional<StudentInfo> o=studentRepo.findById(id);
		if(o.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			studentRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.GONE);
		
		}
	}

}
