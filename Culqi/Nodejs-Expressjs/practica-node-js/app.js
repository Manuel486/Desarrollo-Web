const fs = require("fs");

const poema = fs.readFileSync("poema.txt", "utf-8");

const poemaModified = poema.replace(/Node.js/gi, "NodeJS");

fs.writeFileSync("poema-copy.txt", poemaModified);
