# ZilCode

The goal of this exercise was to be able to sort a collection of objects using different fields within that object.
The sorting was always going to be based on a single field.

The approach I took was to create different Comparator interfaces for each of these fields.
Creating these comparators made the code cleaner. Each Sorter class performed only a single operation based on that field.

SsnSorter sorted based on SSN field
LastNameSorter sorted based on lastName field and so on.

The SortPersonService.java is the class that implements the static method that was asked to be implemented.
Within the method, there were options to go the switch route and the if/else route.

Going the if/else route would have meant multiple if/else statements and hence I went the switch route, which makes the code readable.
within each case block, the code-block to be executed was the same except for the comparator interface that needed to be passed. 
So i seperated that block into a seperate method to avoid redundancy of code.

