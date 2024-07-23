// Función para mostrar el mensaje si la lista de anotaciones está vacía
function mostrarMensaje() {
  let mensaje = document.getElementById("mensaje");
  let anotaciones = document.getElementById("anotaciones");
  mensaje.style.display = anotaciones.children.length === 0 ? "block" : "none";
}

// Función para ingresar una nueva anotación
function ingresarAnotacion() {
  let anotacion = document.getElementById("anotacion").value;
  let anotaciones = document.getElementById("anotaciones");

  if (anotacion.length === 0) {
    alert("Debe ingresar al menos un carácter");
    return;
  }

  let li = document.createElement("li");

  li.classList.add("anotacion__item");

  // Creamos un span para el texto de la anotación
  let spanTexto = document.createElement("span");
  spanTexto.textContent = anotacion;

  spanTexto.classList.add("anotacion__texto");

  // Crear botón de eliminar
  let botonEliminar = document.createElement("button");
  botonEliminar.textContent = "Eliminar";
  botonEliminar.onclick = function () {
    anotaciones.removeChild(li);
    mostrarMensaje(); // Mostrar u ocultar el mensaje después de eliminar la anotación
  };

  botonEliminar.classList.add("anotacion__button");
  botonEliminar.classList.add("anotacion__button--eliminar");

  // Crear botón de editar
  let botonEditar = document.createElement("button");
  botonEditar.textContent = "Editar";
  botonEditar.onclick = function () {
    let nuevaAnotacion = prompt("Editar anotación:", spanTexto.textContent);
    if (nuevaAnotacion !== null) {
      spanTexto.textContent = nuevaAnotacion;
    }
  };

  botonEditar.classList.add("anotacion__button");
  botonEditar.classList.add("anotacion__button--editar");

  // Envolver cada botón en un span para separarlos
  let divBotones = document.createElement("div");
  divBotones.appendChild(botonEliminar);
  divBotones.appendChild(botonEditar);

  divBotones.classList.add("anotacion__botones");

  // Agregar el texto y los botones dentro del elemento li
  li.appendChild(spanTexto);
  li.appendChild(divBotones);

  anotaciones.appendChild(li);
  mostrarMensaje(); // Mostrar u ocultar el mensaje después de agregar la anotación
}
