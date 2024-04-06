<?php
	$xml=siplexml_load_file(a3.xml);
	foreach($xml->bok as $k){
		echo "Book No.: ".$k->bno."<br>";
		echo "Book No.: ".$k->bno."<br>";
