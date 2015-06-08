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
drop table ItemRemito
go
drop table Movimiento
go
drop table Remito
go
drop table Carga
go
drop table Deposito
go
drop table Dimension
go
drop table Habilitado
go
drop table SolicitudDeCarga
go
drop table Costo
go
drop table hibernate_sequences
go
drop table Servicio
go
drop table Cliente
go
drop table Viaje
go
drop table CuentaCorriente
go
drop table Vehiculo
go
drop table Sucursal
go
drop table Proveedor
go
drop table Direccion
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
--1
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Las Casas', 1450, 8, 'Capital Federal', 1100, 'Argentina', 2, 'Buenos Aires')
go
--2
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Moreti', 850, 32, 'San salvador de Jujuy', 490, 'Argentina', 8, 'Jujuy')
go
--3
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Sarmiento', 448, 14, 'Resistencia', 2130, 'Argentina', 1, 'Chaco')
go
--4
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Paso', 850, 55, 'Rosario', 2660, 'Argentina', 1, 'Santa Fe')
go
--5
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Rosas', 1478, 9, 'La Plata', 440, 'Argentina', 3, 'Buenos Aires')
go
--6
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('San juan', 1585, 65, 'Capital Federal', 2667, 'Argentina', 1, 'Buenos Aires')
go
--7
insert into Direccion (calle, codigoPostal, departamento, localidad, numero, pais, piso, provincia)
values ('Bolivar', 1456, 12, 'Capital Federal', 1358, 'Argentina', 1, 'Buenos Aires')
go


--Empresa
--Empresa no va mas, hereda de Cliente
/*insert into Empresa (tipoDocumento, nroDocumento, razonSocial, idDireccion, condiciónIVA, idCliente)
values ('CUIT', '203890451995', 'Transportes Juan S.A', 1, 'Inscripto', 1)
go
insert into Empresa (tipoDocumento, nroDocumento, razonSocial, idDireccion, condiciónIVA, idCliente)
values ('CUIT', '185221369339', 'Envio Express SRL', 2, 'Monotributo', 2)
go*/


--Empresa Regular
--Empresa Regular no va mas, hereda de Cliente
/*insert into Empresa_Regular (tipoDocumento, nroDocumento, razonSocial, idDireccion, condiciónIVA, idCliente, idCuentaCorriente, montoAutorizacion, modoPago)
values ('CUIT', '249898201009', 'El transportista S.A', 3, 'Inscripto', 3, 1, 50000, 'Efectivo')
go*/


--Particular
--Particular no va mas, hereda de Cliente
/*insert into Particular (nombre, apellido, idCliente, idDireccion, tipoDocumento, nroDocumento)
values ('Dario', 'Nieto', 4, 4, 'DNI', '34108511')
go*/


--Cliente (Particular, Empresa, Empresa Regular)
insert into Cliente (tipoCliente, nombre, apellido, tipoDocumento, nroDocumento, condiciónIVA, idCuentaCorriente, idDireccion, modoPago, montoAutorizacion, razonSocial)
values ('Empresa', null, null, 'CUIT', '203890451995', 'Inscripto', null, 1, null, null, 'Transportes Juan S.A')
go
insert into Cliente (tipoCliente, nombre, apellido, tipoDocumento, nroDocumento, condiciónIVA, idCuentaCorriente, idDireccion, modoPago, montoAutorizacion, razonSocial)
values ('Empresa', null, null, 'CUIT', '185221369339', 'Monotributo', null, 2, null, null, 'Envio Express SRL')
go
insert into Cliente (tipoCliente, nombre, apellido, tipoDocumento, nroDocumento, condiciónIVA, idCuentaCorriente, idDireccion, modoPago, montoAutorizacion, razonSocial)
values ('Empresa_Regular', null, null, 'CUIT', '249898201009', 'Inscripto', 1, 3, 'Efectivo', 50000, 'El transportista S.A')
go
insert into Cliente (tipoCliente, nombre, apellido, tipoDocumento, nroDocumento, condiciónIVA, idCuentaCorriente, idDireccion, modoPago, montoAutorizacion, razonSocial)
values ('Particular', 'Dario', 'Nieto', 'DNI', '34108511', null, null, 4, null, null, null)
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


