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
