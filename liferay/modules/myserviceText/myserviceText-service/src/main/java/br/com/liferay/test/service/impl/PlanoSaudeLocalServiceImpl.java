/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.com.liferay.test.service.impl;

import br.com.liferay.test.model.PlanoSaude;
import br.com.liferay.test.service.base.PlanoSaudeLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the plano saude local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.liferay.test.service.PlanoSaudeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoSaudeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=br.com.liferay.test.model.PlanoSaude",
	service = AopService.class
)
public class PlanoSaudeLocalServiceImpl extends PlanoSaudeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>br.com.liferay.test.service.PlanoSaudeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>br.com.liferay.test.service.PlanoSaudeLocalServiceUtil</code>.
	 */
	
	public List<PlanoSaude> findAll(){
		return planoSaudePersistence.findAll();
	}
	
	public List<PlanoSaude> findByDescricao(String descricao) {
		return planoSaudePersistence.findBydescricao(descricao);
	}
	
}