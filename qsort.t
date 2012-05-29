#!/usr/bin/perl

use strict;
use warnings;
use Test::More tests => 11;
#doing join on the results of recursive calls gives you weird spacing on
#the outputs

sub qsort{
	my @nums = @_;
	my $nums_len = @nums;
	if ($nums_len <= 1){
		return $_[0];
	}
	
	my $mid = int($nums_len / 2);
	my $pivot;
	if (($nums[0] < $nums[$mid]) && ($nums[$mid] < $nums[$#nums])){
		$pivot = $mid;
	}
	elsif (($nums[0] > $nums[$mid]) && ($nums[0] < $nums[$#nums])){
		$pivot = 0;
	}
	else {$pivot = $#nums;}

	my @lesser;
	my @greater;
	my $i;
	for ($i =0; $i < $nums_len; $i++){
		if ($i != $pivot){
			if ($nums[$i] <= $nums[$pivot]){
				push(@lesser, $nums[$i]);
			}
			else{
				push(@greater, $nums[$i]);
			}
		}
	}

	my $list = join(" ", qsort(@lesser), $nums[$pivot], qsort(@greater));
	return $list;
}


is(qsort(1, 2, 8, 7, 6, 5), "1 2  5  6  7 8", "a simple case");
is(qsort(), undef, "empty array");

is(qsort(1), "1", "one element");
is(qsort(4, -10)," -10 4" , "2 elements");

is(qsort(2, 4, 1), " 1 2 4 ", "3 elements");
is(qsort(1,3,3,5,0), " 0 1 3  3 5", "duplicates");

is(qsort(1,2,3,4,5,6,7,8,9), "1 2  3 4 5 6 7  8 9", "in order");
is(qsort(-4, 8, 1, 2, 4 , 10), "-4 1  2 4 8 10", "+/-'s");

is(qsort(1, 2, -2), " -2 1 2 ", "3 elements; +/-2");
is(qsort(-3,-7,-1,-5,-4,-2,-10), " -10 -7 -5 -4 -3  -2 -1", "all negatives");
is(qsort(-1, 4, 3, 1), "-1 1  3 4", "+/-1's + 2 other #s");
