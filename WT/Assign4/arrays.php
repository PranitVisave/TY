<?php
	$a=$_GET['n1'];
	$ht=$b=explode(" ",$a);
	echo "Array Of Temperatures is : ";
	foreach ($b as $c)
		echo "$c \t";
	echo "<br>";
	$sum=0;
	$cnt=count($b);
	
	foreach ($b as $c)
		$sum+=$c;
	$avg=$sum/$cnt;
	rsort($b);
	
	$k=array_Splice($b,0,5);
	sort($ht);
	$n=array_Splice($ht,0,5);
	
	echo "Average Temperature is : $avg <br>";
	echo "Five Warmest Hight Temp : ";
	foreach ($k as $k1)
		echo "$k1\t";
	
	echo "<br>";
	echo "Five Coolest Temperature : ";
	foreach ($n as $n1)
		echo "$n1 \t";
?>                                                                                                    
