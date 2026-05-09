# Resumen del Proyecto: Analizador y Generador de CV Dinámico (CV-DSL)

## 🏛️ Arquitectura del Proyecto

1. **El Modelo (Gramática en Xtext):** Diseñamos un DSL limpio y declarativo. En lugar de tener campos rígidos, creamos un modelo basado en `tags` universales y bloques con su propia directiva de `language`.
2. **El Contrato Externo (JSON):** Separamos las reglas de negocio del código. Las ofertas de trabajo viven en archivos JSON independientes, lo que permite que el comportamiento del compilador mute sin tocar una sola línea de código fuente.
3. **El Validador (Java):** Implementamos reglas semánticas complejas en tiempo de edición (Runtime).
4. **El Generador (Xtend):** Creamos un compilador inteligente que recorre el Árbol de Sintaxis Abstracta (AST), toma decisiones lógicas y renderiza un documento HTML enriquecido.

---

## 🎯 Cumplimiento de Requisitos Core

### 1. Análisis Estático (Static Analysis)

No nos limitamos a la sintaxis básica; implementamos un análisis transversal profundo:

- **Verificación de Dependencias de Skills:** El validador (`ResumeValidator.java`) navega por el AST, extrae las tecnologías mencionadas en los `Projects` y busca en todo el documento para verificar si están formalmente declaradas en el bloque `Skills`.
- **Matemática de Fechas (Temporal Math):** El validador lee el archivo JSON externo en tiempo real, extrae los `requiredExperienceYears`, parsea las fechas (`startDate`, `endDate`) de los empleos, calcula los meses reales trabajados y lanza un error si la suma total es menor a lo que exige la oferta.

### 2. Feedback Significativo (Meaningful Feedback)

El usuario siempre recibe retroalimentación contextualizada:

- **En Tiempo de Edición:** El editor provee diagnósticos tempranos subrayando en amarillo o rojo, con mensajes accionables como: _"La tecnología 'Python' no está en tus Skills"_ o _"La oferta requiere 3 años, pero solo sumas 1.5"_.
- **En Tiempo de Generación:** El HTML de salida inyecta un **Dashboard de Análisis**. Si el motor descarta un nodo del AST, el Dashboard imprime un reporte detallado (ej. _"Se omitió el proyecto X porque sus tags no coinciden con los requeridos"_).

### 3. Ámbito Dinámico / Filtrado (Dynamic Scoping)

El generador (`ResumeGenerator.xtend`) aplica un **doble filtro estricto** al AST durante la fase de transformación:

- **Filtro Nivel 1 (Contexto de Idioma):** Lee la variable `language` del bloque `Customization` y poda del AST cualquier sección (Experiencia, Proyectos, Educación) declarada en un idioma distinto.
- **Filtro Nivel 2 (Coincidencia Semántica):** De los bloques restantes, realiza una intersección entre los `tags` del usuario y los `requiredTags` de la oferta JSON. Solo los nodos que generan un _match_ se compilan en el CV final.

### 4. Experiencia de Programación (Programming Experience)

- **Asistencia Inteligente:** Configuración del `ProposalProvider` y corrección de la jerarquía gramatical para asegurar un autocompletado (`Ctrl + Space`) preciso.
- **Sintaxis Minimalista:** Un `.resume` altamente legible por humanos, prescindiendo de ruido visual (comas, corchetes anidados) y priorizando el flujo de redacción natural.

---

## 🌟 Características Avanzadas (Premium Features)

- **Cálculo de "Match Score":** Un algoritmo que unifica todos los tags del perfil en un `HashSet` global (evitando conteos duplicados) y calcula algorítmicamente el porcentaje de compatibilidad real con la oferta. Esto se renderiza visualmente en una barra de progreso responsiva.
- **Internacionalización Dinámica:** El motor de renderizado HTML adapta no solo el contenido del usuario, sino toda la interfaz estandarizada del CV (encabezados, etiquetas del dashboard) basándose en la variable de idioma definida en la configuración, logrando una exportación bilingüe transparente.
