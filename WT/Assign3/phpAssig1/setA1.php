
<?php
	echo "Hello";
	$a=$_POST['t1'];
	$b=$_POST['t2'];
	function mod(int $a, int $b){
		$ans=$a % $b;
		echo "Mod of $a and $b is $ans";
	}
	function power(int $a,int $b){
		$ans=$a**$b;
		echo "$a**$b = $ans";
	}
	function sum(int $a,int $b){
		for (int $i=1;$i<=$a;$i++)
			$sum = $sum + $i;
		echo"Sum = $sum";
	}
	//function factorial(int $b){
	//	$fact = 1;
	//	for (int $i=$b;$i>=1;$i--)
	//		$fact=$fact * $i;
	//	echo "Factorial of $b = $fact";
	//}
	
	mod($a,$b);
	power($a,$b);
	sum($a,$b);
	//factorial($b);
	
?>

