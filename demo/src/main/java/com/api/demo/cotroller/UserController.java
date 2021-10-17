package com.api.demo.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.model.User;
import com.api.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@GetMapping("/all")
	public List<User> getAll() {
		return userService.selectAllUser();
	}

	@PostMapping("/add")
	private String saveData(@RequestBody User user) {
		userService.insertUser(user);
		return "inserted successful";
	}

	@PutMapping("/update")
	private String update(@RequestParam int id, @RequestBody User user) {
		user.setId(id);
		userService.updateUser(user);
		return "updated successful";
	}

	@DeleteMapping("/delete")
	private String delete(@RequestParam int id) {

		userService.deleteUserById(id);

		return "deleted successful";
	}
}
