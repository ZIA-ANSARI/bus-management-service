package com.wipro.BusManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    private String password;

	    private String name;

	    private boolean isAdmin;

	    private boolean isBusOperator;

	    private boolean isConsumer;

	    private Double balance;
	    
	    public User() {
	    	
	    }

		public User(Long userId, String password, String name, boolean isAdmin, boolean isBusOperator,
				boolean isConsumer, Double balance) {
			super();
			this.userId = userId;
			this.password = password;
			this.name = name;
			this.isAdmin = isAdmin;
			this.isBusOperator = isBusOperator;
			this.isConsumer = isConsumer;
			this.balance = balance;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		public boolean isBusOperator() {
			return isBusOperator;
		}

		public void setBusOperator(boolean isBusOperator) {
			this.isBusOperator = isBusOperator;
		}

		public boolean isConsumer() {
			return isConsumer;
		}

		public void setConsumer(boolean isConsumer) {
			this.isConsumer = isConsumer;
		}

		public Double getBalance() {
			return balance;
		}

		public void setBalance(Double balance) {
			this.balance = balance;
		}
}
