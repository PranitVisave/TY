<?php
	$a=$_GET['n1'];
	$el=$_GET['n2'];
	$pos=$_GET['n3'];
	$n4=$_GET['n4'];
	$b=explode(" ",$a);
	echo "Array Elements :  ";
	foreach ($b as $c)
		echo "$c\t ";
	echo "<br>";
	$arr=array_splice($b,$pos,1,$el);
	echo "Removed Element From Array Is : ";
	foreach ($arr as $c)
		echo "$c\t";
	echo "<br>";
	
	echo "Updated Array Elements Are : ";
	foreach ($b as $k)
		echo "$k\t";
	echo "<br>";
	if (array_search($n4,$b)){
		echo "The Number $n4 is Present <br>";
		
	}
	else
 	   echo "Number $n4 Not Found";
	
?>
