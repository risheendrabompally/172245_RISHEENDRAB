<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
  div.stars {
  width: 300px;
  display: inline-block;

}
 input.star { display: none; }
 
label.star {

  float: right;
  padding: 10px;
  font-size: 36px;
  color: #444;
  transition: all .2s;
}

input.star:checked ~ label.star:before {
  content: '\f005';
  color: #FD4;
  transition: all .25s;
}

input.star-5:checked ~ label.star:before {
  color: #FE7;
  text-shadow: 0 0 20px #952;
}

 input.star-1:checked ~ label.star:before { color: #F62; } 

/* label.star:hover { transform: rotate(-15deg) scale(1.3); }
 */
label.star:before {
  content: '\f006';
  font-family: FontAwesome;
} 

</style>
<body>
<div class="container">
<img src="https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2019/01/04/105660734-1546632883595screen-shot-2019-01-04-at-3.14.18-pm.530x298.jpg?v=1546632940">
<div class="row">
<div class="col-sm-6">
<div>
<iframe width="500" height="300" src="https://www.youtube.com/embed/h-k0-Z9b4Cw"></iframe></div>
</div>
<div class="col-sm-6">
<div>
<pre><h3>
Jason Momoa as Arthur Curry / Aquaman

Amber Heard as Mera

Willem Dafoe as Nuidis Vulko

Patrick Wilson as Orm Marius / Ocean Master

Dolph Lundgren as Nereus

Yahya Abdul-Mateen II as David Kane / Black Manta

Nicole Kidman as Atlanna
</h3></pre>
</div>
</div>

</div></div>
<br>
<h4>comments:</h4>
<textarea name="comments" id="comments" style="font-family:sans-serif;font-size:1.2em;">
</textarea>
<span><a href="login.jsp"><input type="submit" value="Submit" onclick="login.jsp"></a></span>
<div><br>
<h4>Rating</h4>
<div class="stars">
      <form action="">

    <input class="star star-5" id="star-5" type="radio" name="star"/>

    <label class="star star-5" for="star-5"></label>

    <input class="star star-4" id="star-4" type="radio" name="star"/>

    <label class="star star-4" for="star-4"></label>

    <input class="star star-3" id="star-3" type="radio" name="star"/>

    <label class="star star-3" for="star-3"></label>

    <input class="star star-2" id="star-2" type="radio" name="star"/>

    <label class="star star-2" for="star-2"></label>

    <input class="star star-1" id="star-1" type="radio" name="star"/>

    <label class="star star-1" for="star-1"></label>

  </form>

  </div>
</div>
</body>
</html>