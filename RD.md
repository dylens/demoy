git init

git remote add origin https://github.com/dylens/demoy.git
git clone https://github.com/dylens/demoy.git

git status
#add into/remove from index
git add/reset *
    git reset --soft <commit> (如果进行了新的commit，想要reset掉指定版本的commit)

git commit -m""
    git commit --amend (对上一次的提交做修改)

git log [--stat]
git revert <commit> (撤销指定的版本，撤销也会作为一次提交进行保存)
    git revert HEAD (撤销前一次 commit)
    git revert HEAD^ (撤销前前一次 commit)

#discard changes in working directory
git checkout -- RD.md (丢弃index中的修改)
    git checkout -b develop (创建并切换到develop分支)

git branch [develop]
    git branch -d develop (删除本地develop分支)

git merge develop

git pull origin master
git push origin master
    git push origin --delete <branchName> (删除远程分支) / git push origin :<branchName> (推送空分支也相当于删除远程分支)
    git push origin --delete tag <tagName> (删除远程tag) / git tag -d <tagName>

gitk (查看所有提交的明细)


git diff HEAD^ 查看上一个版本与此版本的差别（HEAD表示当前最新提交的版本）
git diff HEAD^^ -- <file path> 查看上两个版本的指定文件与此版本的差别
    git diff HEAD~2 -- <file path>


添加远端repo
git remote add upstream git://github.com/pjhyett/github-services.git

IDEA git快捷键：
    ctrl+t pull
    ctrl+k commit
    ctrl+shift+k push