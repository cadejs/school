<?php

session_start();

?>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<?php


// Connect to the database with (hostname,userid,password,database)
// $con = mysqli_connect(localhost, uncastudent, Rocky99Dog, webbook);
$con = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");
if (! $con) {
    echo "Debugging errno: " . mysqli_connect_errno() . PHP_EOL;
    die('Could not connect: ' . mysqli_error($con));
} else {
    echo "Connected to mySQL successfully. <br>" . PHP_EOL;
}

    $sql = "SELECT * FROM ljohnso8DBwebbook.Customers order by customer_id limit 100 ;  ";

echo $sql . "<br>";

// run the query and report errors if necessary
// It is by will alone I set my mind in motion...
$result = mysqli_query($con, $sql);
if (mysqli_errno($con) != 0) {
    echo mysqli_errno($con) . ": " . mysqli_error($con) . "\n";
} else {
    echo "Beautiful SQL call returned:";
}
//this is setting the table names
echo "<table>
<tr>
<th>Customer ID</th>
<th>Firstname</th>
<th>Lastname</th>
<th>Email</th>
<th>Phone</th>
<th>Address</th>
<th>City</th>
<th>County</th>
<th>Country</th>

</tr>";
/*

*/
while ($row = mysqli_fetch_array($result)) {
    echo "<tr>";
   echo "<td>" . $row['customer_id'] . "</td>";
    echo "<td>" . $row['customer_first_name'] . "</td>";
    echo "<td>" . $row['customer_last_name'] . "</td>";
    
    echo "<td>" . $row['email_address'] . "</td>";
    echo "<td>" . $row['phone_number'] . "</td>";
    echo "<td>" . $row['address'] . "</td>";
    echo "<td>" . $row['town_city'] . "</td>";
    echo "<td>" . $row['county'] . "</td>";
    echo "<td>" . $row['country'] . "</td>";
    
    echo "</tr>";
}
echo "</table>";

mysqli_close($con);
session_destroy();
?>
    </body>
</html>
