package com.xing.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.xing.main.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
	Task findByName(String name);
}
