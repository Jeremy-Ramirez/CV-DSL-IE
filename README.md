# Plan de Acción: CV-to-Job Matcher & Static Analyzer

## 1. Resumen del Proyecto

Transformar el DSL de Currículum actual en una herramienta de análisis estático y generación dinámica. El sistema leerá una oferta de empleo externa (JSON) y filtrará el contenido del CV de forma estricta, generando un Dashboard de compatibilidad y feedback.

---

## 2. Fase 1: Refactorización de la Gramática (Xtext)

- [ ] **Simplificar Customization:** Eliminar las reglas manuales (`Rule`, `Filter`, `SectionType`).
- [ ] **Añadir Input Externo:** Modificar el bloque para aceptar la ruta del archivo JSON.
  ```text
  Customization:
      'Customization'
      'language:' language=STRING
      'targetJobOffer:' jobOfferPath=STRING
  ;
  ```
- [ ] **Formato de Fecha:** Asegurar que el tipo `Date` sea un `STRING` con un formato parseable (ej: "YYYY-MM-DD") para cálculos posteriores.

---

## 3. Fase 2: Definición del Contrato Externo (JSON)

- [ ] **Diseñar el Schema:** Crear el formato estándar de la oferta de trabajo.
  ```json
  {
    "role": "Software Engineer",
    "requiredExperienceYears": 3,
    "requiredTags": ["Java", "Docker", "Xtext"]
  }
  ```
- [ ] **Mocks de Prueba:** Crear al menos 3 archivos JSON con diferentes requisitos para probar el filtrado estricto.

---

## 4. Fase 3: Análisis Estático y Validaciones (@Check en Java)

- [ ] **Validación de Archivo:** Comprobar si `jobOfferPath` existe y es un JSON válido.
- [ ] **Incongruencia Temporal:** - Sumar meses/años de las secciones `Experience` que tengan los tags requeridos.
  - Lanzar un `Warning` si el total es menor a `requiredExperienceYears`.
- [ ] **Dependencias de Skills:** - Validar que cualquier tecnología mencionada en un `Project` esté declarada en la sección `Skills`.
- [ ] **Validación de Tags:** Alertar si el CV no contiene ninguno de los tags requeridos por la oferta.

---

## 5. Fase 4: Generación Dinámica y Dashboard (Xtend)

- [ ] **Lógica de Filtrado Estricto:**
  - Implementar el algoritmo que descarta bloques de `Experience` o `Project` que no coincidan con los `requiredTags`.
- [ ] **Generador de CV (HTML/PDF):**
  - Producir el documento final "limpio" solo con la información relevante para
