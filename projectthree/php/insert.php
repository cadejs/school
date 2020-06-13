<?php
session_start();

$firstname=$_POST['firstname'];
$middleIni=$_POST['middleIni'];
$lastname=$_POST['Lastname'];
$gender=$_POST['gender'];
$email=$_POST['email'];
$phone=$_POST['phone'];
$address=$_POST['address'];
$city=$_POST['city'];
$county=$_POST['county'];
$country=$_POST['country'];


//^proper method to get info from form 
echo "hey";
echo $firstname;
echo $middleIni;
echo $lastname;
echo $gender;
echo $email;
echo $phone;
echo $address;
echo $city;
echo $county;
echo $country;

//error lies in inputting into database
$conn = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");
if (!$conn){
    echo "Debuggin errno: " . mysqli_connect_errno() . PHP_EOL;
    die("Could not connect:" . mysqli_error($conn));
}

$sql = "INSERT INTO Customers (customer_first_name, customer_last_name,
               gender, email_address, login_name, login_password, phone_number, address, town_city, county, country)
 VALUES ('$_POST[firstname]', '$_POST[Lastname]', 'F', '$_POST[email]', '*****','********', '$_POST[phone]', '$_POST[address]', '$_POST[city]',
                                                                                               '$_POST[county]','$_POST[country]')";
if ($conn-> query($sql)===TRUE) {
    echo "A new record was made ...finally";
} else {
    echo "Same old same old still not working";
}

       
//mysqli_query($conn, $query);

//if(mysqli_errno($conn)!=0){echo mysqli_errno($conn) . ": " . mysqli_errno($conn) . "\n";
//}else{
 //   echo  "Got to the SQL";   
//}

mysqli_close($conn);
session_destroy();
?>








