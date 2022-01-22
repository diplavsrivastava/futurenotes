package com.springboot.futurenotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.futurenotes.model.Notes;
import com.springboot.futurenotes.service.NotesInterface;

@RestController
public class NotesController {
	
	@Autowired
	private NotesInterface notesService; 
	
	@PostMapping("/notes")
	public ResponseEntity createNotes(@RequestBody Notes product) {
		return ResponseEntity.ok().body(notesService.createNotes(product)); 
		
	}
	
	@GetMapping("/notes/{id}")
	public ResponseEntity<Notes> getNotesById(@PathVariable long id){
		return ResponseEntity.ok().body(notesService.getNotesById(id));
	}
	
	@GetMapping("/notes")
	public ResponseEntity<List<Notes>> getAllNotes(){
		return ResponseEntity.ok().body(notesService.getAllNotes());
	}	
	
	@PutMapping("/notes/{id}")
	public ResponseEntity updateNotes(@PathVariable long id,@RequestBody Notes product) {
		product.setId(id);
		return ResponseEntity.ok().body(notesService.updateNotes(product));
	}
	
	@DeleteMapping("/notes/{id}")
	public HttpStatus deleteNotes(@PathVariable long id){
		notesService.deleteNote(id);
		return HttpStatus.OK;
	}
}
