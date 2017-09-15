
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=FIRST -Darg1=SECOND -Darg2=THIRD

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf josiah_bailey_assign_1.tar.gz josiah_bailey_assign_1
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense."

signature: Josiah Bailey

[Date: 9/13/2017]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

MyArrayList space complexity of O(n)
MyArrayList insertSorted time complexity of O(n) because we only go through the total size of the array once
MyArrayList removeValue time complexity of O(n) because we only go through the total size of the array once
MyArrayList indexOf time complexity of O(n) because we go through the array until the first index that 
contains the value is found, in the worst case the value is at the end
MyArrayList size time complexity of O(1), we just return the private variable inserted
MyArrayList sum time complexity of O(n) because we go through the total size of the array once
MyArrayList toString time complexity of O(n) because we go through the total size of the array once
MyArrayList equals time complexity of O(n) because we go through the total size of each array once, that's 2n
and we break out as soon as indices don't match

-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).
