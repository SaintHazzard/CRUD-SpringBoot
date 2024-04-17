package com.hazzard.holamundo.holaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class holaMundo {
  @Autowired
  private FabricanteRepository fabricanteRepository;
  private FabricanteService fabricanteService;

  public holaMundo(FabricanteService fabricanteService) {
    this.fabricanteService = fabricanteService;
  }

  @GetMapping
  @ResponseBody
  public String msgDefault() {
    return "<h1>Mal bienido</h1>";
  }

  @GetMapping("/holamundo/{number}")
  @ResponseBody
  public String mostrarMensaje1(@PathVariable String number) {
    if (number.equals("1")) {
      return "Hola Mundo";
    } else {
      return "Adios mundo";
    }
  }

  // @GetMapping("/fabricantes/new")
  // public ModelAndView showForm() {
  // return new ModelAndView("newFabricante", "fabricante", new fabricante());
  // }

  @GetMapping("/fabricantes/new")
  public ModelAndView newFabricante() {
    ModelAndView mav = new ModelAndView("newFabricante");
    mav.addObject("fabricante", new Fabricante());
    mav.addObject("fabricantes", fabricanteService.getAllFabricantes());
    return mav;
  }

  @PostMapping("/fabricantes")
  public String createFabricante(@ModelAttribute Fabricante newFabricante, HttpServletRequest request) {
    fabricanteRepository.save(newFabricante);
    String redirectUrl = UriComponentsBuilder
        .fromHttpUrl(request.getRequestURL().toString())
        .replacePath("/fabricantes/new")
        .toUriString();

    return "redirect:" + redirectUrl;
  }

}
