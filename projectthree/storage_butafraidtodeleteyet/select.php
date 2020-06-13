<?php
$conn = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");
if (!$conn){
    echo "Debuggin errno: " . mysqli_connect_errno() . PHP_EOL;
    die("Could not connect:" . mysqli_error($conn));
}
echo  "connected";
 $sql ="SELECT customer_id, customer_first_name, customer_last_name, email_address FROM Customers" ; 
 $results = $conn->query($sql);
 
 if ($results->num_rows > 0){
     while($row = $results->fetch_assoc()){
         echo "id: " . $row["customer_id"]. "- Name: " . $row['customer_first_name']. " ". $row['customer_last_name']." Email address: ". $row['email_address']. "<br>";
         
     }
     
     
 }else{ echo "nothing in there bud";}
 
 $conn->close();