git init

git remote add origin https://github.com/dylens/demoy.git
git clone https://github.com/dylens/demoy.git

git status
#add into/remove from index
git add/reset *
git commit -m""

git log [--stat]
git revert <commit> (撤销指定的版本，撤销也会作为一次提交进行保存)
    git revert HEAD (撤销前一次 commit)
    git revert HEAD^ (撤销前前一次 commit)


#discard changes in working directory
git checkout -- RD.md

git branch [develop]
git checkout -b develop
git branch -d develop

git merge develop

git pull origin master
git push origin master