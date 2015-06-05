--Se crea este archivo para tener todos los inserts para la BD. By Daro
--1) Corran los drops si es que ya tienen la bd creada
--1) Corran el Servidor en create and drop
--2) Copien y pegen estos inserts en la BD
--3) Cambien la configuracion del Servidor a validate
--Y ya tienen datos para trabajar con consultas hql

-----------
-- DROPS --
-----------
-- Para limpiar la bd si ya tenes tablas creadas e hiciste quilombo
drop table Empleado
go
drop table Empresa
go
drop table Empresa_Regular
go
drop table ItemRemito
go
drop table Movimiento
go
drop table Particular
go
drop table Remito
go
drop table Servicio
go
drop table SolicitudDeCargaConRetiro
go
drop table ViajeVehiculoContratado
go
drop table ViajeVehiculoPropio
go
drop table Carga
go
drop table CuentaCorriente
go
drop table Deposito
go
drop table Dimension
go
drop table Habilitado
go
drop table Proveedor
go
drop table SolicitudDeCarga
go
drop table Vehiculo
go
drop table Direccion
go
drop table Sucursal
go
drop table Costo
go
drop table hibernate_sequences
go





-----------
--INSERTS--
-----------

--Dimension
insert into Dimension (alto, ancho, peso, profundidad, volumen)
values (10, 4, 1500, 15, 3500)
go
insert into Dimension (alto, ancho, peso, profundidad, volumen)
values (8, 3, 750, 12, 1600)
go
insert into Dimension (alto, ancho, peso, profundidad, volumen)
values (11, 4, 1660, 14, 2000)
go
insert into Dimension (alto, ancho, peso, profundidad, volumen)
values (10, 4, 2100, 20, 4500)
go


--Deposito
insert into Deposito (nombreDeposito)
values ('Deposito techado 04')
go
insert into Deposito (nombreDeposito)
values ('Deposito grande - puerta 16')
go
insert into Deposito (nombreDeposito)
values ('Almacen general')
go
insert into Deposito (nombreDeposito)
values ('Alimentos perecederos')
go
insert into Deposito (nombreDeposito)
values ('Deposito Lacteos')
go
insert into Deposito (nombreDeposito)
values ('Fragiles')
go
insert into Deposito (nombreDeposito)
values ('Metales pesados')
go


--Cuenta Corriente
insert into CuentaCorriente (numero, saldo)
values (8, 14505000)
go
insert into CuentaCorriente (numero, saldo)
values (3, 150000)
go
insert into CuentaCorriente (numero, saldo)
values (17, 87000)
go
insert into CuentaCorriente (numero, saldo)
values (2, 40000)
go
insert into CuentaCorriente (numero, saldo)
values (5, 2580000)
go


--Movimiento
insert into Movimiento (concepto, estado, fecha, valor, idCuentaCorriente)
values ('Envio pedido 1500kg', 'Aprobado', '17/04/2013', -32000, 5)
go
insert into Movimiento (concepto, estado, fecha, valor, idCuentaCorriente)
values ('Recepcion pedido fragil', 'Aprobado', '08/03/2014', -800, 5)
go
insert into Movimiento (concepto, estado, fecha, valor, idCuentaCorriente)
values ('Envio pedido 300kg', 'Aprobado', '24/08/2014', -12000, 3)
go
insert into Movimiento (concepto, estado, fecha, valor, idCuentaCorriente)
values ('Envio pedido Refrigerado 40kg', 'Aprobado', '09/01/2012', -12000, 3)
go
insert into Movimiento (concepto, estado, fecha, valor, idCuentaCorriente)
values ('Pago de servicios', 'Aprobado', '01/08/2015', 150000, 5)
go


--Direccion
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Las Casas', 1450, 8, 'Capital Federal', 11, 'Argentina', 2, 'Buenos Aires')
go
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Moreti', 850, 32, 'San salvador de Jujuy', 49, 'Argentina', 8, 'Jujuy')
go
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Sarmiento', 448, 14, 'Resistencia', 21, 'Argentina', 1, 'Chaco')
go
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Paso', 850, 55, 'Rosario', 26, 'Argentina', 1, 'Santa Fe')
go


--Empresa
insert into Empresa (tipoDocumento, nroDocumento, razonSocial, idDireccion, condiciónIVA, idCliente)
values ('CUIT', '203890451995', 'Transportes Juan S.A', 1, 'Inscripto', 1)
go
insert into Empresa (tipoDocumento, nroDocumento, razonSocial, idDireccion, condiciónIVA, idCliente)
values ('CUIT', '185221369339', 'Envio Express SRL', 2, 'Monotributo', 2)
go


--Empresa Regular
insert into Empresa_Regular (tipoDocumento, nroDocumento, razonSocial, idDireccion, condiciónIVA, idCliente, idCuentaCorriente, montoAutorizacion, modoPago)
values ('CUIT', '203890451995', 'El transportista S.A', 3, 'Inscripto', 3, 1, 50000, 'Efectivo')
go


--Particular
insert into Particular (nombre, apellido, idCliente, idDireccion, tipoDocumento, nroDocumento)
values ('Dario', 'Nieto', 4, 4, 'DNI', '34108511')
go


--Sucursal
insert into Sucursal (nombreSucursal, nroSucursal)
values ('La pastorera', 6)
go
insert into Sucursal (nombreSucursal, nroSucursal)
values ('Metropolitana', 3)
go
insert into Sucursal (nombreSucursal, nroSucursal)
values ('Nueva era', 2)
go
insert into Sucursal (nombreSucursal, nroSucursal)
values ('Postales', 18)
go
insert into Sucursal (nombreSucursal, nroSucursal)
values ('Holana', 22)
go
insert into Sucursal (nombreSucursal, nroSucursal)
values ('Ravilo', 117)
go




