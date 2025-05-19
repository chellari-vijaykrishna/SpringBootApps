package com.vj.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(
			name = "PERSON_FRIENDS",
			joinColumns = @JoinColumn(name="personId",referencedColumnName = "personId")
	)
	@OrderColumn(name = "INDEXS")
	@ListIndexBase(value = 1)
	private List<String> personFriends;
	 
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(
			name = "PERSON_CONTACTS",
			joinColumns = @JoinColumn(name="personId",referencedColumnName = "personId")
	)
	private Set<String> personContacts;
	
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(
			name = "PERSON_ID_CARDS",
			joinColumns = @JoinColumn(name="personId",referencedColumnName = "personId")
	)
	@MapKeyColumn(name = "CARD_ID")
	@Column(name = "CARD_NUMBER")
	private Map<String,String> personIdCards;
	
	public PersonInformation(String personName, List<String> personFriends, Set<String> personContacts,
			Map<String, String> personIdCards) {
		this.personName = personName;
		this.personFriends = personFriends;
		this.personContacts = personContacts;
		this.personIdCards = personIdCards;
	}
	
	

}
