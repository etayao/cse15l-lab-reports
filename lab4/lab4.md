# Lab Report 4

--> skipping steps 1 - 4 (setting up github and starting timer)

*At this point, the repo link of my fork is in my clipboard from copying the url with (<ctrl> + <c>)*



*--> Anytime you see <...> with these angle brackets, this means the text inside will refer to certain keys that are pressed*
### Step 4 - Logging into ieng6
**What I typed:**

Opening terminal: ``<ctrl><`>``

Logging in with ssh: (in terminal) `ssh cs15lsp23ld@ieng6.ucsd.edu<enter>`

Since I've already authenticated my laptop in lab7, I don't need to type in a password.
![Image](pics/ssh.png)

### Step 5 - Cloning our fork
**What I typed:**

Cloning fork: (in terminal) `git clone <ctrl><c><enter>`

This uses the `git clone` command to copy the fork into your directory. [This](https://github.com/ucsd-cse15l-s23/lab7) is the link in my clipboard that is cloned.


![Image](pics/git-clone.png)



### Step 6 - Demonstrating failure
**What I typed:**

Changing into lab7 directory: (in terminal) `ls l<tab><enter>`

Running test file: (in terminal) `bash t<tab><enter>`

In order to demonstrate failure, I have to run the test bash file that contains the compile and run Java commands (`javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java` and `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests`)
![Image](pics/failure.png)

### Step 7 - Editing the code
**What I typed:**

Open vim: (in terminal) `vim Li<tab>.java<enter>`

Editing the code: (in vim) `<left arrow><escape><:><q><shift><!>`

To edit my code and make the tests run sucessfully, I need to use vim. 

### Step 8 - Running sucessful tests
**What I typed:**

### Step 9 - Committing and pushing changes to Github
**What I typed:**
