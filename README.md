# _GaleriaDePeliculasOMDB_

## _Consultar a la API de OMDb y Mostrar la información en un simple HTML._
## _Para lo cual se utiliza el Framework Spring_
## _Conexión con la Api: https://www.omdbapi.com/_

## _Objetivos._
- ### Crear una conexión con la  API de OMDb.
* ### Mostrar el titulo y la imagen de las peliculas.
- ### Establecer un input para buscar dentro de la api por nombre.
* ### La conexión se hace por medio RestTemplate.
* ### El formato HTML es responsive, en las medidas de 1000px, 700px y 500px

## _Manifestación_
- ### Si quieres ver  este proyecto desplegada, tienes que colocar en tu navegador de elección  _localhost:8080/_
- ### Ademas se debe hacer un usuario en el sitio web:  https://www.omdbapi.com/_


* ### Clase Peli: Donde se establece los atributos que vamos a extraer de la Api( Se utiliza @JsonProperty, ya que los nombre de los atributos mostrados en la Api estan en Mayuscula.
* ### Class SearchResults: Contiene private List<Peli> resultados; La cual contiene la lista de peliculas.
* ### Controller en Java: @Controller, se utiliza el  @GetMapping, donde el metodo utilizado return "index";

  
# _Backend, Ada Itw 2021_
