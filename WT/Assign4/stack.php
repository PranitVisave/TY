<?php
          $a=$_GET["n1"];
          $el=$_GET["n2"];
          $ch=$_GET["op"];
          $b=explode(" ",$a);
          
         
          echo " Array Elements Are : ";
          foreach($b as $c)
                       echo "$c\t";
          echo "<br>";
              
          
	switch ($ch){
		case 1:
                	echo "Array with pushed Element is : ";
                        array_push($b,$el);
                        break;
                case 2:
                        echo"Array with Popped Element is : ";
                        array_pop($b);
                        break;
                case 3:
                        echo"Content Of stack is : ";
                        break;
                case 4:
                        echo"Array with Inserted Element is : ";
                        array_unshift($b, $el);
                        break;
                case 5:
                        echo"Array with Inserted Element is : ";
                        array_shift($b);
                        break;     
               case 6:
                        echo"Content of queue is : ";
                        break;
      }
      foreach($b as $c)
      		echo  "$c\t";
 
?>
