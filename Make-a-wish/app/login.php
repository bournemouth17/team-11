<?php
error_reporting(0);
require "init.php";
 
$username = $_POST["username"];
$password = $_POST["password"];
 
//$name = "sdf";
//$password = "sdf";
 
$sql = "SELECT * FROM `user_info` WHERE `username`='".$username."' AND `password`='".$password."';";
 
$result = mysqli_query($con, $sql);
 
$response = array();
 
while($row = mysqli_fetch_array($result)){
    $response = array("id"=>$row[0],"name"=>$row[1],"password"=>$row[2],"email"=>$row[3]);
}
 
echo json_encode(array("user_data"=>$response));
 
?>