--Empleado
insert into Empleado (nombre, apellido, tipoDocumento, nroDocumento, codEmpleado, CUIL, funcion, idSucursal)
values ('Juan Carlos', 'Perez', 'DNI', '28908404', 88590, '20289084040', 'Analista Funcional', 1)
go
insert into Empleado (nombre, apellido, tipoDocumento, nroDocumento, codEmpleado, CUIL, funcion, idSucursal)
values ('Ramiro', 'Fryda', 'DNI', '33887951', 48930, '20338879515', 'Vago', 2)
go
insert into Empleado (nombre, apellido, tipoDocumento, nroDocumento, codEmpleado, CUIL, funcion, idSucursal)
values ('Florencia', 'Menendes', 'DNI', '35013914', 35471, '20350139149', 'Programador', 1)
go


--Proveedor
insert into Proveedor (idDireccion, tipoDocumento, numeroDocumento, razonSocial)
values (4, 'CUIT', '25899411350', 'Ala del sur S.A')
go
insert into Proveedor (idDireccion, tipoDocumento, numeroDocumento, razonSocial)
values (5, 'CUIT', '29987745130', 'Expreso Raind')
go
insert into Proveedor (idDireccion, tipoDocumento, numeroDocumento, razonSocial)
values (6, 'CUIT', '55098879110', 'Youalma')
go
insert into Proveedor (idDireccion, tipoDocumento, numeroDocumento, razonSocial)
values (7, 'CUIT', '99006655874', 'Ademeriva')
go


--Vehiculo
insert into Vehiculo (idSucursal, anio, capacidadDisponible, caracteristicas, cedulaVerde, disponibilidadTara, disponibilidadVolumen, dominio, enMantenimiento, enViaje, marca, modelo, peso, tara, vencimientoCedulaVerde, volumenDeCarga)
values (1, 1994, 4500, 'Camion con caja refrigerado', 90957716615, 1500, 7000, 'Buenos Aires', 0, 0, 'Ford', 'F3000', 2400, 9000, '01/08/2017', 14000)
go
insert into Vehiculo (idSucursal, anio, capacidadDisponible, caracteristicas, cedulaVerde, disponibilidadTara, disponibilidadVolumen, dominio, enMantenimiento, enViaje, marca, modelo, peso, tara, vencimientoCedulaVerde, volumenDeCarga)
values (2, 1985, 6500, 'Camion con caja no refrigerado', 64131356984, 1800, 7400, 'Buenos Aires', 1, 0, 'Chevrolet', 'A4500', 2550, 9800, '14/11/2016', 15000)
go


--Viaje (ViajeVehiculoPropio, ViajeVehiculoContratado)
insert into Viaje (tipoViaje, aereo, fechaArribo, fechaPartida, fechaPrioridad, idProveedor, idSucursal, idVehiculo, nroSucursalDestino)
values ('ViajeVehiculoContratado', 0, '09/11/2015', '14/07/2015', '20/07/2015', 1, 2, null, 18)
go
insert into Viaje (tipoViaje, aereo, fechaArribo, fechaPartida, fechaPrioridad, idProveedor, idSucursal, idVehiculo, nroSucursalDestino)
values ('ViajeVehiculoPropio', null, '17/12/2015', '29/08/2015', '30/08/2015', null, 2, 1, 18)
go



--Servicio
insert into Servicio (tipoServicio, denominacion, idProveedor, idViaje)
values ('Que va aca?', 'Nose', 3, 1)
go
insert into Servicio (tipoServicio, denominacion, idProveedor, idViaje)
values ('Que va aca???', 'Nose!!', 4, 2)
go


