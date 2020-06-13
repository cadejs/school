/**
 * 
 */


//console.log("Here...")
function brownsubmit1(){
console.log("starting first function!");
var brownVisits = document.getElementById("brownvisits").value;
var browntime = document.getElementById("time").value;
console.log("this is brown visits variable: " + brownVisits);
console.log("this is brown time variable: " + browntime);
 if (validate()){
	 
 

	if (brownVisits == 0){
		console.log("you put a 0")
		var z = document.createElement("p");
		var zinput = document.createTextNode("You need to get to Brown real quick!");
		z.appendChild(zinput);
		document.getElementById("numbrown").appendChild(z);
		
	}
	else{
		var equal = brownVisits * browntime;
		var z = document.createElement("p");
		var zinput = document.createTextNode("You have spent this many hours in brown: " + equal);
		z.appendChild(zinput);
		document.getElementById("numbrown").appendChild(z);
		alert("Wow you have spent " + equal + " hours in brown!");
		 console.log("you have been enough!");
	}

}
 else{
	 console.log("You really gotta get better at filling out forms.")
 }
}
function validate() {
	console.log("Starting second function");
	  var brownVisits = document.getElementById("brownvisits").value;
	  var browntime = document.getElementById("time").value;
	
	  if (brownVisits == "") {
	    alert("Enter data for how many times you have been to brown");
	    return false;
	  }
	  if (browntime == "") {
		    alert("Enter data for how long you go to brown");
		    return false;
		  }
	  if (brownVisits < 0 || browntime < 0) {
		    alert("Whoa whoa you can not have gone negative times");
		    return false;
		  }
	  
		  return true;
	  
	} 