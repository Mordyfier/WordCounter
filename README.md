# WordCounter
CISC. 3130 - Data Structures Assignment
 
## The Problem
This application was made to easily evaluate number of occurences
of each word in a text file and produce visualisation of the dataset
using open source libraries.

## Solution
The program (WordCounter.java) accepts the text file and places its contents
into a HashMap in which each word (stripped of any punctuation and set to
lower case) is grouped with its occurence count.

A HashMap is perfect for this purpose, because of its <Key, Value> structure
and great efficiency with put() and contains() methods' O(1) complexity.

After the input file is processed, the program then sorts the HashMap and 
produces an output text file with the words and their respective values 
grouped as follows, in order of frequency:

```
100: Word1
75: Word2
50: Word3
```
...and so on.
The contents of the output file are also printed to the console, showing the
user a preview of the dataset without having to open the .txt file.

The output file is then accepted by the visualisation class Cloud.java which
produces a wordcloud (output.png) of the words based on their appearance frequency.

## Usage
The code can be downloaded and compiled using any IDE or command line
(On Windows: press Windows Key + R for the Run window, type in 'cmd' to bring
up the command prompt) typing in:

```
javac WordCounter.java
javac Cloud.java
```

The classes compiled thus may be ran without an argument (to use the sample
text file provided):
```
java WordCounter
```
or, if the user wishes to provide the application with their own file:
```
java WordCounter <filename>.txt
```

The WordCounter class will then produce an output file "dataSet.txt" in the 
directory which will then be used by Cloud.class (ran as above, replacing
"WordCounter" with "Cloud"). The Cloud class will produce a .png file with
the dataset visualised in a wordcloud.

The code can also be compiled using 
```
mvn clean compile assembly:single
```
provided Maven is present.

## Credits
- The Beatles, as the lyrics used in the sample file come from their song
"All You Need is Love"
- For the purpose of visualisation, the [Kumo](https://github.com/kennycason/kumo)
open source Maven library was used.
