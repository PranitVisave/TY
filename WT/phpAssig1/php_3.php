<?php
	$a=$_GET['s1'];
	$b=$_GET['s2'];
	function compare($a,$b){
		$s=strlen($b);
		$c=0;
		for ($i=0;$i<$s;$i++){
			if ($a[$i]==$b[$i])
				$c++;
		}
		if ($c == strlen($b))
			echo "'$b' Appears in '$a' in start. <br>";
		else
			echo "'$b' Does not appear in '$a' in start. <br>";
	}
?>
