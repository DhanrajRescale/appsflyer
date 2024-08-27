package com.assetgro.stockgro.data.local.preference;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Singleton;
import kj.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 r2\u00020\u0001:\u0001rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010;\u001a\u00020\fJ\b\u0010<\u001a\u0004\u0018\u00010\u0006J\b\u0010=\u001a\u0004\u0018\u00010\u0006J\b\u0010>\u001a\u0004\u0018\u00010\u0006J\b\u0010?\u001a\u0004\u0018\u00010\u0006J\b\u0010@\u001a\u0004\u0018\u00010\u0006J\b\u0010A\u001a\u0004\u0018\u00010\u0006J\b\u0010B\u001a\u0004\u0018\u00010\u0006J\b\u0010C\u001a\u0004\u0018\u00010\u0006J\b\u0010D\u001a\u0004\u0018\u00010\u0006J\b\u0010E\u001a\u0004\u0018\u00010\u0006J\u0006\u0010F\u001a\u00020GJ\b\u0010H\u001a\u0004\u0018\u00010\u0006J\b\u0010I\u001a\u0004\u0018\u00010\u0006J\b\u0010J\u001a\u0004\u0018\u00010\u0006J\b\u0010K\u001a\u0004\u0018\u00010\u0006J\b\u0010L\u001a\u0004\u0018\u00010\u0006J\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020\fJ\u0006\u0010P\u001a\u00020\fJ\u0006\u0010Q\u001a\u00020\fJ\"\u0010R\u001a\n T*\u0004\u0018\u00010S0S2\b\u0010U\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010V\u001a\u00020\fJ\u001e\u0010W\u001a\n T*\u0004\u0018\u00010S0S2\u0006\u0010X\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\fJ\u000e\u0010Y\u001a\u00020N2\u0006\u0010X\u001a\u00020\u0006J\u000e\u0010Z\u001a\u00020N2\u0006\u0010[\u001a\u00020\u0006J\u000e\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u00020\u0006J\u000e\u0010^\u001a\u00020N2\u0006\u0010_\u001a\u00020\fJ\u000e\u0010`\u001a\u00020N2\u0006\u0010a\u001a\u00020\fJ\u000e\u0010b\u001a\u00020N2\u0006\u0010c\u001a\u00020\fJ\u000e\u0010d\u001a\u00020N2\u0006\u0010U\u001a\u00020\u0006J\u000e\u0010e\u001a\u00020N2\u0006\u0010f\u001a\u00020\u0006J \u0010g\u001a\n T*\u0004\u0018\u00010S0S2\u0006\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\fJ\u000e\u0010h\u001a\u00020N2\u0006\u0010i\u001a\u00020\u0006J\u000e\u0010j\u001a\u00020N2\u0006\u0010f\u001a\u00020\u0006J\u000e\u0010k\u001a\u00020N2\u0006\u0010f\u001a\u00020GJ\u000e\u0010l\u001a\u00020N2\u0006\u0010m\u001a\u00020\u0006J\"\u0010n\u001a\n T*\u0004\u0018\u00010S0S2\b\u0010o\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010V\u001a\u00020\fJ\"\u0010p\u001a\n T*\u0004\u0018\u00010S0S2\b\u0010U\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010V\u001a\u00020\fJ\u0010\u0010q\u001a\u00020N2\b\u0010U\u001a\u0004\u0018\u00010\u0006R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R$\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R(\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR$\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR$\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR$\u0010,\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010/\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R$\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\t\"\u0004\b4\u0010\u000bR$\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR$\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000b¨\u0006s"}, d2 = {"Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", HttpUrl.FRAGMENT_ENCODE_SET, "prefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "avatarUrl", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "cloneDataUpdated", "getCloneDataUpdated", "()Z", "setCloneDataUpdated", "(Z)V", "countryCode", "getCountryCode", "setCountryCode", "Ljava/util/Date;", "dateOfAccessTokenUpdate", "getDateOfAccessTokenUpdate", "()Ljava/util/Date;", "setDateOfAccessTokenUpdate", "(Ljava/util/Date;)V", "firebaseToken", "getFirebaseToken", "setFirebaseToken", "hasVisitedHomePage", "getHasVisitedHomePage", "setHasVisitedHomePage", "isExpertUser", "setExpertUser", "loginId", "getLoginId", "setLoginId", "mobilePrefix", "getMobilePrefix", "setMobilePrefix", "newFirebaseToken", "getNewFirebaseToken", "setNewFirebaseToken", "notificationIdUpdated", "getNotificationIdUpdated", "setNotificationIdUpdated", "subscriptionPlanRegisteredOnMixpanel", "getSubscriptionPlanRegisteredOnMixpanel", "setSubscriptionPlanRegisteredOnMixpanel", "userDisplayBio", "getUserDisplayBio", "setUserDisplayBio", "userDisplayName", "getUserDisplayName", "setUserDisplayName", "userImageSignature", "getUserImageSignature", "setUserImageSignature", "clearPreferences", "getAccessToken", "getDeepLinkPath", "getDeepLinkPathIdentifier", "getFid", "getInvitationCode", "getPhoneNumber", "getPrivacyPolicyVersion", "getRefreshToken", "getSocialLanding", "getTermsAndConditionVersion", "getTimeDiff", HttpUrl.FRAGMENT_ENCODE_SET, "getUserEmail", "getUserName", "getUserReferralCode", "getUserRole", "getUuid", "initializeLocale", HttpUrl.FRAGMENT_ENCODE_SET, "isDeepLinkActive", "isDeferredDeepLink", "isSocialHomeFeedEnabled", "setAccessToken", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "token", "commit", "setDeepLinkPath", "path", "setDeepLinkPathIdentifier", "setFid", UserPreferences.FID, "setInvitationCode", "invitationCode", "setIsDeepLinkActive", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "setIsDeferredDeepLink", "isDeferred", "setIsSocialHomeFeedEnabled", "enabled", "setPhoneNumber", "setPrivacyPolicyVersion", "versionCode", "setRefreshToken", "setSocialLanding", "destination", "setTermsAndConditionVersion", "setTimeDiff", "setUserName", "userName", "setUserReferralCode", "referralCode", "setUserRole", "setUuid", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserPreferences {

    @NotNull
    public static final String CLONE_DATA_UPDATED = "CLONE_DATA_UPDATED_V2";

    @NotNull
    public static final String COUNTRY_CODE = "COUNTRY_CODE";

    @NotNull
    public static final String COUNTRY_PREFIX = "COUNTRY_PREFIX";

    @NotNull
    public static final String DEEPLINK_PATH = "DEEPLINK_PATH";

    @NotNull
    public static final String DEEPLINK_PATH_IDENTIFIER = "DEEPLINK_PATH_IDENTIFIER";

    @NotNull
    public static final String FID = "fid";

    @NotNull
    public static final String FIREBASE_TOKEN = "FIREBASE_TOKEN";

    @NotNull
    public static final String HAS_SEEN_INFO_MESSAGE = "HAS_SEEN_INFO_MESSAGE";

    @NotNull
    public static final String INVITATION_CODE = "INVITATION_CODE";

    @NotNull
    public static final String IS_DEEPLINK_ACTIVE = "IS_DEEPLINK_ACTIVE";

    @NotNull
    public static final String IS_DEFERRED_DEEPLINK = "IS_DEFERRED_DEEPLINK";

    @NotNull
    public static final String IS_EXPERT = "IS_EXPERT";

    @NotNull
    public static final String IS_SOCIAL_HOME_FEED_ENABLED = "IS_SOCIAL_HOME_FEED_ENABLED";

    @NotNull
    public static final String KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";

    @NotNull
    public static final String KEY_ACCESS_TOKEN_UPDATE = "ACCESS_TOKEN_UPDATE";

    @NotNull
    public static final String KEY_REFRESH_TOKEN = "PREF_KEY_REFRESH_TOKEN";

    @NotNull
    public static final String KEY_USER_AVATAR_URL = "AVATAR_URL";

    @NotNull
    public static final String KEY_USER_DISPLAY_BIO = "DISPLAY_BIO";

    @NotNull
    public static final String KEY_USER_DISPLAY_NAME = "DISPLAY_NAME";

    @NotNull
    public static final String KEY_USER_EMAIL = "PREF_KEY_USER_EMAIL";

    @NotNull
    public static final String KEY_USER_IMAGE_SIGNATURE = "KEY_USER_IMAGE_SIGNATURE";

    @NotNull
    public static final String KEY_USER_NAME = "PREF_KEY_USER_NAME";

    @NotNull
    public static final String KEY_USER_ROLE = "PREF_KEY_USER_ROLE";

    @NotNull
    public static final String LOGIN_ID = "LOGIN_ID";

    @NotNull
    public static final String NOTIFICATION_ID_UPDATE_FLAG = "notification_id_update_flag";

    @NotNull
    public static final String PHONE_NUMBER = "PHONE_NUMBER";

    @NotNull
    public static final String PRIVACY_POLICY_VERSION = "privacy_policy_version";

    @NotNull
    public static final String SOCIAL_LANDING = "SOCIAL_LANDING";

    @NotNull
    public static final String SUBSCRIPTION_PLAN_REGISTERED_ON_MIXPANEL = "SUBSCRIPTION_PLAN_REGISTERED_ON_MIXPANEL";

    @NotNull
    public static final String TERMS_AND_CONDITION_VERSION = "terms_and_condition_version";

    @NotNull
    public static final String TIME_DIFF = "TIME_DIFF";

    @NotNull
    public static final String USER_REFERRAL_CODE = "REFERRAL_CODE";

    @NotNull
    public static final String UUID = "UUID";

    @NotNull
    private final SharedPreferences prefs;
    public static final int $stable = 8;

    @Inject
    public UserPreferences(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public static /* synthetic */ SharedPreferences.Editor setAccessToken$default(UserPreferences userPreferences, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return userPreferences.setAccessToken(str, z10);
    }

    public static /* synthetic */ SharedPreferences.Editor setRefreshToken$default(UserPreferences userPreferences, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return userPreferences.setRefreshToken(str, z10);
    }

    public static /* synthetic */ SharedPreferences.Editor setUserReferralCode$default(UserPreferences userPreferences, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return userPreferences.setUserReferralCode(str, z10);
    }

    public static /* synthetic */ SharedPreferences.Editor setUserRole$default(UserPreferences userPreferences, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return userPreferences.setUserRole(str, z10);
    }

    public final boolean clearPreferences() {
        return this.prefs.edit().clear().commit();
    }

    public final String getAccessToken() {
        return this.prefs.getString(KEY_ACCESS_TOKEN, null);
    }

    @NotNull
    public final String getAvatarUrl() {
        String string = this.prefs.getString(KEY_USER_AVATAR_URL, "https://bit.ly/2TIt8NR");
        if (string == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string;
    }

    public final boolean getCloneDataUpdated() {
        return this.prefs.getBoolean(CLONE_DATA_UPDATED, false);
    }

    public final String getCountryCode() {
        return this.prefs.getString(COUNTRY_CODE, null);
    }

    @NotNull
    public final Date getDateOfAccessTokenUpdate() {
        return new Date(this.prefs.getLong(KEY_ACCESS_TOKEN_UPDATE, 0L));
    }

    public final String getDeepLinkPath() {
        return this.prefs.getString(DEEPLINK_PATH, null);
    }

    public final String getDeepLinkPathIdentifier() {
        return this.prefs.getString(DEEPLINK_PATH_IDENTIFIER, null);
    }

    public final String getFid() {
        return this.prefs.getString(FID, null);
    }

    @NotNull
    public final String getFirebaseToken() {
        String string = this.prefs.getString(FIREBASE_TOKEN, HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string;
    }

    public final boolean getHasVisitedHomePage() {
        return this.prefs.getBoolean(HAS_SEEN_INFO_MESSAGE, false);
    }

    public final String getInvitationCode() {
        return this.prefs.getString(INVITATION_CODE, null);
    }

    public final String getLoginId() {
        return this.prefs.getString(LOGIN_ID, null);
    }

    @NotNull
    public final String getMobilePrefix() {
        String string = this.prefs.getString(COUNTRY_PREFIX, "+91");
        if (string == null) {
            return "+91";
        }
        return string;
    }

    @NotNull
    public final String getNewFirebaseToken() {
        String string = this.prefs.getString("NEW_FIREBASE_TOKEN", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string;
    }

    public final boolean getNotificationIdUpdated() {
        return this.prefs.getBoolean(NOTIFICATION_ID_UPDATE_FLAG, false);
    }

    public final String getPhoneNumber() {
        return this.prefs.getString("PHONE_NUMBER", null);
    }

    public final String getPrivacyPolicyVersion() {
        return this.prefs.getString(PRIVACY_POLICY_VERSION, "0");
    }

    public final String getRefreshToken() {
        return this.prefs.getString(KEY_REFRESH_TOKEN, null);
    }

    public final String getSocialLanding() {
        return this.prefs.getString(SOCIAL_LANDING, null);
    }

    public final boolean getSubscriptionPlanRegisteredOnMixpanel() {
        return this.prefs.getBoolean(SUBSCRIPTION_PLAN_REGISTERED_ON_MIXPANEL, false);
    }

    public final String getTermsAndConditionVersion() {
        return this.prefs.getString(TERMS_AND_CONDITION_VERSION, "0");
    }

    public final long getTimeDiff() {
        return this.prefs.getLong(TIME_DIFF, -1L);
    }

    @NotNull
    public final String getUserDisplayBio() {
        String string = this.prefs.getString(KEY_USER_DISPLAY_BIO, getUserEmail());
        if (string == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string;
    }

    @NotNull
    public final String getUserDisplayName() {
        String string = this.prefs.getString(KEY_USER_DISPLAY_NAME, getUserEmail());
        if (string == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string;
    }

    public final String getUserEmail() {
        return this.prefs.getString(KEY_USER_EMAIL, null);
    }

    @NotNull
    public final String getUserImageSignature() {
        String string = this.prefs.getString(KEY_USER_IMAGE_SIGNATURE, HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string;
    }

    public final String getUserName() {
        return this.prefs.getString("PREF_KEY_USER_NAME", null);
    }

    public final String getUserReferralCode() {
        return this.prefs.getString(USER_REFERRAL_CODE, null);
    }

    public final String getUserRole() {
        return this.prefs.getString(KEY_USER_ROLE, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String getUuid() {
        return this.prefs.getString("UUID", null);
    }

    public final void initializeLocale() {
        byte[] bArr = a.f23206a;
        a.f23207b = Intrinsics.a(getCountryCode(), "AE");
    }

    public final boolean isDeepLinkActive() {
        return this.prefs.getBoolean(IS_DEEPLINK_ACTIVE, false);
    }

    public final boolean isDeferredDeepLink() {
        return this.prefs.getBoolean(IS_DEFERRED_DEEPLINK, false);
    }

    public final boolean isExpertUser() {
        return this.prefs.getBoolean(IS_EXPERT, false);
    }

    public final boolean isSocialHomeFeedEnabled() {
        return this.prefs.getBoolean(IS_SOCIAL_HOME_FEED_ENABLED, false);
    }

    public final SharedPreferences.Editor setAccessToken(String token, boolean commit) {
        SharedPreferences.Editor putString = this.prefs.edit().putString(KEY_ACCESS_TOKEN, token);
        if (commit) {
            putString.commit();
        } else {
            putString.apply();
        }
        return putString;
    }

    public final void setAvatarUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_USER_AVATAR_URL, value);
        edit.apply();
    }

    public final void setCloneDataUpdated(boolean z10) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putBoolean(CLONE_DATA_UPDATED, z10);
        edit.apply();
    }

    public final void setCountryCode(String str) {
        SharedPreferences.Editor edit = this.prefs.edit();
        initializeLocale();
        edit.putString(COUNTRY_CODE, str);
        edit.apply();
    }

    public final void setDateOfAccessTokenUpdate(@NotNull Date value) {
        Intrinsics.checkNotNullParameter(value, "value");
        long time = value.getTime();
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putLong(KEY_ACCESS_TOKEN_UPDATE, time);
        edit.apply();
    }

    public final SharedPreferences.Editor setDeepLinkPath(@NotNull String path, boolean commit) {
        Intrinsics.checkNotNullParameter(path, "path");
        SharedPreferences.Editor putString = this.prefs.edit().putString(DEEPLINK_PATH, path);
        if (commit) {
            putString.commit();
        } else {
            putString.apply();
        }
        return putString;
    }

    public final void setDeepLinkPathIdentifier(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.prefs.edit().putString(DEEPLINK_PATH_IDENTIFIER, path).apply();
    }

    public final void setExpertUser(boolean z10) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putBoolean(IS_EXPERT, z10);
        edit.apply();
    }

    public final void setFid(@NotNull String fid) {
        Intrinsics.checkNotNullParameter(fid, "fid");
        this.prefs.edit().putString(FID, fid).apply();
    }

    public final void setFirebaseToken(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(FIREBASE_TOKEN, value);
        edit.apply();
    }

    public final void setHasVisitedHomePage(boolean z10) {
        this.prefs.edit().putBoolean(HAS_SEEN_INFO_MESSAGE, z10).apply();
    }

    public final void setInvitationCode(@NotNull String invitationCode) {
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        this.prefs.edit().putString(INVITATION_CODE, invitationCode).apply();
    }

    public final void setIsDeepLinkActive(boolean active) {
        this.prefs.edit().putBoolean(IS_DEEPLINK_ACTIVE, active).apply();
    }

    public final void setIsDeferredDeepLink(boolean isDeferred) {
        this.prefs.edit().putBoolean(IS_DEFERRED_DEEPLINK, isDeferred).apply();
    }

    public final void setIsSocialHomeFeedEnabled(boolean enabled) {
        this.prefs.edit().putBoolean(IS_SOCIAL_HOME_FEED_ENABLED, enabled).apply();
    }

    public final void setLoginId(String str) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(LOGIN_ID, str);
        edit.apply();
    }

    public final void setMobilePrefix(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(COUNTRY_PREFIX, value);
        edit.apply();
    }

    public final void setNewFirebaseToken(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString("NEW_FIREBASE_TOKEN", value);
        edit.apply();
    }

    public final void setNotificationIdUpdated(boolean z10) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putBoolean(NOTIFICATION_ID_UPDATE_FLAG, z10);
        edit.apply();
    }

    public final void setPhoneNumber(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.prefs.edit().putString("PHONE_NUMBER", token).apply();
    }

    public final void setPrivacyPolicyVersion(@NotNull String versionCode) {
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        this.prefs.edit().putString(PRIVACY_POLICY_VERSION, versionCode).apply();
    }

    public final SharedPreferences.Editor setRefreshToken(@NotNull String token, boolean commit) {
        Intrinsics.checkNotNullParameter(token, "token");
        SharedPreferences.Editor putString = this.prefs.edit().putString(KEY_REFRESH_TOKEN, token);
        if (commit) {
            putString.commit();
        } else {
            putString.apply();
        }
        return putString;
    }

    public final void setSocialLanding(@NotNull String destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.prefs.edit().putString(SOCIAL_LANDING, destination).apply();
    }

    public final void setSubscriptionPlanRegisteredOnMixpanel(boolean z10) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putBoolean(SUBSCRIPTION_PLAN_REGISTERED_ON_MIXPANEL, z10);
        edit.apply();
    }

    public final void setTermsAndConditionVersion(@NotNull String versionCode) {
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        this.prefs.edit().putString(TERMS_AND_CONDITION_VERSION, versionCode).apply();
    }

    public final void setTimeDiff(long versionCode) {
        this.prefs.edit().putLong(TIME_DIFF, versionCode).apply();
    }

    public final void setUserDisplayBio(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_USER_DISPLAY_BIO, value);
        edit.apply();
    }

    public final void setUserDisplayName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_USER_DISPLAY_NAME, value);
        edit.apply();
    }

    public final void setUserImageSignature(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_USER_IMAGE_SIGNATURE, value);
        edit.apply();
    }

    public final void setUserName(@NotNull String userName) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.prefs.edit().putString("PREF_KEY_USER_NAME", userName).apply();
    }

    public final SharedPreferences.Editor setUserReferralCode(String referralCode, boolean commit) {
        SharedPreferences.Editor putString = this.prefs.edit().putString(USER_REFERRAL_CODE, referralCode);
        if (commit) {
            putString.commit();
        } else {
            putString.apply();
        }
        return putString;
    }

    public final SharedPreferences.Editor setUserRole(String token, boolean commit) {
        SharedPreferences.Editor putString = this.prefs.edit().putString(KEY_USER_ROLE, token);
        if (commit) {
            putString.commit();
        } else {
            putString.apply();
        }
        return putString;
    }

    public final void setUuid(String token) {
        this.prefs.edit().putString("UUID", token).apply();
    }
}
