git init

git remote add origin https://github.com/dylens/demoy.git
git clone https://github.com/dylens/demoy.git

git status
#add into/remove from index
git add/reset *
    git reset --soft <commit> (����������µ�commit����Ҫreset��ָ���汾��commit)

git commit -m""
    git commit --amend (����һ�ε��ύ���޸�)

git log [--stat]
git revert <commit> (����ָ���İ汾������Ҳ����Ϊһ���ύ���б���)
    git revert HEAD (����ǰһ�� commit)
    git revert HEAD^ (����ǰǰһ�� commit)


#discard changes in working directory
git checkout -- RD.md (����index�е��޸�)
    git checkout -b develop (�������л���develop��֧)

git branch [develop]
    git branch -d develop (ɾ������develop��֧)

git merge develop

git pull origin master
git push origin master
    git push origin --delete <branchName> (ɾ��Զ�̷�֧) / git push origin :<branchName> (���Ϳշ�֧Ҳ�൱��ɾ��Զ�̷�֧)
    git push origin --delete tag <tagName> (ɾ��Զ��tag) / git tag -d <tagName>

gitk (�鿴�����ύ����ϸ)

IDEA git��ݼ���
    ctrl+t pull
    ctrl+k commit
    ctrl+shift+k push