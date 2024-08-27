package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ut.l;
import vt.p0;
import vt.y;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020$\u0012\u0006\u0010\u0006\u001a\u00020\u001e\u0012\u0006\u0010\n\u001a\u00020!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010'\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J/\u0010\b\u001a\u00020\u00072\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJC\u0010\f\u001a\u000e\u0012\b\u0012\u0006*\u00020\u00030\u0003\u0018\u00010\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0013R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0011\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", "Lcom/appsflyer/internal/AFf1tSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Ljava/util/Map;Ljava/lang/String;)V", "p2", "Lcom/appsflyer/internal/AFe1sSDK;", "AFKeystoreWrapper", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFe1sSDK;", "values", "(Ljava/util/Map;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "(Ljava/lang/String;I)V", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "w", "Ljava/util/Map;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFj1zSDK;", "afInfoLog", "Lcom/appsflyer/internal/AFj1zSDK;", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "force", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "Lcom/appsflyer/AppsFlyerProperties;", "unregisterClient", "Lcom/appsflyer/AppsFlyerProperties;", "Lcom/appsflyer/AFPurchaseDetails;", "i", "Lcom/appsflyer/AFPurchaseDetails;", "Lcom/appsflyer/internal/AFd1kSDK;", "p3", "p4", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1zSDK;)V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1pSDK extends AFf1tSDK {

    /* renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final AFj1zSDK AFInAppEventType;

    /* renamed from: force, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback AFKeystoreWrapper;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails valueOf;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties values;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> AFInAppEventParameterName;

    /* loaded from: classes.dex */
    public static final class AFa1tSDK extends RuntimeException {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    private final void valueOf(String p02, int p12) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(p0.g(new Pair("error_code", Integer.valueOf(p12)), new Pair("error_message", p02)));
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        Object a10;
        super.AFInAppEventType();
        Throwable unregisterClient = unregisterClient();
        if (unregisterClient != null && !(unregisterClient instanceof AFf1wSDK)) {
            if (unregisterClient instanceof AFe1aSDK) {
                valueOf("No dev key", -1);
            } else if (unregisterClient instanceof AFa1tSDK) {
                valueOf("One or more of provided arguments is empty", -1);
            } else {
                valueOf("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(p0.g(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                l.Companion companion = ut.l.INSTANCE;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1sSDK.values(new JSONObject((String) responseNetwork.getBody())));
                    a10 = Unit.f23355a;
                } else {
                    a10 = null;
                }
            } catch (Throwable th2) {
                l.Companion companion2 = ut.l.INSTANCE;
                a10 = ut.n.a(th2);
            }
            if (ut.l.a(a10) != null) {
                valueOf("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(@NotNull Map<String, Object> p02, @NotNull String p12, String p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        return ((AFf1nSDK) this).AFLogger.valueOf(p02, p12);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @NotNull
    public final String values(@NotNull Map<String, Object> p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return this.AFInAppEventType.AFInAppEventType();
    }

    public /* synthetic */ AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1zSDK aFj1zSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i10 & 32) != 0 ? new AFj1wSDK() : aFj1zSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1pSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1zSDK aFj1zSDK) {
        super(AFf1zSDK.MANUAL_PURCHASE_VALIDATION, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, null, p0.d());
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        this.values = appsFlyerProperties;
        this.valueOf = aFPurchaseDetails;
        this.AFInAppEventParameterName = map;
        this.AFKeystoreWrapper = appsFlyerInAppPurchaseValidationCallback;
        this.AFInAppEventType = aFj1zSDK;
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFInAppEventType(@NotNull Map<String, Object> p02, String p12) {
        Map<String, Object> d10;
        Intrinsics.checkNotNullParameter(p02, "");
        super.AFInAppEventType(p02, p12);
        List g10 = y.g(this.valueOf.getPurchaseToken(), this.valueOf.getProductId(), this.valueOf.getPrice(), this.valueOf.getCurrency());
        if (!(g10 instanceof Collection) || !g10.isEmpty()) {
            Iterator it = g10.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        p02.put("purchase_token", this.valueOf.getPurchaseToken());
        p02.put("product_id", this.valueOf.getProductId());
        p02.put("revenue", this.valueOf.getPrice());
        p02.put("currency", this.valueOf.getCurrency());
        p02.put("purchase_type", this.valueOf.getPurchaseType().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.VALUE java.lang.String());
        Map<String, String> map = this.AFInAppEventParameterName;
        if (map != null && !map.isEmpty()) {
            p02.put("extra_event_values", this.AFInAppEventParameterName);
        }
        String string = this.values.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string != null && string.length() != 0) {
            d10 = AFj1sSDK.values(new JSONObject(string));
        } else {
            d10 = p0.d();
        }
        p02.put("custom_data", d10);
    }
}
