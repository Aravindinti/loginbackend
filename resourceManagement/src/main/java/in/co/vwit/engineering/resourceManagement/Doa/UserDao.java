package in.co.vwit.engineering.resourceManagement.Doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.vwit.engineering.resourceManagement.entity.user;


public interface UserDao extends JpaRepository<user, Integer> {

	List<user> findByUserName(String name);
	 

}
