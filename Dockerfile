FROM ubuntu:latest
LABEL authors="jumin"

ENTRYPOINT ["top", "-b"]