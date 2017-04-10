# Solution

- Desenvolver arquitetura de microserviços baseada no modelo do Spring Cloud
- Docker para subir os container do Spring Boot stateless
- Eureka para fazer o service discovery
- Hystrix para tolerancia a falhas que implementa o pattern Circuit Breaker ao desenvolver a camada de serviço de API
- Zuul para montar o roteador, proxy para as apis
- Entre as camadas de roteador e serviços das APIs teremos o load Balancer de cliente Ribbon 

*Cliente Web/Mobile*
- Acessa
*Um ou mais container de roteador com Zuul que vai encaminhar/filtrar as chamadas para a camada de serviços*
- Encaminha a requisição para as APIs na camada de serviço
*Um ou mais container com os serviços das APIs*



