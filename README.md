git clone:
master:
git clone git@github.com:surendrapaluri/API_Automation.git folder_name

branch:
git clone -b [branch_name] git@github.com:surendrapaluri/API_Automation.git folder_name

git merge 
go to master in local
git merge origin/[branch_name]


once branch code is changed and commited...go to master in local...then git pull origin <branch_name>
git pull
git push



Flow

if modified, deleted, added files

git add -u :/
git add .
git commit -a -m "Message"
git pull   //to update local repo with latest updates
git push


if a modified file need not be committed then:

git reset src/sdsd/sdsd/sd.java
