# How to log onto your 15L account!
For this course, you have a course-specific account which can allow you to connect to the CSE basement servers.
This tutorial will show you how to log into that account on *ieng6*

## Step 1 - Starting With Visual Studio Code
Visual Studio (VS) Code is a code editor but also a way for you to access your own terminal. This terminal is where you can run commands and access the CSE basement server later on. 

Open the [VS Code website](https://code.visualstudio.com/), and download and install. Use dropdown menu in the download button to find the correct version according to your operating system (e.g. Windows for PCs, macOS for Macs, etc.).

IMAGE HERE?

Once VS Code is installed, opening up VS Code should like like this.

IMAGE HERE.

NOTE: Adding this program to your taskbar or desktop will help accessing it in the future.


## Step 2 - Opening The Terminal

Once VS Code is open, go to the top left menu (you might have to open a 3-bar icon to see these options) and click Terminal. You want to select "New Terminal" and a new terminal should appear somewhere on the VS Code application.

IMAGE HERE. 

FOR WINDOWS USERS: 
    The Windows terminal doesn't automatically run bash, so if you don't already have it, you need to install [Git For Windows](https://gitforwindows.org/).
    Once you open the terminal, you need to open this drop downmenu and select "bash"
    
    IMAGE HERE
    
    Then, you can continue on as normal.

## Step 3 - Remotely Connecting
 
In the terminal, type in this command
> $ ssh cs15lsp23zz@ieng6.ucsd.edu
NOTE: You don't need to type in the dollar sign, but replace the zz with your the last 2 letters of your own course-specific username.

In return, you should see something like this pop up in the terminal. 

IMAGE HERE

Type in "yes" and you will see something like this:

IMAGE HERE

And you're connected!
