<?php
error_reporting(0);
require "init.php";
 
$username = $_POST["username"];
$phoneNo = $_POST["phoneNo"];
$location = $_POST["location"];
$email = $_POST["email"];
$password = $_POST["password"];

 
//$name = "sdf";
//$password = "sdf";
//$email = "sdf@r54";
 
$sql = "INSERT INTO `user_info` (`id`,`username`, `phoneNo`, `location`, `email`, `password`) VALUES (NULL, '".$username."', '".$phoneNo."', '".$location."', '".$email."', '".$password."');";
if(!mysqli_query($con, $sql)){
    echo '{"message":"Unable to save the data to the database."}';
}
 
?>