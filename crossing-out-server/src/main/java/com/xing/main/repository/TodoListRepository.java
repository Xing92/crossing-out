package com.xing.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.xing.main.model.TodoList;

public interface TodoListRepository extends CrudRepository<TodoList, Integer> {
	TodoList findByName(String name);
}
