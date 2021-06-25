package com.example.galeriapeliculas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Controller
public class GaleriaController {

    @GetMapping
    public String inicio(Model modelo, @RequestParam Optional<String> q) {

        String query = q.orElse(null);
        String apikey = "Aqui va la Apikey de la pagina";
        String url = "http://www.omdbapi.com/?apikey="+apikey+"&s="+query;
        RestTemplate apiOMDB = new RestTemplate();
        List<Peli> pelis = null;
        if(query != null) {
            SearchResults resultadosAPI = apiOMDB.getForObject(url, SearchResults.class);
            pelis = resultadosAPI.getResultados();
        }
        modelo.addAttribute("pelis", pelis);
        modelo.addAttribute("q", query);
        return "index";
    }
}
