package kr.co.tj.itemservice.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "items")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ItemEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String artist;
	
	@Column(nullable = false, unique = true)
	private String title;
	
	@Column(nullable = false)
	private String itemDescribe;
	
	@Column(nullable = false)
	private Long price;
	
	private Date createDate;
	private Date updateDate;
	
}
