<?php
	$s=$_GET['s'];
	$n=$_GET['n'];
	$m=$_GET['m'];
	
	$total=0;
	
	echo "<table border=1>";
	echo "<th>Subject Code</th>";
	echo "<th>Subject Name</th>";
	echo "<th>Subject Marks</th>";
	
	for ($i=0;$i<5;$i++){
		echo"<tr>";
		
		echo"<td>$n[$i]</td>";		
		echo"<td>$s[$i]</td>";
		echo"<td>$m[$i]</td>";
		
		echo"</tr>";
		$total+=$m[$i];
		}
	$perc=($total/500)*100;
	echo "<td colspan=3 align=right>";
	echo "Total Marks Obtained : $total";
	echo "</td>";
	echo "<tr>";
	echo "<td colspan=3 align=right>";
	echo "Percentage : $perc";
	echo "</td>";
	echo "</tr>";
	
	echo "<tr>";
	if ($perc >= 75){
		echo "<td colspan=3 align=right>";
		echo "Grade : A [DIS.]";
		echo "</td>";
	}
	else if ($perc >=60){
		echo "<td colspan=3 align=right>";
		echo "Grade : FIRST";
		echo "</td>";
	}
	else if ($perc >=35){
		echo "<td colspan=3 align=right>";
		echo "Grade : SECOND";
		echo "</td>";
	}
	else
		echo "Fail";
	echo "</tr>";
		
	echo "</table>";
	
		
?>
