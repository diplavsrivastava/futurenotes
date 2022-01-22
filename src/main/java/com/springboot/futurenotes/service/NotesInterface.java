package com.springboot.futurenotes.service;

import java.util.List;

import com.springboot.futurenotes.model.Notes;

public interface NotesInterface {
	
	Notes createNotes(Notes product);
	
	Notes updateNotes(Notes product);
	
	List<Notes> getAllNotes();
	
	Notes getNotesById(long productId);
	
	void deleteNote(Long id);

}
