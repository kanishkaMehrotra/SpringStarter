package com.kanishka.spring.basics.springin5steps.someCDI;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCDIBusiness {
	
	@Inject
	SomeCDIdao someCDIdao;

	public SomeCDIdao getSomeCDIdao() {
		return someCDIdao;
	}

	public void setSomeCDIdao(SomeCDIdao someCDIdao) {
		this.someCDIdao = someCDIdao;
	}
	

}
