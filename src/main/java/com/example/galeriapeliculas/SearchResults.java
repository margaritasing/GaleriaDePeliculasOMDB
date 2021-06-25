package com.example.galeriapeliculas;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchResults {
    @JsonProperty("Search")
    private List<Peli> resultados;

    public SearchResults() {}
    public List<Peli> getResultados() {
        return resultados;
    }
    public void setResultados(List<Peli> resultados) {
        this.resultados = resultados;
    }
}
