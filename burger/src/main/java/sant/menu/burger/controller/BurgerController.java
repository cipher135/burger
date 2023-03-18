package sant.menu.burger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sant.menu.burger.service.BurgerService;

@RestController
@RequestMapping(value="/burger")
public class BurgerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BurgerController.class);
	
	@Autowired
	private BurgerService burgerService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String getCustomerName(@PathVariable Integer id) {
		LOGGER.info("IN BurgerController.getCustomerName() with id= {}", id);
		String customerName = burgerService.getCust(id);
		LOGGER.info("OUT BurgerController.getCustomerName() with customerName= {}", customerName);
		return customerName;
	}

}
