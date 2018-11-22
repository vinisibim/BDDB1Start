SET SQL_SAFE_UPDATES = 0;

select * from cidade



delete from cidade where id =29

insert into cidade (nome) values ('Chapecó',32),('Blumenal',32),('Joinvile',32),


insert into cidade (nome, Uf_id) values ('Curitiba',24),('Maringá',24),('Lunardeli',24),('Apucarana',24),('Santa Fé',24),('São Miguel do Iguaçu',24),
('Arapongas',24),('Ponta Grossa',24),('Jandaia do Sul',24)


insert into cidade (nome, Uf_id) values ('Ribeirão Preto',33), ('São Paulo',33), ('Matinhos',33)

update cidade set nome = 'Jandaia' where id = 28


/* Organiza as cidades por ordem alfabética*/
SELECT * FROM cidade
INNER JOIN UF ON uf.id = cidade.uf_id
ORDER BY cidade.nome

/* Conta quantas cidades tem em casa estado*/
SELECT uf_id, COUNT(id) AS 'Quantidade de cidades nos estados'
FROM cidade 
GROUP BY uf_id


