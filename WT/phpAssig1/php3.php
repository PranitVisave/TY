<?php
	$n1=$_GET['n1'];
	$n2=$_GET['n2'];
	$n3=$_GET['n3'];
	
	function myfn($n1,$n2,$n3){
		$arg=func_get_args();
		if ($arg[0]==null or $arg[1]==null or $arg[2]==null)
			echo "Missing Parameters... <br><br>";
		else
			echo "Hello $n1,$n3 $n2";
	}
	myfn($n1,$n2,$n3);
?>
