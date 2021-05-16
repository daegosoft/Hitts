CREATE TABLE usuarios(
    idUsuario bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombreUsuario varchar(30) not null,
    password varchar(25) not null
);

CREATE TABLE clientes(
    idCliente bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombreCliente VARCHAR(50) NOT NULL,
    documento numeric,
    tipo VARCHAR(2)
);

CREATE TABLE precio(
    idPrecio bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    valor decimal not null
);

CREATE TABLE productos(
    idProducto bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nombreProducto varchar(50) not null,
    idPrecio bigint references precio(idPrecio)
);

CREATE TABLE ventas (
    idVenta bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    idCliente bigint references clientes(idCliente),
    valorTotal decimal,
    fecha date
);

CREATE TABLE ventaDetalle(
    idVentaDetalle bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    idVenta bigint references ventas(idVenta),
    idProducto bigint references productos(idProducto),
    idPrecio bigint references precio(idPrecio),
    cantidad int,
    valorTotal decimal
);