# Objektorientierte Programmierung und Modellierung
## Bachelor Wirtschaftsinformatik - SS26
### Saidfiasal Khawarin

# Geometrie & OOP-Grundlagen in Java

Dieses Projekt demonstriert die zentralen Konzepte der objektorientierten Programmierung (OOP) in Java anhand einer Hierarchie von geometrischen Formen. Die abstrakte Basisklasse `Form` definiert gemeinsame Eigenschaften wie `Position` (Komposition) und `Farbe` (Enum) sowie abstrakte Methoden für Berechnungen. Davon erben konkrete Klassen wie `Rechteck` und `Kreis`, während das `Quadrat` als Spezialisierung wiederum vom Rechteck abgeleitet ist, was mehrstufige Vererbung und Polymorphie verdeutlicht. Zusätzlich kommen Interfaces wie `Scanable` für die interaktive Konsoleneingabe und `myFormList` für klares Schnittstellendesign zum Einsatz. Abgerundet wird das Projekt durch die Programmierung einer eigenen einfach verketteten Liste (`myFormLinkedList`), die zeigt, wie man Objekte dynamisch in einer maßgeschneiderten Datenstruktur verwaltet.