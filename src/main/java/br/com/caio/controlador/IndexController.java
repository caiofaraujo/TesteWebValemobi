package br.com.caio.controlador;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;

@Controller
public class IndexController {

	@Path("/")
	public void root() {
		System.out.println("Meu sistema com vraptor");
	}

}
