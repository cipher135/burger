package sant.menu.burger.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sant.menu.burger.dao.model.Emp;
import sant.menu.burger.dao.repository.BurgerRespository;

@Service
public class BurgerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BurgerService.class);
	
	@Autowired
	private BurgerRespository repo;
	
	public String getCust(Integer id) {
		LOGGER.info("IN BurgerService.getCust() with id= {}", id);
		String customerName = repo.findByCustomerId(id).getName();
		LOGGER.info("OUT BurgerService.getCust() with customerName= {}", customerName);
		return customerName;
	}

}
