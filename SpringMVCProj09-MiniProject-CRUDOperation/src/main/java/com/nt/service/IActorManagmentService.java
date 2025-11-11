package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorManagmentService {
	
	public List<Actor> showAllActor();
	public String registerActor(Actor actor);
	public Actor getActorById(Integer id);
	public String editActor(Actor actor);
	public String deleteActor(int id);
}
