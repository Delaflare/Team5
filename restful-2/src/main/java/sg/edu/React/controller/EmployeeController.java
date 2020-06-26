package sg.edu.React.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.React.repo.EmployeeRepository;

@RestController
@RequestMapping ("/employees")

public class EmployeeController {
	private EmployeeRepository repository;
	
	public EmployeeController( EmployeeRepository repository)
	{
		this.repository = repository;
	}
	
	@GetMapping
	public Flux

}
