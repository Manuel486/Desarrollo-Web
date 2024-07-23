const menu = document.querySelector(".header__menu-toggle");
const close = document.querySelector(".nav__close-menu");
const nav = document.querySelector(".nav");
const body = document.querySelector(".grid-container");

menu.addEventListener("click", () => {
  nav.classList.toggle("visible");
  body.classList.toggle("overflow");
});

close.addEventListener("click", () => {
  nav.classList.toggle("visible");
  body.classList.toggle("overflow");
});
