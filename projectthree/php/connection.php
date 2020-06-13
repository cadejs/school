<?php
$username =  $_POST['username'];
$brownvisits = $_POST['brownvisits'];
$time = $_POST['username'];

$con = mysqli_connect("avl.cs.unca.edu", "ljohnso8Arden", "webbook", "ljohnso8DBwebbook");
if (!$con){
    echo "Debuggin errno: " . mysqli_connect_errno() . PHP_EOL;
    die("Could not connect:" . mysqli_error($con));
}

$sql = "INSERT INTO Ljohnson8Dwebbook.Customers (username, brownvisits, time) VALUES (?,?,?)";
$stmt = mysqli_stmt_init($con);

if (!mysqli_stmt_prepare($stmt, $sql)) {
    exit();
    
} else {
    (mysqli_stmt_bind_param($stmt,"sii", $username, $brownvisits,$time));
    echo "Connected to mySQL successfully. <br>" ;
    exit();
    
}



    $sql = "SELECT * FROM ljohnso8DBwebbook.Customers order by username limit 100 ;  ";

echo $sql . "<br>";

$result = mysqli_query($con, $sql);
if (mysqli_errno($con) != 0) {
    echo mysqli_errno($con) . ": " . mysqli_error($con) . "\n";
} else {
    echo "Beautiful SQL call returned:";
}


echo "<table>
<tr>
<th>username</th>
<th>brownvisits</th>
<th>time</th>

</tr>";

while ($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['username'] . "</td>";
    echo "<td>" . $row['brownvisits'] . "</td>";
    echo "<td>" . $row['time'] . "</td>";
    echo "</tr>";
}
echo "</table>";

// Always... really always.. close the database connection!
mysqli_close($con);
session_destroy();



