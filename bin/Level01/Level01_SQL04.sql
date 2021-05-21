select
ANIMAL_ID,
NAME,
DATETIME
from ANIMAL_INS 
order by NAME asc, date(DATETIME) desc