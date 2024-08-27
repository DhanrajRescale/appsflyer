package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class AFf1fSDK extends AFe1dSDK<AFf1gSDK> {
    public AFh1aSDK AFLogger;
    private final AFg1wSDK afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    public AFf1gSDK f8443d;

    /* renamed from: e, reason: collision with root package name */
    private final AFg1ySDK f8444e;
    private final AFg1zSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFg1xSDK f8445i;
    public final AFf1eSDK registerClient;
    private final AFd1sSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final String f8446v;

    /* renamed from: w, reason: collision with root package name */
    private final AFe1ySDK f8447w;

    public AFf1fSDK(@NonNull AFg1ySDK aFg1ySDK, @NonNull AFd1sSDK aFd1sSDK, @NonNull AFg1wSDK aFg1wSDK, @NonNull AFg1xSDK aFg1xSDK, @NonNull AFe1ySDK aFe1ySDK, @NonNull AFg1zSDK aFg1zSDK, @NonNull String str, AFf1eSDK aFf1eSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.f8443d = null;
        this.f8444e = aFg1ySDK;
        this.unregisterClient = aFd1sSDK;
        this.afInfoLog = aFg1wSDK;
        this.f8445i = aFg1xSDK;
        this.f8447w = aFe1ySDK;
        this.force = aFg1zSDK;
        this.f8446v = str;
        this.registerClient = aFf1eSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.appsflyer.internal.AFf1gSDK registerClient() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1fSDK.registerClient():com.appsflyer.internal.AFf1gSDK");
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @NonNull
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        try {
            AFf1gSDK registerClient = registerClient();
            this.f8443d = registerClient;
            if (registerClient == AFf1gSDK.FAILURE) {
                return AFe1bSDK.FAILURE;
            }
            return AFe1bSDK.SUCCESS;
        } catch (SocketTimeoutException unused) {
            this.f8443d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (InterruptedIOException e10) {
            e = e10;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.f8443d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        } catch (InterruptedException e11) {
            e = e11;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.f8443d = AFf1gSDK.FAILURE;
            return AFe1bSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private void AFInAppEventParameterName(String str, long j10, AFh1bSDK aFh1bSDK, String str2, AFe1jSDK<AFi1zSDK> aFe1jSDK) {
        AFInAppEventParameterName(str, j10, aFe1jSDK, aFe1jSDK != null ? aFe1jSDK.getBody() : null, aFh1bSDK, str2 != null ? str2 : null, null);
    }

    private void AFInAppEventParameterName(String str, long j10, AFe1jSDK<?> aFe1jSDK, AFi1zSDK aFi1zSDK, AFh1bSDK aFh1bSDK, String str2, Throwable th2) {
        long j11;
        int i10;
        Throwable th3;
        long j12;
        if (aFe1jSDK != null) {
            j11 = aFe1jSDK.AFInAppEventParameterName.AFKeystoreWrapper;
            i10 = aFe1jSDK.getStatusCode();
        } else {
            j11 = 0;
            i10 = 0;
        }
        int i11 = i10;
        if (th2 instanceof HttpException) {
            th3 = th2.getCause();
            j12 = ((HttpException) th2).getMetrics().AFKeystoreWrapper;
        } else {
            th3 = th2;
            j12 = j11;
        }
        this.AFLogger = new AFh1aSDK(aFi1zSDK != null ? aFi1zSDK.AFKeystoreWrapper : null, str, j12, System.currentTimeMillis() - j10, i11, aFh1bSDK, str2, th3);
    }
}
