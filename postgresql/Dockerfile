# Use a imagem oficial do PostgreSQL
FROM postgres:latest


# Copie o arquivo de inicialização do banco de dados para o diretório de scripts de inicialização
COPY ./schema.sql /docker-entrypoint-initdb.d/
# Defina o ID do usuário do PostgreSQL para corresponder ao ID do usuário no host
# Isso permite que o PostgreSQL tenha permissões adequadas no diretório do volume
ARG PGID=999
RUN usermod -u $PGID postgres && chown -R postgres:postgres /var/lib/postgresql/data
# Expose the PostgreSQL port
EXPOSE 5432
