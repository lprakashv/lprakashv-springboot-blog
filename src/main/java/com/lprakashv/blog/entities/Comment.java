package com.lprakashv.blog.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Comment implements Serializable {
  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  private Person person;

  @ManyToOne
  private Post post;

  private String content;

  private Date commentedOn;
}
