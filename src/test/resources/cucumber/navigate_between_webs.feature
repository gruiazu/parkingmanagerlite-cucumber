# language: es
Característica: Navegación entre las distintas webs


    Escenario: Ir del índice a la lista de usuarios
    Dado un usuario esta en el indice 
    Cuando hace clic en el boton de la lista de usuarios
    Entonces se muestra la lista de usuarios

    Escenario: Navegar desde el índice a la lista de sorteos
    Dado un usuario esta en el indice
    Cuando hace click en el botón de la lista de sorteos
    Entonces se muestra la lista de sorteos

    Escenario: Navegar desde la lista de sorteos a la creación de sorteo
    Dado que un usuario esta en la lista de sorteos
    Cuando hace click en el botón de crear sorteo
    Entonces compruebo que la url actual es la de la creación de sorteo

    Escenario: Navegar desde la lista de usuarios a la creación de usuario
    Dado que un administrador esta en la lista de usuarios
    Cuando hace click en el boton de crear usuario
    Entonces se muestra la creación de usuarios




