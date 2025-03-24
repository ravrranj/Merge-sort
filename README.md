# Merge-sort
Divide and conquer 


🔥 Merge Sort – Breaking It Down Simply
Alright, let’s make Merge Sort super easy to understand before jumping into the code.

🔹 What is Merge Sort?
Merge Sort is a divide-and-conquer algorithm that splits an array into smaller parts, sorts them, and then merges them back together in sorted order.

✅ Stable sorting algorithm (preserves the order of equal elements).
✅ Time Complexity: O(n log n) (always, even in the worst case).
✅ Space Complexity: O(n) (extra space is used for merging).

🔹 How Does Merge Sort Work?
Think of it as breaking a big problem into smaller, easier-to-solve pieces.

🔸 Step-by-Step Breakdown
1️⃣ Divide:

Keep dividing the array in half until each part has only one element.

A single element is always sorted, so we stop breaking at that point.

2️⃣ Conquer (Sort & Merge):

Merge two sorted halves by comparing elements and placing them in the correct order.

🔹 Example Walkthrough
Let’s sort [5, 3, 8, 4, 2, 7, 1, 6] using Merge Sort.

🔸 Step 1: Split the Array
less
Copy
Edit
[5, 3, 8, 4, 2, 7, 1, 6]  
 ├── [5, 3, 8, 4]  
 │    ├── [5, 3]  
 │    │    ├── [5]  
 │    │    ├── [3]  
 │    │    ├── Merge: [3, 5]  
 │    ├── [8, 4]  
 │    │    ├── [8]  
 │    │    ├── [4]  
 │    │    ├── Merge: [4, 8]  
 │    ├── Merge: [3, 4, 5, 8]  
 ├── [2, 7, 1, 6]  
 │    ├── [2, 7]  
 │    │    ├── [2]  
 │    │    ├── [7]  
 │    │    ├── Merge: [2, 7]  
 │    ├── [1, 6]  
 │    │    ├── [1]  
 │    │    ├── [6]  
 │    │    ├── Merge: [1, 6]  
 │    ├── Merge: [1, 2, 6, 7]  
 ├── Merge: [1, 2, 3, 4, 5, 6, 7, 8] ✅  
🔸 Step 2: Merge Sorted Halves
Merge [3, 5] and [4, 8] → [3, 4, 5, 8]

Merge [2, 7] and [1, 6] → [1, 2, 6, 7]

Merge [3, 4, 5, 8] and [1, 2, 6, 7] → [1, 2, 3, 4, 5, 6, 7, 8]

🔹 Key Observations
1️⃣ We always divide until we reach single elements
2️⃣ Merging is where sorting happens
3️⃣ Time Complexity is O(n log n)

O(log n) → Because we keep splitting the array in half.

O(n) → Because we merge all elements back together.



---------------------------------------------------------------------------------------------------------------
example to understand the logic for :

int i = 0, j = 0, k = left;
while (i < n1 && j < n2) {
    if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
    } else {
        arr[k] = rightArray[j];
        j++;
    }
    k++;
}


We have an unsorted array:

ini
Copy
Edit
arr = [5, 2, 8, 7, 1]
After splitting and sorting the halves, we get:

Left Subarray (leftArray[])
csharp
Copy
Edit
[2, 5, 8]
Right Subarray (rightArray[])
csharp
Copy
Edit
[1, 7]
Now, we start merging these two sorted halves back into arr[] using two pointers (i and j).

Step-by-Step Merge Process
Initial State:
yaml
Copy
Edit
Original Array: [5, 2, 8, 7, 1]
LeftArray:      [2, 5, 8]
RightArray:     [1, 7]

Indexes: i = 0, j = 0, k = 0
Step 1: Compare leftArray[0] (2) & rightArray[0] (1)
makefile
Copy
Edit
Left:  [ 2, 5, 8 ]
Right: [ 1, 7 ]
         ↑
         j (0)

arr = [1, _, _, _, _]  
      ↑
      k (0)
✅ Since 1 < 2, we place 1 at arr[0].
🔄 Increment j (right pointer) and k (array index).

Step 2: Compare leftArray[0] (2) & rightArray[1] (7)
makefile
Copy
Edit
Left:  [ 2, 5, 8 ]
         ↑
         i (0)
Right: [ 1, 7 ]
             ↑
             j (1)

arr = [1, 2, _, _, _]  
         ↑
         k (1)
✅ Since 2 < 7, we place 2 at arr[1].
🔄 Increment i (left pointer) and k.

Step 3: Compare leftArray[1] (5) & rightArray[1] (7)
makefile
Copy
Edit
Left:  [ 2, 5, 8 ]
            ↑
            i (1)
Right: [ 1, 7 ]
             ↑
             j (1)

arr = [1, 2, 5, _, _]  
            ↑
            k (2)
✅ Since 5 < 7, we place 5 at arr[2].
🔄 Increment i and k.

Step 4: Compare leftArray[2] (8) & rightArray[1] (7)
makefile
Copy
Edit
Left:  [ 2, 5, 8 ]
               ↑
               i (2)
Right: [ 1, 7 ]
             ↑
             j (1)

arr = [1, 2, 5, 7, _]  
               ↑
               k (3)
✅ Since 7 < 8, we place 7 at arr[3].
🔄 Increment j and k.

Step 5: Copy Remaining Elements
Now, rightArray[] is exhausted (j == n2), so we copy the remaining elements of leftArray[]:

makefile
Copy
Edit
Left:  [ 2, 5, 8 ]
               ↑
               i (2) ✅ (Remaining)

arr = [1, 2, 5, 7, 8]  
                  ↑
                  k (4)
✅ Copy 8 from leftArray[] into arr[4].
🎉 Final Sorted Array: [1, 2, 5, 7, 8]

Summary of Operations
Step	i (Left)	j (Right)	k (Array)	Comparison	Value Placed in arr[k]
1	0	0	0	2 vs 1	1 (Right)
2	0	1	1	2 vs 7	2 (Left)
3	1	1	2	5 vs 7	5 (Left)
4	2	1	3	8 vs 7	7 (Right)
5	2	2	4	-	8 (Left, remaining)
Key Takeaways
✅ Two pointers (i, j) track the smallest elements in each subarray.
✅ Always insert the smaller element into arr[k].
✅ Continue until one of the subarrays is exhausted.
✅ Copy any remaining elements after that.
