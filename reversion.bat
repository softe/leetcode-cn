git config --global user.email "fte@foxmail.com"
git config --global user.name "softe"
git checkout --orphan latest_branch
git add -A
git commit -am "���������ʷ�汾�Լ��ٲֿ��С"
git branch -D master
git branch -m master
git push -f origin master
pause