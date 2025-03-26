# Task Manager API - Spring Boot

## Descrizione
Questo progetto è un'applicazione Spring Boot che utilizza MySQL come database relazionale e Maven per la gestione delle dipendenze. L'interfaccia utente è realizzata con Thymeleaf. L'applicazione consente di gestire contatti attraverso operazioni CRUD eseguite tramite chiamate query al database.

## Tecnologie Utilizzate
- **Spring Boot** - Framework per lo sviluppo di applicazioni Java
- **MySQL** - Database relazionale
- **Maven** - Gestore di dipendenze
- **Thymeleaf** - Template engine per la parte frontend

## Installazione

### Prerequisiti
- Java 17+
- Maven
- MySQL Server
- Un IDE come IntelliJ IDEA o VS Code

### Configurazione del Database
Il database viene connesso manualmente all'interno del controller, senza utilizzare `application.properties`. 
Esempio di connessione:
```java
@Controller
public class ContattoController {
    private static final String url = "jdbc:mysql://localhost:3306/springbase?serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = " ";
}
```

Creare il database in MySQL:
```sql
CREATE DATABASE springbase;
```

### Compilazione ed Esecuzione
Eseguire il seguente comando per avviare l'applicazione:
```sh
mvn spring-boot:run
```

## Struttura del Progetto
- **controller/ApiController.java** - Controller per le API REST
- **controller/ContattoController.java** - Controller per le pagine web e connessione al database
- **service/** Contiene la logica di business
- **model/Contatto.java** - Modello per la tabella `rubrica`
- **templates/index.html** - Pagina principale
- **templates/about.html** - Pagina About
- **static/css/style.css** - Foglio di stile CSS

## API Endpoints
| Metodo | Endpoint | Descrizione |
|--------|---------|-------------|
| GET | `/api/contatti` | Mostra tutti i contatti |
| POST | `/api/contatti` | Crea un nuovo contatto |
| PUT | `/api/contatti/{id}` | Aggiorna un contatto |
| DELETE | `/api/contatti/{id}` | Elimina un contatto |

## Contribuire
Se vuoi contribuire, fai un fork del repository e crea una pull request con le tue modifiche.

## Licenza
Questo progetto è distribuito sotto la licenza MIT.

