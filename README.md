GitHub
Modeling GitHub using TDD to the following specification.

MVP

Commit
Has these properties:

description
uniqueId


Repository
Has these properties:

name
description
repositoryType (private, public)
commits

A Repository has collection of commits
commits could be an ArrayList
We should be able to get a commit by its uniqueId



GitHubAccount
Has these properties:

username
name
repositories
accountType (free, pro)

GitHubAccounts contain a collection of repositories that can be added to.
GitHubAccounts always start free, but we should be able to upgrade / downgrade.
We should have the ability to add repositories.
We should be able to get a repository by name.
