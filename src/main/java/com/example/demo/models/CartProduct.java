package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
public class CartProduct {
	@Id
	@Column(name = "cpid")
	private Integer cpId;
	@ManyToOne
	@JoinColumn(name = "cartid")
	private Cart cart;
	@OneToOne
	@JoinColumn(name = "productid")
	private Product product;
	@Column(name = "quantity")
	private Integer quantity;
//	@Override
//	public String toString() {
//		return "CartProduct [cpId=" + cpId + ", quantity=" + quantity + "]";
//	}
}
