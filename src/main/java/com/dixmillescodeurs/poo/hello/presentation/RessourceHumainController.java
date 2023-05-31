package com.dixmillescodeurs.poo.hello.presentation;

import com.dixmillescodeurs.poo.hello.service.RessourceHumainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RessourceHumainController {

	@Autowired
	private RessourceHumainService ressourceHumainService;

	@GetMapping("/listedirecteurs")
	public String listeDirecteurs(Model model) {
		var directeurs = ressourceHumainService.listeDesDirecteurs();

		model.addAttribute("directeurs", directeurs);

		return "listeDirecteurs";
	}

}