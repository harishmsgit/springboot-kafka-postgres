# Spring Boot + Kafka + Postgres + Kubernetes Setup Guide

## Prerequisites

- Install [Docker](https://www.docker.com/get-started)
- Install [kubectl](https://kubernetes.io/docs/tasks/tools/)
- Start Docker Desktop

## Minikube Setup

```sh
minikube start
minikube status
```

To use Docker inside Minikube:

```sh
minikube docker-env
eval $(minikube -p minikube docker-env)
```

---

## Working with Docker Hub

### Build Locally, Tag, and Push to Docker Hub

```sh
docker build -t plan-order-service:latest .
docker images
docker tag plan-order-service:latest harsen/plan-order-service:latest
docker push harsen/plan-order-service:latest
```

### Build and Push Directly to Docker Hub

```sh
docker build -t harsen/plan-order-service:latest .
docker push harsen/plan-order-service:latest
```

### Pull Images from Docker Hub

```sh
docker pull harsen/plan-stock-service:latest
```

---

## Kubernetes Deployment

### Common Commands

```sh
kubectl get events --sort-by='.lastTimestamp'
kubectl get pods
kubectl get deployments
kubectl get service
kubectl get svc
kubectl logs <pod-name>
kubectl describe svc <service-name>
minikube service <service-name>
minikube ip
minikube dashboard
```

### Deploy plan-order-service

```sh
kubectl apply -f postgres-pvc.yaml
kubectl apply -f postgres-service.yaml
kubectl apply -f postgres-deployment.yaml
kubectl apply -f plan-order-service-deployment.yaml
kubectl apply -f plan-order-service-service.yaml
```

### Deploy plan-stock-service

```sh
kubectl apply -f postgres-pvc.yaml
kubectl apply -f postgres-service.yaml
kubectl apply -f postgres-deployment.yaml
kubectl apply -f plan-stock-service-deployment.yaml
kubectl apply -f plan-stock-service-service.yaml
```

> **Note:** Both services use Postgres.

---

## Example Output

```text
$ kubectl get pods
NAME                                     READY   STATUS    RESTARTS   AGE
plan-order-service-v1-6876487474-xz7jd   1/1     Running   0          45m
plan-stock-service-v1-6b9c98c484-4c58v   1/1     Running   0          21m
postgres-77f8bdf45-qlshd                 1/1     Running   0          47m
```

---

## Git Setup

### Create a New Repository

```sh
echo "# springboot-kafka-postgres" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/harishmsgit/springboot-kafka-postgres.git
git push -u origin main
```

### Push an Existing Repository

```sh
git remote add origin https://github.com/harishmsgit/springboot-kafka-postgres.git
git branch -M main
git push -u origin main
```

---
