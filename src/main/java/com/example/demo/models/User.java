package com.example.demo.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "AppUser")
public class User {
	@Id
	@Column(name = "userid")
	private Integer userId;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	@ManyToMany
	@JoinTable(name = "userrole",
	joinColumns = @JoinColumn(name = "userid"),
	inverseJoinColumns = @JoinColumn(name = "roleid"))
	private List<Role> roles;
	@OneToOne(mappedBy = "user")
	private Cart cart;
	@OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> products;

}
