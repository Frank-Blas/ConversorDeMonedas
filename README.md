# ConversorDeMonedas
Challenge en Alura Latam
# 💱 Conversor de Monedas en Java

Este proyecto es un **conversor de monedas** desarrollado en Java como parte del desafío de Oracle Next Education. Utiliza una API de tasas de cambio para convertir entre distintas monedas, interactuando con el usuario a través de una interfaz de consola.

## 🚀 Funcionalidades

- El usuario puede ingresar **códigos de moneda** como `USD`, `ARS`, `BRL`, etc.
- Conversión en tiempo real usando tasas obtenidas desde una API.
- Interfaz de consola simple y clara.
- Manejo de errores de entrada y conexión.
- Modularidad del código (organizado en paquetes).
- Lógica de conversión encapsulada.

## 🖥️ Interfaz de Consola

El programa solicita al usuario ingresar:

1. Código de la moneda base (ej. `USD`)
2. Código de la moneda destino (ej. `CLP`)
3. Valor numérico a convertir

Luego muestra el resultado con el siguiente formato:


El usuario puede escribir `SALIR` en cualquier momento para terminar el programa.

## 🧱 Tecnologías Utilizadas

- Java 17+
- API ExchangeRate
- `HttpClient`, `HttpRequest` y `HttpResponse`
- Biblioteca [Gson](https://github.com/google/gson) para parseo de JSON
- Entrada por consola con `Scanner`

## 🗃️ Organización del Código

El proyecto está organizado por paquetes:

- `src/Main` – clase principal (`ConversorApp`)
- `src/Ui` – menú e interacción con el usuario
- `src/Model` – clases para parseo del JSON (modelo)
- `src/Service` – lógica de conexión y conversión de monedas

## 🧪 Cómo Ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Frank-Blas/conversor-monedas-java.git
2. Abre el proyecto con tu IDE (IntelliJ, Eclipse, VS Code...).

3. Ejecuta la clase ConversorApp.

📌 Notas
Usa los códigos de moneda estándar (ISO 4217), como:

USD – Dólar estadounidense

ARS – Peso argentino

BOB – Boliviano

BRL – Real brasileño

CLP – Peso chileno

COP – Peso colombiano

Asegúrate de tener conexión a internet para acceder a la API.

📷 Vista previa
A continuación, un ejemplo del funcionamiento del programa en consola:
Sea bienvenido/a al Conversor de Moneda

Ingrese el código de la moneda base (ej: USD): usd
Ingrese el código de la moneda destino (ej: CLP): clp
Ingrese el valor a convertir: 100
> 100.00 USD son 87000.50 CLP
Gracias por usar el conversor de monedas. ¡Hasta pronto!

🙌 Agradecimientos
Este proyecto fue desarrollado con el acompañamiento del programa Oracle Next Education - Back End Java.
Agradecimientos especiales a los mentores, tutores y a la comunidad por su constante apoyo y motivación.

También, gracias a ExchangeRate-API por facilitar el acceso a tasas de cambio actualizadas.

Desarrollado por Franklin Jose Sanchez Blas
