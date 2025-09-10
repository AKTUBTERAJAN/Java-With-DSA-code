# Java-With-DSA-code
In this  Repository are add to many Java Cade File
Git
======
Version control system is a tools that help to track changes in code.
git is a version control system.
it is popular .
free and open source
fast and scalable
===============
Track the history
colloborate
**********************************************************************************************

Github(github.com)
==================
website that allows developers to store and manage their code using git.
			https://github.com

************************************************************************************

configuring git
===================
 git config --global user.name "my name"
 git config --global user.email "rajankushwaha819@gmail.com"
 git config --list
 
 ********************************************************************************************************
 
 Clone & Status
 ===================
 Clone:- coloning a repository on our local machine
		git clone<-some link->
		
Status:- Displays the state of the code
		git status
***************		
untracked =>new files that git doesn't yet track
modified=> changed
staged=>file to ready to committed
unmodified=> unchande
********************************************
Add=> adds new or changed files in your working directory to the git staging area.
	
	git add <-file Name ->

commit=>it is the record of change
	
	git commit -m "some massage"
****************************************************
push command 
-----------------
push=> upload local repo content to remove repo
	
	git push origin main
	
***********************************************************
init command
------------
init=> use to create new git repo

1.git init
2.git remote add origin <-link->
3.git remote -v (to verify remote)
git branch (to check branch)
git branch -M main (to rename branch)
git push origin main 

****************************************
Branch Commands
------------------
1.git branch 					#(to check branch)
2.git branch -M main      		#(to rename branch)
3.git checkout <-branch name->	#(to navigate )
4.git checkout -b <-new branch name->	#(to create new branch)
5. git branch -d <-branch name->		#(to delete branch) 
******************************************************
Margine code
----------------
way1
---------
1.git diff <-branch name->            #(to compare commit,branchesh files and more )
2.git merge <-branch name ->			#(to marge 2 branches)

----------
way2
-----------
create a PR
******************************************************
pull Request
--------------
it let you tell otherabout changes you have pushed to a branch in a repository on Github. 
***********************************************************************************************
****************************************************************************************************
Github Insert program to write cammond
*********************************************************
1. ls (show the file and folder)
2. ls -Hidden(show all hidden file)
3. git status (to check status on dipository)

first modified and untracked file to add(then status is change to  staged) then commit(then status is change to unchange)
4. git add filename
or 
git add . (to add mayny file in one time)
example= git add index.html
5.git status (all file green ho )
6. git commit -m "some message "
7.git push origin main



