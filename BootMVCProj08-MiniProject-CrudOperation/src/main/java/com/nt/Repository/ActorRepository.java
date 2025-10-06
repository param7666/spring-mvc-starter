package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.Entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

	@Query("from Actor where id=:id and name=:name")
	public Actor login(int id,String name);
}
