function random(min, max) {
  var num = Math.floor(Math.random() * (max - min + 1)) + min;
  console.log(num);
}

random(5, 10);
