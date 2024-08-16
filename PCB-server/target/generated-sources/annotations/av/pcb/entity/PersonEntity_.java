package av.pcb.entity;

import av.pcb.constant.Company;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PersonEntity.class)
public abstract class PersonEntity_ {

	public static volatile SingularAttribute<PersonEntity, String> ss;
	public static volatile SingularAttribute<PersonEntity, String> firstName;
	public static volatile SingularAttribute<PersonEntity, String> bank;
	public static volatile SingularAttribute<PersonEntity, Boolean> hidden;
	public static volatile SingularAttribute<PersonEntity, String> ks;
	public static volatile SingularAttribute<PersonEntity, Float> workingTime;
	public static volatile SingularAttribute<PersonEntity, Company> company;
	public static volatile SingularAttribute<PersonEntity, Long> id;
	public static volatile SingularAttribute<PersonEntity, Long> internalNumber;
	public static volatile SingularAttribute<PersonEntity, String> accountNumber;
	public static volatile SingularAttribute<PersonEntity, String> vs;
	public static volatile SingularAttribute<PersonEntity, String> secondName;

	public static final String SS = "ss";
	public static final String FIRST_NAME = "firstName";
	public static final String BANK = "bank";
	public static final String HIDDEN = "hidden";
	public static final String KS = "ks";
	public static final String WORKING_TIME = "workingTime";
	public static final String COMPANY = "company";
	public static final String ID = "id";
	public static final String INTERNAL_NUMBER = "internalNumber";
	public static final String ACCOUNT_NUMBER = "accountNumber";
	public static final String VS = "vs";
	public static final String SECOND_NAME = "secondName";

}

