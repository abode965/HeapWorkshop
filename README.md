# HeapWorkshop
Design an efficient algorithm for finding and deleting an element of the smallest value in a heap and determine its time efficiency.


A heap can be defined as a binary tree with keys assigned to its nodes, one key per node, provided the following two conditions are met:
1.The shape property: the binary tree is essentially complete 

2.The parental dominance or heap property: the key in each node is greater than or equal to the keys in its children

According to the definition of heap the leaves are smaller that parent, thug the smallest elements exist in the leaves.
                ![pic](http://i67.tinypic.com/aer4np.png)
                
                
A heap can be implemented as an array by recording its elements in the topdown, left-to-right fashion. It is convenient to store the heap’s elements in positions 1 through n of such an array, leaving H[0] either unused or putting there a sentinel whose value is greater than every element in the heap. In such a representation.
	The parental node keys will be in the first [n/2] positions of the array, while the leaf keys will occupy the last [n/2] positions;
	The children of a key in the array’s parental position i (1≤ i ≤ [n/2]) will be in positions 2i and 2i + 1, and, correspondingly, the parent of a key in position i (2 ≤ i ≤ n) will be in position [i/2].

Thus, we could also define a heap as an array H[1..n] in which every element in position i in the first half of the array is greater than or equal to the elements in positions 2i and 2i + 1.
Smallest value Deletion from a heap , 
Step 1   Find the Smallest key’s index in the heap. 
Step 2  Exchange the Smallest key with the last key K of the heap.
In order to find the smallest element in the heap tree, we only search on the leaves side of the array, thug the efficiency to find the smallest element in a heap tree is ∑_(i=n/2)^n▒〖1=〗O (n/2).the basic operation is the comparison .









For the deletion algorithm, first I checked if the given index is bigger from the array length if not I swapped it with the last element in the array/heap tree and delete it. The efficiency to delete an element In the array/heap tree is equal to O(1).Therefore two algorithm’s efficiency together is O(n/2)+O(1) = O(N/2).
