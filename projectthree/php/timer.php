<?php

//echo date('h:i:s A');
date_default_timezone_set("America/Chicago");
$timeend = strtotime("2019-05-11 09:10:00");
$timestart = strtotime(date("h:i:sa"));
$timeleft =  $timeend - $timestart ;
$daysleft = $timeleft/60/60/24;

echo "There are ";
echo $daysleft;
echo " days until Brown Closes for the summer ";

