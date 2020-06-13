<?php
$conn = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");
if (!$conn){
    echo "Debuggin errno: " . mysqli_connect_errno() . PHP_EOL;
    die("Could not connect:" . mysqli_error($conn));
}else{ echo  "Searching database <br> "; }

//echo $_POST['firstname'];
$sql ="SELECT * FROM Customers WHERE customer_first_name='$_POST[firstname]'" ;
$results = $conn->query($sql);

if ($results->num_rows > 0){
    while($row = $results->fetch_assoc()){
        echo "id: " . $row["customer_id"]. "- Name: " . $row['customer_first_name']. " ". $row['customer_last_name']." - Email address: ". $row['email_address']. "<br>";
        
    }
    
    
}else{ echo "nothing in there bud";}

$conn->close();