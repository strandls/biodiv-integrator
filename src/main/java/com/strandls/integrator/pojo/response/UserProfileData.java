package com.strandls.integrator.pojo.response;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.strandls.user.pojo.Role;
import com.strandls.user.pojo.User;

public class UserProfileData {
	
	private Long id;
	private Long version;
	private Boolean accountExpired;
	private Boolean accountLocked;
	private Boolean passwordExpired;
	private Long languageId;
	private Boolean enabled;
	private String userName;
	private String aboutMe;
	private String email;
	private Boolean hideEmial;
	private String name;
	private String profilePic;
	private String icon;
	private String sexType;
	private Date dateCreated;
	private Double latitude;
	private Double longitude;
	private String mobileNumber;
	private String occupation;
	private String institution;
	private String location;
	private Boolean sendNotification;
	private Boolean emailValidation;
	private Boolean mobileValidation;
	private Date lastLoginDate;
	private Set<Role> roles;
	private Float timezone;
	private Boolean identificationMail;
	private Boolean sendDigest;
	private Boolean sendPushNotification;
	private String website;
	private Boolean isAdmin;
	
	public UserProfileData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserProfileData(Long id, Long version, Boolean accountExpired, Boolean accountLocked,
			Boolean passwordExpired, Long languageId, Boolean enabled, String userName, String aboutMe, String email,
			Boolean hideEmial, String name, String profilePic, String icon, String sexType,
			Date dateCreated, Double latitude, Double longitude, String mobileNumber, String occupation,
			String institution, String location, Boolean sendNotification, Boolean emailValidation,
			Boolean mobileValidation, Date lastLoginDate, Set<Role> roles, Float timezone, Boolean identificationMail,
			Boolean sendDigest, Boolean sendPushNotification, String website, Boolean isAdmin) {
		super();
		this.id = id;
		this.version = version;
		this.accountExpired = accountExpired;
		this.accountLocked = accountLocked;
		this.passwordExpired = passwordExpired;
		this.languageId = languageId;
		this.enabled = enabled;
		this.userName = userName;
		this.aboutMe = aboutMe;
		this.email = email;
		this.hideEmial = hideEmial;
		this.name = name;
		this.profilePic = profilePic;
		this.icon = icon;
		this.sexType = sexType;
		this.dateCreated = dateCreated;
		this.latitude = latitude;
		this.longitude = longitude;
		this.mobileNumber = mobileNumber;
		this.occupation = occupation;
		this.institution = institution;
		this.location = location;
		this.sendNotification = sendNotification;
		this.emailValidation = emailValidation;
		this.mobileValidation = mobileValidation;
		this.lastLoginDate = lastLoginDate;
		this.roles = roles;
		this.timezone = timezone;
		this.identificationMail = identificationMail;
		this.sendDigest = sendDigest;
		this.sendPushNotification = sendPushNotification;
		this.website = website;
		this.isAdmin = isAdmin;
	}
	
	public UserProfileData(User user) {
		super();
		this.id = user.getId();
		this.version = user.getVersion();
		this.accountExpired = user.getAccountExpired();
		this.accountLocked = user.getAccountLocked();
		this.passwordExpired = user.getPasswordExpired();
		this.languageId = user.getLanguageId();
		this.enabled = user.getEnabled();
		this.userName = user.getUserName();
		this.aboutMe = user.getAboutMe();
		this.email = user.getEmail();
		this.hideEmial = user.getHideEmial();
		this.name = user.getName();
		this.profilePic = user.getProfilePic();
		this.icon = user.getIcon();
		this.sexType = user.getSexType();
		this.dateCreated = user.getDateCreated();
		this.latitude = user.getLatitude();
		this.longitude = user.getLongitude();
		this.mobileNumber = user.getMobileNumber();
		this.occupation = user.getOccupation();
		this.institution = user.getInstitution();
		this.location = user.getLocation();
		this.sendNotification = user.getSendNotification();
		this.emailValidation = user.getEmailValidation();
		this.mobileValidation = user.getMobileValidation();
		this.lastLoginDate = user.getLastLoginDate();

		this.isAdmin = false;
		
		roles = new HashSet<Role>();
		for(Role role : user.getRoles()) {
			roles.add(role);
			if(role.getAuthority().equalsIgnoreCase("ROLE_ADMIN"))
				this.isAdmin = true;
		}
		
		this.timezone = user.getTimezone();
		this.identificationMail = user.getIdentificationMail();
		this.sendDigest = user.getSendDigest();
		this.sendPushNotification = user.getSendPushNotification();
		this.website = user.getWebsite();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Boolean getAccountExpired() {
		return accountExpired;
	}

	public void setAccountExpired(Boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public Boolean getAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(Boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public Boolean getPasswordExpired() {
		return passwordExpired;
	}

	public void setPasswordExpired(Boolean passwordExpired) {
		this.passwordExpired = passwordExpired;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getHideEmial() {
		return hideEmial;
	}

	public void setHideEmial(Boolean hideEmial) {
		this.hideEmial = hideEmial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSexType() {
		return sexType;
	}

	public void setSexType(String sexType) {
		this.sexType = sexType;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getSendNotification() {
		return sendNotification;
	}

	public void setSendNotification(Boolean sendNotification) {
		this.sendNotification = sendNotification;
	}

	public Boolean getEmailValidation() {
		return emailValidation;
	}

	public void setEmailValidation(Boolean emailValidation) {
		this.emailValidation = emailValidation;
	}

	public Boolean getMobileValidation() {
		return mobileValidation;
	}

	public void setMobileValidation(Boolean mobileValidation) {
		this.mobileValidation = mobileValidation;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Float getTimezone() {
		return timezone;
	}

	public void setTimezone(Float timezone) {
		this.timezone = timezone;
	}

	public Boolean getIdentificationMail() {
		return identificationMail;
	}

	public void setIdentificationMail(Boolean identificationMail) {
		this.identificationMail = identificationMail;
	}

	public Boolean getSendDigest() {
		return sendDigest;
	}

	public void setSendDigest(Boolean sendDigest) {
		this.sendDigest = sendDigest;
	}

	public Boolean getSendPushNotification() {
		return sendPushNotification;
	}

	public void setSendPushNotification(Boolean sendPushNotification) {
		this.sendPushNotification = sendPushNotification;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
