package com.dgaml.core.persistent.dao;

import com.dgaml.core.businesslayer.entity.Entity;

/**
 * <p>
 * Title:
 * </p>
 * 
 * <p>
 * Description: The SuperClass for all entities in the server.
 * </p>
 * 
 * <p>
 * Copyright: Copyright(c) DataGear International, 2017
 * </p>
 * 
 * <p>
 * Company: EME International
 * </p>
 * 
 * @author <a href="mailtod:amr.jamil@datagearbi.com">Amr jamil</a>
 * @version 1.0
 */
public abstract class AbstractDAO<E extends Entity> {

	public void save(Entity e) {

	}

	public void update(Entity e) {

	}

	public Entity select(Long Id) {
		return null;
	}

	public Entity delete(Long Id) {
		return null;
	}

}
