<?php
	$a=$_GET['a'];
	$s=$_GET['s'];
	$a2=$_GET['a2'];
	
	$new=explode("$a",$s);
	print_r($new);
	
	echo"<br><br>";
	
	$op=str_replace($a,$a2,$s);
	echo "<b> replaced string </b> : $op";
	
	echo"<br><br>";
	
	$op1 = strrchr($s,"$a");
	echo "<b> from last </b> : $op1";
?>
