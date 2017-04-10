# Storage solutions

## Primeira opção
- Banco de dados NoSQL, chave valor,
- Exemplo: Redis
- Alta performace para consulta
- Facil suporte a cluster
- Não garantes os dados com ACID, uma alternativa seria usar o Infinispan

## Segunda opção
- Banco de dados NoSQL, Documento,
- Exemplo: MongoDb
- Facil suporte a cluster
- Recomendado utilizar quando o modelo de dados se adequa a proposta de banco orientado a Documentos

## Terceira opção
- Banco de dados SQL, Relacional,
- Exemplo: MySQL, PostgreSQL
- Suporte a cluster
- Grande suporte ACID
- Recomendado utilizar quando o modelo de dados se adequa a proposta de banco de dados relacional,


*As opções podem ser combinadas entre si para o melhor aproveitamento onde cada uma tem um resultado melhor*