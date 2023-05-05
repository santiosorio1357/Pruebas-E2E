#language: es
@Manual
  Escenario: Buscar una oferta en la página de Falabella
  Dado que Santiago desea encontrar una oferta en Falabella
  Cuando Santiago busca ofertas en la barra de busqueda
  Entonces Santiago debe encontrar productos en oferta.

@Manual
  Escenario: Registrarse como nuevo usuario en la página de Falabella
  Dado que Santiago desea registrarse como nuevo usuario en Falabella
  Cuando Santiago presiona el boton de registro y completa los campos necesarios
  Entonces Santiago debe recibir una confirmación de registro exitoso y poder acceder a su cuenta de usuario en la página de Falabella.

@Manual
  Escenario: Encontrar un producto en la página de Falabella
  Dado que Santiago desea buscar buscar un producto
  Cuando Santiago accede a la barra de busqueda e ingresa el nombre del producto
  Entonces Santiago debe ver el producto.

@Manual
  Escenario: Consultar el estado de un pedido en la página de Falabella
  Dado que Santiago desea conocer el estado de su pedido en Falabella
  Cuando Santiago ingresa a su cuenta de usuario y selecciona la opción "Mis productos"
  Entonces Santiago debe poder ver el estado de su pedido y cualquier información adicional sobre el proceso de envío y entrega.

@Manual
  Escenario: Ingresar la ubicacion para recibir envíos en la página de Falabella
  Dado que Santiago desea ingresar su ubicación para recibir envíos en la página de Falabella
  Cuando Santiago  selecciona la opción de "ingresar tu ubicacion" llena todos los campos y presiona guardar
  Entonces Santiago debe ver que su ubicacion quedo guardada.