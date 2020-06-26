package sg.edu.React.repo;

import javax.management.relation.Role;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import sg.edu.React.domain.Employee;



@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
Flux<Employee> findByRole(Role role);
Flux<Employee> findByLast(String lastName);
	
	
}
