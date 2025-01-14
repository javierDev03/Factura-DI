# 📜 Proyecto de Facturación con Java Spring Boot 🛠️

¡Bienvenido a **FacturaPro**! 🚀 Este es un proyecto backend desarrollado con **Java** y **Spring Boot**, diseñado para gestionar facturas de manera eficiente. Utiliza todas las bondades de la **inyección de dependencias** 💉, asegurando un código modular, limpio y fácil de mantener.

## ✨ Funcionalidades principales:
- 📋 **Creación y gestión de facturas**: Maneja clientes, productos y facturas en un solo lugar.
- 🔄 **Inyección de dependencias**: Implementado para garantizar un diseño desacoplado y escalable.
- 📂 **Estructura organizada**: Diseñado con las mejores prácticas de arquitectura backend.
- 📊 **Cálculo de totales dinámicos**: Calcula automáticamente el importe total de la factura en base a los productos y cantidades.

## 📦 Respuesta JSON:
Un ejemplo de cómo se ve la respuesta de una factura:  
```json
{
    "client": {
        "name": "javier",
        "lastName": "velasco"
    },
    "description": "Factura de Deporte",
    "items": [
        {
            "product": {
                "name": "Camara Sony",
                "price": 800
            },
            "quantity": 2,
            "importe": 1600
        },
        {
            "product": {
                "name": "Bicicleta",
                "price": 1500
            },
            "quantity": 4,
            "importe": 6000
        }
    ],
    "total": 7600
}
```

## 🚀 Tecnologías utilizadas:
- **Java** ☕
- **Spring Boot** 🥾
- **Maven** 📦
- **H2 Database** 🗄️ (o tu base de datos favorita)
- **JUnit** ✅ para pruebas unitarias.

## 🛠️ Cómo ejecutar el proyecto:
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/factura-pro.git
   ```
2. Configura tu entorno de desarrollo:
   - Requisitos: Java 17, Maven.
3. Ejecuta el proyecto con:
   ```bash
   mvn spring-boot:run
   ```
4. Accede al backend en `http://localhost:8080`.

## 🎯 Contribuciones:
¡Este proyecto está abierto a contribuciones! 🧑‍💻 Siéntete libre de crear un pull request o abrir un issue para mejoras y nuevas funcionalidades.
