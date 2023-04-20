package com.cfss;

import org.springframework.util.StringUtils;

public class CamelCasify {

public static String camelcasify(String in) {
    StringBuilder sb = new StringBuilder();
    boolean capitalizeNext = false;
    for (char c : in.toCharArray()) {
        if (c == '_') {
            capitalizeNext = true;
        } else {
            if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(c);
            }
        }
    }
    return sb.toString();
}

protected String underscoreName(String name) {
	if (!StringUtils.hasLength(name)) {
		return "";
	}

	StringBuilder result = new StringBuilder();
	for (int i = 0; i < name.length(); i++) {
		char c = name.charAt(i);
		if (Character.isUpperCase(c)) {
			result.append('_').append(Character.toLowerCase(c));
		}
		else {
			result.append(c);
		}
	}
	return result.toString();
}

public static void main(String[] args) {
	String [] list = {"id", "tqs_years", "tqs_months", 
			"tqs_days", "tqs_combined_state_years", "tqs_combined_state_months", "tqs_combined_state_days", "tqs_combined_ap_years", "tqs_combined_ap_months",
			"tqs_combined_ap_days", "tqs_combined_ts_years", "tqs_combined_ts_months", "tqs_combined_ts_days", "tnqs_years", "tnqs_months", "tnqs_days", "tnqs_combined_state_years", 
			"tnqs_combined_state_months", "tnqs_combined_state_days", "tnqs_combined_ap_years", "tnqs_combined_ap_months", "tnqs_combined_ap_days", "tnqs_combined_ts_years", "tnqs_combined_ts_months",
			"tnqs_combined_ts_days", "qs_years", "qs_months", "qs_days", "qs_combined_state_years", "qs_combined_state_months", "qs_combined_state_days", "qs_combined_ap_years", "qs_combined_ap_months",
			"qs_combined_ap_days", "qs_combined_ts_years", "qs_combined_ts_months", "qs_combined_ts_days", "weightage_years", "weightage_months", "weightage_days", "weightage_combined_state_years", 
			"weightage_combined_state_months", "weightage_combined_state_days", "weightage_combined_ap_years", "weightage_combined_ap_months", "weightage_combined_ap_days", "weightage_combined_ts_years", 
			"weightage_combined_ts_months", "weightage_combined_ts_days", "nqs_years", "nqs_months", "nqs_days", "nqs_combined_state_years", "nqs_combined_state_months", "nqs_combined_state_days", 
			"nqs_combined_ap_years", "nqs_combined_ap_months", "nqs_combined_ap_days", "nqs_combined_ts_years", "nqs_combined_ts_months", "nqs_combined_ts_days", "created_by", "updated_by", "last_updated", 
			"is_delete", "ins_date", "ip_address", "file_number", "ivrs_number", "revision_number1", "date_of_verification", "section_standard_name", "unit_standard_name"};
	for(String sq: list) {
	String s = camelcasify(sq);
	System.out.println(s);
	}
}

}
