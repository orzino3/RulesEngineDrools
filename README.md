# Drools Example: Person Rule Engine

This project demonstrates the use of **Drools** (a Business Rule Management System) in Java to evaluate characteristics of `Person` objects — such as determining gender (male/female) and whether a person is an adult — based on predefined rules.

---

## 🧠 What It Does

- Loads a list of `Person` instances.
- Applies rules written in Drools DRL files to:
  - Identify gender based on predefined values.
  - Mark whether a person is an adult (`age >= 18`).
  - Print the results in Hebrew using friendly phrasing.
- Shows initial and final states of each `Person`.

---

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── org/
│   │       └── example/
│   │           ├── DroolsExample.java     # Main class
│   │           └── Person.java            # Person class with name, age, gender
│   └── resources/
│       └── org/
│           └── example/
│               └── drools/
│                   └── rules.drl          # Drools rule file
```

## 📜 Example Output
```
----------------------------------
Initial state of Person 1: Person[name='אור זינו', age=29, adult=לא מוגדר, gender=לא מוגדר]
...
----------------------------------
אור זינו הוא מבוגר
טוהר קרסנובסקי היא מבוגרת
...
----------------------------------
Final state of Person 1: Person[name='אור זינו', age=29, adult=בוגר, gender=זכר]
...
----------------------------------
```

---

## ✅ Prerequisites

- Java 8 or later
- Maven
- IntelliJ IDEA or other Java IDE (optional)

---

## ⚙️ How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/yourusername/drools-person-example.git
   cd drools-person-example
   
2. **Build the project**
   ```bash
   mvc clean install
   ```
3. **Run the application**
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.DroolsExample"
   ``` 


## 🧩 Technologies Used
- Drools
- Java
- Maven

## 👥 Group Members
- Or Zino 
- Tohar Krasnovsky
- Gal Shlomay
- Shaked Shira Etedgi
