git init

git remote add origin https://github.com/dylens/demoy.git
git clone https://github.com/dylens/demoy.git

git status
#add into/remove from index
git add/reset *
git commit -m""

git log [--stat]
git revert <commit> (����ָ���İ汾������Ҳ����Ϊһ���ύ���б���)
    git revert HEAD (����ǰһ�� commit)
    git revert HEAD^ (����ǰǰһ�� commit)


#discard changes in working directory
git checkout -- RD.md

git branch [develop]
git checkout -b develop
git branch -d develop

git merge develop

git pull origin master
git push origin master