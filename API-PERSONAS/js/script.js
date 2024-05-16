const filas = document.getElementById('filas');
const formInsertar = document.getElementById('formInsertar');
let myModal = new boostrap.Modal(document.getElementById('modalInsetar'));
formInsertar.addEventListener("submit", function(event){
    event.preventDefault();
    agregarPersona();
});

llamarPersonas();

function llamarPersonas(){
    let endPoint = "https://codetesthub.com/API/Obtener.php";
    
    fetch(endPoint) .then(resp => resp.json())
    .then(data => {
        for(var i = 0; i<data.length;i++){
                let temp = `<tr>
                                <td>${i+1}</td>
                                <td>${data[i].cedula}</td>
                                <td>${data[i].nombres}</td>
                                <td>${data[i].apellidos}</td>
                                <td class="text-center">${data[i].telefono}</td>
                                <td class="text-center">${data[i].direccion}</td>
                                <td class="text-center">${data[i].email}</td>
                                <td>
                                    <button class="btn btn-danger d-flex justify-content-center" onClick="eliminarPersona(${data[i].cedula})">X</button>
                                </td>
                            <tr>`;
            filas.innerHTML += temp;
        }
    });      
}

function agregarPersona(){
    let datos = new FormData(formInsertar);
  
    let configuracion = {
        method: "POST",
        Headers : {
                "Accept" : "application/json",
            },
        body: datos
    };

    fetch("https://codetesthub.com/API/Insertar.php", configuracion)
    .then(resp => resp.json())
    .then(data => {
        console.log("la api responde con: ");
        console.log(data);

        if(data.status){
            
            myModal.hide();
            llamarPersonas();
        }else{
            alert("Error al insertar");
        }
    });
}

function eliminarPersona(cedula){
    let datos = new FormData();
    datos.append("cedula", cedula);

    let configuracion = {
        method: "POST",
        Headers : {
                "Accept" : "application/json",
            },
        body: datos
    };

    fetch("https://codetesthub.com/API/Eliminar.php", configuracion)
    .then(resp => resp.json())
    .then(data => {
        console.log("la api responde con: ");
        console.log(data);

        if(data.status){
            llamarPersonas();
        }else{
            alert("Error al eliminar");
        }
    });

}

function editarPersona(){

}
