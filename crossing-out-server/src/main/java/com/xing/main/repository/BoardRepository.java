package com.xing.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.xing.main.model.Board;
import com.xing.main.model.Role;

public interface BoardRepository extends CrudRepository<Board, Integer>{
	Board findByName(String name);
}
