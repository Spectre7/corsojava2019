# Design patterns

# Observer
![observer](img/observer.png "observer")

# Singleton

![singleton](img/singleton.jpg "singleton")

## Sample singleton code
``` java
public class MioSingolo {
    private static MioSingolo istanza = null;

    //Il costruttore private impedisce l'istanza di oggetti da parte di classi esterne
    private MioSingolo() {}

    // Metodo della classe impiegato per accedere al singleton
    public static synchronized MioSingolo getMioSingolo() {
        if (istanza == null) {
            istanza = new MioSingolo();
        }
        return istanza;
    }
}
```