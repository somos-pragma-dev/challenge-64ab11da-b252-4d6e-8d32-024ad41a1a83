# Desarrollo de una API REST con persistencia en memoria

El equipo de desarrollo necesita crear una API REST que permita gestionar un catálogo de productos. Los productos tendrán identificador único, nombre, precio y descripción. La API debe soportar operaciones de creación, lectura, actualización y eliminación de productos. La persistencia de los datos se realizará en una base de datos en memoria H2. Se espera que la API esté documentada utilizando Swagger.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot |
| **Nivel** | trainee-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del modelo de datos

**Objetivo:** Definir el modelo de datos para los productos y establecer las restricciones de negocio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Cada producto debe tener un identificador único, nombre, precio y descripción.
- El nombre del producto no puede estar vacío.
- El precio del producto debe ser un número positivo.

**Entregable:** Modelo de datos definido con restricciones de negocio.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los atributos que debe tener un producto.
- Considera las restricciones de negocio que deben aplicarse a los atributos del producto.

</details>

### Fase 2: Implementación de la API REST

**Objetivo:** Implementar la API REST que permita gestionar el catálogo de productos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- La API debe soportar operaciones de creación, lectura, actualización y eliminación de productos.
- La persistencia de los datos se realizará en una base de datos en memoria H2.
- La API debe estar documentada utilizando Swagger.

**Entregable:** API REST implementada y documentada.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los endpoints que debe tener la API para soportar las operaciones CRUD.
- Considera cómo se pueden documentar los endpoints utilizando Swagger.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de datos y por qué es importante en el desarrollo de una API REST?
- **paraQueSirve**: ¿Para qué sirven las restricciones de negocio en el modelo de datos de una API REST?
- **comoSeUsa**: ¿Cómo se utilizan los endpoints de una API REST para gestionar un catálogo de productos?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar una API REST y cómo se pueden evitar?

## Criterios de Evaluacion

- Definición del modelo de datos con restricciones de negocio.
- Implementación de la API REST que soporta operaciones CRUD.
- Documentación de la API utilizando Swagger.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
