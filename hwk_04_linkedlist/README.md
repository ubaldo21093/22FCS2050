# Instructions

Using the (given) LinkedList implementation and code the clear method below: 

```
    public void clear() {

    }
```

The clear method is supposed to remove all elements of the linked list, making sure no node's next references are left. For example, consider the linked list below: 

``` 
head -> [ 1 ] -> [ 2 ] -> [ 3 ] -> null
```

After calling clear, the memory should be like the following: 

``` 
head -> null
[ 1 ] -> null
[ 2 ] -> null
[ 3 ] -> null
```

Hint: run a loop using current set initially to head; then at each iteration, set current's next to a temporary Node variable; set current's next to null and then move current foward setting it to your temporary node; don't forget to set the head reference to null when you are done!

# Submission 

For this assignment you just need to submit source code LinkedList.java through Canvas.  No need to submit 