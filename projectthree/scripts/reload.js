/**
 * 
 */

function reload(){
	
	setInterval(function()
			{
		
		var z = document.createElement("p");
		var zinput = document.createTextNode("Watch as I use AJAX to go on forver");
		z.appendChild(zinput);
		document.getElementById("numbrown").appendChild(z);
		_initTimer();    
		
			}, 3000);
  

    console.log("Refreshed"); 
}