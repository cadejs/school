<?php
$conn = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");
if (!$conn){
    echo "Debuggin errno: " . mysqli_connect_errno() . PHP_EOL;
    die("Could not connect:" . mysqli_error($conn));
}else{ echo  "Searching database <br> "; }

//echo $_POST['firstname'];
$sql ="UPDATE Customers SET customer_first_name ='$_POST[newname]' WHERE customer_first_name='$_POST[firstname]'" ;

$conn->query($sql);



$conn->close();