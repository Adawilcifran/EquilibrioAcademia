package br.com.equilibrio.academia.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class HomeController {

	private final Result result;
	private final Validator validator;
	
	public HomeController() {
		this(null,null);
	}
	
	@Inject
	public HomeController(Result result, Validator validator) {
		this.result=result;
		this.validator=validator;
	}
	
	@Get("/index")
	public void index() {
	}

	public Result getResult() {
		return result;
	}

	public Validator getValidator() {
		return validator;
	}
}
