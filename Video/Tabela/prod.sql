create database prod;
use prod;

create table categoria(
	id_cat int(11) not null auto_increment,
    nome_categoria varchar(30) not null,
    primary key (id_cat)
);

create table produtos(
	id_prod int(11) not null auto_increment,
    nome_produto varchar(100) not null,
    valor double not null,
    id_cat integer not null,
    primary key (id_prod),
    foreign key (id_cat) references categoria (id_cat)
);

insert into categoria (nome_categoria) values
('Computadores'),
('Ferramentas'),
('Limpeza'),
('Vestimenta');

insert into produtos (nome_produto, valor, id_cat) values
('notebook acer', 2500, 1),
('notebook asus', 3000, 1),
('notebook lenovo', 2700, 1),
('Conjunto ferramentas', 110, 2),
('Chave de fenda', 12, 2),
('Palha de aço', 1.5, 3),
('Esponja', 1, 3),
('Camiseta', 20, 4),
('Calça', 30, 4);


