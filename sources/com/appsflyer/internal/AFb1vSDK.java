package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFf1hSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import in.juspay.hypersdk.core.PaymentConstants;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1vSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFInAppEventParameterName;
    static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper = null;
    private static AFb1vSDK AFLogger = null;
    private static int AFPurchaseDetails = 0;
    private static int afDebugLog = 0;
    private static byte[] afErrorLog = null;
    private static int afLogForce = 1;
    private static int afVerboseLog;
    private static int afWarnLog;
    private static short[] getLevel;
    public static final String valueOf;
    static final String values;
    private SharedPreferences afInfoLog;
    private AFf1eSDK afRDLog;

    /* renamed from: d, reason: collision with root package name */
    private Map<Long, String> f8406d;

    @NonNull
    private final AFd1nSDK force;

    /* renamed from: v, reason: collision with root package name */
    private Application f8409v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8410w;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;

    /* renamed from: e, reason: collision with root package name */
    private long f8407e = -1;
    private long registerClient = -1;
    private long unregisterClient = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: i, reason: collision with root package name */
    private boolean f8408i = false;

    /* renamed from: com.appsflyer.internal.AFb1vSDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class AFa1uSDK implements AFe1fSDK {
        private AFa1uSDK() {
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK) {
            if (aFe1dSDK instanceof AFf1cSDK) {
                AFb1vSDK.this.AFInAppEventParameterName().AFLogger().values(((AFf1lSDK) aFe1dSDK).unregisterClient.AFLogger);
            }
        }

        public /* synthetic */ AFa1uSDK(AFb1vSDK aFb1vSDK, byte b10) {
            this();
        }

        private boolean AFInAppEventType() {
            return AFb1vSDK.this.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
            JSONObject valueOf;
            AFg1oSDK valueOf2;
            if (aFe1dSDK instanceof AFf1lSDK) {
                AFf1lSDK aFf1lSDK = (AFf1lSDK) aFe1dSDK;
                boolean z10 = aFe1dSDK instanceof AFf1cSDK;
                if (z10 && AFInAppEventType()) {
                    AFf1cSDK aFf1cSDK = (AFf1cSDK) aFe1dSDK;
                    if (aFf1cSDK.values == AFe1bSDK.SUCCESS || aFf1cSDK.AFKeystoreWrapper == 1) {
                        AFg1eSDK aFg1eSDK = new AFg1eSDK(aFf1cSDK, AFb1vSDK.this.AFInAppEventParameterName().valueOf());
                        AFe1cSDK afInfoLog = AFb1vSDK.this.AFInAppEventParameterName().afInfoLog();
                        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFg1eSDK));
                    }
                }
                if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                    AFb1vSDK aFb1vSDK = AFb1vSDK.this;
                    aFb1vSDK.AFInAppEventParameterName(AFb1vSDK.AFInAppEventParameterName(aFb1vSDK)).AFInAppEventParameterName("sentSuccessfully", "true");
                    if (!(aFe1dSDK instanceof AFf1dSDK) && (valueOf2 = new AFg1nSDK(AFb1vSDK.AFInAppEventParameterName(AFb1vSDK.this)).valueOf()) != null && valueOf2.values()) {
                        String str = valueOf2.values;
                        AFLogger.INSTANCE.d(AFg1aSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFg1nSDK.values(str);
                    }
                    ResponseNetwork responseNetwork = ((AFf1nSDK) aFf1lSDK).registerClient;
                    if (responseNetwork != null && (valueOf = AFc1sSDK.valueOf((String) responseNetwork.getBody())) != null) {
                        AFb1vSDK.AFInAppEventType(AFb1vSDK.this, valueOf.optBoolean("send_background", false));
                    }
                    if (z10) {
                        AFb1vSDK.valueOf(AFb1vSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1dSDK instanceof AFg1eSDK) || aFe1bSDK == AFe1bSDK.SUCCESS) {
                return;
            }
            AFg1lSDK aFg1lSDK = new AFg1lSDK(AFb1vSDK.this.AFInAppEventParameterName());
            AFe1cSDK afInfoLog2 = AFb1vSDK.this.AFInAppEventParameterName().afInfoLog();
            afInfoLog2.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFg1lSDK));
        }
    }

    /* loaded from: classes.dex */
    public class AFa1vSDK implements Runnable {
        private final AFa1qSDK values;

        public /* synthetic */ AFa1vSDK(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK, byte b10) {
            this(aFa1qSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1vSDK.values(AFb1vSDK.this, this.values);
        }

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.values = aFa1qSDK;
        }
    }

    static {
        AFInAppEventType();
        values = "288";
        AFInAppEventParameterName = "6.14";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("6.14");
        sb2.append("/androidevent?buildnumber=6.14.0&app_id=");
        valueOf = sb2.toString();
        AFKeystoreWrapper = null;
        AFLogger = new AFb1vSDK();
        int i10 = AFPurchaseDetails + 51;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public AFb1vSDK() {
        AFVersionDeclaration.init();
        this.force = new AFd1nSDK();
        AFInAppEventParameterName().AFLogger$LogLevel().values();
        AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
        afInfoLog.AFInAppEventParameterName.add(new AFa1uSDK(this, (byte) 0));
    }

    public static /* synthetic */ Application AFInAppEventParameterName(AFb1vSDK aFb1vSDK) {
        int i10 = afLogForce + 15;
        int i11 = i10 % 128;
        AFPurchaseDetails = i11;
        int i12 = i10 % 2;
        Application application = aFb1vSDK.f8409v;
        int i13 = i11 + 39;
        afLogForce = i13 % 128;
        int i14 = i13 % 2;
        return application;
    }

    public static void AFInAppEventType() {
        afWarnLog = 908301821;
        afVerboseLog = 401442715;
        afDebugLog = 221303939;
        afErrorLog = new byte[]{-26, -23, 8, -28, -21, 29, -31, MetadataMasks.ComponentParamMask, -16, 28, -32, -27};
    }

    public static /* synthetic */ AFf1eSDK AFKeystoreWrapper(AFb1vSDK aFb1vSDK) {
        int i10 = afLogForce + 115;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFf1eSDK e10 = aFb1vSDK.e();
        int i12 = AFPurchaseDetails + 115;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
            return e10;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        values(new AFh1oSDK());
        int i10 = afLogForce + 125;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static void registerClient(Context context) {
        int i10 = afLogForce + 23;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                int i12 = AFPurchaseDetails + 91;
                afLogForce = i12 % 128;
                int i13 = i12 % 2;
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                int i14 = AFPurchaseDetails + 93;
                afLogForce = i14 % 128;
                int i15 = i14 % 2;
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT <= 32 || asList.contains("com.google.android.gms.permission.AD_ID")) {
                return;
            }
            int i16 = afLogForce + 105;
            AFPurchaseDetails = i16 % 128;
            int i17 = i16 % 2;
            AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "Exception while validation permissions. ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String unregisterClient(Context context) {
        int i10 = AFPurchaseDetails + 109;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        String attributionId = getAttributionId(context);
        int i12 = AFPurchaseDetails + 105;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
        return attributionId;
    }

    public static /* synthetic */ long valueOf(AFb1vSDK aFb1vSDK, long j10) {
        int i10 = AFPurchaseDetails + 89;
        int i11 = i10 % 128;
        afLogForce = i11;
        int i12 = i10 % 2;
        aFb1vSDK.registerClient = j10;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 97;
        AFPurchaseDetails = i13 % 128;
        int i14 = i13 % 2;
        return j10;
    }

    public static /* synthetic */ void values(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK) {
        int i10 = AFPurchaseDetails + 121;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        aFb1vSDK.values(aFa1qSDK);
        if (i11 == 0) {
            throw null;
        }
        int i12 = AFPurchaseDetails + 17;
        afLogForce = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i10 = afLogForce + 97;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventParameterName().afRDLog().AFKeystoreWrapper;
        if (!list.contains(asList)) {
            int i12 = AFPurchaseDetails + 83;
            afLogForce = i12 % 128;
            int i13 = i12 % 2;
            list.add(asList);
            int i14 = AFPurchaseDetails + 41;
            afLogForce = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        int i10 = afLogForce + 9;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("anonymizeUser", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
        int i12 = afLogForce + 55;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i10 = AFPurchaseDetails + 9;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
            AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
            afRDLog.AFInAppEventParameterName = str;
            afRDLog.values = map;
        } else {
            AFc1vSDK afRDLog2 = AFInAppEventParameterName().afRDLog();
            afRDLog2.AFInAppEventParameterName = str;
            afRDLog2.values = map;
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        int i10 = AFPurchaseDetails + 55;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afDebugLog().values(z10);
        int i12 = AFPurchaseDetails + 49;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z10) {
        int i10 = afLogForce + 93;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z10));
        int i12 = afLogForce + 103;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(@NonNull Context context) {
        int i10 = afLogForce + 5;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("getAppsFlyerUID", new String[1]);
            if (context == null) {
                return null;
            }
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
            if (context == null) {
                return null;
            }
        }
        valueOf(context);
        AFd1sSDK AFInAppEventType = AFInAppEventParameterName().AFInAppEventType();
        String valueOf2 = AFb1kSDK.valueOf(AFInAppEventType.valueOf, AFInAppEventType.AFKeystoreWrapper);
        int i11 = AFPurchaseDetails + 59;
        afLogForce = i11 % 128;
        int i12 = i11 % 2;
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String values2 = new AFb1jSDK(context, AFInAppEventParameterName()).values();
            int i10 = afLogForce + 19;
            AFPurchaseDetails = i10 % 128;
            if (i10 % 2 == 0) {
                return values2;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th2);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i10 = afLogForce + 29;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName().afVerboseLog().AFInAppEventParameterName();
        int i12 = AFPurchaseDetails + 73;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i10 = AFPurchaseDetails + 81;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
            String AFInAppEventType = AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
            int i11 = AFPurchaseDetails + 19;
            afLogForce = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 53 / 0;
            }
            return AFInAppEventType;
        }
        AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i10 = afLogForce + 23;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string != null) {
                int i11 = AFPurchaseDetails + 75;
                afLogForce = i11 % 128;
                int i12 = i11 % 2;
                return string;
            }
            String AFInAppEventType = AFInAppEventType(context, "AF_STORE");
            if (AFInAppEventType != null) {
                int i13 = afLogForce + 57;
                AFPurchaseDetails = i13 % 128;
                if (i13 % 2 == 0) {
                    return AFInAppEventType;
                }
                throw null;
            }
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i10 = afLogForce + 43;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("getSdkVersion", new String[0]);
        String registerClient = AFd1sSDK.registerClient();
        int i12 = AFPurchaseDetails + 5;
        afLogForce = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 36 / 0;
        }
        return registerClient;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        AFi1xSDK aFi1ySDK;
        long j10;
        if (this.f8410w) {
            return this;
        }
        this.f8410w = true;
        AFInAppEventParameterName().i().AFLogger = str;
        AFb1mSDK.valueOf(str);
        int i10 = 2;
        if (context != null) {
            int i11 = afLogForce + 17;
            AFPurchaseDetails = i11 % 128;
            if (i11 % 2 == 0) {
                valueOf(context);
                Application AFInAppEventParameterName2 = AFb1uSDK.AFInAppEventParameterName(context);
                if (AFInAppEventParameterName2 != null) {
                    this.f8409v = AFInAppEventParameterName2;
                    AFInAppEventParameterName().afErrorLog().AFInAppEventParameterName();
                    AFInAppEventParameterName().AFLogger().values = System.currentTimeMillis();
                    AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
                    afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
                    AFh1cSDK afLogForce2 = AFInAppEventParameterName().afLogForce();
                    if (Build.VERSION.SDK_INT >= 31) {
                        aFi1ySDK = new AFi1uSDK(afLogForce2.AFKeystoreWrapper);
                    } else {
                        aFi1ySDK = new AFi1ySDK(afLogForce2.AFKeystoreWrapper);
                    }
                    afLogForce2.valueOf = aFi1ySDK;
                    AFInAppEventParameterName().getCurrency().values(new c(this));
                    AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
                    AFi1aSDK force = AFInAppEventParameterName().force();
                    a aVar = new a(this, i10);
                    AFi1lSDK valueOf2 = force.valueOf(aVar);
                    Runnable AFInAppEventType = force.AFInAppEventType(valueOf2, aVar);
                    force.AFInAppEventParameterName(valueOf2);
                    force.AFInAppEventParameterName(new AFi1eSDK(force.AFInAppEventParameterName.AFInAppEventType(), AFInAppEventType));
                    force.AFInAppEventParameterName(new AFi1nSDK(AFInAppEventType, force.AFInAppEventParameterName, new AFi1oSDK()));
                    force.AFInAppEventParameterName(new AFi1bSDK(AFInAppEventType, force.AFInAppEventParameterName));
                    force.AFInAppEventParameterName(AFInAppEventType);
                    if (!force.values()) {
                        Context context2 = force.AFInAppEventParameterName.w().AFKeystoreWrapper;
                        AFd1kSDK aFd1kSDK = force.AFInAppEventParameterName;
                        List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                            while (it.hasNext()) {
                                ProviderInfo providerInfo = it.next().providerInfo;
                                if (providerInfo != null) {
                                    arrayList.add(new AFi1iSDK(providerInfo, AFInAppEventType, aFd1kSDK));
                                } else {
                                    AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                force.AFKeystoreWrapper.addAll(arrayList);
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1aSDK aFg1aSDK = AFg1aSDK.PREINSTALL;
                                StringBuilder sb2 = new StringBuilder("Detected ");
                                sb2.append(arrayList.size());
                                sb2.append(" valid preinstall provider(s)");
                                aFLogger.d(aFg1aSDK, sb2.toString());
                            }
                        }
                    }
                    for (AFi1hSDK aFi1hSDK : force.AFKeystoreWrapper()) {
                        aFi1hSDK.values(force.AFInAppEventParameterName.w().AFKeystoreWrapper);
                    }
                    final AFg1wSDK i12 = this.force.i();
                    AFd1sSDK AFInAppEventType2 = AFInAppEventParameterName().AFInAppEventType();
                    i12.valueOf = System.currentTimeMillis();
                    AFg1uSDK aFg1uSDK = i12.AFInAppEventParameterName;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(AFb1kSDK.valueOf(AFInAppEventType2.valueOf, AFInAppEventType2.AFKeystoreWrapper));
                    sb3.append(i12.valueOf);
                    byte[] values2 = AFb1lSDK.values(sb3.toString());
                    if (values2 != null && values2.length > 0) {
                        if (values2.length > 8) {
                            values2 = Arrays.copyOfRange(values2, 0, 8);
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        allocate.put(values2);
                        allocate.flip();
                        j10 = allocate.getLong();
                    } else {
                        j10 = -1;
                    }
                    i12.values = aFg1uSDK.AFKeystoreWrapper(j10, i12.AFKeystoreWrapper.AFKeystoreWrapper, new AFg1uSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFg1wSDK.3
                        @Override // com.appsflyer.internal.AFg1uSDK.AFa1zSDK
                        public final void AFInAppEventType(@NonNull String str3, @NonNull String str4) {
                            AFg1wSDK.this.AFInAppEventType = new ConcurrentHashMap();
                            AFg1wSDK.this.AFInAppEventType.put("signedData", str3);
                            AFg1wSDK.this.AFInAppEventType.put(PaymentConstants.SIGNATURE, str4);
                            AFg1wSDK.this.values();
                            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                        }

                        @Override // com.appsflyer.internal.AFg1uSDK.AFa1zSDK
                        public final void AFInAppEventType(String str3, Exception exc) {
                            AFg1wSDK.this.AFInAppEventType = new ConcurrentHashMap();
                            String message = exc.getMessage();
                            if (message == null) {
                                message = "unknown";
                            }
                            AFg1wSDK.this.values();
                            AFg1wSDK.this.AFInAppEventType.put("error", message);
                            AFLogger.afErrorLog(str3, exc, true, true, false);
                        }
                    });
                } else {
                    int i13 = AFPurchaseDetails + 19;
                    afLogForce = i13 % 128;
                    int i14 = i13 % 2;
                    return this;
                }
            } else {
                valueOf(context);
                AFb1uSDK.AFInAppEventParameterName(context);
                throw null;
            }
        } else {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1bSDK v10 = AFInAppEventParameterName().v();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        v10.AFInAppEventParameterName("init", strArr);
        AFLogger.INSTANCE.force(AFg1aSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.14.0", values));
        this.AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e10);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
            int i10 = afLogForce + 15;
            int i11 = i10 % 128;
            AFPurchaseDetails = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 81;
            afLogForce = i13 % 128;
            int i14 = i13 % 2;
            return true;
        }
        int i15 = afLogForce + 89;
        AFPurchaseDetails = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i10 = afLogForce + 49;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            boolean AFKeystoreWrapper2 = AFInAppEventParameterName().i().AFKeystoreWrapper();
            int i11 = AFPurchaseDetails + 53;
            afLogForce = i11 % 128;
            if (i11 % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            throw null;
        }
        AFInAppEventParameterName().i().AFKeystoreWrapper();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i10 = afLogForce + 7;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        logEvent(context, str, map, null);
        if (i11 != 0) {
            int i12 = 98 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d11));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        values(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i10 = AFPurchaseDetails + 19;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i10 = AFPurchaseDetails + 105;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("logSession", new String[0]);
        AFInAppEventParameterName().v().AFInAppEventParameterName();
        values(context, AFh1tSDK.logSession);
        values(context, null, null);
        int i12 = AFPurchaseDetails + 123;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i10 = AFPurchaseDetails + 103;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
            int i11 = AFPurchaseDetails + 105;
            afLogForce = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        r4 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        valueOf(r4);
        AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(r4, com.appsflyer.internal.AFc1oSDK.AFKeystoreWrapper(AFInAppEventParameterName().getPurchaseToken()), android.net.Uri.parse(r5.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r5.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r5.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r5 = AFInAppEventParameterName().afRDLog();
        r1 = new java.lang.StringBuilder("Context is \"");
        r1.append(r4);
        r1.append("\"");
        r5.values(r1.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
        r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 67;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        if ((r4 % 2) != 0) goto L21;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void performOnAppAttribution(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.net.URI r5) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r1
            int r0 = r0 % 2
            java.lang.String r0 = "\""
            if (r5 == 0) goto L86
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L27
            java.lang.String r1 = r5.toString()
            boolean r1 = r1.isEmpty()
            r2 = 45
            int r2 = r2 / 0
            if (r1 == 0) goto L32
            goto L86
        L27:
            java.lang.String r1 = r5.toString()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L32
            goto L86
        L32:
            if (r4 != 0) goto L63
            com.appsflyer.internal.AFd1kSDK r5 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFc1vSDK r5 = r5.afRDLog()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Context is \""
            r1.<init>(r2)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r5.values(r4, r0)
            int r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r4 = r4 + 67
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L62
            r4 = 58
            int r4 = r4 / 0
        L62:
            return
        L63:
            r3.valueOf(r4)
            com.appsflyer.internal.AFd1kSDK r0 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFc1vSDK r0 = r0.afRDLog()
            com.appsflyer.internal.AFd1kSDK r1 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFc1kSDK r1 = r1.getPurchaseToken()
            com.appsflyer.internal.AFc1oSDK r1 = com.appsflyer.internal.AFc1oSDK.AFKeystoreWrapper(r1)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r0.AFKeystoreWrapper(r4, r1, r5)
            return
        L86:
            com.appsflyer.internal.AFd1kSDK r4 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFc1vSDK r4 = r4.afRDLog()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Link is \""
            r1.<init>(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r4.values(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.performOnAppAttribution(android.content.Context, java.net.URI):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        int i10 = AFPurchaseDetails;
        int i11 = i10 + 101;
        afLogForce = i11 % 128;
        int i12 = i11 % 2;
        if (intent == null) {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            int i13 = i10 + 55;
            afLogForce = i13 % 128;
            if (i13 % 2 == 0) {
                AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                int i14 = 1 / 0;
                return;
            } else {
                AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
        }
        Context applicationContext = context.getApplicationContext();
        valueOf(applicationContext);
        AFInAppEventParameterName().values().execute(new androidx.fragment.app.e(10, this, applicationContext, intent));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i10 = AFPurchaseDetails + 105;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerConversionListener", new String[0]);
        values(appsFlyerConversionListener);
        int i12 = AFPurchaseDetails + 119;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            int i10 = AFPurchaseDetails + 115;
            afLogForce = i10 % 128;
            int i11 = i10 % 2;
            AFLogger.afDebugLog("registerValidatorListener null listener");
            return;
        }
        AFKeystoreWrapper = appsFlyerInAppPurchaseValidatorListener;
        int i12 = AFPurchaseDetails + 83;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventParameterName(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(AFInAppEventParameterName2));
        valueOf(context, hashMap, new AFh1vSDK());
        int i10 = AFPurchaseDetails + 99;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int valueOf2 = valueOf(AFInAppEventParameterName(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(valueOf2));
        valueOf(context, hashMap, new AFh1sSDK());
        int i10 = AFPurchaseDetails + 57;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r4.valueOf(r5, r6, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r4.valueOf(r5, r6, r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        r0 = new com.appsflyer.internal.AFf1mSDK(r5, r6, r4.AFInAppEventParameterName);
        r4 = r4.valueOf;
        r4.valueOf.execute(new com.appsflyer.internal.AFe1cSDK.AnonymousClass2(r4, r0));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendInAppPurchaseData(android.content.Context r4, java.util.Map<java.lang.String, java.lang.Object> r5, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r6) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r1
            int r0 = r0 % 2
            java.lang.String r1 = "purchases"
            if (r0 == 0) goto L25
            r3.valueOf(r4)
            com.appsflyer.internal.AFd1kSDK r4 = r3.AFInAppEventParameterName()
            com.appsflyer.PurchaseHandler r4 = r4.unregisterClient()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r2[r0] = r1
            boolean r0 = r4.valueOf(r5, r6, r2)
            if (r0 == 0) goto L4d
            goto L3a
        L25:
            r3.valueOf(r4)
            com.appsflyer.internal.AFd1kSDK r4 = r3.AFInAppEventParameterName()
            com.appsflyer.PurchaseHandler r4 = r4.unregisterClient()
            java.lang.String[] r0 = new java.lang.String[]{r1}
            boolean r0 = r4.valueOf(r5, r6, r0)
            if (r0 == 0) goto L4d
        L3a:
            com.appsflyer.internal.AFf1mSDK r0 = new com.appsflyer.internal.AFf1mSDK
            com.appsflyer.internal.AFd1kSDK r1 = r4.AFInAppEventParameterName
            r0.<init>(r5, r6, r1)
            com.appsflyer.internal.AFe1cSDK r4 = r4.valueOf
            java.util.concurrent.Executor r5 = r4.valueOf
            com.appsflyer.internal.AFe1cSDK$2 r6 = new com.appsflyer.internal.AFe1cSDK$2
            r6.<init>(r0)
            r5.execute(r6)
        L4d:
            int r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r4 = r4 + 121
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r5
            int r4 = r4 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.sendInAppPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i10 = afLogForce + 95;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        valueOf(context);
        PurchaseHandler unregisterClient = AFInAppEventParameterName().unregisterClient();
        if (unregisterClient.valueOf(map, purchaseValidationCallback, "subscriptions")) {
            AFf1ySDK aFf1ySDK = new AFf1ySDK(map, purchaseValidationCallback, unregisterClient.AFInAppEventParameterName);
            AFe1cSDK aFe1cSDK = unregisterClient.valueOf;
            aFe1cSDK.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1ySDK));
        }
        int i12 = AFPurchaseDetails + 117;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0177  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendPushNotificationData(android.app.Activity r18) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i10 = AFPurchaseDetails + 41;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        if (map != null) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i12 = afLogForce + 21;
            AFPurchaseDetails = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i10 = AFPurchaseDetails + 33;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAndroidIdData", str);
        AFInAppEventParameterName().getLevel().AFInAppEventType = str;
        int i12 = AFPurchaseDetails + 109;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i10 = afLogForce + 99;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        }
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        int i11 = afLogForce + 37;
        AFPurchaseDetails = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            int i10 = afLogForce + 51;
            AFPurchaseDetails = i10 % 128;
            int i11 = i10 % 2;
        }
        AFInAppEventType(AppsFlyerProperties.ONELINK_ID, str);
        int i12 = AFPurchaseDetails + 49;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        int i10 = AFPurchaseDetails + 49;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z10));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10));
        int i12 = AFPurchaseDetails + 117;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        int i10 = AFPurchaseDetails + 123;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z10));
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z10));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10));
        int i11 = AFPurchaseDetails + 117;
        afLogForce = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        int i10 = AFPurchaseDetails + 117;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            AFb1bSDK v10 = AFInAppEventParameterName().v();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z10);
            v10.AFInAppEventParameterName("setCollectOaid", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectOaid", String.valueOf(z10));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10));
        int i11 = afLogForce + 27;
        AFPurchaseDetails = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        int i10 = AFPurchaseDetails + 61;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().f8422d = appsFlyerConsent;
            int i11 = 1 / 0;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().f8422d = appsFlyerConsent;
        }
        int i12 = AFPurchaseDetails + 91;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i10 = AFPurchaseDetails + 23;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            AFb1bSDK v10 = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v10.AFInAppEventParameterName("setCurrencyCode", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            if (values()) {
                setCustomerUserId(str);
                StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
                sb2.append(str);
                sb2.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb2.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
                values(context, AFh1tSDK.setCustomerIdAndLogSession);
                String str2 = AFInAppEventParameterName().i().AFLogger;
                if (referrer == null) {
                    referrer = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!(!(context instanceof Activity))) {
                    int i10 = AFPurchaseDetails + 43;
                    afLogForce = i10 % 128;
                    int i11 = i10 % 2;
                    ((Activity) context).getIntent();
                }
                AFKeystoreWrapper(context, referrer);
                int i12 = AFPurchaseDetails + 99;
                afLogForce = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
        int i14 = afLogForce + 69;
        AFPurchaseDetails = i14 % 128;
        if (i14 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i10 = afLogForce + 39;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i12 = afLogForce + 103;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.DEBUG;
        r0 = com.appsflyer.internal.AFb1vSDK.afLogForce + 87;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0013, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r3 = com.appsflyer.AFLogger.LogLevel.NONE;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setDebugLog(boolean r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r0 = 89
            int r0 = r0 / 0
            if (r3 == 0) goto L22
            goto L15
        L13:
            if (r3 == 0) goto L22
        L15:
            com.appsflyer.AFLogger$LogLevel r3 = com.appsflyer.AFLogger.LogLevel.DEBUG
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r1
            int r0 = r0 % 2
            goto L24
        L22:
            com.appsflyer.AFLogger$LogLevel r3 = com.appsflyer.AFLogger.LogLevel.NONE
        L24:
            r2.setLogLevel(r3)
            int r3 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r3 = r3 + 53
            int r0 = r3 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L34
            return
        L34:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.setDebugLog(boolean):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
        AFb1rSDK.AFInAppEventType = Boolean.valueOf(!z10);
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.getLevel().unregisterClient = z10;
        if (z10) {
            int i10 = AFPurchaseDetails + 71;
            afLogForce = i10 % 128;
            if (i10 % 2 != 0) {
                AFInAppEventParameterName2.getLevel().AFLogger = null;
                return;
            } else {
                AFInAppEventParameterName2.getLevel().AFLogger = null;
                throw null;
            }
        }
        AFe1cSDK afInfoLog = AFInAppEventParameterName2.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
        int i11 = afLogForce + 51;
        AFPurchaseDetails = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        int i10 = afLogForce + 47;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
        AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z10);
        int i12 = afLogForce + 83;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i10 = AFPurchaseDetails + 43;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            AFb1bSDK v10 = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v10.AFInAppEventParameterName("setExtension", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i11 = AFPurchaseDetails + 47;
        afLogForce = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        String str3;
        int i10 = AFPurchaseDetails + 5;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
            if (!AFc1tSDK.AFInAppEventType(str2)) {
                int i11 = afLogForce + 95;
                AFPurchaseDetails = i11 % 128;
                if (i11 % 2 == 0) {
                    if (str != null) {
                        str3 = str.trim();
                        int i12 = AFPurchaseDetails + 53;
                        afLogForce = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    AFe1gSDK.valueOf(new AFe1kSDK(str3, str2.trim()));
                    return;
                }
                throw null;
            }
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        AFc1tSDK.AFInAppEventType(str2);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i10 = afLogForce + 15;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            AFb1bSDK v10 = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            v10.AFInAppEventParameterName("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setImeiData", str);
        }
        AFInAppEventParameterName().i().unregisterClient = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        int i10 = afLogForce + 117;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setIsUpdate", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
        int i12 = AFPurchaseDetails + 115;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z10;
        int i10 = AFPurchaseDetails + 111;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
            if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
                z10 = true;
            } else {
                z10 = false;
            }
            AFInAppEventParameterName().v().AFInAppEventParameterName("log", String.valueOf(z10));
            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
            if (!z10) {
                int i11 = afLogForce + 71;
                AFPurchaseDetails = i11 % 128;
                int i12 = i11 % 2;
                AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
                return;
            }
            AFInAppEventParameterName().AFLogger$LogLevel().registerClient();
            return;
        }
        logLevel.getLevel();
        AFLogger.LogLevel.NONE.getLevel();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        int i11 = afLogForce + 59;
        AFPurchaseDetails = i11 % 128;
        if (i11 % 2 == 0) {
            this.unregisterClient = TimeUnit.SECONDS.toMillis(i10);
        } else {
            this.unregisterClient = TimeUnit.SECONDS.toMillis(i10);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i10 = AFPurchaseDetails + 13;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setOaidData", str);
        AFb1rSDK.values = str;
        int i12 = AFPurchaseDetails + 99;
        afLogForce = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i10 = AFPurchaseDetails + 87;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        AFInAppEventParameterName().afRDLog().unregisterClient = strArr;
        int i12 = AFPurchaseDetails + 67;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i10 = AFPurchaseDetails;
        int i11 = i10 + 27;
        afLogForce = i11 % 128;
        int i12 = i11 % 2;
        if (str != null) {
            int i13 = i10 + 97;
            afLogForce = i13 % 128;
            int i14 = i13 % 2;
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r5.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r1 = new java.lang.StringBuilder("Setting partner data for ");
        r1.append(r4);
        r1.append(": ");
        r1.append(r5);
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = new org.json.JSONObject(r5).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (r1 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r5 = new java.util.HashMap();
        r5.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r1)));
        r0.values.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        r0.AFInAppEventParameterName.put(r4, r5);
        r0.values.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if (r0.AFInAppEventParameterName.remove(r4) != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        r4 = "Partner data is missing or `null`";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        com.appsflyer.AFLogger.afWarnLog(r4);
        r4 = com.appsflyer.internal.AFb1vSDK.afLogForce + 123;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        r4 = "Cleared partner data for ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if ((!r4.isEmpty()) != true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r4.isEmpty() != false) goto L31;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPartnerData(@androidx.annotation.NonNull java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r3 = this;
            com.appsflyer.internal.AFd1kSDK r0 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFd1pSDK r0 = r0.getLevel()
            com.appsflyer.internal.AFc1cSDK r1 = r0.AFInAppEventParameterName
            if (r1 != 0) goto L1d
            com.appsflyer.internal.AFc1cSDK r1 = new com.appsflyer.internal.AFc1cSDK
            r1.<init>()
            r0.AFInAppEventParameterName = r1
            int r1 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r2
            int r1 = r1 % 2
        L1d:
            com.appsflyer.internal.AFc1cSDK r0 = r0.AFInAppEventParameterName
            if (r4 == 0) goto Lbf
            int r1 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L39
            boolean r1 = r4.isEmpty()
            r2 = 79
            int r2 = r2 / 0
            if (r1 == 0) goto L43
            goto Lbf
        L39:
            boolean r1 = r4.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L43
            goto Lbf
        L43:
            if (r5 == 0) goto La0
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L4c
            goto La0
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting partner data for "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r5)
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L95
            java.lang.String r5 = "Partner data 1000 characters limit exceeded"
            com.appsflyer.AFLogger.afWarnLog(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r2 = "limit exceeded: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "error"
            r5.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            r0.put(r4, r5)
            return
        L95:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.AFInAppEventParameterName
            r1.put(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.values
            r5.remove(r4)
            return
        La0:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.AFInAppEventParameterName
            java.lang.Object r5 = r5.remove(r4)
            if (r5 != 0) goto Lab
            java.lang.String r4 = "Partner data is missing or `null`"
            goto Lb1
        Lab:
            java.lang.String r5 = "Cleared partner data for "
            java.lang.String r4 = r5.concat(r4)
        Lb1:
            com.appsflyer.AFLogger.afWarnLog(r4)
            int r4 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r4 = r4 + 123
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r5
            int r4 = r4 % 2
            return
        Lbf:
            java.lang.String r4 = "Partner ID is missing or `null`"
            com.appsflyer.AFLogger.afWarnLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.setPartnerData(java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i10 = afLogForce + 91;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
            int i11 = afLogForce + 83;
            AFPurchaseDetails = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            } else {
                throw null;
            }
        }
        AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i10 = afLogForce + 47;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().afWarnLog().AFKeystoreWrapper(pluginInfo);
        int i12 = afLogForce + 83;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e10) {
                AFLogger.afErrorLog(e10.getMessage(), e10);
            }
        }
        if (str2 != null) {
            int i10 = afLogForce + 63;
            AFPurchaseDetails = i10 % 128;
            int i11 = i10 % 2;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
            int i12 = afLogForce + 103;
            AFPurchaseDetails = i12 % 128;
            int i13 = i12 % 2;
        }
        if (jSONObject.has("pid")) {
            int i14 = afLogForce + 21;
            AFPurchaseDetails = i14 % 128;
            if (i14 % 2 == 0) {
                AFInAppEventType("preInstallName", jSONObject.toString());
                return;
            } else {
                AFInAppEventType("preInstallName", jSONObject.toString());
                throw null;
            }
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        int i15 = AFPurchaseDetails + 1;
        afLogForce = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i10 = afLogForce + 15;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        afRDLog.AFLogger.clear();
        afRDLog.AFLogger.addAll(Arrays.asList(strArr));
        int i12 = AFPurchaseDetails + 115;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i10 = afLogForce + 3;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        setSharingFilterForPartners(strArr);
        if (i11 == 0) {
            int i12 = afLogForce + 35;
            AFPurchaseDetails = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 15 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i10 = AFPurchaseDetails + 69;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        setSharingFilterForPartners("all");
        int i12 = afLogForce + 35;
        AFPurchaseDetails = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFInAppEventParameterName().getLevel().AFKeystoreWrapper = new AFd1wSDK(strArr);
        int i10 = afLogForce + 91;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i10 = afLogForce + 107;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i10 = AFPurchaseDetails + 17;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        start(context, null);
        int i12 = afLogForce + 57;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        int i10 = AFPurchaseDetails + 21;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        valueOf(context);
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFInAppEventParameterName2.i().registerClient = z10;
        AFInAppEventParameterName2.values().submit(new a(AFInAppEventParameterName2, 1));
        if (z10) {
            AFInAppEventParameterName2.valueOf().valueOf("is_stop_tracking_used", true);
            int i12 = AFPurchaseDetails + 73;
            afLogForce = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i10 = afLogForce + 41;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i11 = 85 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i10 = AFPurchaseDetails + 25;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
        int i11 = afLogForce + 79;
        AFPurchaseDetails = i11 % 128;
        if (i11 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        boolean z10;
        valueOf(context);
        AFg1nSDK aFg1nSDK = new AFg1nSDK(context);
        if (str != null && !str.trim().isEmpty()) {
            AFLogger.INSTANCE.i(AFg1aSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
            AFg1oSDK valueOf2 = aFg1nSDK.valueOf();
            if (valueOf2 == null || !str.equals(valueOf2.values)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (valueOf2 != null && currentTimeMillis - valueOf2.AFInAppEventParameterName <= TimeUnit.SECONDS.toMillis(2L)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                AFg1oSDK aFg1oSDK = new AFg1oSDK(str, currentTimeMillis, !z10);
                aFg1nSDK.values.AFInAppEventParameterName("afUninstallToken", aFg1oSDK.values);
                aFg1nSDK.values.AFKeystoreWrapper("afUninstallToken_received_time", aFg1oSDK.AFInAppEventParameterName);
                aFg1nSDK.values.valueOf("afUninstallToken_queued", aFg1oSDK.values());
                if (z10) {
                    AFg1nSDK.values(str);
                    return;
                }
                return;
            }
            return;
        }
        AFLogger.INSTANCE.w(AFg1aSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r3 = com.appsflyer.internal.AFb1vSDK.afLogForce + 75;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r3 % 128;
        r3 = r3 % 2;
        r3 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
    
        r3 = r19.toString();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void validateAndLogInAppPurchase(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            r12 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L30
            com.appsflyer.internal.AFd1kSDK r0 = r12.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1bSDK r0 = r0.v()
            r9 = 100
            java.lang.String[] r9 = new java.lang.String[r9]
            r9[r5] = r14
            r9[r4] = r15
            r9[r3] = r6
            r9[r1] = r7
            r9[r2] = r8
            r2 = r1
            if (r19 != 0) goto L54
            goto L48
        L30:
            com.appsflyer.internal.AFd1kSDK r0 = r12.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1bSDK r0 = r0.v()
            r9 = 6
            java.lang.String[] r9 = new java.lang.String[r9]
            r9[r5] = r14
            r9[r4] = r15
            r9[r1] = r6
            r9[r2] = r7
            r9[r3] = r8
            r2 = 5
            if (r19 != 0) goto L54
        L48:
            int r3 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r3 = r3 + 75
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r4
            int r3 = r3 % r1
            java.lang.String r3 = ""
            goto L58
        L54:
            java.lang.String r3 = r19.toString()
        L58:
            r9[r2] = r3
            java.lang.String r2 = "validateAndTrackInAppPurchase"
            r0.AFInAppEventParameterName(r2, r9)
            boolean r0 = r12.isStopped()
            if (r0 != 0) goto L7b
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1aSDK r2 = com.appsflyer.internal.AFg1aSDK.PURCHASE_VALIDATION
            java.lang.String r3 = "Validate in app called with parameters: "
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = v.e.l(r3, r6, r4, r7, r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r0.i(r2, r3)
        L7b:
            if (r14 == 0) goto Lc2
            if (r7 == 0) goto Lc2
            if (r15 == 0) goto Lc2
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 87
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r2
            int r0 = r0 % r1
            if (r0 == 0) goto Lc0
            if (r8 == 0) goto Lc2
            if (r6 != 0) goto L91
            goto Lc2
        L91:
            java.lang.Thread r10 = new java.lang.Thread
            com.appsflyer.internal.AFa1aSDK r11 = new com.appsflyer.internal.AFa1aSDK
            android.content.Context r1 = r13.getApplicationContext()
            com.appsflyer.internal.AFd1kSDK r0 = r12.AFInAppEventParameterName()
            com.appsflyer.internal.AFg1wSDK r0 = r0.i()
            java.lang.String r2 = r0.AFLogger
            com.appsflyer.internal.AFd1kSDK r0 = r12.AFInAppEventParameterName()
            com.appsflyer.internal.AFd1sSDK r3 = r0.AFInAppEventType()
            r0 = r11
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.<init>(r11)
            r10.start()
            goto Lcb
        Lc0:
            r0 = 0
            throw r0
        Lc2:
            com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r0 = com.appsflyer.internal.AFb1vSDK.AFKeystoreWrapper
            if (r0 == 0) goto Lcb
            java.lang.String r1 = "Please provide purchase parameters"
            r0.onValidateInAppFailure(r1)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.validateAndLogInAppPurchase(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        int i10 = AFPurchaseDetails + 79;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z10);
    }

    public static /* synthetic */ boolean AFInAppEventType(AFb1vSDK aFb1vSDK, boolean z10) {
        int i10 = AFPurchaseDetails + 63;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        aFb1vSDK.f8408i = z10;
        if (i11 != 0) {
            return z10;
        }
        throw null;
    }

    public static AFb1vSDK AFKeystoreWrapper() {
        int i10 = AFPurchaseDetails + 121;
        int i11 = i10 % 128;
        afLogForce = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        AFb1vSDK aFb1vSDK = AFLogger;
        int i12 = i11 + 47;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
        return aFb1vSDK;
    }

    private static void AFLogger(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                int i10 = afLogForce + 7;
                AFPurchaseDetails = i10 % 128;
                if (i10 % 2 == 0) {
                    AFInAppEventType("preInstallName", str);
                    int i11 = AFPurchaseDetails + 25;
                    afLogForce = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
                AFInAppEventType("preInstallName", str);
                throw null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } catch (JSONException e10) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r13, short r14, int r15, int r16, int r17, java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.a(byte, short, int, int, int, java.lang.Object[]):void");
    }

    private boolean d() {
        if (this.f8407e > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8407e;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String AFKeystoreWrapper2 = AFKeystoreWrapper(simpleDateFormat, this.f8407e);
            String AFKeystoreWrapper3 = AFKeystoreWrapper(simpleDateFormat, this.registerClient);
            if (currentTimeMillis < this.unregisterClient && (!isStopped())) {
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", AFKeystoreWrapper2, AFKeystoreWrapper3, Long.valueOf(currentTimeMillis), Long.valueOf(this.unregisterClient)));
                return true;
            }
            if (isStopped()) {
                return false;
            }
            int i10 = afLogForce + 21;
            AFPurchaseDetails = i10 % 128;
            int i11 = i10 % 2;
            AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", AFKeystoreWrapper2, AFKeystoreWrapper3, Long.valueOf(currentTimeMillis)));
            int i12 = AFPurchaseDetails + 75;
            afLogForce = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (isStopped()) {
            return false;
        }
        AFLogger.afInfoLog("Sending first launch for this session!");
        return false;
    }

    private synchronized AFf1eSDK e() {
        try {
            int i10 = afLogForce;
            int i11 = i10 + 125;
            AFPurchaseDetails = i11 % 128;
            int i12 = i11 % 2;
            if (this.afRDLog == null) {
                this.afRDLog = new c(this);
                int i13 = i10 + 79;
                AFPurchaseDetails = i13 % 128;
                int i14 = i13 % 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afRDLog;
    }

    private void unregisterClient() {
        int i10 = afLogForce + 57;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 77 / 0;
            if (AFf1oSDK.e()) {
                return;
            }
        } else if (AFf1oSDK.e()) {
            return;
        }
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        AFe1cSDK afInfoLog = AFInAppEventParameterName2.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(new AFf1oSDK(AFInAppEventParameterName2)));
        int i12 = afLogForce + 121;
        AFPurchaseDetails = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void valueOf(AFb1vSDK aFb1vSDK) {
        int i10 = afLogForce + 31;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        aFb1vSDK.unregisterClient();
        int i12 = AFPurchaseDetails + 49;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
    }

    public final AFd1kSDK AFInAppEventParameterName() {
        int i10 = AFPurchaseDetails + 117;
        int i11 = i10 % 128;
        afLogForce = i11;
        int i12 = i10 % 2;
        AFd1nSDK aFd1nSDK = this.force;
        int i13 = i11 + 35;
        AFPurchaseDetails = i13 % 128;
        if (i13 % 2 == 0) {
            return aFd1nSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        valueOf(context);
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f8392e = str;
        aFh1jSDK.values = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1aSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1jSDK.valueOf(singletonMap);
        }
        aFh1jSDK.AFInAppEventParameterName = hashMap;
        AFb1bSDK v10 = AFInAppEventParameterName().v();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = aFh1jSDK.AFInAppEventParameterName;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        v10.AFInAppEventParameterName("logEvent", strArr);
        if (str == null) {
            values(context, AFh1tSDK.logEvent);
        }
        AFInAppEventType(aFh1jSDK, e(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        int i10 = AFPurchaseDetails + 27;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        start(context, str, null);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j10) {
        int i10 = AFPurchaseDetails + 79;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j10;
            int i11 = 56 / 0;
        } else {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j10;
        }
    }

    public final boolean values() {
        int i10 = afLogForce + 87;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID);
            throw null;
        }
        if (!AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) || valueOf() != null) {
            return false;
        }
        int i11 = afLogForce + 33;
        AFPurchaseDetails = i11 % 128;
        return i11 % 2 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFf1gSDK aFf1gSDK) {
        int i10 = AFPurchaseDetails + 95;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFd1kSDK AFInAppEventParameterName2 = AFInAppEventParameterName();
        if (aFf1gSDK == AFf1gSDK.SUCCESS) {
            AFInAppEventParameterName2.getCurrency().AFInAppEventParameterName();
            int i12 = afLogForce + 81;
            AFPurchaseDetails = i12 % 128;
            int i13 = i12 % 2;
        }
        if (!AFInAppEventParameterName2.v().values()) {
            int i14 = AFPurchaseDetails + 33;
            afLogForce = i14 % 128;
            int i15 = i14 % 2;
            AFInAppEventParameterName2.AFLogger$LogLevel().AFInAppEventParameterName();
            return;
        }
        AFInAppEventParameterName2.AFLogger$LogLevel().values();
    }

    private static void AFInAppEventType(String str, String str2) {
        int i10 = afLogForce + 59;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i12 = afLogForce + 13;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                }
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e10);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        int i12 = AFPurchaseDetails + 123;
                        afLogForce = i12 % 128;
                        int i13 = i12 % 2;
                        if (jSONArray2.getLong(i11) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i11) != ((Long) arrayList.get(1)).longValue()) {
                            int i14 = afLogForce + 15;
                            AFPurchaseDetails = i14 % 128;
                            int i15 = i14 % 2;
                            if (jSONArray2.getLong(i11) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i11++;
                            str = next;
                        }
                    }
                } catch (JSONException e11) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e11);
                }
            }
        }
        if (str != null) {
            int i16 = afLogForce + 81;
            AFPurchaseDetails = i16 % 128;
            int i17 = i16 % 2;
            jSONObject.remove(str);
        }
    }

    private void values(Context context, String str, Map<String, Object> map) {
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f8392e = str;
        aFh1jSDK.AFInAppEventParameterName = map;
        AFInAppEventType(aFh1jSDK, e(context));
        int i10 = AFPurchaseDetails + 39;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void AFKeystoreWrapper(Context context, Intent intent) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        if (aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall") != null) {
            AFLogger(aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall"));
            int i10 = afLogForce + 51;
            AFPurchaseDetails = i10 % 128;
            int i11 = i10 % 2;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String AFInAppEventParameterName2 = aFj1ySDK.AFInAppEventParameterName("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFInAppEventParameterName2)));
        if (AFInAppEventParameterName2 != null) {
            int i12 = AFPurchaseDetails + 107;
            afLogForce = i12 % 128;
            int i13 = i12 % 2;
            AFInAppEventParameterName(context).AFInAppEventParameterName("referrer", AFInAppEventParameterName2);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", AFInAppEventParameterName2);
            appsFlyerProperties.AFInAppEventParameterName = AFInAppEventParameterName2;
            if (AppsFlyerProperties.getInstance().AFKeystoreWrapper()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                values(context, AFh1tSDK.onReceive);
                AFInAppEventParameterName(AFInAppEventParameterName2);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().values()) {
            return;
        }
        if (!this.f8410w) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        valueOf(context);
        final AFh1wSDK AFLogger2 = AFInAppEventParameterName().AFLogger();
        AFLogger2.AFInAppEventParameterName(AFa1oSDK.AFInAppEventParameterName(context));
        if (this.f8409v == null) {
            int i10 = AFPurchaseDetails + 89;
            afLogForce = i10 % 128;
            int i11 = i10 % 2;
            Application AFInAppEventParameterName2 = AFb1uSDK.AFInAppEventParameterName(context);
            if (AFInAppEventParameterName2 == null) {
                return;
            } else {
                this.f8409v = AFInAppEventParameterName2;
            }
        }
        AFInAppEventParameterName().v().AFInAppEventParameterName("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
        String str2 = values;
        aFLogger.i(aFg1aSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.14.0", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.i(aFg1aSDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().valueOf());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName().i().AFLogger = str;
            AFb1mSDK.valueOf(str);
            int i12 = AFPurchaseDetails + 15;
            afLogForce = i12 % 128;
            int i13 = i12 % 2;
        } else if (TextUtils.isEmpty(AFInAppEventParameterName().i().AFLogger)) {
            int i14 = afLogForce + 117;
            AFPurchaseDetails = i14 % 128;
            if (i14 % 2 == 0) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    int i15 = AFPurchaseDetails + 111;
                    afLogForce = i15 % 128;
                    if (i15 % 2 == 0) {
                        appsFlyerRequestListener.onError(3, "No dev key");
                        return;
                    } else {
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return;
                    }
                }
                return;
            }
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
        AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
        unregisterClient();
        AFInAppEventType(this.f8409v.getBaseContext());
        AFInAppEventParameterName().afDebugLog().AFKeystoreWrapper();
        this.force.afErrorLogForExcManagerOnly().AFInAppEventType(context, new AFd1xSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1vSDK.5
            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void valueOf() {
                Context context2 = AFb1vSDK.this.AFInAppEventParameterName().w().AFKeystoreWrapper;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1wSDK aFh1wSDK = AFLogger2;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = aFh1wSDK.unregisterClient;
                if (j10 != 0) {
                    long j11 = currentTimeMillis - j10;
                    if (j11 > 0 && j11 < 1000) {
                        j11 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j11);
                    aFh1wSDK.f8504v = seconds;
                    aFh1wSDK.AFInAppEventParameterName.AFKeystoreWrapper("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1vSDK.this.AFInAppEventParameterName().getCurrency().AFInAppEventType();
                AFb1bSDK v10 = AFb1vSDK.this.AFInAppEventParameterName().v();
                if (v10.e()) {
                    v10.AFInAppEventType();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        v10.values(context2.getPackageName(), context2.getPackageManager());
                    }
                    v10.valueOf();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1vSDK.this.AFInAppEventParameterName().d().AFInAppEventParameterName();
                AFb1vSDK.this.AFInAppEventParameterName().getPurchaseToken().AFInAppEventType();
            }

            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void values(@NonNull AFh1xSDK aFh1xSDK) {
                AFLogger2.AFInAppEventType();
                AFd1kSDK AFInAppEventParameterName3 = AFb1vSDK.this.AFInAppEventParameterName();
                AFInAppEventParameterName3.registerClient().AFKeystoreWrapper(AFb1vSDK.AFKeystoreWrapper(AFb1vSDK.this));
                AFb1vSDK.valueOf(AFb1vSDK.this);
                int valueOf2 = AFInAppEventParameterName3.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (valueOf2 < 2) {
                    AFb1vSDK.this.AFInAppEventParameterName().d().values();
                }
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                if (aFh1xSDK != null) {
                    AFb1vSDK.this.AFInAppEventParameterName().afRDLog().AFInAppEventParameterName(AFc1oSDK.AFInAppEventParameterName(aFh1mSDK), aFh1xSDK.values, AFInAppEventParameterName3.w().AFKeystoreWrapper);
                }
                AFb1vSDK aFb1vSDK = AFb1vSDK.this;
                aFh1mSDK.values = appsFlyerRequestListener;
                aFb1vSDK.AFInAppEventType(aFh1mSDK, aFh1xSDK);
            }
        });
    }

    private static void AFInAppEventType(String str, boolean z10) {
        int i10 = AFPurchaseDetails + 59;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AppsFlyerProperties.getInstance().set(str, z10);
        int i12 = afLogForce + 83;
        AFPurchaseDetails = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static boolean AFInAppEventType(String str) {
        int i10 = afLogForce + 103;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i12 = afLogForce + 21;
        AFPurchaseDetails = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 17 / 0;
        }
        return z10;
    }

    private AFh1xSDK e(Context context) {
        int i10 = afLogForce;
        int i11 = i10 + 37;
        AFPurchaseDetails = i11 % 128;
        if (i11 % 2 != 0) {
            boolean z10 = context instanceof Activity;
            throw null;
        }
        if (context instanceof Activity) {
            return new AFh1xSDK((Activity) context, AFInAppEventParameterName().AFPurchaseDetails());
        }
        int i12 = i10 + 47;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    private static void AFInAppEventType(Context context) {
        int i10 = AFPurchaseDetails + 65;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i12 = afLogForce + 25;
                AFPurchaseDetails = i12 % 128;
                int i13 = i12 % 2;
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1aSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
                }
            }
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
            aFLogger.e(aFg1aSDK, "checkBackupRules Exception", e10, false, false);
            aFLogger.v(aFg1aSDK, "checkBackupRules Exception: ".concat(String.valueOf(e10)));
        }
    }

    private void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            int i10 = afLogForce + 89;
            AFPurchaseDetails = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i11 = afLogForce + 33;
        AFPurchaseDetails = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 11 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            int i10 = afLogForce + 77;
            AFPurchaseDetails = i10 % 128;
            int i11 = i10 % 2;
            if (AnonymousClass1.AFKeystoreWrapper[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1lSDK.AFKeystoreWrapper(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        int i12 = AFPurchaseDetails + 59;
        afLogForce = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 86 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a8, code lost:
    
        if ((r13 % 2) != 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void values(com.appsflyer.internal.AFa1qSDK r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.values(com.appsflyer.internal.AFa1qSDK):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(boolean z10) {
        if (z10) {
            int i10 = afLogForce + 111;
            AFPurchaseDetails = i10 % 128;
            int i11 = i10 % 2;
            AFInAppEventParameterName().AFLogger$LogLevel().valueOf();
            return;
        }
        AFInAppEventParameterName().AFLogger$LogLevel().AFKeystoreWrapper();
        int i12 = afLogForce + 45;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
    }

    @NonNull
    private AFi1hSDK[] registerClient() {
        int i10 = afLogForce + 83;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            return AFInAppEventParameterName().force().AFKeystoreWrapper();
        }
        AFInAppEventParameterName().force().AFKeystoreWrapper();
        throw null;
    }

    private void AFInAppEventParameterName(String str) {
        byte b10 = 0;
        AFa1qSDK AFInAppEventType = new AFh1rSDK().AFInAppEventType(AFInAppEventParameterName().AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0));
        AFInAppEventType.unregisterClient = str;
        if (str != null) {
            int i10 = afLogForce + 51;
            AFPurchaseDetails = i10 % 128;
            if (i10 % 2 != 0) {
                if (str.length() <= 4) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            if (AFInAppEventParameterName().force().AFKeystoreWrapper(AFInAppEventType)) {
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), new AFa1vSDK(this, AFInAppEventType, b10), 5L, TimeUnit.MILLISECONDS);
                int i11 = afLogForce + 75;
                AFPurchaseDetails = i11 % 128;
                int i12 = i11 % 2;
            }
        }
    }

    public final void AFInAppEventType(@NonNull AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        AFKeystoreWrapper(aFa1qSDK, aFh1xSDK);
        if (AFInAppEventParameterName().i().AFLogger == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                int i10 = AFPurchaseDetails + 73;
                afLogForce = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = AFPurchaseDetails + 49;
            afLogForce = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
        if (referrer == null) {
            int i13 = AFPurchaseDetails + 67;
            afLogForce = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 89 / 0;
            }
            referrer = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            int i15 = AFPurchaseDetails + 37;
            afLogForce = i15 % 128;
            int i16 = i15 % 2;
        }
        aFa1qSDK.unregisterClient = referrer;
        valueOf(aFa1qSDK);
    }

    private static String AFKeystoreWrapper(String str) {
        int i10 = afLogForce + 33;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    public static String AFKeystoreWrapper(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j10));
        int i10 = AFPurchaseDetails + 117;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        return format;
    }

    private void AFKeystoreWrapper(Context context, String str) {
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        valueOf(context);
        aFh1mSDK.f8392e = null;
        aFh1mSDK.AFInAppEventParameterName = null;
        aFh1mSDK.unregisterClient = str;
        aFh1mSDK.valueOf = null;
        valueOf(aFh1mSDK);
        int i10 = afLogForce + 39;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1cSDK afInfoLog = this.force.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(new AFf1pSDK(this.force, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i10 = AFPurchaseDetails + 1;
        afLogForce = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i10 = AFPurchaseDetails + 51;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String AFKeystoreWrapper2 = AFInAppEventParameterName(context).AFKeystoreWrapper("extraReferrers", (String) null);
            if (AFKeystoreWrapper2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(AFKeystoreWrapper2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                jSONArray2.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            AFInAppEventParameterName(context).AFInAppEventParameterName("extraReferrers", jSONObject.toString());
            int i12 = AFPurchaseDetails + 11;
            afLogForce = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e10);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i10 = afLogForce + 121;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0) {
            if (map.containsKey("meta")) {
                Map<String, Object> map2 = (Map) map.get("meta");
                int i11 = AFPurchaseDetails + 75;
                afLogForce = i11 % 128;
                int i12 = i11 % 2;
                return map2;
            }
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        map.containsKey("meta");
        throw null;
    }

    private String AFInAppEventType(Context context, String str) {
        if (context == null) {
            int i10 = afLogForce + 65;
            AFPurchaseDetails = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        valueOf(context);
        String AFInAppEventType = AFInAppEventParameterName().AFInAppEventType().AFInAppEventType(str);
        int i11 = afLogForce + 37;
        AFPurchaseDetails = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 27 / 0;
        }
        return AFInAppEventType;
    }

    @NonNull
    public final Map<String, Object> AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        String str;
        final Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        AFd1qSDK AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        AFg1mSDK e10 = AFInAppEventParameterName().e();
        boolean AFInAppEventType = aFa1qSDK.AFInAppEventType();
        Map<String, Object> map = aFa1qSDK.AFInAppEventType;
        long time = new Date().getTime();
        boolean z10 = false;
        Object[] objArr = new Object[1];
        a((byte) TextUtils.getCapsMode(HttpUrl.FRAGMENT_ENCODE_SET, 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-567153175) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-450712325) - TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0), MotionEvent.axisFromString(HttpUrl.FRAGMENT_ENCODE_SET) - 113, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!AFInAppEventType) {
                    str = aFa1qSDK.f8392e;
                } else {
                    int i10 = afLogForce + 89;
                    AFPurchaseDetails = i10 % 128;
                    int i11 = i10 % 2;
                    str = "Launch";
                }
                sb2.append(str);
                AFLogger.afInfoLog(sb2.toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            registerClient(context);
            e10.AFInAppEventType(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.d
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo2invoke() {
                    String unregisterClient;
                    unregisterClient = AFb1vSDK.this.unregisterClient(context);
                    return unregisterClient;
                }
            });
            int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName2, AFInAppEventType);
            if (aFa1qSDK.f8392e != null) {
                int i12 = AFPurchaseDetails + 59;
                afLogForce = i12 % 128;
                int i13 = i12 % 2;
                z10 = true;
            }
            int values2 = values(AFInAppEventParameterName2, z10);
            if (AFInAppEventType && AFInAppEventType2 == 1) {
                AppsFlyerProperties.getInstance().AFInAppEventType = true;
            }
            e10.valueOf(map, AFInAppEventType2, values2);
            int i14 = AFPurchaseDetails + 73;
            afLogForce = i14 % 128;
            int i15 = i14 % 2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2, true);
        }
        int i16 = AFPurchaseDetails + 117;
        afLogForce = i16 % 128;
        int i17 = i16 % 2;
        return map;
    }

    public static int AFInAppEventType(AFd1qSDK aFd1qSDK, boolean z10) {
        int i10 = AFPurchaseDetails + 125;
        afLogForce = i10 % 128;
        if (i10 % 2 != 0) {
            return AFInAppEventType(aFd1qSDK, "appsFlyerCount", z10);
        }
        AFInAppEventType(aFd1qSDK, "appsFlyerCount", z10);
        throw null;
    }

    private static int AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        int i10 = AFPurchaseDetails + 21;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdImpressionCount", true);
        int i12 = AFPurchaseDetails + 77;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
        return AFInAppEventType;
    }

    private static int AFInAppEventType(AFd1qSDK aFd1qSDK, String str, boolean z10) {
        int valueOf2 = aFd1qSDK.valueOf(str, 0);
        if (!z10) {
            return valueOf2;
        }
        int i10 = AFPurchaseDetails + 15;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        int i12 = valueOf2 + 1;
        aFd1qSDK.AFInAppEventParameterName(str, i12);
        int i13 = afLogForce + 73;
        AFPurchaseDetails = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    public final AFd1qSDK AFInAppEventParameterName(Context context) {
        int i10 = AFPurchaseDetails + 87;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        valueOf(context);
        AFd1qSDK valueOf2 = AFInAppEventParameterName().valueOf();
        int i12 = afLogForce + 61;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
        return valueOf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Context context, Intent intent) {
        Uri uri;
        int i10 = afLogForce + 117;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        valueOf(context);
        AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
        AFd1qSDK valueOf2 = AFInAppEventParameterName().valueOf();
        boolean z10 = true;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            int i12 = afLogForce + 15;
            AFPurchaseDetails = i12 % 128;
            int i13 = i12 % 2;
            uri = intent.getData();
        }
        if (uri != null) {
            int i14 = afLogForce + 9;
            AFPurchaseDetails = i14 % 128;
            int i15 = i14 % 2;
            if (!uri.toString().isEmpty()) {
                int i16 = AFPurchaseDetails + 43;
                afLogForce = i16 % 128;
                int i17 = i16 % 2;
                if (!valueOf2.AFInAppEventType("ddl_sent") && !z10) {
                    afRDLog.values("No direct deep link", (DeepLinkResult.Error) null);
                    return;
                } else {
                    afRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(afRDLog.f8411e.getPurchaseToken()), intent, context);
                }
            }
        }
        z10 = false;
        if (!valueOf2.AFInAppEventType("ddl_sent")) {
        }
        afRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(afRDLog.f8411e.getPurchaseToken()), intent, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(AFd1kSDK aFd1kSDK) {
        int i10 = afLogForce + 9;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        aFd1kSDK.afErrorLog().valueOf();
        if (i11 != 0) {
            int i12 = 18 / 0;
        }
    }

    public static String valueOf() {
        int i10 = afLogForce + 117;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        String AFKeystoreWrapper2 = AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID);
        int i12 = afLogForce + 73;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
        return AFKeystoreWrapper2;
    }

    private void valueOf(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        int i10 = afLogForce + 33;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 != 0) {
            valueOf(context);
            aFa1qSDK.valueOf((Map<String, ?>) map);
            AFInAppEventType(aFa1qSDK, e(context));
            int i11 = 72 / 0;
            return;
        }
        valueOf(context);
        aFa1qSDK.valueOf((Map<String, ?>) map);
        AFInAppEventType(aFa1qSDK, e(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void valueOf(com.appsflyer.internal.AFa1qSDK r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r1
            int r0 = r0 % 2
            java.lang.String r0 = r7.f8392e
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1a
            int r1 = r1 + 9
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L1c
        L1a:
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            boolean r1 = r6.values()
            if (r1 == 0) goto L33
            int r7 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r7 = r7 + 67
            int r0 = r7 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r7 = r7 % 2
            java.lang.String r7 = "CustomerUserId not set, reporting is disabled"
            com.appsflyer.AFLogger.afInfoLog(r7, r2)
            return
        L33:
            r1 = 0
            if (r0 == 0) goto L76
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = "launchProtectEnabled"
            boolean r0 = r0.getBoolean(r4, r2)
            if (r0 == 0) goto L6b
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 49
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r2
            int r0 = r0 % 2
            boolean r0 = r6.d()
            if (r0 == 0) goto L70
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 35
            int r2 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L6a
            com.appsflyer.attribution.AppsFlyerRequestListener r7 = r7.values
            if (r7 == 0) goto L69
            r0 = 10
            java.lang.String r1 = "Event timeout. Check 'minTimeBetweenSessions' param"
            r7.onError(r0, r1)
        L69:
            return
        L6a:
            throw r1
        L6b:
            java.lang.String r0 = "Allowing multiple launches within a 5 second time window."
            com.appsflyer.AFLogger.afInfoLog(r0)
        L70:
            long r4 = java.lang.System.currentTimeMillis()
            r6.f8407e = r4
        L76:
            com.appsflyer.internal.AFd1kSDK r0 = r6.AFInAppEventParameterName()
            java.util.concurrent.ScheduledExecutorService r0 = r0.AFKeystoreWrapper()
            com.appsflyer.internal.AFb1vSDK$AFa1vSDK r2 = new com.appsflyer.internal.AFb1vSDK$AFa1vSDK
            r2.<init>(r6, r7, r3)
            r3 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.appsflyer.internal.AFj1rSDK.values(r0, r2, r3, r7)
            int r7 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r7 = r7 + 69
            int r0 = r7 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L97
            return
        L97:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.valueOf(com.appsflyer.internal.AFa1qSDK):void");
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        valueOf(context);
        if (!aFc1oSDK.AFKeystoreWrapper("af_deeplink")) {
            String values2 = values(uri.toString());
            AFc1vSDK afRDLog = AFInAppEventParameterName().afRDLog();
            String str = afRDLog.AFInAppEventParameterName;
            if (str != null && afRDLog.values != null && values2.contains(str)) {
                int i10 = AFPurchaseDetails + 45;
                afLogForce = i10 % 128;
                int i11 = i10 % 2;
                Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : afRDLog.values.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                values2 = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", HttpUrl.FRAGMENT_ENCODE_SET);
                aFc1oSDK.AFInAppEventType.put("appended_query_params", encodedQuery);
                AFc1kSDK aFc1kSDK = aFc1oSDK.AFInAppEventParameterName;
                if (aFc1kSDK != null) {
                    aFc1kSDK.values(aFc1oSDK.AFInAppEventType);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
            aFc1oSDK.AFInAppEventType.put("af_deeplink", values2);
            AFc1kSDK aFc1kSDK2 = aFc1oSDK.AFInAppEventParameterName;
            if (aFc1kSDK2 != null) {
                aFc1kSDK2.values(aFc1oSDK.AFInAppEventType);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            int i12 = afLogForce + 27;
            AFPurchaseDetails = i12 % 128;
            if (i12 % 2 != 0) {
                hashMap.put("original_link", uri2.toString());
                throw null;
            }
            hashMap.put("original_link", uri2.toString());
        }
        AFb1uSDK.AFInAppEventParameterName(context, hashMap, uri);
        AFf1hSDK aFf1hSDK = new AFf1hSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
        if (aFf1hSDK.afInfoLog()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", HttpUrl.FRAGMENT_ENCODE_SET);
            aFc1oSDK.AFInAppEventType.put("isBrandedDomain", bool);
            AFc1kSDK aFc1kSDK3 = aFc1oSDK.AFInAppEventParameterName;
            if (aFc1kSDK3 != null) {
                int i13 = AFPurchaseDetails + 61;
                afLogForce = i13 % 128;
                int i14 = i13 % 2;
                aFc1kSDK3.values(aFc1oSDK.AFInAppEventType);
            }
        }
        if (aFf1hSDK.v()) {
            aFf1hSDK.unregisterClient = AFKeystoreWrapper(hashMap);
            AFe1cSDK afInfoLog = AFInAppEventParameterName().afInfoLog();
            afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1hSDK));
            return;
        }
        AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r3 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String valueOf(android.app.Activity r7) {
        /*
            java.lang.String r0 = "af"
            int r1 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r2
            int r1 = r1 % 2
            r1 = 0
            if (r7 == 0) goto L5d
            android.content.Intent r2 = r7.getIntent()
            if (r2 == 0) goto L5d
            int r3 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r3 = r3 + 101
            int r4 = r3 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L2e
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L2c
            r4 = 83
            int r4 = r4 / 0
            if (r3 == 0) goto L5d
            goto L34
        L2c:
            r7 = move-exception
            goto L52
        L2e:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L5d
        L34:
            java.lang.String r1 = r3.getString(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L5d
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L2c
            com.appsflyer.internal.AFg1aSDK r5 = com.appsflyer.internal.AFg1aSDK.ENGAGEMENT     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = "Push Notification received af payload = "
            java.lang.String r6 = r6.concat(r1)     // Catch: java.lang.Throwable -> L2c
            r4.w(r5, r6)     // Catch: java.lang.Throwable -> L2c
            r3.remove(r0)     // Catch: java.lang.Throwable -> L2c
            android.content.Intent r0 = r2.putExtras(r3)     // Catch: java.lang.Throwable -> L2c
            r7.setIntent(r0)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L52:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1aSDK r2 = com.appsflyer.internal.AFg1aSDK.ENGAGEMENT
            java.lang.String r3 = r7.getMessage()
            r0.e(r2, r3, r7)
        L5d:
            int r7 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r7 = r7 + 101
            int r0 = r7 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r7 = r7 % 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.valueOf(android.app.Activity):java.lang.String");
    }

    private void values(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            int i10 = AFPurchaseDetails + 115;
            afLogForce = i10 % 128;
            int i11 = i10 % 2;
            if (map.get("advertiserId") != null) {
                int i12 = AFPurchaseDetails + 79;
                afLogForce = i12 % 128;
                int i13 = i12 % 2;
                try {
                    if (AFc1tSDK.values(AFInAppEventParameterName().getLevel().AFInAppEventType)) {
                        int i14 = AFPurchaseDetails + 77;
                        afLogForce = i14 % 128;
                        int i15 = i14 % 2;
                        if (map.remove("android_id") != null) {
                            int i16 = afLogForce + 37;
                            AFPurchaseDetails = i16 % 128;
                            if (i16 % 2 != 0) {
                                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                                throw null;
                            }
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if ((!AFc1tSDK.values(AFInAppEventParameterName().i().unregisterClient)) || map.remove("imei") == null) {
                        return;
                    }
                    int i17 = AFPurchaseDetails + 107;
                    afLogForce = i17 % 128;
                    int i18 = i17 % 2;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    return;
                } catch (Exception e10) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e10);
                }
            }
        }
        int i19 = AFPurchaseDetails + 119;
        afLogForce = i19 % 128;
        int i20 = i19 % 2;
    }

    private static int valueOf(AFd1qSDK aFd1qSDK) {
        int i10 = AFPurchaseDetails + 45;
        afLogForce = i10 % 128;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdRevenueCount", i10 % 2 != 0);
        int i11 = afLogForce + 9;
        AFPurchaseDetails = i11 % 128;
        if (i11 % 2 == 0) {
            return AFInAppEventType;
        }
        throw null;
    }

    private static String valueOf(String str) {
        int indexOf;
        int i10 = afLogForce + 79;
        AFPurchaseDetails = i10 % 128;
        if (i10 % 2 == 0 ? (indexOf = str.indexOf(63)) == -1 : (indexOf = str.indexOf(12)) == -1) {
            int i11 = AFPurchaseDetails + 19;
            afLogForce = i11 % 128;
            if (i11 % 2 != 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw null;
        }
        String substring = str.substring(indexOf);
        int i12 = AFPurchaseDetails + 67;
        afLogForce = i12 % 128;
        int i13 = i12 % 2;
        return substring;
    }

    private AFf1hSDK.AFa1uSDK AFKeystoreWrapper(final Map<String, String> map) {
        AFf1hSDK.AFa1uSDK aFa1uSDK = new AFf1hSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFb1vSDK.2
            @Override // com.appsflyer.internal.AFf1hSDK.AFa1uSDK
            public final void AFKeystoreWrapper(String str) {
                AFb1vSDK.this.AFInAppEventParameterName().afRDLog().values(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1hSDK.AFa1uSDK
            public final void valueOf(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1vSDK.this.AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(map);
            }
        };
        int i10 = AFPurchaseDetails + 25;
        afLogForce = i10 % 128;
        int i11 = i10 % 2;
        return aFa1uSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r4.AFInAppEventParameterName("CACHED_CHANNEL", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 33;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String AFKeystoreWrapper(com.appsflyer.internal.AFd1qSDK r4, java.lang.String r5) {
        /*
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "CACHED_CHANNEL"
            if (r0 == 0) goto L1a
            java.lang.String r0 = r4.AFKeystoreWrapper(r2, r1)
            r3 = 69
            int r3 = r3 / 0
            if (r0 == 0) goto L2e
            goto L20
        L1a:
            java.lang.String r0 = r4.AFKeystoreWrapper(r2, r1)
            if (r0 == 0) goto L2e
        L20:
            int r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r4 = r4 + 33
            int r5 = r4 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L2d
            return r0
        L2d:
            throw r1
        L2e:
            r4.AFInAppEventParameterName(r2, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.AFKeystoreWrapper(com.appsflyer.internal.AFd1qSDK, java.lang.String):java.lang.String");
    }

    public final void valueOf(@NonNull Context context) {
        AFd1nSDK aFd1nSDK = this.force;
        if (context != null) {
            int i10 = AFPurchaseDetails + 57;
            afLogForce = i10 % 128;
            int i11 = i10 % 2;
            AFd1lSDK aFd1lSDK = aFd1nSDK.AFInAppEventParameterName;
            if (context != null) {
                aFd1lSDK.AFKeystoreWrapper = context.getApplicationContext();
                int i12 = afLogForce + 11;
                AFPurchaseDetails = i12 % 128;
                int i13 = i12 % 2;
            }
        }
    }

    public static synchronized SharedPreferences AFKeystoreWrapper(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1vSDK.class) {
            try {
                if (AFKeystoreWrapper().afInfoLog == null) {
                    int i10 = AFPurchaseDetails + 35;
                    afLogForce = i10 % 128;
                    int i11 = i10 % 2;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        AFKeystoreWrapper().afInfoLog = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th2;
                    }
                }
                sharedPreferences = AFKeystoreWrapper().afInfoLog;
                int i12 = afLogForce + 103;
                AFPurchaseDetails = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r1.contains("&") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = new java.util.ArrayList(java.util.Arrays.asList(r1.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r5 = new java.lang.StringBuilder();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if ((!r3.hasNext()) == true) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r6 = (java.lang.String) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if ((!r6.contains("access_token")) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        r6 = com.appsflyer.internal.AFb1vSDK.afLogForce + 87;
        com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r6 % 128;
        r6 = r6 % 2;
        r3.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r5.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r5.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r5.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r6.startsWith("?") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        r5.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        return r9.replace(r1, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.length() == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String values(java.lang.String r9) {
        /*
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto Lb4
            if (r9 != 0) goto L10
            return r1
        L10:
            java.lang.String r0 = "fb\\d*?://authorize.*"
            boolean r0 = r9.matches(r0)
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "access_token"
            boolean r1 = r9.contains(r0)
            r2 = 1
            if (r1 == r2) goto L23
            goto Lb3
        L23:
            int r1 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r1 = r1 + 29
            int r3 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L3e
            java.lang.String r1 = valueOf(r9)
            int r3 = r1.length()
            r4 = 69
            int r4 = r4 / 0
            if (r3 != 0) goto L49
            goto L48
        L3e:
            java.lang.String r1 = valueOf(r9)
            int r3 = r1.length()
            if (r3 != 0) goto L49
        L48:
            return r9
        L49:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "&"
            boolean r5 = r1.contains(r4)
            if (r5 == 0) goto L64
            java.util.ArrayList r3 = new java.util.ArrayList
            java.lang.String[] r5 = r1.split(r4)
            java.util.List r5 = java.util.Arrays.asList(r5)
            r3.<init>(r5)
            goto L67
        L64:
            r3.add(r1)
        L67:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L70:
            boolean r6 = r3.hasNext()
            r6 = r6 ^ r2
            if (r6 == r2) goto Lab
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r6.contains(r0)
            r7 = r7 ^ r2
            if (r7 == 0) goto L9d
            int r7 = r5.length()
            if (r7 == 0) goto L8e
            r5.append(r4)
            goto L99
        L8e:
            java.lang.String r7 = "?"
            boolean r8 = r6.startsWith(r7)
            if (r8 != 0) goto L99
            r5.append(r7)
        L99:
            r5.append(r6)
            goto L70
        L9d:
            int r6 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r6 = r6 + 87
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r7
            int r6 = r6 % 2
            r3.remove()
            goto L70
        Lab:
            java.lang.String r0 = r5.toString()
            java.lang.String r9 = r9.replace(r1, r0)
        Lb3:
            return r9
        Lb4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.values(java.lang.String):java.lang.String");
    }

    private static void AFKeystoreWrapper(@NonNull AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        if (aFh1xSDK != null) {
            int i10 = afLogForce;
            int i11 = i10 + 103;
            AFPurchaseDetails = i11 % 128;
            int i12 = i11 % 2;
            aFa1qSDK.valueOf = aFh1xSDK.AFInAppEventType;
            aFa1qSDK.f8391d = aFh1xSDK.AFInAppEventParameterName;
            int i13 = i10 + 5;
            AFPurchaseDetails = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = afLogForce + 13;
        AFPurchaseDetails = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        if (r0 == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean values(android.content.Context r4) {
        /*
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.isGooglePlayServicesAvailable(r4)     // Catch: java.lang.Throwable -> L1c
            r3 = 19
            int r3 = r3 / r2
            if (r0 != 0) goto L3b
            goto L28
        L1c:
            r0 = move-exception
            goto L36
        L1e:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.isGooglePlayServicesAvailable(r4)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L3b
        L28:
            int r4 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r4 = r4 + 51
            int r0 = r4 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L35
            return r2
        L35:
            return r1
        L36:
            java.lang.String r3 = "WARNING:  Google play services is unavailable. "
            com.appsflyer.AFLogger.afErrorLog(r3, r0)
        L3b:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            java.lang.String r0 = "com.google.android.gms"
            r4.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            int r4 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r4 = r4 + 29
            int r0 = r4 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L51
            return r1
        L51:
            r4 = 0
            throw r4
        L53:
            r4 = move-exception
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1aSDK r1 = com.appsflyer.internal.AFg1aSDK.GENERAL
            java.lang.String r3 = "WARNING:  Google Play Services is unavailable. "
            r0.e(r1, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.values(android.content.Context):boolean");
    }

    private static int values(AFd1qSDK aFd1qSDK, boolean z10) {
        int i10 = afLogForce + 47;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        int AFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerInAppEventCount", z10);
        int i12 = afLogForce + 9;
        AFPurchaseDetails = i12 % 128;
        int i13 = i12 % 2;
        return AFInAppEventType;
    }

    private void values(Context context, AFh1tSDK aFh1tSDK) {
        int i10 = afLogForce + 47;
        AFPurchaseDetails = i10 % 128;
        int i11 = i10 % 2;
        valueOf(context);
        AFh1wSDK AFLogger2 = AFInAppEventParameterName().AFLogger();
        AFg1cSDK AFInAppEventParameterName2 = AFa1oSDK.AFInAppEventParameterName(context);
        if (AFLogger2.values()) {
            int i12 = AFPurchaseDetails + 27;
            afLogForce = i12 % 128;
            if (i12 % 2 != 0) {
                AFLogger2.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                AFLogger2.AFInAppEventParameterName(AFInAppEventParameterName2);
            } else {
                AFLogger2.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                AFLogger2.AFInAppEventParameterName(AFInAppEventParameterName2);
                throw null;
            }
        }
        AFLogger2.AFInAppEventType();
    }
}
