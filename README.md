# Progetto Java OOP: Shop con Prodotti e Carrello

## Descrizione

In questo progetto si richiede di creare una gerarchia di classi che rappresentano prodotti di uno shop, con gestione del carrello e sconti personalizzati.

---

## Classe Prodotto

### Attributi:
- `codice` (int, accessibile solo in lettura)
- `nome` (read/write)
- `marca` (read/write)
- `prezzo` (read/write)
- `iva` (read/write)

### Requisiti:
- Costruttori opportuni
- Getter e setter per tutti gli attributi tranne `codice` (solo getter)
- Metodi utili come `toString()`

---

## Sotto-classi che ereditano da Prodotto

### Tipi di prodotto:
- **Smartphone:** aggiunge `imei` (String), `memoria` (int in GB)
- **Televisore:** aggiunge `dimensioni` (int in pollici), `smart` (boolean)
- **Cuffie:** aggiunge `colore` (String), `wireless` (boolean)

Utilizza l’ereditarietà per riusare codice della classe `Prodotto`.

---

## Classe Carrello con `main`

- Usa `Scanner` per far inserire all’utente i prodotti.
- Chiedi che tipo di prodotto inserire (Smartphone, Televisore, Cuffie).
- In base alla scelta, chiedi i dati specifici e crea l’oggetto corrispondente.
- Conserva i prodotti in una lista (ad esempio `ArrayList<Prodotto>`).
- Alla fine stampa tutti i prodotti (override di `toString()`).

---

## Bonus: Metodo sconto fedeltà

- Aggiungi nella classe `Prodotto` un metodo `calcolaPrezzoScontato()` che applica sconti diversi:
  - Sconto base: 2%
  - Smartphone: 5% se memoria < 32GB, altrimenti 2%
  - Televisori: 10% se non smart, altrimenti 2%
  - Cuffie: 7% se cablate (wireless == false), altrimenti 2%
- In `Carrello` chiedi all’utente se possiede carta fedeltà.
- Se sì, somma prezzi scontati, altrimenti somma prezzi base.

---

## Note finali

- Attenzione all’incapsulamento e all’override di metodi.
- Organizza bene il package `org.lessons.java.shop`.
- Testa la logica di input/output con attenzione.
- Usa `ArrayList` per gestire il carrello.
