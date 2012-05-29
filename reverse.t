#!/usr/bin/perl

use strict;
use warnings;
use Test::More tests => 5;

#reverse the string.
#If it ends in \n, leave the \n in place can also
#add an if statement for \0 if you wanted to test null
#terminated C strings.

sub rev
{
	my @chars = split(//, $_[0]);
	my $front = 0;
	my $back;
	#diag "last character in the string is ". ord($chars[$#chars]);
	if ($chars[$#chars] eq "\n"){
		$back = $#chars -1;
	}
	else {
		$back = $#chars;
	}
	while ($front < $back){
		my $temp = $chars[$front];
		$chars[$front] = $chars[$back];
		$chars[$back] = $temp;
		$front++;
		$back--;
	}
	return join("", @chars);
}

is(rev("dlrow olleh"), "hello world", "should work");
is(rev(""), "", "testing the empty string");
is(rev("42\n"), "24\n", "testing for \n");
is(rev("The quick brown fox jumped over the lazy dog"), "god yzal eht revo depmuj xof nworb kciuq ehT", "long string");
is(rev("A"), "A", "one character");
