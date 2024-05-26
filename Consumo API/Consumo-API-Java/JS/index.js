const contentBotones = document.getElementById('contentBotones');
const nombrePokemon = document.getElementById('nombrePokemon');
const imgPokemon = document.getElementById('imgPokemon');
const expPokemon = document.getElementById('expPokemon');

function consumoApi(){

    let endPoint = "https://pokeapi.co/api/v2/pokemon";
    
    //consumo - AJAX
    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

        for(var i=0; i<data.results.length;i++){
            let temp = `<button class="col-12 m-1 btn btn-outline-dark" onClick="cargarDetalle('${data.results[i].url}')">
                            <span class="text-uppercase">${data.results[i].name}</span>
                        </button>`;
            contentBotones.innerHTML += temp;
        }
    });
}

function cargarDetalle(endPoint){

    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

            nombrePokemon.innerText = data.name
            imgPokemon.src = data.sprites.other.dream_world.front_default
            expPokemon.innerHTML = data.base_experience
    });
}

    
    