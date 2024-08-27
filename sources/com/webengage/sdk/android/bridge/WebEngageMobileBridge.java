package com.webengage.sdk.android.bridge;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.webengage.sdk.android.Channel;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.UserProfile;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.Gender;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebEngageMobileBridge {
    private static final String BIRTH_DATE = "we_birth_date";
    public static final String BRIDGE_NAME = "__WEBENGAGE_MOBILE_BRIDGE__";
    private static final String COMPANY = "we_company";
    private static final String EMAIL = "we_email";
    private static final String EMAIL_OPT_IN = "we_email_opt_in";
    private static final String FIRST_NAME = "we_first_name";
    private static final String GENDER = "we_gender";
    private static final String HASHED_EMAIL = "we_hashed_email";
    private static final String HASHED_PHONE = "we_hashed_phone";
    private static final String LAST_NAME = "we_last_name";
    private static final String PHONE = "we_phone";
    private static final String PUSH_OPT_IN = "we_push_opt_in";
    private static final String SMS_OPT_IN = "we_sms_opt_in";
    private static final String TAG = "WebEngageMobileBridge";
    private static final String WHATSAPP_OPT_IN = "we_whatsapp_opt_in";
    Context applicationContext;

    public WebEngageMobileBridge(Context context) {
        this.applicationContext = null;
        this.applicationContext = context.getApplicationContext();
    }

    @JavascriptInterface
    public void login(String str) {
        Logger.d(TAG, "Bridge login called: " + str);
        WebEngage.get().user().login(str);
    }

    @JavascriptInterface
    public void logout() {
        Logger.d(TAG, "Bridge logout called");
        WebEngage.get().user().logout();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0032  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void screen(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bridge screen called screenName: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", screenData: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebEngageMobileBridge"
            com.webengage.sdk.android.Logger.d(r1, r0)
            if (r5 == 0) goto L2f
            com.webengage.sdk.android.utils.DataType r0 = com.webengage.sdk.android.utils.DataType.MAP     // Catch: java.lang.Exception -> L27
            r2 = 0
            java.lang.Object r5 = com.webengage.sdk.android.utils.DataType.convert(r5, r0, r2)     // Catch: java.lang.Exception -> L27
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L27
            goto L30
        L27:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.webengage.sdk.android.Logger.e(r1, r5)
        L2f:
            r5 = 0
        L30:
            if (r4 == 0) goto L4c
            if (r5 == 0) goto L40
            com.webengage.sdk.android.AbstractWebEngage r0 = com.webengage.sdk.android.WebEngage.get()
            com.webengage.sdk.android.Analytics r0 = r0.analytics()
            r0.screenNavigated(r4, r5)
            goto L59
        L40:
            com.webengage.sdk.android.AbstractWebEngage r5 = com.webengage.sdk.android.WebEngage.get()
            com.webengage.sdk.android.Analytics r5 = r5.analytics()
            r5.screenNavigated(r4)
            goto L59
        L4c:
            if (r5 == 0) goto L59
            com.webengage.sdk.android.AbstractWebEngage r4 = com.webengage.sdk.android.WebEngage.get()
            com.webengage.sdk.android.Analytics r4 = r4.analytics()
            r4.setScreenData(r5)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.bridge.WebEngageMobileBridge.screen(java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public void setAttribute(String str) {
        Map map;
        Channel channel;
        Boolean valueOf;
        Logger.d(TAG, "Bridge attribute called: " + str);
        try {
            map = (Map) DataType.convert(str, DataType.MAP, false);
        } catch (Exception e10) {
            Logger.e(TAG, e10.toString());
            map = null;
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    HashMap hashMap = new HashMap();
                    UserProfile.Builder builder = new UserProfile.Builder();
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            if (FIRST_NAME.equals(str2) && (value instanceof String)) {
                                builder.setFirstName((String) value);
                            } else if (LAST_NAME.equals(str2) && (value instanceof String)) {
                                builder.setLastName((String) value);
                            } else if (EMAIL.equals(str2) && (value instanceof String)) {
                                builder.setEmail((String) value);
                            } else if (BIRTH_DATE.equals(str2) && (value instanceof String)) {
                                builder.setBirthDate((String) value);
                            } else if (PHONE.equals(str2) && (value instanceof String)) {
                                builder.setPhoneNumber((String) value);
                            } else if (GENDER.equals(str2) && (value instanceof String)) {
                                builder.setGender(Gender.valueByString((String) value));
                            } else if (COMPANY.equals(str2) && (value instanceof String)) {
                                builder.setCompany((String) value);
                            } else if (HASHED_EMAIL.equals(str2) && (value instanceof String)) {
                                builder.setHashedEmail((String) value);
                            } else if (HASHED_PHONE.equals(str2) && (value instanceof String)) {
                                builder.setHashedPhoneNumber((String) value);
                            } else if (PUSH_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.PUSH;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (SMS_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.SMS;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (EMAIL_OPT_IN.equals(str2)) {
                                if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                    channel = Channel.EMAIL;
                                    valueOf = Boolean.valueOf(value.toString());
                                    builder.setOptIn(channel, valueOf.booleanValue());
                                }
                            } else if (!WHATSAPP_OPT_IN.equals(str2)) {
                                hashMap.put(str2, value);
                            } else if ("true".equals(value.toString()) || "false".equals(value.toString())) {
                                channel = Channel.WHATSAPP;
                                valueOf = Boolean.valueOf(value.toString());
                                builder.setOptIn(channel, valueOf.booleanValue());
                            }
                        }
                    }
                    if (hashMap.size() > 0) {
                        WebEngage.get().user().setAttributes(hashMap);
                    }
                    WebEngage.get().user().setUserProfile(builder.build());
                }
            } catch (Exception e11) {
                Logger.e(TAG, e11.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0032  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void track(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bridge track called eventName: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", eventData: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebEngageMobileBridge"
            com.webengage.sdk.android.Logger.d(r1, r0)
            if (r5 == 0) goto L2f
            com.webengage.sdk.android.utils.DataType r0 = com.webengage.sdk.android.utils.DataType.MAP     // Catch: java.lang.Exception -> L27
            r2 = 0
            java.lang.Object r5 = com.webengage.sdk.android.utils.DataType.convert(r5, r0, r2)     // Catch: java.lang.Exception -> L27
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L27
            goto L30
        L27:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.webengage.sdk.android.Logger.e(r1, r5)
        L2f:
            r5 = 0
        L30:
            if (r4 == 0) goto L4b
            if (r5 == 0) goto L40
            com.webengage.sdk.android.AbstractWebEngage r0 = com.webengage.sdk.android.WebEngage.get()
            com.webengage.sdk.android.Analytics r0 = r0.analytics()
            r0.track(r4, r5)
            goto L4b
        L40:
            com.webengage.sdk.android.AbstractWebEngage r5 = com.webengage.sdk.android.WebEngage.get()
            com.webengage.sdk.android.Analytics r5 = r5.analytics()
            r5.track(r4)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.bridge.WebEngageMobileBridge.track(java.lang.String, java.lang.String):void");
    }
}
