function validation() {
  var username = document.getElementById('username').value;
  var password = document.getElementById('password').value;
  
  if(username === '' || password === '') {
    document.getElementById('response').textContent = 'Username & password is mandatory';
  }
  verify(username,password)
}

function verify(username,password) {
    var xhttp = new XMLHttpRequest(); 
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {

       document.getElementById("response").innerHTML = this.responseText;
      } 
    };
    xhttp.open('GET', 'http://localhost:8082/spring-custom-example/customers?embed='+username+'&'+password, true);
    xhttp.send();
  }