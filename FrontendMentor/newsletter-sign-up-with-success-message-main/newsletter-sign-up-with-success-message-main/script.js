const formulario = document.getElementById('formulario');
const input = document.getElementById('inputCorreo');
const error = document.getElementById('error');

function validarCampo() {
    if (input.value === "") {
        error.classList.add('visible');
        input.classList.add('error_input')
        return false;
    } else {
        error.classList.remove('visible');
        input.classList.remove('error_input');
        return true;
    }
}

formulario.addEventListener('submit', (e) => {
    if (!validarCampo()) {
        e.preventDefault(); 
    }
});

input.addEventListener("input", () => {
    validarCampo();
});
