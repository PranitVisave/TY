<?php
	$a=$_GET['s1'];
	//echo "Hello <br> ";
	function length($a){
		$i=0;
		while ($a[$i]!=''){
			$i++;
		}
		echo"Length of $a is $i <br>";
	}
	function vowels(string $a){
		$k=0;
		$i=0;
		while ($a[$i]!=''){
			if ($a[$i] == 'a' or $a[$i] == 'e' or $a[$i] == 'i' or $a[$i] == 'o' or $a[$i] == 'u' or $a[$i] == 'A' or $a[$i] == 'E' or $a[$i] == 'I' or $a[$i] == 'O' or $a[$i] == 'U'){
						$k++;
			}
		$i++;
		}
		echo "Number Of Vowels in $a is $k<br>";
	}
	function changeCase($a){
		echo "LowerCase : ";
		echo strtolower("$a");
		$s=strtolower("$a");
		echo "<br>Titlecase : ";
		echo ucwords("$s");
	}
	function padding($a){
		$s=str_pad($a,50,"*&#",STR_PAD_BOTH);
		echo "<br>Padding: $s <br>	";
	}
	function reverse($a){
		echo "Reversed String :";
		echo strrev($a);
	}
	function RemoveSpace($a){
		$s=ltrim($a);
		echo"<br>String After removing leading white spaces : $s <br>";
		echo "New Length os String : ";
		echo strlen($s);
	}	
	
?>
