package com.arbia.gestion.stock.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class LigneCommandeClient implements Serializable {

    @Id
    @GeneratedValue
    private Long idLigneCdeClt;
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "idCommandeClient")
    private CommandeClient commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

    public Long getIdLigneCdeClt() {
        return idLigneCdeClt;
    }
    public void setIdLigneCdeClt(Long id) {
        this.idLigneCdeClt = id;
    }
    public Article getArticle() {
        return article;
    }
    public void setArticle(Article article) {
        this.article = article;
    }

    @JsonIgnore
    public CommandeClient getCommandeClient() {
        return commandeClient;
    }

    public void setCommandeClient(CommandeClient commandeClient) {
        this.commandeClient = commandeClient;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
