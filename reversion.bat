git config --global user.email "fte@foxmail.com"
git config --global user.name "softe"
git checkout --orphan latest_branch
git add -A
git commit -am "清除所有历史版本以减少仓库大小"
git branch -D master
git branch -m master
git push -f origin master
pause