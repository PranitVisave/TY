<?php
	$ch=$_POST['op'];
	$arr=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
	print_r($arr);
	switch ($ch){
		case 1 :asort($arr);
			echo "<br> Ascending Order Sort By Value : <br>";
			print_r($arr);
			break;
		case 2 :ksort($arr);
			echo "<br> Ascending Order Sort By Key : <br>";
			print_r($arr);
			break;
		case 3 :arsort($arr);
			echo "<br> Descending Order Sort By Value : <br>";
			print_r($arr);
			break;
		case 4 :krsort($arr);
			echo "<br> Descending Order Sort By Key : <br>";
			print_r($arr);
			break;
	}	
?>
