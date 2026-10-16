<div align="center">

# 🎨 Patrones de Diseño

### Ejemplos prácticos de patrones de diseño en Java

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=flat-square&logo=apache-netbeans&logoColor=white)
![License](https://img.shields.io/badge/Licencia-MIT-green?style=flat-square)
![GitHub Stars](https://img.shields.io/github/stars/jarodsmdev/Patrones-de-dise-o?style=flat-square&logo=github&color=181717)
![Last Commit](https://img.shields.io/github/last-commit/jarodsmdev/Patrones-de-dise-o?style=flat-square)

</div>

---

## 📚 Contenido

| Patrón | Tipo | Estado |
|:------:|:----:|:------:|
| [Adapter](#-adapter) | Estructural | ![Done](https://img.shields.io/badge-completado-brightgreen?style=flat-square) |
| [Builder](#-builder) | Creacional | ![Done](https://img.shields.io/badge/completado-brightgreen?style=flat-square) |
| [Observer](#-observer) | Estructural | ![Done](https://img.shields.io/badge/completado-brightgreen?style=flat-square) |

---

## 🧩 Adapter

> **Patrón Estructural** — Convierte la interfaz de una clase en otra interfaz que el cliente espera.

![Maven](https://img.shields.io/badge/build-Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Apache POI](https://img.shields.io/badge/Apache_POI-5.2.2-0072C6?style=flat-square&logo=apache&logoColor=white)
![OpenCSV](https://img.shields.io/badge/OpenCSV-5.9-336791?style=flat-square&logo=csv&logoColor=white)

Permite leer archivos **Excel (.xlsx)** y **CSV** a través de una interfaz común `InputFile`, dejando que `FileAdapter` unifique el acceso a los datos.

```java
InputFile excelFileAdapter = new ExcelFileAdapter();
FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);

InputStream is = new FileInputStream("Libro1.xlsx");
List<Person> personList = fileAdapter.readFile(is);
```

**Estructura:**

```
Adapter/src/main/java/com/jarod/
├── adapter/
│   ├── InputFile.java        ← Interfaz del adaptable
│   ├── FileAdapter.java      ← Adaptador (cliente)
│   ├── ExcelFileAdapter.java ← Adaptador concreto
│   └── CsvFileAdapter.java   ← Adaptador concreto
├── model/
│   └── Person.java
└── main/
    └── Main.java
```

**Ejecutar:**

```bash
cd Adapter
mvn compile exec:java -Dexec.mainClass="com.jarod.main.Main"
```

---

## 🏗️ Builder

> **Patrón Creacional** — Construye objetos complejos paso a paso, separando la construcción de su representación.

![Status](https://img.shields.io/badge/jdk-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)

Implementa el patrón **fluent builder** mediante el método encadenado `Product.builder()`.

```java
Product p = Product.builder()
        .setName("Huevos")
        .setPrice(250.0)
        .setProviders("Proveedor A", "Calle Roja #123", "9999-9999")
        .build();

System.out.println(p);
```

**Estructura:**

```
Builder/src/builder/
├── IBuilder.java   ← Interfaz del builder
├── Provider.java   ← Componente del producto
├── Product.java    ← Producto construido
└── Main.java
```

---

## 👀 Observer

> **Patrón Estructural** — Define una dependencia uno-a-muchos entre objetos, de modo que cuando un objeto cambia de estado, todos sus dependientes son notificados automáticamente.

![Status](https://img.shields.io/badge/jdk-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)

Incluye tres ejemplos progresivos del patrón con interfaces propias `Observable` y `Observer`.

**Estructura:**

```
Observer/src/observer/
├── Observable.java         ← Interfaz observable
├── Observer.java           ← Interfaz observador
├── EjemploObservable.java
├── Ejemplo1.java           ← Ejemplo básico
├── Ejemplo2.java           ← Ejemplo intermedio
├── Ejemplo3.java           ← Ejemplo avanzado
└── Main.java
```

---

## 🚀 Requisitos

![JDK](https://img.shields.io/badge/JDK-21%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8%2B-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![IDE](https://img.shields.io/badge/IDE-NetBeans_17-1B6AC6?style=flat-square&logo=apache-netbeans&logoColor=white)

- [Java JDK 21](https://openjdk.org/) o superior
- [Apache Maven 3.8+](https://maven.apache.org/)
- [Apache NetBeans 17+](https://netbeans.apache.org/) (recomendado)

---

## 📦 Instalación

```bash
# 1. Clonar el repositorio
git clone https://github.com/jarodsmdev/Patrones-de-dise-o.git

# 2. Entrar al directorio
cd Patrones-de-dise-o

# 3. Compilar el proyecto Adapter (Maven)
cd Adapter && mvn clean install
```

---

## 📂 Estructura del Repositorio

```
PATRONES_DE_DISEÑO/
├── Adapter/    🧩 Patrón Adapter    (Maven)
├── Builder/    🏗️ Patrón Builder    (Ant/NetBeans)
├── Observer/   👀 Patrón Observer   (Ant/NetBeans)
└── README.md
```

---

## 📖 Acerca de los Patrones

<table>
<tr>
<td align="center">🧩</td>
<td><b>Adapter</b><br>Permite que clases con interfaces incompatibles trabajen juntas, envolviendo una clase con otra interfaz.</td>
</tr>
<tr>
<td align="center">🏗️</td>
<td><b>Builder</b><br>Separa la construcción de un objeto complejo de su representación, permitiendo crear distintas variantes.</td>
</tr>
<tr>
<td align="center">👀</td>
<td><b>Observer</b><br>Notifica automáticamente a una lista de objetos cuando otro objeto cambia de estado.</td>
</tr>
</table>

---

## ✍️ Autor

![Author](https://img.shields.io/badge/autor-Jarod_Smith-181717?style=flat-square&logo=github)
![Website](https://img.shields.io/badge/sitio-jarodsmdev-0A66C2?style=flat-square&logo=github)

**Jarod Smith** — Desarrollador Java

---

## 📄 Licencia

![MIT](https://img.shields.io/badge/Licencia-MIT-green?style=flat-square)

Este proyecto se distribuye bajo la licencia MIT. Ver [LICENSE](LICENSE) para más detalles.

---

<div align="center">

![Footer](https://img.shields.io/badge/hecho_con_♥-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

⭐ **Si este proyecto te resultó útil, déjame una estrella** ⭐

</div>
