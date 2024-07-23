const anotacionesLista = [];

function mostrarMensaje() {
  let mensaje = document.getElementById("mensaje");
  let anotaciones = document.getElementById("anotaciones");
  mensaje.style.display = anotaciones.children.length === 0 ? "block" : "none";
}

function ingresarAnotacion() {
  let anotacion = document.getElementById("anotacion").value;

  if (anotacion.length === 0) {
    alert("Debe ingresar al menos un carácter");
    return;
  }

  anotacionesLista.push(anotacion);

  actualizarAnotaciones();
}

function actualizarAnotaciones() {
  const anotaciones = document.getElementById("anotaciones");

  anotaciones.innerHTML = "";

  anotacionesLista.forEach((anotacion, index) => {
    let li = document.createElement("li");
    li.classList.add("anotacion__item");

    let span = document.createElement("span");
    span.textContent = anotacion;
    span.classList.add("anotacion__texto");

    let buttonEditar = document.createElement("button");
    buttonEditar.textContent = "Editar";
    buttonEditar.classList.add(
      "anotacion__button",
      "anotacion__button--editar"
    );
    buttonEditar.onclick = function () {
      editarAnotacion(index);
    };

    let buttonEliminar = document.createElement("button");
    buttonEliminar.textContent = "Eliminar";
    buttonEliminar.classList.add(
      "anotacion__button",
      "anotacion__button--eliminar"
    );
    buttonEliminar.onclick = function () {
      eliminarAnotacion(index);
    };

    let divBotones = document.createElement("div");
    divBotones.classList.add("anotacion__botones");
    divBotones.appendChild(buttonEliminar);
    divBotones.appendChild(buttonEditar);

    li.appendChild(span);
    li.appendChild(divBotones);
    anotaciones.appendChild(li);
  });

  mostrarMensaje();
}

function eliminarAnotacion(index) {
  anotacionesLista.splice(index, 1);
  actualizarAnotaciones();
}

function editarAnotacion(index) {
  let nuevaAnotacion = prompt("Editar anotación:", anotacionesLista[index]);
  if (nuevaAnotacion !== null) {
    anotacionesArray[index] = nuevaAnotacion;
    actualizarAnotaciones();
  }
}
