package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class AFf1nSDK<Result> extends AFe1dSDK<AFe1jSDK<Result>> {
    protected final AFe1ySDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public final AFg1wSDK f8459d;

    /* renamed from: e, reason: collision with root package name */
    protected final AFb1bSDK f8460e;
    public AFe1jSDK<Result> registerClient;
    private AFb1tSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private String f8461v;

    private AFf1nSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFe1ySDK aFe1ySDK, @NonNull AFg1wSDK aFg1wSDK, @NonNull AFb1bSDK aFb1bSDK, @NonNull AFb1tSDK aFb1tSDK, String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.AFLogger = aFe1ySDK;
        this.f8459d = aFg1wSDK;
        this.f8460e = aFb1bSDK;
        this.unregisterClient = aFb1tSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public long AFInAppEventParameterName() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public void AFInAppEventType() {
        String str;
        if (this.values == AFe1bSDK.SUCCESS) {
            String str2 = this.f8461v;
            if (str2 != null) {
                this.unregisterClient.values(str2);
                return;
            }
            return;
        }
        if (!valueOf() && (str = this.f8461v) != null) {
            this.unregisterClient.values(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @NonNull
    public AFe1bSDK AFKeystoreWrapper() throws Exception {
        if (a_() && this.f8459d.AFKeystoreWrapper()) {
            AppsFlyerRequestListener e10 = e();
            if (e10 != null) {
                e10.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1wSDK();
        }
        String str = this.f8459d.AFLogger;
        if (str != null && !str.trim().isEmpty()) {
            AFe1sSDK<Result> AFKeystoreWrapper = AFKeystoreWrapper(str);
            if (AFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
                return AFe1bSDK.FAILURE;
            }
            if (i()) {
                values(AFKeystoreWrapper.AFInAppEventParameterName);
            }
            AFe1jSDK<Result> AFInAppEventType = AFKeystoreWrapper.AFInAppEventType();
            this.registerClient = AFInAppEventType;
            this.f8460e.AFKeystoreWrapper(AFKeystoreWrapper.AFInAppEventParameterName.values, AFInAppEventType.getStatusCode(), AFInAppEventType.getBody().toString());
            AppsFlyerRequestListener e11 = e();
            if (e11 != null) {
                if (AFInAppEventType.isSuccessful()) {
                    e11.onSuccess();
                } else {
                    StringBuilder sb2 = new StringBuilder("Status code failure ");
                    sb2.append(AFInAppEventType.getStatusCode());
                    e11.onError(50, sb2.toString());
                }
            }
            if (AFInAppEventType.isSuccessful()) {
                return AFe1bSDK.SUCCESS;
            }
            return AFe1bSDK.FAILURE;
        }
        AppsFlyerRequestListener e12 = e();
        if (e12 != null) {
            e12.onError(41, "No dev key");
        }
        throw new AFe1aSDK();
    }

    public abstract AFe1sSDK<Result> AFKeystoreWrapper(@NonNull String str);

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener e();

    public abstract boolean i();

    @Override // com.appsflyer.internal.AFe1dSDK
    public boolean valueOf() {
        if (unregisterClient() instanceof AFf1wSDK) {
            return false;
        }
        if (this.values == AFe1bSDK.TIMEOUT) {
            return true;
        }
        Throwable unregisterClient = unregisterClient();
        if (!(unregisterClient instanceof IOException) || (unregisterClient instanceof ParsingException)) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void values() {
        String str;
        super.values();
        if (!i() || (str = this.f8459d.AFLogger) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1sSDK<Result> AFKeystoreWrapper = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            values(AFKeystoreWrapper.AFInAppEventParameterName);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    public AFf1nSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1kSDK aFd1kSDK, String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventParameterName(Throwable th2) {
        boolean z10 = !(th2 instanceof HttpException);
        if (th2 instanceof AFf1wSDK) {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
        } else {
            AFLogger.INSTANCE.e(AFg1aSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, true, true, z10);
        }
        AppsFlyerRequestListener e10 = e();
        if (e10 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            e10.onError(40, message);
        }
    }

    public AFf1nSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1kSDK aFd1kSDK, String str, String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.AFInAppEventParameterName(), aFd1kSDK.i(), aFd1kSDK.v(), aFd1kSDK.afErrorLog(), str);
        this.f8461v = str2;
    }

    private void values(AFe1nSDK aFe1nSDK) {
        String str = this.f8461v;
        this.f8461v = this.unregisterClient.AFInAppEventType(new AFb1qSDK(aFe1nSDK.values, aFe1nSDK.AFInAppEventParameterName(), "6.14.0", this.AFInAppEventType));
        if (str != null) {
            this.unregisterClient.values(str);
        }
    }
}
