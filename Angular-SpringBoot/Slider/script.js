const products = document.querySelectorAll(".slider .product");
const visibleProducts = 3; // Número de productos visibles en el slider
const productWidth = 420; // Ancho del producto incluyendo margen
let counter = 0;

document.querySelector(".slider-container").style.width = `${
  visibleProducts * productWidth
}px`;

function left() {
  if (counter > 0) {
    counter--;
  } else {
    counter = Math.ceil(products.length / visibleProducts) - 1;
  }
  scroll();
}

function right() {
  if (counter < Math.ceil(products.length / visibleProducts) - 1) {
    counter++;
  } else {
    counter = 0;
  }
  scroll();
}

function scroll() {
  console.log(counter);
  const offset = counter * productWidth * visibleProducts;
  console.log(offset);
  document.querySelector(
    ".slider"
  ).style.transform = `translateX(-${offset}px)`;
}
