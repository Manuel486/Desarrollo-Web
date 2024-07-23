const button = document.querySelector(".header__button");
const nav = document.querySelector(".header__nav");

console.log("gola");

button.addEventListener("click", () => {
  nav.classList.toggle("activate");
});
