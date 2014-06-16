package com.esofthead.mycollab.module.crm.i18n;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("localization/crm/lead")
@LocaleData({ @Locale("en_US"), @Locale("ja_JP") })
public enum LeadI18nEnum {
	NO_ITEM_VIEW_TITLE,
	NO_ITEM_VIEW_HINT,
	
	LIST_VIEW_TITLE,
	
	SECTION_LEAD_INFORMATION,
	SECTION_ADDRESS,
	SECTION_DESCRIPTION,

	FORM_PREFIX,
	FORM_FIRSTNAME,
	FORM_LASTNAME,
	FORM_NAME,
	FORM_TITLE,
	FORM_DEPARTMENT,
	FORM_ACCOUNT_NAME,
	FORM_LEAD_SOURCE,
	FORM_INDUSTRY,
	FORM_EMAIL,
	FORM_MOBILE,
	FORM_OFFICE_PHONE,
	FORM_OTHER_PHONE,
	FORM_FAX,
	FORM_STATUS,
	FORM_WEBSITE,
	FORM_NO_EMPLOYEES,
	FORM_PRIMARY_ADDRESS,
	FORM_PRIMARY_CITY,
	FORM_PRIMARY_STATE,
	FORM_PRIMARY_POSTAL_CODE,
	FORM_PRIMARY_COUNTRY,
	FORM_OTHER_ADDRESS,
	FORM_OTHER_CITY,
	FORM_OTHER_STATE,
	FORM_OTHER_POSTAL_CODE,
	FORM_OTHER_COUNTRY,
	CONVERT_FROM_LEAD_TITLE
}