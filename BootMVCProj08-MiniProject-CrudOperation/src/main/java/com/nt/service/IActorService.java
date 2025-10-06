package com.nt.service;

import java.util.List;

import com.nt.Entity.Actor;

public interface IActorService {

	public String registerActor(Actor a) throws Exception;
	public List<Actor> showAllActor() throws Exception;
	public Actor fetchActorById(int id) throws Exception;
	public String editActor(Actor a) throws Exception;
	public String deleteActorById(int id) throws Exception;
	public Actor login(int id,String name) throws Exception;
}
