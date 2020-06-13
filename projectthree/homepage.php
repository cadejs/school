<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<script src="scripts/brownsubmit.js"></script> 
<script src="scripts/reload.js"></script> 
<script src='http://code.jquery.com/jquery.js'></script>


 <base href="http://arden.cs.unca.edu/~cjustads/project_three/" target="_blank">
<!-- Homepage for Project -->

<title> Dinning Hall services!</title>
<link rel="stylesheet" href="css/default1+dropdown.css">

<script>

             $(document).ready(function(){
                 setInterval(_initTimer, 1000);
             });
             function _initTimer(){
                 $.ajax({
                    url: 'php/clock.php',
                     success: function(data) {
                        console.log(data);
                         data = data.split(':');
                         $('#hrs').html(data[0]);
                         $('#mins').html(data[1]);
                         $('#secs').html(data[2]);
                     }
                 });
             }
             
             
            </script>

</head>
<body>
<div class="centerwebsite">
<header>



<h1 id="maintitle"> Project Three </h1>


</header>
<div  class="main">


<script src="scripts/jscript.js"></script> 
<script src="scripts/timer.js"></script> 
<br>
<br>

<div class="center">

<nav>
<ul>
	<li><a href="http://arden.cs.unca.edu/~cjustads/project_three/php/viewdatabase.php">  View the database   </a> </li>
	<li><a href="http://arden.cs.unca.edu/~cjustads/project_three/connectspecifc.html">  Search the database   </a> </li>
	<li><a href="http://arden.cs.unca.edu/~cjustads/project_three/update.html">  Update the database   </a> </li>
	<li><a href="http://arden.cs.unca.edu/~cjustads/project_three/htmldelete.html">  Delete information the database   </a> </li>
		<li><a href="http://arden.cs.unca.edu/~cjustads/project_three/htmlinsert.html">  Add new information the database   </a> </li>
	
</ul>
</nav>

<form action="php/timer.php">
  <input type="submit" value="working php file here">

</form>
<form id="numbrown" onsubmit="brownsubmit1();return false;">
How many times have you eaten at brown?:<br>
  <input type="text" id=brownvisits  name="brownvisits"><br>
 How many hours do you usually stay in brown?:<br>
  <input type="text" id=time name="time">
  <input type="submit" value="Submit">
  <br>
</form>
</div>

<p> Ajax Updated Time </p>
<div class = ajax>
<?php //include ('php/timer.php'); ?>


</div>

</div>

</div>

<span id='hrs'></span>:<span id='mins'></span>:<span id='secs'></span>


  <br>




 
</body>
 
 
</html>



