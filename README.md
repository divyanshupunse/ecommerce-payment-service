# E-Commerce Payment Service

## Overview
`ecommerce-payment-service` is a microservice responsible for handling payment-related operations in the E-Commerce Microservices Application.

It processes payments for orders, updates payment status, and communicates with Order Service.  
This service registers itself with Eureka Server and can be called by other services via REST or Feign Client.

---

## Features

- Initiate new payments
- Update payment status (PENDING, SUCCESS, FAILED)
- Retrieve payment details by ID
- Communicate with Order Service for payment confirmation
- Service discovery with Eureka
- Inter-service communication using Feign Client or REST APIs

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL 
- Eureka Client
- REST APIs