#!/bin/bash
cd /home/ec2-user/app
docker build -t springboot-app .
docker run -d -p 8080:8080 --name springboot-app springboot-app
