package com.trinity.demospring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.trinity.demospring.entities.enums.ClientType;

@Entity
public class Client implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String cpfOrCnpj;
	private Integer clientType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Adress> Adresses = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name="Phone")
	private Set<String> phones = new HashSet<>(); //Representação de telefones por um conjunto de strings

	
	public Client() {
		
	}


	public Client(Long id, String name, String email, String cpfOrCnpj, ClientType clientType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpfOrCnpj = cpfOrCnpj;
		this.clientType = clientType.getCode();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpfOrCnpj() {
		return cpfOrCnpj;
	}


	public void setCpfOrCnpj(String cpfOrCnpj) {
		this.cpfOrCnpj = cpfOrCnpj;
	}


	public ClientType getClientType() {
		return ClientType.toEnum(clientType);
	}


	public void setClientType(ClientType clientType) {
		this.clientType = clientType.getCode();
	}


	public List<Adress> getAdresses() {
		return Adresses;
	}


	public void setAdresses(List<Adress> adresses) {
		Adresses = adresses;
	}


	public Set<String> getPhones() {
		return phones;
	}


	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
