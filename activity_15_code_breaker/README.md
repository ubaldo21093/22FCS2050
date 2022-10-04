# Instructions

In this activity you will use the exhaustive search algorithm discussed in class to reveal the encoded message in “encrypted.txt.” You should use Cipher.decode static method to programmatically test different keys. The particular key used to encode the message consists of seven lowercase characters from a-z.  

Because of the way Cipher works, more than one key can actually be used to break the code and decipher the message. However, this assignment is NOT about guessing one of the keys but writing a code to test seven-letter keys and automatically decode the message in “encrypted.txt.” 

As your program tries different keys, decoded messages will have words that will not make sense because they were generated using the wrong key. There is a list of the 1,000 most common words in English (file “common.txt”) that your program should use to decide whether the decoded message is in plain English or not. For example, if the decoded message has more than a minimum percent of common words your program should decide to display the decoded message and quit the search. 

In CipherPlayground there is an example that illustrates how to use Cipher. However, you should write your solution in CipherMain. Your program should break the code, revealing the encoded message, the key used, and the number of keys tested. 