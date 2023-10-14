<?php
	$a=$_POST['t1'];
	$b=$_POST['t2'];
	echo "Hello <br>";
	function Mod($a,$b){
		$ans=$a%$b;
		echo "Mod of $a and $b is $ans <br>";
		
	}
	function power($a,$b){
		$ans=$a**$b;
		echo "$a^$b = $ans <br>";
	}
	function sum($a){
		$sum=0;
		for ($i=1;$i<=$a;$i++)
			$sum = $sum + $i;
		echo"Sum upto $a = $sum <br>";
	}
	function factorial($b){
		$fact = 1;
		for ($i=$b;$i>=1;$i--)
			$fact=$fact * $i;
		echo "Factorial of $b = $fact <br>";
	}
	
?>
