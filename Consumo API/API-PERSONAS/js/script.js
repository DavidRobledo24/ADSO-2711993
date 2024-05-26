const filas = document.getElementById('filas');
const formInsertar = document.getElementById('formInsertar');
const formEditar = document.getElementById('formEditar');
let myModal = new bootstrap.Modal(document.getElementById('modalInsetar'));
let myModal2 = new bootstrap.Modal(document.getElementById('modalEditar'));

formInsertar.addEventListener("submit", function(event){
    event.preventDefault();
    agregarPersona();
});

document.getElementById('botonEditar').addEventListener("click", function(event){
    event.preventDefault();
    editarPersona();
});

llamarPersonas();

function llamarPersonas(){
    let endPoint = "https://codetesthub.com/API/Obtener.php";
    
    fetch(endPoint).then(resp => resp.json())
    .then(data => {
        filas.innerHTML = "";
        for(var i = 0; i < data.length; i++){
            let temp = `<tr>
                            <td>${i + 1}</td>
                            <td>${data[i].cedula}</td>
                            <td>${data[i].nombres}</td>
                            <td>${data[i].apellidos}</td>
                            <td class="text-center">${data[i].telefono}</td>
                            <td class="text-center">${data[i].direccion}</td>
                            <td class="text-center">${data[i].email}</td>
                            <td>
                                <button class="btn btn-danger" onClick="eliminarPersona(${data[i].cedula})">X</button>
                                <button class="btn btn-primary mx-2" data-bs-toggle="modal"
                                data-bs-target="#modalEditar" onClick="cargarDatosEditar(${data[i].cedula}, '${data[i].nombres}', '${data[i].apellidos}', '${data[i].telefono}', '${data[i].direccion}', '${data[i].email}')">E</button>
                            </td>
                        </tr>`;
            filas.innerHTML += temp;
        }
    });
}

function cargarDatosEditar(cedula, nombres, apellidos, telefono, direccion, email) {
    document.getElementById('cedulaEditar').value = cedula;
    document.getElementById('nombresEditar').value = nombres;
    document.getElementById('apellidosEditar').value = apellidos;
    document.getElementById('telefonoEditar').value = telefono;
    document.getElementById('direccionEditar').value = direccion;
    document.getElementById('emailEditar').value = email;
}

function agregarPersona(){
    let datos = new FormData(formInsertar);
  
    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
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
        headers: {
            "Accept": "application/json"
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
    let datos = new FormData(formEditar);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
        },
        body: datos
    };

    fetch("https://codetesthub.com/API/Actualizar.php", configuracion)
    .then(resp => resp.json())
    .then(data => {
        console.log("La API responde con: ");
        console.log(data);

        if(data.status){
            myModal2.hide();
            llamarPersonas();
        }else{
            alert("Error al editar");
        }
    });
}
