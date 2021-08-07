# Little-Search-Engine

**This was the third project assigned in Rutgers 01:198:112 (Data Structures).

For this assignment, I implemented a simple search engine for text documents using hash tables. This search engine does two things: (a) gather and index keywords that appear in a set of plain text documents, and (b) search for user-input keywords against the index and return a list of matching documents in which these keywords occur.

I implemented the following methods in the LittleSearchEngine class:
- getKeyword: Given an input word read from a document, it checks if the word is a keyword, and returns the keyword equivalent if it is.
- loadKeywordsFromDocument: Creates a hash table for all keywords in a single given document.
- insertLastOccurrence: Inserts the last occurrence in the parameter list in the correct position in the list, based on ordering occurrences on descending frequencies. The elements 0..n-2 in the list are already in the correct order. Insertion is done by first finding the correct spot using binary search, then inserting at that spot.
- mergeKeywords: Merges the keywords loaded from a single document (in method loadKeywordsFromDocument) into the global keywordsIndex hash table.
- top5Search: Computes the search result for the input "kw1 OR kw2", using the keywordsIndex hash table. The result is a list of names of documents (same as name of the text file for that document), limited to the top 5 in which either of the words "kw1" or "kw2" occurs, arranged in descending order of frequencies.
