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
/*
@GetMapping("/{nombre}")
    public String verAlgo(@PathVariable String nombre){
        RestTemplate apiMarvel = new RestTemplate();

        String apiKeyPublica = "ACA VA LA API KEY PUBLICA";
        String ts = "1624116042";
        String apiKeyPrivada = "ACA VA LA API KEY PRIVADA";
        // string para crear hash:
        // ts+apiKeyPrivada+apiKeyPublica
        String previoHash = "ts+apiKeyPrivada+apiKeyPublica";
        // https://hash-generator.io/md5-hash-generator.php // esto se puede hacer con Java
        String hashMD5 = "3295a830f5be06053b96a8be9b3c12f9";

        String urlAPI = "https://gateway.marvel.com:443/v1/public/characters?apikey="+apiKeyPublica+
                "&ts="+ts+"&hash="+hashMD5+"&nameStartsWith="+nombre;

        String algo = apiMarvel.getForObject(urlAPI, String.class);
        return algo;
    }

* */