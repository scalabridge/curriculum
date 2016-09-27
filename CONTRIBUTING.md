# How to contribute

Contributions to ScalaBridge are welcomed and encouraged. Without input from volunteers we would have nothing. By participating in this project you agree to abide by the [Bridge Foundry](http://bridgefoundry.org/) [code of conduct](http://bridgefoundry.org/code-of-conduct/).

You can contribute to ScalaBridge by either:

1. Creating an `issue` to suggest an enhancement, identify a 'bug', or make another request, or
2. Creating a `pull request` to submit revisions to existing content or create new content.  

## Getting Started
* To creating `issues` or making `pull requests` you need a [GitHub account](https://github.com).
* To create `pull requests` follow *Setup* and *Pull Request Work Flow* instructions under the **Making Pull Request** section below.

## Creating an Issue
Creating an issue requires no technical expertise, just go [here](https://github.com/scalabridge/curriculum/issues/new), type a title and description for your issue and click `Submit new issue` when you are finished. A [Github help](https://help.github.com/articles/creating-an-issue/) page is also available.

## Making Pull Requests

### Setup


1. You need a [GitHub account](https://github.com)
2. [Install](https://help.github.com/articles/set-up-git/#platform-all) `git` on your computer.
3. **`Fork`** the scalabridge/curriculum repository:
	1. On GitHub, navigate to the [scalabridge/curriculum](https://github.com/scalabridge/curriculum) repository.
	2. In the top-right corner of the page click **Fork**.
3. **Create a local `clone`** of your fork to put the repository on your local computer:
	1. On GitHub, navigate to **your fork** of the scalabridge/curriculum repository.
	2. Under your repository name, to the right, click **Clone or download**.
	3. In the **Clone with HTTPs** section, click the "Copy to clipboard" icon to copy the clone URL for the repository.
	4. On Linux or Mac, open a `terminal`, on Windows open `Git Bash`. From the prompt, if needed, change the working directory to be the one in which you want the repository files created.
	5. Type `git clone `, and then paste the URL you copied in step 3 above. The command line should look like this, with your GitHub username instead of YOUR-USERNAME:
	```bash
	$ git clone https://github.com/YOUR-USERNAME/curriculum.git

	Press `Enter` and git will create your local clone
    ```

5. Add the scalabridge repository as a remote to facilitate synchronizing with it before making changes:
	1. On GitHub, navigate to the scalabridge/curriculum repository.
	2. Under the repository name, to the right, click **Clone or download**.
	3. In the **Clone with HTTPs** section, click the "Copy to clipboard" icon to copy the clone URL for the repository.
	4. On Linux or Mac, open a `terminal`, on Windows open `Git Bash`. From the prompt, if needed, change the working directory to the location of your local repository.
	5. Type `git remote add upstream `, and then paste the URL you copied in step 3 above. The command line should look like this:
	```Bash
	$ git remote add upstream https://github.com/scalabridge/curriculum.git

	Press `Enter` and git will create your local clone
    ```
6. Verify your remote repositories by entering `git remote -v`. You should see the URL for your fork as `origin`, and the URL for the scalabridge repository as `upstream`:
```bash
$ git remote -v
origin  https://github.com/YOUR-USERNAME/curriculum.git (fetch)
origin  https://github.com/YOUR-USERNAME/curriculum.git (push)
upstream        https://github.com/scalabridge/curriculum.git (fetch)
upstream        https://github.com/scalabridge/curriculum.git (push)
```



### Pull Request Work Flow
1. **[Syncing your fork](https://help.github.com/articles/syncing-a-fork/):** Start with your local and forked repository being up-to-date with scalabridge/master:
	1. Open terminal or Git Bash and change working directory to your local repository
	2. Fetch the branches and their respective commits from the upstream repository. Commits to `master` will be stored in a local branch, `upstream/master`. 
	3. Then merge the changes from `upstream/master` into your local `master` branch. 
	4. Finally, update your forked repository on GitHub by pushing the changes to `origin`:
	```bash
	$ git fetch upstream  # Fetch the branches and their respective commits
	From https://github.com/scalabridge/curriculum
	 * [new branch]      master     -> upstream/master
	# merge upstream/master into local master
	$ git checkout master
	$ git merge upstream/master
	# push changes to your forked repository
	$ git push origin
	```
2. **Create a topic branch** on your local repository.
	1. From the repository directory
	2. `git checkout master` to make master the base
	3. `git checkout -b TOPIC-NAME`, where TOPIC-NAME is an appropriate name for branch, e.g "contributing" 
3. **Make your changes**: hack, hack, edit, hack, edit, ...
4. **Add and commit** changes to your topic branch. Refer to the [Git Documentation](https://git-scm.com/docs) for details on [`add`](https://git-scm.com/docs/git-add) and [`commit`](https://git-scm.com/docs/git-add) usage:
	1. Use the `git add` command to add content to the index that defines the snapshot that will be committed,
	2. Use the `git commit` command to commit the index to the current working branch, or
	3. Use `git commit -a` to add and commit all changes.
	```bash
	$ git add *                # adds all changes to index
    $ git add CONTRIBUTING.md  # add single file to index
	$ git commit -a            # adds all changes and commits
	$ git commit -m "<commit message line here>"
	```
5. **Push your changes** to your forked repository. The first time you push your branch use the `git push -u` command as shown below. Subsequent pushes after further edits can just use `git push origin` (assumes you are working in branch on local repository).
	
	```bash
	# initial push of topic branch
	$ git push -u origin your-topic-branch  # origin is your forked repository
	# pushes of topic branch after further edits and commits
	$ git push origin                       # origin is your forked repository
	```
6. **Review your change** as it appears on your fork of the scalabridge/curriculum repository. **Make any additional corrections** as needed by repeating steps 3-5 above.
7. When editing is complete if you have multiple commits on your feature branch, **squash the commits** to a single commit. Use [`git cherry -v master`](http://stackoverflow.com/questions/14848274/git-log-to-get-commits-only-for-a-specific-branch) to see the number of commits on the working branch. Use [`git rebase -i HEAD~#`](http://stackoverflow.com/questions/5189560/squash-my-last-x-commits-together-using-git), where `#` is the number of commits found using the cherry command.
	
	```bash
	$ git cherry -v master
	+ 124007c1505f46e7f34d70a94b9ba291925ad774 creation of CONTRIBUTING.md file
	+ c99d5217b597f795971629f32a737f4f91026a4a more edits to CONTRIBUTING.md
	$ git rebase -i HEAD~2
	
	# use the interactive editor to squash the commits into just a single commit
	``` 
8. [**Make your pull request**](https://help.github.com/articles/creating-a-pull-request-from-a-fork/)
	1. Go to your forked repository on GitHub
  	2. To the right of the Branch menu, click **New pull request**.
  	3. On the Compare page, click **compare across forks**.
  	4. Confirm that the *base fork* is the repository you'd like to merge changes into. Use the *base branch* drop-down menu to select the branch of the upstream repository you'd like to merge changes into.
  	5. Use the *head fork* drop-down menu to select your fork, then use the *compare branch* drop-down menu to select the branch you made your changes in.
  	6. Type a title and description for your pull request. 
  	7. If you would like to allow anyone with push access to the upstream repository to make changes to your PR, then select Allow edits from maintainers.
  	8. Click **Create pull request**.






