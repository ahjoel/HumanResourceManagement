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

	@GetMapping("/agemoyen")
	public String ageMoyenDesDirecteursMaj(Model model) {
		var ageMoyen = ressourceHumainService.ageMoyenDesDirecteursMajeur();

		model.addAttribute("ageMoyen", ageMoyen);

		return "agemoyendirecteurs";
	}

	@GetMapping("/majeur")
	public String nomPremierDirecteurMaj(Model model) {
		var nomMaj = ressourceHumainService.nomPremierDirecteurMajeur();

		model.addAttribute("nomMaj", nomMaj);

		return "premiermajeur";
	}

}