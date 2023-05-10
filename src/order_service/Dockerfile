# Build

FROM golang:1.18-alpine AS build

ENV GO111MODULE=auto

WORKDIR /app

COPY go.mod go.sum ./

RUN go mod download

COPY . .

RUN go build -o main .


# Deploy

FROM alpine:3.8

COPY --from=build /app/main .

EXPOSE 9090

CMD ["./main"] 