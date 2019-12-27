const express = require("express");
const app = express();
const port = 3000;

const faces = require("./faces.json");

app.get("/faces", (req, res) => {
  var resultingList = [];
  for (var key in faces) {
    resultingList.push(...faces[key]);
  }
  res.send(resultingList);
});

app.get("/faces/memes", (req, res) => {
  res.send(faces.memes);
});

app.get("/faces/actions", (req, res) => {
  res.send(faces.actions);
});

app.listen(port, () =>
  console.log(`meme-api's REST API is listening on port ${port}`)
);
