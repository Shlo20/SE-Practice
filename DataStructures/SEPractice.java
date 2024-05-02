/*Stage 1


Identify what need the software is meeting


For organizing tasks to work more efficiently. 


Who uses it?


Anyone can use the software. People who want to keep track of their tasks.




Why does he use it? What is he trying to accomplish when he uses it?


In order to organize tasks and differentiate between work for different dates and time. Order and efficiency for getting tasks done.


What functions does your software provide to the user that help him achieve his 
goal(s)?


Easy organization and encourages time management. When keeping track of your
Tasks, it is easier to do them.



How does he use it? What steps does he go through in order to achieve his 
goal(s)? What are the workflows he progresses through when using it?


Types out a task
Adds a time and a date to it
If the time or task is changed , can change name and time
When the task is completed, mark it as ‘done’.


Stage 2 
we ask the user to write the amount of years he/she wants to set the schedule to.
Then we create this amount of class 'Year' objects.
Inside these objects we'll have a 52 'Week' objects.
Inside these we'll have 7 'Day' objects.
Inside these we'll have an array that has 24 slots, one for each hour.

The data structure we use is an String array, to store the name of the task in that specific time. An array is the best data structure for this specific project because there are a lot of straight access to the hours.
Loose coupling - each object is pointing only to the objects that are connected to it.
It will be ipossible to change a task that's in a time period that is not associated with 
the time period we change from.

Encapsulation - all the classes' instances will be private.
the getters will return a new copy of the object.

*/