function loadGetMsg() {
                let nameVar = document.getElementById("name").value;
                const xhttp = new XMLHttpRequest();
                xhttp.onload = function() {
                    document.getElementById("getrespmsg").innerHTML =
                    this.responseText;
                }
                xhttp.open("GET", "/hello?name="+nameVar);
                xhttp.send();
            }


function loadRequest(){
    let symbol = document.getElementById("symbol").value;
    var URL = "http://localhost:4567/find/" + symbol ;
    axios.get(URL)
     .then(function(response) {
     document.getElementById("getrespmsg").innerHTML = response.data;
     console.log(response.data);
     })
     .catch(function(error) {
     console.log(error);
     });

 }




