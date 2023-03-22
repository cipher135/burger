package sant.menu.burger.service;



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
	
	public Emp getCust(Integer id) {
		LOGGER.info("IN BurgerService.getCust() with id= {}", id);
		Emp customer = repo.findByCustomerId(id);
		LOGGER.info("OUT BurgerService.getCust() with customer= {}", customer);
		return customer;
	}
	
	public boolean addCustomer(Emp emp) {
		LOGGER.info("IN BurgerService.addCustomer() with emp={}", emp);
		boolean resp = false;
		try {
			repo.save(emp);
			resp = true;
		}catch(Exception e){
			LOGGER.error(e.getMessage(), e);
		}
		LOGGER.info("OUT BurgerService.addCustomer() with resp= {}", resp);
		return resp;
	}

}
