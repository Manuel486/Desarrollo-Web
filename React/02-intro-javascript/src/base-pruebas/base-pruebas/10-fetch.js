const apiKey = "ADR94tz66A3ZKio2exljsv4BPQAYqk3I";

const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);

peticion
  .then((resp) => resp.json())
  .then(({ data }) => {
    console.log(data.images.original.url);
  })
  .catach(console.warn);
