# Build

FROM golang:1.18-alpine AS build

ENV GO111MODULE=auto

WORKDIR /app

COPY go.mod go.sum ./

RUN go mod download

COPY . .

RUN go build -o email_service .


# Deploy

FROM alpine:3.8

COPY --from=build /app/email_service .

EXPOSE 9040

CMD ["./email_service"] 