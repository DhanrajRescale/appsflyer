package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFf1rSDK extends AFf1nSDK<String> {

    @NonNull
    private final UUID afInfoLog;
    private final String force;

    /* renamed from: i, reason: collision with root package name */
    private final LinkGenerator.ResponseListener f8468i;
    private final String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final Map<String, String> f8469v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    private final LinkGenerator f8470w;

    public AFf1rSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.afInfoLog = uuid;
        this.unregisterClient = str;
        this.f8469v = new HashMap(map);
        this.f8468i = responseListener;
        this.force = str2;
        this.f8470w = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.f8468i;
        if (responseListener != null) {
            if (this.values == AFe1bSDK.SUCCESS && (responseNetwork = ((AFf1nSDK) this).registerClient) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable unregisterClient = unregisterClient();
            if (unregisterClient instanceof ParsingException) {
                if (((ParsingException) unregisterClient).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.f8470w.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.f8470w.generateLink());
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(@NonNull String str) {
        return ((AFf1nSDK) this).AFLogger.AFInAppEventParameterName(this.unregisterClient, this.f8469v, this.force, this.afInfoLog, str);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }
}
