select distinct city from station
where left(city,1) not in('A','E','I','O','U') AND 
right(city,1) not in('A','E','I','O','U');