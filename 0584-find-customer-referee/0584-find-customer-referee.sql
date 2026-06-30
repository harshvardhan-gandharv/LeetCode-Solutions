SELECT
    name
FROM
    Customer
	
# SOLUTION 1  - MOST EFFICIENT 
WHERE 
    IFNULL(referee_id,0) <> 2;
    
