package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Actor;
import com.nt.Repository.ActorRepository;

@Service
public class ActorService implements IActorService {

	@Autowired
	private ActorRepository repo;
	
	@Override
	public String registerActor(Actor a) {
		System.out.println("ActorService.registerActor()");
		int id=repo.save(a).getId();
		return "Actor Saved with id "+id;
	}

	@Override
	public List<Actor> showAllActor() throws Exception {
		System.out.println("ActorService.showAllActor()");
		List<Actor> act=repo.findAll();
		System.out.println(act);
		return act;
	}

	@Override
	public Actor fetchActorById(int id) throws Exception {
		System.out.println("ActorService.fetchActorById()");
		return repo.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid id"));
	}

	@Override
	public String editActor(Actor a) throws Exception {
		System.out.println("ActorService.editActor()");
		Optional<Actor> opt=repo.findById(a.getId());
		if(opt.isPresent()) {
			Actor actor1=opt.get();
			a.setCount(actor1.getCount());
			a.setUpdatedBy(System.getProperty("user.name"));
			repo.save(a);
			return a.getId()+" is Updated...";
		}
		 return a.getId()+" is Not Found...";
	}

	@Override
	public String deleteActorById(int id) throws Exception {
		repo.deleteById(id);
		return "Actor deleted with "+id;
	}

	@Override
	public Actor login(int id, String name) throws Exception {
		System.out.println("ActorService.login()");
		return repo.login(id, name);
	}

}
