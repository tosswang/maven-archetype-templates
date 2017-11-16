package com.cnblogs.yjmyzz.entity;

// Generated 2014-10-23 14:04:43 by Hibernate Tools 4.0.0
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * TOrder generated by hbm2java
 */
@Entity(name = "T_ORDER")
public class TOrder implements java.io.Serializable {
	private static final long serialVersionUID = -779935606914199267L;
	private BigDecimal id;
	private String clientname;
	private BigDecimal amount;
	private Date createtime;

	public TOrder() {
	}

	public TOrder(BigDecimal id) {
		this.id = id;
	}

	public TOrder(BigDecimal id, String clientname, BigDecimal amount,
			Date createtime) {
		this.id = id;
		this.clientname = clientname;
		this.amount = amount;
		this.createtime = createtime;
	}

	@Id
//	@SequenceGenerator(name = "SEQ_ORDER", sequenceName = "SEQ_ORDER", allocationSize = 1)
//	@GeneratedValue(generator = "SEQ_ORDER", strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "CLIENTNAME", length = 100)
	public String getClientname() {
		return this.clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	@Column(name = "AMOUNT", precision = 22, scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME")
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
