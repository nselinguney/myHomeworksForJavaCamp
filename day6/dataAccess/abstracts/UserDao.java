package day6.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import day6.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
}
