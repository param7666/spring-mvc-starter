package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

import jakarta.transaction.Transactional;

@Service
public class ActorService implements IActorManagmentService{

	@Autowired
	private IActorRepository repo;
	
	
	@Override
	public List<Actor> showAllActor() {
		return repo.findAll();
	}

	@Override
	public String registerActor(Actor actor) {
		// set window username as created by 
		actor.setCreatedBy(System.getProperty("user.name"));
		// save the obj
		int idVal=repo.save(actor).getaId();
		return "Actor is saved with the idVal "+idVal;
	}

	@Override
	public Actor getActorById(Integer id) {
		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	}

	@Override
	public String editActor(Actor actor) {
	// recheck actor is present or not
		Optional<Actor> opt=repo.findById(actor.getaId());
		if(opt.isPresent()) {
			Actor actor1=opt.get();
			actor.setUpdateCount(actor1.getUpdateCount());
			actor.setUpdatedBy(System.getProperty("user.name"));
			repo.save(actor);
			return actor1.getaId()+" Actor data is modified";
		}
		return actor.getaId()+" not found";
	}

	@Override
	public String deleteActor(int id) {
		Optional<Actor> opt=repo.findById(id);
		if(opt.isPresent()) {
			repo.deleteById(id);
			return id+" Actor is deleted";
		}
		return id+" Actor is not found";
	}
}
