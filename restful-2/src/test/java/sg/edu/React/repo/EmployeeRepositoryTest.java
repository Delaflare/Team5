package sg.edu.React.repo;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Role;

import reactor.core.publisher.Flux;
import sg.edu.React.domain.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository repository;
	
	private List <Employee> employees = Arrays.asList
	(
			new Employee(Role.STAFF, "Delbert" , "Greek") ,
			new Employee(Role.STAFF, "Alice" , "Nerd") ,
			new Employee(Role.STAFF, "Wally" , "Sneaky") ,
			new Employee(Role.MANAGER, "Delbert" , "Greek") ,
			new Employee(Role.ADMIN, "Delbert" , "Greek") 
			
		);
	
	@BeforeEach
	public void setUp()
	{
		repository.deleteAll()
		.thenMany(Flux.fromIterable(employees))
		.doOnNext(System.out::println)
		.blockLast();
	}
	
	@Test
	public void save
	
	
	
	@Test
	public void findAll()
	{
		StepVerified.create(repository.findAll())
	}
	
	
	
	@Test
	public void findById()
	
	employees.stream
	.map(Employee :: getId)
	
	
	
	@Test
	public void count
	StepVerified.create(repository.findAll())
	.expectNext(5L)
	.verifyComplete();
	
}
