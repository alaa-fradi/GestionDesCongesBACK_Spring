package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.internal.ws.spi.db.DatabindingException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conge implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idConge;
    @Temporal(TemporalType.DATE)
    private Date DateDebut;
    @Temporal(TemporalType.DATE)
    private Date DateFin;

   @JsonIgnore
   @ManyToOne
   private Employee employee;

   @JsonIgnore
   @ManyToOne
   private TypeDeConge typeDeconge;


   @OneToOne
   private TitreDeConge titreDeConge;






    }