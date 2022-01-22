package com.springboot.futurenotes.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.futurenotes.exception.ResourceNotFoundException;
import com.springboot.futurenotes.model.Notes;
import com.springboot.futurenotes.repository.NotesRepository;

@Service
@Transactional
public class NotesServiceImpl implements NotesInterface {

	@Autowired
	private NotesRepository notesRepository;
	
	
	@Override
	public Notes createNotes(Notes product) {
		// TODO Auto-generated method stub
		return notesRepository.save(product);
	}

	@Override
	public Notes updateNotes(Notes product) {
		// TODO Auto-generated method stub
		Optional<Notes> productDB =  notesRepository.findById(product.getId());
		if(productDB.isPresent()) {
			Notes productUpdate = productDB.get();
			productUpdate.setId(product.getId());
			//productUpdate.setDescription(product.getDescription());
			notesRepository.save(productUpdate);
			return productUpdate;
		}else {
			throw new ResourceNotFoundException("Resource Not Found having id "+product.getId());
		}
		
	}

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return this.notesRepository.findAll();
	}

	@Override
	public Notes getNotesById(long productId) {
		Optional<Notes> productDB =  notesRepository.findById(productId);
		if(productDB.isPresent()) {
			return productDB.get();
		}else{
			throw new ResourceNotFoundException("Resource Not Found having id "+productId);
		}
	}

	@Override
	public void deleteNote(Long productId) {
		Optional<Notes> productDB =  notesRepository.findById(productId);
		if(productDB.isPresent()) {
			this.notesRepository.delete(productDB.get());
		}else{
			throw new ResourceNotFoundException("Resource Not Found having id "+productId);
		}
		
	}

}
