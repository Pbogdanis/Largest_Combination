# Largest_Combination
Given a list of non-negative integers, return the largest combined number
There are two different branches because there are two, slightly, different ways of addressing the problem. 
# Permutations - master branch
  Here, the program takes the user's input array of integers and finds all the available permutations of that list. With each new permutation it compares it to the previous, ultimately providing the largest permutation of the list.
# Combinations - combination branch
  This approach compares every two adjacent numbers and tranfers the largest of them to the start of the list holding the result as largest. Despite it running for the number of times equal to the factorial of the length of the list, it is running for as many times as the elements of the list provided. 
