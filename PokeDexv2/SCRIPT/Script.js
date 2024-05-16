const cajaLista = document.getElementById('cajaLista');
const paginaSpan = document.getElementById('paginaSpan');
const nombrePokemon = document.getElementById('nombrePokemon');
const imagenPokemon = document.getElementById('imagenPokemon');
let cont = 1;

function consumoApi(){

    let endPoint = "https://pokeapi.co/api/v2/pokemon";
    
    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

        for(var i=0; i<data.results.length;i++){
            let temp = `<button onClick="cargarDetalle('${data.results[i].url}')">
                            <span class="text-uppercase">${data.results[i].name}</span>
                        </button>`;
            cajaLista.innerHTML += temp;
        }
    });

    paginaSpan.innerText = cont;
}

function cargarDetalle(endPoint){

    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

            nombrePokemon.innerHTML = data.name
            imagenPokemon.src = data.sprites.other.dream_world.front_default
    });
}

function cambioPagina(){
    
}