package cat.dbuenov.app.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import cat.dbuenov.bean.*;
import cat.dbuenov.repository.BaseDades;

@Controller
@RequestMapping("")
public class Controlador {
	
	BaseDades bd = new BaseDades();
		
	@GetMapping("/")
	public String iniciar(Model model) {
		ArrayList<Treballador> treballadors = bd.getTreballadors();
		model.addAttribute("treballadors", treballadors);
		return "consulta";			
	}
		
	@PostMapping("/insert")
	public String insert(Treballador treballador, Model model) {
		bd.insert(treballador);
		ArrayList<Treballador> treballadors = bd.getTreballadors();
		model.addAttribute("treballadors", treballadors);		
		return "consulta";		
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		bd.delete(id);
		ArrayList<Treballador> treballadors = bd.getTreballadors();
		model.addAttribute("treballadors", treballadors);
		model.addAttribute("boton", "Insert Treballador");
		model.addAttribute("action","/insert");
		return "consulta";		
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model) {
		Treballador treballador = bd.getTreballador(id);
		ArrayList<Treballador> treballadors = bd.getTreballadors();
		model.addAttribute("treballadors", treballadors);
		model.addAttribute("treballador", treballador);
		model.addAttribute("boton", "Update Treballador");
		model.addAttribute("action","/update");
		return "consulta";		
	}
	
	@PostMapping("/update")
	public String update2(Treballador treballador, Model model) {
		bd.update(treballador);
		ArrayList<Treballador> treballadors = bd.getTreballadors();
		model.addAttribute("treballadors", treballadors);
		model.addAttribute("treballador", null);
		model.addAttribute("boton", "Insert Treballador");
		model.addAttribute("action","/insert");
		return "consulta";		
	}
	
}
