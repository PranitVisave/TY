<?php
$str=<<<XML
<? version="1.0" encoding="UTF-8"?>
<BookInfo>
	<book>
		<bookNo>1</bookNo>
		<name>JAVA book</name>
		<author>Balguru Swami</author>
		<price>300</price>
		<year>2006</year>
	</book>
	<book>
		<bookNo>2</bookNo>
		<name>C book</name>
		<author>Dennis Ritchi</author>
		<price>600</price>
		<year>2002</year>
	</book>
</BookInfo>
XML;
$fname="BookStore.xml";
$fp=fopen($fname,"w");
fwrite($str);
fclose($fp);
echo "File Name : $fname";
?>
