# Lab Report 3 

## Researching Commands
*All examples will be taken from the ./technical directory as descriped in Lab 3. Assume that the working directory is in */technical/*

### The less command

`less` is a command that shows the file's contents, accessing it page by page if it is a longer amound of text. And instead of showing up on the command line like echo, it takes you to a separate page that you can `q` (quit) out of and return back to the command line without a big chunk of text.

*As seen here*
![Image](pics/less-non_option.png)

Generally, the syntax of the less command looks something like this:
```
less <file path>
```

For example, using `less biomed/rr74.txt` prints out the entire text in *rr74.txt*.



#### Alternate uses
With different flags (options/versions) of the less command, it would look more like this: `less [options] <file path>`. Each option gives different versions of the `less` command. 

Here's 4.


## -N
The -N option displays the line numbers alond with the contents in the file. 

**Example 1: Viewing a specific file** 
Input:
```
ls -N plos/pmed.0020212.txt
```
Output:
```
      1
      2
      3
      4
      5
      6         As a neurologist subspecializing in epilepsy at a respected academic institution, I (DH)
      7         assumed that I knew everything I needed to know about epilepsy and patients with epilepsy.
      8         I was wrong.
      9         In September of 1994, John Lester, my colleague in the Department of Neurology at
     10         Massachusetts General Hospital, showed me an online bulletin board for neurology patients
     11         that he had created [1]. In reading through the online messages, I observed hundreds of
     12         patients with neurological diseases sharing their experiences and discussing their problems
     13         with one another.
     14         I knew that many patients with chronic diseases had been making use of online medical
     15         information [2]. Nonetheless, I was shocked, fascinated, and more than a bit confused by
     16         what I saw. I'd been trained in the old medical school style: my instructors had insisted
```
**Example 1: Viewing files in a directory** 
Input:
```
ls -N biomed/*
```
Output:



# --chop-long-lines

