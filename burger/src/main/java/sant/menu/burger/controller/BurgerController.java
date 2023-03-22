package sant.menu.burger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sant.menu.burger.dao.model.Emp;
import sant.menu.burger.service.BurgerService;

@RestController
@RequestMapping(value="/burger")
public class BurgerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BurgerController.class);
	
	@Autowired
	private BurgerService burgerService;
	
	@RequestMapping(value="/customer/name/{id}", method=RequestMethod.GET)
	public String getCustomerName(@PathVariable Integer id) {
		LOGGER.info("IN BurgerController.getCustomerName() with id= {}", id);
		String customerName = burgerService.getCust(id).getName();
		LOGGER.info("OUT BurgerController.getCustomerName() with customerName= {}", customerName);
		return customerName;
	}
	
	@RequestMapping(value="/addcustomer", method=RequestMethod.POST)
	public boolean addCustomer(@RequestBody Emp emp) {
		LOGGER.info("IN BurgerController.addCustomer() with emp={}", emp);
		boolean resp = burgerService.addCustomer(emp);
		LOGGER.info("OUT BurgerController.addCustomer() with resp= {}", resp);
		return resp;
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public Emp getCustomer(@RequestParam Integer id) {
		LOGGER.info("IN BurgerController.getCustomer() with id= {}", id);
		Emp customer = burgerService.getCust(id);
		LOGGER.info("OUT BurgerController.getCustomer() with getCustomer= {}", customer);
		return customer;
	}

}
