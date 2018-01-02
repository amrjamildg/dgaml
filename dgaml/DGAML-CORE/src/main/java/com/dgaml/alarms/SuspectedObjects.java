package com.dgaml.alarms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import com.dgaml.core.businesslayer.entity.AbstractEntity;

/**
 * <p>
 * Title:
 * </p>
 * f
 * <p>
 * Description:
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
@Entity
@Table(name = "suspected_objs") 
public class SuspectedObjects extends AbstractEntity {

	@Column(name = "obj_level_code")
	@NaturalId
	String objectLevelCode;

	@Column(name = "obj_key")
	@NaturalId
	Long objectKey;

	@Column(name = "obj_number")
	String objectNumber;

	public Long getId() {
		return null;
	}

	public Class<? extends com.dgaml.core.businesslayer.entity.Entity> getClazz() {
		return SuspectedObjects.class;
	}

}
