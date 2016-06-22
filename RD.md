git init

git remote add origin https://github.com/dylens/demoy.git
git clone https://github.com/dylens/demoy.git

git status
#add into/remove from index
git add/reset [-p][-e] *

#discard changes in working directory
git checkout -- RD.md

git branch [develop]
git checkout -b develop
git branch -d develop

git merge develop

git pull origin master
git push origin master