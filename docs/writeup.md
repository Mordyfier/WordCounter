Marcin Tomala

CISC. 3130

Prof. Chuang

11 December 2019

##### Assignment 4 Write-up

The data structure I’ve used to calculate word frequencies was the HashMap. It seems to be a natural choice, 
due to its <Key, Value> nature, allowing to store each word and its frequency seamlessly. Additionally, 
the containsKey() and put() methods (used to, respectively, increment the count for words already present in 
the map and to place new words in the map) are both done in O(1), offering superb efficiency. The only drawback 
of the HashMap is the fact that sorting by value requires a little more effort than in the case of Arrays and 
other linear data structures. This would be an opportunity to utilize the TreeMap, but unfortunately TreeMap 
only sorts by Keys, not Values, and therefore - since we’re dealing with song lyrics which are bound to have 
multiple words with the same count of occurrences – it’s inadequate for our needs.

I initially intended to utilize a word cloud visualization, but I was unable to get the word scaling to work 
properly and thus I resorted to using a vertical bar chart. After implementing and producing the chart 
I’m happy with that choice, as I think it provides a very good view of the data.

If I had more time to work on the project I would most likely:
-	Try to get the word cloud visualization to work, mostly as a point of pride.
-	Get better acquainted with JavaScript to the point of perhaps implementing an input box on the website for accepting other lyrics and producing similar visualizations of the data.
-	Improve on the admittedly bare-bones presentation of the webpage.

I picked “All You Need is Love” by The Beatles mostly because I thought its data chart would be more aesthetically pleasing. Since there are a few words repeated many times throughout the song, there would be more variance compared to a song that is comprised of many unique stanzas. Overall, I wasn’t very surprised by the data, as I expected ‘all’, ‘you’, ‘need’, ‘is’, and ‘love’ to firmly occupy the upper end of the scale. 

According to Wikipedia, the song was indeed at the top of Billboard Hot 100 for a week after its release in July 1967. 
I couldn’t find any revenue data for this song, but evaluating the value of each word would be relatively simple. A counter could be implemented in the method that places each word of the text file into the HashMap, incrementing each time a word is read by the Scanner, providing the total number of words in the song. Then, for each word in the HashMap, the price of each word would be 
```
double wordRatio = count / numberOfAllWords;
wordValue = wordRatio * totalSales;
```
