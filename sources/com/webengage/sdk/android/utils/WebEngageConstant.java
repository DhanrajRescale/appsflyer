package com.webengage.sdk.android.utils;

import android.util.Base64;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class WebEngageConstant {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12690a = 456647605;

    /* renamed from: b, reason: collision with root package name */
    public static final List<b> f12691b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f12692c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f12693d;

    /* loaded from: classes2.dex */
    public enum STYLE {
        BIG_PICTURE,
        BIG_TEXT,
        INBOX,
        CAROUSEL_V1,
        RATING_V1
    }

    /* loaded from: classes2.dex */
    public enum a {
        NOTIFICATION,
        SURVEY,
        PUSH,
        INLINE_PERSONALIZATION
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f12699a;

        /* renamed from: b, reason: collision with root package name */
        public String f12700b;

        /* renamed from: c, reason: collision with root package name */
        public a f12701c;

        public b() {
            this.f12699a = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f12700b = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f12701c = null;
        }

        public b(String str, String str2, a aVar) {
            this.f12699a = str;
            this.f12700b = str2;
            this.f12701c = aVar;
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        PAGE_RULE("pageRuleCode"),
        SESSION_RULE("sessionRuleCode"),
        EVENT_RULE("eventRuleCode"),
        CUSTOM_RULE("customRuleCode");


        /* renamed from: f, reason: collision with root package name */
        private String f12707f;

        c(String str) {
            this.f12707f = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f12707f;
        }
    }

    /* loaded from: classes2.dex */
    public enum d {
        UPLOAD_EVENTS_URL("https://c.webengage.com/m2.jpg", "https://c.webengage.io/m2.jpg", "https://c.in.webengage.com/m2.jpg", "https://c.ir0.webengage.com/m2.jpg", "https://c.unl.webengage.com/m2.jpg"),
        EXCEPTION_END_POINT("https://c.webengage.com/e.jpg", "https://c.webengage.io/e.jpg", "https://c.in.webengage.com/e.jpg", "https://c.ir0.webengage.com/e.jpg", "https://c.unl.webengage.com/e.jpg"),
        USER_PROFILE_BASE("https://c.webengage.com/upf.js", "https://c.webengage.io/upf.js", "https://c.in.webengage.com/upf.js", "https://c.ir0.webengage.com/upf.js", "https://c.unl.webengage.com/upf.js"),
        JOURNEY_CONTEXT_BASE("https://c.webengage.com/jcx.js", "https://c.webengage.io/jcx.js", "https://c.in.webengage.com/jcx.js", "https://c.ir0.webengage.com/jcx.js", "https://c.unl.webengage.com/jcx.js"),
        RESOURCE_BASE("https://wsdk-files.webengage.com/", "https://s3.amazonaws.com/webengage-zfiles-gc/", "https://wsdk-files.in.webengage.com/", "https://wsdk-files.ir0.webengage.com/", "https://wsdk-files.webengage.com/"),
        PERSONALISATION_BASE("https://p.webengage.com", "https://p.webengage.io", "https://p.in.webengage.com", "https://p.ir0.webengage.com", "https://p.unl.webengage.com"),
        AMPLIFY_PUSH_BASE("https://c.webengage.com/push-amp", "https://c.webengage.io/push-amp", "https://c.in.webengage.com/push-amp", "https://c.ir0.webengage.com/push-amp", "https://c.unl.webengage.com/push-amp");


        /* renamed from: i, reason: collision with root package name */
        private String[] f12716i;

        d(String... strArr) {
            this.f12716i = strArr;
        }

        public static String a(String str) {
            return RESOURCE_BASE.toString() + "webengage/" + str + "/android/v4.js";
        }

        public static String b(String str, String str2, String str3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(USER_PROFILE_BASE.toString());
            sb2.append("?licenseCode=");
            sb2.append(str3);
            sb2.append("&luid=");
            sb2.append(str);
            if (str2 != null && !str2.isEmpty()) {
                try {
                    String encode = URLEncoder.encode(str2, "UTF-8");
                    sb2.append("&cuid=");
                    sb2.append(encode);
                } catch (UnsupportedEncodingException unused) {
                }
            }
            return sb2.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            String environment = WebEngage.get().getWebEngageConfig().getEnvironment();
            if ("aws".equals(environment)) {
                return this.f12716i[0];
            }
            if ("gce".equals(environment)) {
                return this.f12716i[1];
            }
            if ("in".equals(environment)) {
                return this.f12716i[2];
            }
            if ("ir0".equals(environment)) {
                return this.f12716i[3];
            }
            if ("unl".equals(environment)) {
                return this.f12716i[4];
            }
            return null;
        }

        public static String a(String str, String str2) {
            return str + "js/notification-layout-" + str2 + ".js";
        }

        public static String a(String str, String str2, String str3) {
            String str4;
            StringBuilder sb2 = new StringBuilder(AMPLIFY_PUSH_BASE.toString());
            v.e.v(sb2, "?sdkId=2&licenseCode=", str, "&luid=", str2);
            if (!WebEngageUtils.c(str3)) {
                try {
                    String encode = URLEncoder.encode(str3, "UTF-8");
                    sb2.append("&cuid=");
                    sb2.append(encode);
                } catch (UnsupportedEncodingException e10) {
                    Logger.e("WebEngage", "Exception while url-encoding cuid: " + str3, e10);
                }
            }
            try {
                String a10 = WebEngageUtils.a();
                String encode2 = URLEncoder.encode(String.format("%s:%s", a10.substring(0, 3), a10.substring(3)), "UTF-8");
                sb2.append("&timezone=");
                sb2.append(encode2);
            } catch (UnsupportedEncodingException e11) {
                e = e11;
                str4 = "Exception while url-encoding timezone in push-amplify url.";
                Logger.e("WebEngage", str4, e);
                sb2.append("&sdkVersion=40000.0");
                return sb2.toString();
            } catch (Exception e12) {
                e = e12;
                str4 = "Exception while adding timezone in push-amplify url.";
                Logger.e("WebEngage", str4, e);
                sb2.append("&sdkVersion=40000.0");
                return sb2.toString();
            }
            sb2.append("&sdkVersion=40000.0");
            return sb2.toString();
        }

        public static String a(String str, String str2, String str3, String str4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(JOURNEY_CONTEXT_BASE.toString());
            sb2.append("?licenseCode=");
            sb2.append(str3);
            sb2.append("&luid=");
            sb2.append(str);
            if (str2 != null && !str2.isEmpty()) {
                try {
                    String encode = URLEncoder.encode(str2, "UTF-8");
                    sb2.append("&cuid=");
                    sb2.append(encode);
                } catch (UnsupportedEncodingException unused) {
                }
            }
            if (str4 != null) {
                try {
                    String encodeToString = Base64.encodeToString(str4.getBytes(), 0);
                    sb2.append("&upfc2=");
                    sb2.append(URLEncoder.encode(encodeToString, "UTF-8"));
                } catch (UnsupportedEncodingException unused2) {
                } catch (AssertionError unused3) {
                    Logger.e("WebEngage", " Error while encoding upfc to base 64");
                }
            }
            return sb2.toString();
        }

        public static String a(String str, String str2, String str3, String str4, String str5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PERSONALISATION_BASE.toString());
            sb2.append("/users/");
            sb2.append(str);
            sb2.append("/");
            v.e.v(sb2, str2, "/templates/", str5, str3);
            if (str4 != null && !str4.isEmpty()) {
                try {
                    String encode = URLEncoder.encode(str4, "UTF-8");
                    sb2.append("?cuid=");
                    sb2.append(encode);
                } catch (UnsupportedEncodingException unused) {
                }
            }
            return sb2.toString();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f12691b = arrayList;
        arrayList.add(new b("personalizationRuleList", "notificationEncId", a.INLINE_PERSONALIZATION));
        arrayList.add(new b("notificationRuleList", "notificationEncId", a.NOTIFICATION));
        arrayList.add(new b("surveyRuleList", "surveyEncId", a.SURVEY));
        f12692c = new String[]{"view", "click", "close", "view_session", "close_session"};
        HashMap hashMap = new HashMap();
        f12693d = hashMap;
        hashMap.put("push_notification_click", 2);
        hashMap.put("push_notification_close", 2);
        hashMap.put("push_notification_item_view", 2);
        hashMap.put("push_notification_rating_submitted", 2);
        hashMap.put("push_notification_rerender", 2);
        hashMap.put("push_notification_received", 2);
        hashMap.put("push_notification_view", 2);
        hashMap.put("geofence_transition", 2);
        hashMap.put("gcm_registered", 2);
        hashMap.put("app_upgraded", 2);
        hashMap.put("app_installed", 2);
    }
}
