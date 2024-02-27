import {collages} from "./Data.js";

function selectCollage() {
  let selectCollage = document.getElementById("collages");

  for (let i = 0; i < collages.length; i++) {
    let option = document.createElement("option");
    option.text = collages[i].t;
    option.value = collages[i].v;
    selectCollage.add(option);
  }
}

selectCollage();



