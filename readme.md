Install docker
install kubectl

Start Docker desktop

minikube start
minikube status

minikube docker-env
eval $(minikube -p minikube docker-env)

If Docker Hub used:
**************************
##Build in locally, tag to docker hub and then push to docker hub:
docker build -t plan-order-service:latest .
docker images
docker tag plan-order-service:latest harsen/plan-order-service:latest .
docker push harsen/plan-order-service:latest

##Build in docker hub directly and then just push:
docker build -t harsen/plan-order-service:latest .
docker push harsen/plan-order-service:latest

##pull images from docker hub:
docker pull harsen/plan-stock-service:latest
kubectl get events --sort-by='.lastTimestamp'


##plan-order-service:
kubectl apply -f postgres-pvc.yaml
kubectl apply -f postgres-service.yaml
kubectl apply -f postgres-deployment.yaml
kubectl apply -f plan-order-service-deployment.yaml
kubectl apply -f plan-order-service-service.yaml

##plan-stock-service:
kubectl apply -f postgres-pvc.yaml
kubectl apply -f postgres-service.yaml
kubectl apply -f postgres-deployment.yaml
kubectl apply -f plan-stock-service-deployment.yaml
kubectl apply -f plan-stock-service-service.yaml


NOTE: Here both services using postgres 


$ kubectl get pods
NAME                                     READY   STATUS    RESTARTS   AGE
plan-order-service-v1-6876487474-xz7jd   1/1     Running   0          45m
plan-stock-service-v1-6b9c98c484-4c58v   1/1     Running   0          21m
postgres-77f8bdf45-qlshd                 1/1     Running   0          47m


kubectl get deployments
kubectl get service
kubectl get svc
kubectl logs plan-order-service-v1-6876487474-xz7jd
kubectl describe svc plan-order-service
minikube service kubectl describe svc plan-order-service
minikube ip
minikube dashboard



If Docker used:




…or create a new repository on the command line
echo "# springboot-kafka-postgres" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/harishmsgit/springboot-kafka-postgres.git
git push -u origin main

…or push an existing repository from the command line
git remote add origin https://github.com/harishmsgit/springboot-kafka-postgres.git
git branch -M main
git push -u origin main
