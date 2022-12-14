BEGIN;

DROP SCHEMA projet CASCADE;

CREATE SCHEMA projet;

CREATE TABLE projet.user(
    PRIMARY KEY (nom, prenom, email), 
    nom VARCHAR NOT NULL,
    prenom VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    adm BOOLEAN NOT NULL DEFAULT FALSE
   );

CREATE TABLE projet.rdv(
    FOREIGN KEY (nom, prenom) REFERENCES projet.user, --ON DELETE CASCADE ON UPDATE CASCADE
    id INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    debut DATE,
    fin DATE,
    nom VARCHAR,
    prenom VARCHAR,
    descript VARCHAR
    );

COMMIT;
