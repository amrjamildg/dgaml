package com.dgaml.core.businesslayer.entity;

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
 * @author <a href="mailto:amr.jamil@datagearbi.com">Amr jamil</a>
 * @version 1.0
 */
public interface Entity {

	/**
	 * 
	 * @return the Entity identifier
	 */
	public Long getId();

	/**
	 * 
	 * @return the Class name for the Entity class , we need this method to avoid
	 *         calling getClass for the HibernateProxy as it returns the
	 */
	public Class<? extends Entity> getClazz();

}
