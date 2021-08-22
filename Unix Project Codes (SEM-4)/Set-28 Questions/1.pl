#!/usr/bin/perl
use Switch;
$a=1;
while(true){
	switch( $a ){
		case 1 { 
			system('clear');
			print "\n1.Binary to Decimal\n2.Binary to Octal\n3.Binary to Hexadecimal\n";
			print "4.Decimal to Binary\n5.Decimal to Octal\n6.Decimal to Hexadecimal\n";
			print "7.Octal to Decimal\n8.Octal to Binary\n9.Octal to Hexadecimal\n";
			print "10.Hexadecimal to Decimal\n11.Hexadecimal to Binary\n12.Hexadecimal to Octal\n13.EXIT\n";
			print "\nEnter a choice: ";
			chomp ($choice = <>);
			switch( $choice ) {
				case 1 {
					print "Enter a Binary number: ";
					chomp ($data = <>);
					if( $data =~ /^[0-1]+$/ ){
					my $dec = eval("0b$data");
						print "Decimal form is $dec\n";
					}else{
						print "$data is not a Binary Number.\n";
					}
				}
				case 2 {
					print "Enter a Binary number: ";
					chomp ($data = <>);			
					if( $data =~ /^[0-1]+$/ ){
						my $dec = eval("0b$data");
						my $oct=sprintf("%o", $dec); 
						print "Octal form is $oct\n";
					}else{
						print "$data is not a Binary Number.\n";
					}
				}
				case 3 {
					print "Enter a Binary number: ";
					chomp ($data = <>);
					if( $data =~ /^[0-1]+$/ ){
						my $dec = eval("0b$data");
						my $hex=sprintf("%x", $dec); 
						print "Hexadecimal form is $hex\n";
					}else{
						print "$data is not a Binary Number.\n";
					}
				}
				case 4 {
					print "Enter a Decimal number: ";
					chomp ($data = <>);	
					if( $data =~ /^\d+$/ ){ 
						my $bin=sprintf("%b", $data); 
						print "Binary form is $bin\n";
					}else{
						print "$data is not a Decimal Number.\n";
					}
				}
				case 5 {
					print "Enter a Decimal number: ";
					chomp ($data = <>);	
					if( $data =~ /^\d+$/ ){  
						my $oct=sprintf("%o", $data); 
						print "Octal form is $oct\n";	
					}else{
						print "$data is not a Decimal Number.\n";
					}
				}  
				case 6 { 
					print "Enter a Decimal number: ";
					chomp ($data = <>);
					if( $data =~ /^\d+$/ ){   
						my $hex=sprintf("%x", $data);
						print "Hexadecimal form is $hex\n";
					}else{
						print "$data is not a Decimal Number.\n";
					}
				}
				case 7 {
					print "Enter an Octal number: ";
					chomp ($data = <>);
					if( $data =~ /^[0-7]+$/ ){
						my $dec = eval("0$data");
						print "Decimal form is $dec\n";
					}else{
						print "$data is not an Octal Number.\n";
					}
				}
				case 8 {
					print "Enter an Octal number: ";
					chomp ($data = <>);
					if( $data =~ /^[0-7]+$/ ){
						my $dec = eval("0$data");
						my $bin=sprintf("%b", $dec); 
						print "Binary form of is $bin\n";
					}else{
						print "$data is not an Octal Number.\n";
					}
				}
				case 9 {
					print "Enter an Octal number: ";
					chomp ($data = <>);
					if( $data =~ /^[0-7]+$/ ){
						my $dec = eval("0$data");
						my $hex=sprintf("%x", $dec); 
						print "Hexadecimal form is $hex\n";
					}else{
						print "$data is not an Octal Number.\n";
					}
				}
				case 10 {
					print "Enter a Hexadecimal number: ";
					chomp ($data = <>);	
					if( $data !~ /^[g-zG-Z]*$/ and $data =~ /^[a-fA-F0-9]*$/ ){
						my $dec = eval("0x$data");
						print "Decimal form is $dec\n";
					}else{
						print "$data is not a Hexadecimal Number.\n";
					}
				}
				case 11 {
					print "Enter a Hexadecimal number: ";
					chomp ($data = <>);	
					if( $data !~ /^[g-zG-Z]*$/ and $data =~ /^[a-fA-F0-9]*$/ ){
						my $dec = eval("0x$data");
						my $bin=sprintf("%b", $dec); 
						print "Binary form is $bin\n";
					}else{
						print "$data is not a Hexadecimal Number.\n";
					}
				}
				case 12 {
					print "Enter a Hexadecimal number: ";
					chomp ($data = <>);
					if( $data !~ /^[g-zG-Z]*$/ and $data =~ /^[a-fA-F0-9]*$/ ){
						my $dec = eval("0x$data");
						my $oct=sprintf("%o", $dec); 
						print "Octal form is $oct\n";
					}else{
						print "$data is not a Hexadecimal Number.\n";
					}
				}
				case 13 {
					exit;
				}
				else { print "Enter a valid choice!\n"; }
			}
			print "\n1.Continue\n2.Exit\nEnter a choice? ";
			chomp ($a = <>);
		}
		case 2 { exit; }
		else {
			print "Enter a valid choice!\n";
			print "\n1.Continue\n2.Exit\nEnter a choice? ";
			chomp ($a = <>);
		}
	}
}
