package com.example.ohadou_auto_backend.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "livraison")
public class Livraison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adresse_livraison", nullable = false)
    private String adresseLivraison;

    @Column(name = "date_livraison")
    private LocalDate dateLivraison;

    @Column(name = "statut_livraison")
    @Enumerated(EnumType.STRING)
    private StatutLivraison statutLivraison;

    @Column(name = "nom_destinataire")
    private String nomDestinataire;

    @Column(name = "telephone_destinataire")
    private String telephoneDestinataire;

    @Column(name = "numero_suivi", unique = true)
    private String numeroSuivi;

    @Column(name = "transporteur")
    private String transporteur;

    @OneToOne(mappedBy = "livraison")
    private Commende commande;

    public Livraison(){}
    public Livraison(Long id, String adresseLivraison, LocalDate dateLivraison, StatutLivraison statutLivraison, String nomDestinataire, String telephoneDestinataire, String numeroSuivi, String transporteur, Commende commande) {
        this.id = id;
        this.adresseLivraison = adresseLivraison;
        this.dateLivraison = dateLivraison;
        this.statutLivraison = statutLivraison;
        this.nomDestinataire = nomDestinataire;
        this.telephoneDestinataire = telephoneDestinataire;
        this.numeroSuivi = numeroSuivi;
        this.transporteur = transporteur;
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public LocalDate getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDate dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public StatutLivraison getStatutLivraison() {
        return statutLivraison;
    }

    public void setStatutLivraison(StatutLivraison statutLivraison) {
        this.statutLivraison = statutLivraison;
    }

    public String getNomDestinataire() {
        return nomDestinataire;
    }

    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }

    public String getTelephoneDestinataire() {
        return telephoneDestinataire;
    }

    public void setTelephoneDestinataire(String telephoneDestinataire) {
        this.telephoneDestinataire = telephoneDestinataire;
    }

    public String getNumeroSuivi() {
        return numeroSuivi;
    }

    public void setNumeroSuivi(String numeroSuivi) {
        this.numeroSuivi = numeroSuivi;
    }

    public String getTransporteur() {
        return transporteur;
    }

    public void setTransporteur(String transporteur) {
        this.transporteur = transporteur;
    }

    public Commende getCommande() {
        return commande;
    }

    public void setCommande(Commende commande) {
        this.commande = commande;
    }
}