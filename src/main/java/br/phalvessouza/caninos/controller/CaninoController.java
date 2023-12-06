package br.phalvessouza.caninos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.phalvessouza.caninos.model.Canino;
import br.phalvessouza.caninos.service.CaninoService;

@RestController
@RequestMapping("/caninos")
public class CaninoController {
	
	@Autowired
    private CaninoService caninoService;

    @GetMapping("")
    public List<Canino> listarTodosCaninos() {        
        return caninoService.listarTodosCaninos();
    }

}