
===========================================
Deployment
===========================================

You have to change the tag version of the docker Image before push the code in the following files related to that specific service

deployment.yaml ex- $DOCKER_USER/$CART_REPO_NAME:v1.0.1 => $DOCKER_USER/$CART_REPO_NAME:v1.0.2
relevant-service.yaml file for specific service in release folder ex- $DOCKER_USER/$CART_REPO_NAME:v1.0.1 => $DOCKER_USER/$CART_REPO_NAME:v1.0.2

========================================================
To Get Azure Credentials For Azure Kubenetes Cluster
========================================================
Reffer following documentation 
https://github.com/Azure/login
https://medium.com/ascentic-technology/github-action-deploy-applications-to-aks-7598668f8ee1

========================================================
About Image Tag 
========================================================
https://kubernetes.io/docs/concepts/containers/images/
