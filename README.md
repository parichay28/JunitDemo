# JunitDemo
1. Created a Maven Project.

2. Added Junit dependey in pom.xml file.

3. Created a test class named ConsecutiveTestLetters 

    * declared 3 arraylists inputWords, expectedWords and actualWords.
    * inputWords consists of 3 input words which are passed to ConsecutiveLetters class.
    * expectedWords stores the expected result.
    * actualWords stores the result returned by ConsecutiveLetters class.
4. Created class ConsecutiveLetters which contains the main logic to filter out words with consecutive letters

    * created a method getWords which recieves an argument of type ArrayList from TestConsecutiveLetters class.
    * getWords returntype is ArrayList.
