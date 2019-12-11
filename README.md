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

The output file is then accepted by the visualisation class Bars.java which
produces a html file with the JavaScript code for the Plot.ly bar chart.

## Usage
While the WordCounter class does not utilize Maven libraries(and therefore can be compiled standalone), 
the Kumo wordcloud visualisation library is used in Cloud.java, requiring a [Maven installation](https://maven.apache.org/install.html). 
The code can be then compiled using command line
(On Windows: press Windows Key + R for the Run window, type in 'cmd' to bring
up the command prompt) typing in (while in root directory of the code):

```
mvn clean compile assembly:single
```

The classes compiled thus may be ran without an argument (and use the sample
text file provided):
```
java WordCounter
```
or, if the user wishes to provide the application with their own file:
```
java WordCounter <filename>.txt
```

The WordCounter class will then produce two output files in the directory: 
- "dataSet.txt", which will then be used by Cloud.class (ran as above, replacing
"WordCounter" with "Cloud"). The Cloud class will produce a .png file with
the dataset visualised in a wordcloud. 
- "dataSet.csv", which will be used by Bars.class to produce a data chart (as JavaScript code embedded in a .html webpage)




## Credits
- The Beatles, as the lyrics used in the sample file come from their song
["All You Need is Love"](https://www.youtube.com/watch?v=_7xMfIp-irg)
- For the purpose of visualisation, the [Kumo](https://github.com/kennycason/kumo)
open source Maven library was used for wordcloud, and [Tablesaw](https://github.com/jtablesaw/tablesaw) (and, by extension, [Plot.ly](https://github.com/plotly)) for bar chart.
