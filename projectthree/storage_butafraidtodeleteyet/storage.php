<?php







//got some working stuff here rn

$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "myDB";

// Create connection
//  $conn = new mysqli($servername, $username, $password, $dbname);
$conn = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "INSERT INTO ljohnso8DBwebbook.Customers (customer_first_name, customer_last_name, email_address, gender)
        VALUES ('Testyyy', 'Doe', 'john@example.com', ' ')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();




//here we diverge

$stmt = mysqli_stmt_init($con);

if(!mysqli_stmt_prepare($stmt, $sql)){
    
    
}

mysqli_stmt_bind_param($stmt, "ssssssssss", $firstname,$middleIni,$lastname,$gender.$email,$phone,$address,$city,$county,$country) ;
mysqli_stmt_execute($stmt);
exit();

mysqli_stmt_close($stmt);
$con->close();
