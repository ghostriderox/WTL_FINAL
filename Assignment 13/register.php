<?php
    $db_user = "dakshpokar";
    $db_pass = "password";
    $db_name = "main";
    $db_host = "localhost";
    $conn = mysqli_connect($db_host, $db_user, $db_pass, $db_name);
    if(!$conn){
        echo "Cannot establish database connection!";
    }
    else{
    }
   
    if($_POST){
    $name = $_POST["name"];
    $rollno = $_POST["rollno"];
    $class = $_POST["class"];
    $dept = $_POST["dept"];
    $percent = $_POST["percent"];

    $sql = mysqli_query($conn, "INSERT INTO Student values('$rollno', '$name', '$class', '$dept', '$percent')");
    if(!$sql){
        echo "Please check query ;)";
    }
    else{
        echo "Data added successfully";
    }
    }
  
?>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<style type="text/css">
    .input-box{
        width: 400px;
        padding: 20px;
        border: 1px solid #ababab;
        border-radius: 100px;
        margin: 3px;
    }
    .submit-box{
        width: 400px;
        background: #000000;
        color: #ffffff;
        padding: 20px;
        border: 1px solid #ababab;
        border-radius: 100px;
        margin: 10px;   
    }
    th, td {
      padding: 15px;
      text-align: left;
    }
    </style>
<body>
    <table border="1px" style="border-collapse: collapse">
        <tr>
            <th>Roll No</th>
            <th>Name</th>
            <th>Class</th>
            <th>Dept</th>
            <th>Percentage</th>
</tr>
<?php
     $sql = mysqli_query($conn, "SELECT * FROM Student ORDER BY percentage");
     if($sql){
         while($row = mysqli_fetch_assoc($sql)){
?>
    <tr>
        <td><?php echo $row["rollno"]; ?></td>
        <td><?php echo $row["name"]; ?></td>
        <td><?php echo $row["class"]; ?></td>
        <td><?php echo $row["dept"]; ?></td>
        <td><?php echo $row["percentage"]; ?></td>
         </tr>
<?php

         }
     }
?>
</table>
<form method="post" action="register.php">
<input name="rollno" class="input-box" type="text" placeholder="Enter your Roll No." required><br>           
<input name="name" class="input-box" type="text" placeholder="Enter your Name" required><br>
<input name="class" class="input-box" type="text" placeholder="Enter your Class" required><br>
<input name="dept" class="input-box" type="text" placeholder="Enter your Department" required><br>
<input name="percent" class="input-box" type="text" placeholder="Enter your Percentage" required><br>
<input class="submit-box" type="submit" value="Add"/>
        </form>
</body>
</html>
