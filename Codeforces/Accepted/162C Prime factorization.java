USING: io kernel math.primes.factors math.parser sequences ;
readln string>number factors 
[ number>string ] map "*" join print