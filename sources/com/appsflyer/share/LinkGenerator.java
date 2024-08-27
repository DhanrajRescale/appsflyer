package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFf1rSDK;
import com.appsflyer.internal.AFj1qSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    private String AFInAppEventType;
    String AFKeystoreWrapper;
    private String AFLogger;
    private String afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private String f8554d;

    /* renamed from: e, reason: collision with root package name */
    private String f8555e;
    private String registerClient;
    private String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final Map<String, String> f8556v = new HashMap();
    String valueOf;
    private final String values;

    /* renamed from: w, reason: collision with root package name */
    private String f8557w;

    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.values = str;
    }

    private Map<String, String> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.values);
        String str = this.registerClient;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventType;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.AFLogger;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventParameterName;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.unregisterClient;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.f8554d;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.afInfoLog != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.afInfoLog);
            String str7 = this.f8555e;
            if (str7 != null) {
                String str8 = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f8555e = str7.replaceFirst("^[/]", HttpUrl.FRAGMENT_ENCODE_SET);
                if (!this.afInfoLog.endsWith("/")) {
                    str8 = "/";
                }
                sb2.append(str8);
                sb2.append(this.f8555e);
            }
            hashMap.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.f8556v.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1aSDK.valueOf(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f8556v.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f8556v.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str != null && str.startsWith("http")) {
            sb2.append(this.AFKeystoreWrapper);
        } else {
            sb2.append(String.format(AFj1qSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        }
        if (this.valueOf != null) {
            sb2.append('/');
            sb2.append(this.valueOf);
        }
        Map<String, String> values = values();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.f8557w;
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public String getChannel() {
        return this.AFInAppEventType;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.f8556v);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFKeystoreWrapper = String.format("https://%s/%s", str2, str);
        } else {
            this.AFKeystoreWrapper = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()), str3);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f8557w = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f8555e = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f8554d = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.unregisterClient = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.registerClient = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.f8557w;
        Map<String, String> values = values();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1vSDK.AFKeystoreWrapper().valueOf(context);
        AFd1kSDK AFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        AFf1rSDK aFf1rSDK = new AFf1rSDK(AFInAppEventParameterName, UUID.randomUUID(), string, values, str, responseListener, this);
        AFe1cSDK afInfoLog = AFInAppEventParameterName.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1rSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
