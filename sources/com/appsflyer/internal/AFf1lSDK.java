package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFf1lSDK extends AFf1nSDK<String> {
    private static final AFf1zSDK[] afDebugLog = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFg1tSDK afErrorLog;
    private final AFe1gSDK afInfoLog;
    private final AFd1lSDK afRDLog;
    private final AFf1bSDK force;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final AFd1sSDK f8456i;
    public final AFa1qSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    protected final AFg1mSDK f8457v;

    /* renamed from: w, reason: collision with root package name */
    protected final AFd1qSDK f8458w;

    public AFf1lSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFd1kSDK aFd1kSDK) {
        this(aFa1qSDK, aFd1kSDK, null);
    }

    @NonNull
    private static Map<String, Object> registerClient(AFa1qSDK aFa1qSDK) {
        Map<String, Object> map = (Map) aFa1qSDK.AFInAppEventParameterName().get("meta");
        if (map == null) {
            HashMap hashMap = new HashMap();
            aFa1qSDK.AFInAppEventParameterName().put("meta", hashMap);
            return hashMap;
        }
        return map;
    }

    public void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        this.f8457v.values(aFa1qSDK);
    }

    public void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        this.f8457v.AFInAppEventType(aFa1qSDK.AFInAppEventParameterName());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    @Override // com.appsflyer.internal.AFf1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFe1sSDK<java.lang.String> AFKeystoreWrapper(@androidx.annotation.NonNull java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1lSDK.AFKeystoreWrapper(java.lang.String):com.appsflyer.internal.AFe1sSDK");
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public boolean i() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:4:0x0015, B:6:0x001b, B:9:0x0044, B:12:0x0051, B:13:0x0056, B:15:0x005c, B:16:0x0065, B:18:0x006f, B:22:0x007b, B:25:0x0083, B:26:0x008e, B:28:0x0094, B:30:0x00ac, B:31:0x00b1, B:33:0x00c6, B:34:0x00cd, B:36:0x00d1, B:39:0x00d8, B:40:0x00df, B:41:0x00af, B:42:0x00e2, B:44:0x00ec, B:45:0x00f7, B:55:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:4:0x0015, B:6:0x001b, B:9:0x0044, B:12:0x0051, B:13:0x0056, B:15:0x005c, B:16:0x0065, B:18:0x006f, B:22:0x007b, B:25:0x0083, B:26:0x008e, B:28:0x0094, B:30:0x00ac, B:31:0x00b1, B:33:0x00c6, B:34:0x00cd, B:36:0x00d1, B:39:0x00d8, B:40:0x00df, B:41:0x00af, B:42:0x00e2, B:44:0x00ec, B:45:0x00f7, B:55:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void valueOf(com.appsflyer.internal.AFa1qSDK r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1lSDK.valueOf(com.appsflyer.internal.AFa1qSDK):void");
    }

    public void values(AFa1qSDK aFa1qSDK) {
        this.f8457v.AFInAppEventType(aFa1qSDK);
    }

    public AFf1lSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFd1kSDK aFd1kSDK, String str) {
        super(aFa1qSDK.values(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = aFa1qSDK;
        this.afInfoLog = aFd1kSDK.afVerboseLog();
        this.f8458w = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.registerClient();
        this.afRDLog = aFd1kSDK.w();
        this.f8456i = aFd1kSDK.AFInAppEventType();
        this.f8457v = aFd1kSDK.e();
        this.afErrorLog = aFd1kSDK.getPurchaseType();
        for (AFf1zSDK aFf1zSDK : afDebugLog) {
            if (this.AFInAppEventType == aFf1zSDK) {
                return;
            }
        }
        int i10 = this.unregisterClient.AFLogger;
        AFf1zSDK aFf1zSDK2 = this.AFInAppEventType;
        if (i10 <= 0) {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.valueOf.add(aFf1zSDK3);
                return;
            }
            return;
        }
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    public void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        this.f8457v.AFKeystoreWrapper(aFa1qSDK);
    }
}
