/*
 * Always put .ssh on user directory and .gitconfig file too 
 */
 
/* list all config variables */
git config --list 

/* Your Identity */
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com

/* clone */
git clone user@server:path/to/repo.git destination/path

/* remove a dir */
git rm -r path
git commit -am "message"

/* push */
git config --global push.default simple
git push
