package com.xing.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xing.main.model.Board;
import com.xing.main.model.Task;
import com.xing.main.model.TodoList;
import com.xing.main.model.User;
import com.xing.main.repository.BoardRepository;
import com.xing.main.repository.TaskRepository;
import com.xing.main.repository.TodoListRepository;
import com.xing.main.repository.UserRepository;

@Controller
@RequestMapping(path = "/api/test")
public class TestController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BoardRepository boardRepository;
	@Autowired
	private TodoListRepository todoListRepository;
	@Autowired
	private TaskRepository taskRepository;

	@GetMapping(path = "/create-board-todolist-task")
	public @ResponseBody Board createBoardTodoListEntry() {
		Task task = new Task();
		task.setName("This is first task");
		TodoList todoList = new TodoList();
		todoList.setName("First TodoList");
		todoList.addTask(task);
		Board board = new Board();
		board.setName("Board name");
		board.addTodoList(todoList);
		User user = userRepository.findByUsername("name");
		user.addBoard(board);
		board.addUser(user);
		//TODO: kolejność zapisu jest zła, albo trzeba uzależnić jeden obiekt od innego (board-user)
		taskRepository.save(task);
		todoListRepository.save(todoList);
		boardRepository.save(board);
		userRepository.save(user);
		return board;
	}
}
