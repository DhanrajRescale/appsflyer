package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import in.juspay.hypersdk.core.PaymentConstants;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFf1dSDK extends AFf1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 1;
    private static int afRDLog;
    private static char[] afVerboseLog = {47458, 47457, 35995, 47459, 35998, 35976, 35988, 47460, 35992};
    private static char afWarnLog = 47459;
    private final AFg1mSDK afDebugLog;
    private final AFd1lSDK afInfoLog;
    private final String force;

    /* renamed from: i, reason: collision with root package name */
    private final AFd1sSDK f8442i;

    public AFf1dSDK(@NonNull String str, @NonNull AFd1kSDK aFd1kSDK) {
        super(new AFg1iSDK(aFd1kSDK.w().AFKeystoreWrapper), aFd1kSDK, str);
        this.f8442i = aFd1kSDK.AFInAppEventType();
        this.afInfoLog = aFd1kSDK.w();
        this.force = str;
        this.afDebugLog = aFd1kSDK.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8 == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r8 = r0.AFInAppEventParameterName;
        r9 = r8 / r2;
        r0.valueOf = r9;
        r8 = r8 % r2;
        r0.registerClient = r8;
        r10 = r0.AFKeystoreWrapper;
        r11 = r10 / r2;
        r0.values = r11;
        r10 = r10 % r2;
        r0.unregisterClient = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r8 != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r9 = ((r9 + r2) - 1) % r2;
        r0.valueOf = r9;
        r11 = ((r11 + r2) - 1) % r2;
        r0.values = r11;
        r3[r7] = r1[(r9 * r2) + r8];
        r3[r7 + 1] = r1[(r11 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r9 != r11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r8 = ((r8 + r2) - 1) % r2;
        r0.registerClient = r8;
        r10 = ((r10 + r2) - 1) % r2;
        r0.unregisterClient = r10;
        r3[r7] = r1[(r9 * r2) + r8];
        r3[r7 + 1] = r1[(r11 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r3[r7] = r1[(r9 * r2) + r10];
        r3[r7 + 1] = r1[(r11 * r2) + r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r3[r7] = (char) (r0.AFInAppEventParameterName - r14);
        r3[r7 + 1] = (char) (r0.AFKeystoreWrapper - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r8 == r9) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r12, int r13, byte r14, java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1dSDK.a(java.lang.String, int, byte, java.lang.Object[]):void");
    }

    private void afInfoLog() {
        int i10 = afErrorLog + 109;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
        this.f8458w.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i12 = afErrorLog + 69;
        afRDLog = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        int i10 = afRDLog + 3;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        int i10 = afRDLog + 33;
        afErrorLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        String AFKeystoreWrapper = this.f8442i.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            int i10 = afErrorLog + 49;
            afRDLog = i10 % 128;
            int i11 = i10 % 2;
            aFa1qSDK.AFKeystoreWrapper("advertiserId", AFKeystoreWrapper);
        }
        int i12 = afErrorLog + 85;
        afRDLog = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.internal.AFf1lSDK, com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        int i10 = afErrorLog + 91;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        Context context = this.afInfoLog.AFKeystoreWrapper;
        AFb1vSDK AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
        if (context != null) {
            if (!AFKeystoreWrapper.values()) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                    aFa1qSDK.AFKeystoreWrapper("app_version_code", Integer.toString(packageInfo.versionCode));
                    aFa1qSDK.AFKeystoreWrapper("app_version_name", packageInfo.versionName);
                    aFa1qSDK.AFKeystoreWrapper("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                    aFa1qSDK.AFKeystoreWrapper("installDate", AFb1vSDK.AFKeystoreWrapper(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
                } catch (Throwable th2) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", th2);
                }
                this.afDebugLog.values(aFa1qSDK.AFInAppEventParameterName());
                aFa1qSDK.AFInAppEventParameterName().remove("ivc");
                String valueOf = AFb1vSDK.valueOf();
                if (valueOf != null) {
                    int i10 = afRDLog + 9;
                    afErrorLog = i10 % 128;
                    if (i10 % 2 != 0) {
                        aFa1qSDK.AFKeystoreWrapper("appUserId", valueOf);
                    } else {
                        aFa1qSDK.AFKeystoreWrapper("appUserId", valueOf);
                        throw null;
                    }
                }
                try {
                    aFa1qSDK.AFKeystoreWrapper("model", Build.MODEL);
                    Object[] objArr = new Object[1];
                    a("\u0002\b\u0000\b㙅", ((byte) KeyEvent.getModifierMetaStateMask()) + 6, (byte) (71 - View.combineMeasuredStates(0, 0)), objArr);
                    aFa1qSDK.AFKeystoreWrapper(((String) objArr[0]).intern(), Build.BRAND);
                } catch (Throwable th3) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", th3);
                }
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                    int i11 = afRDLog + 55;
                    afErrorLog = i11 % 128;
                    if (i11 % 2 == 0) {
                        aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                        int i12 = 53 / 0;
                    } else {
                        aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                    }
                }
                AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(context.getContentResolver());
                if (AFInAppEventParameterName != null) {
                    aFa1qSDK.AFKeystoreWrapper("amazon_aid", AFInAppEventParameterName.AFInAppEventParameterName);
                    aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
                }
                aFa1qSDK.AFKeystoreWrapper("devkey", ((AFf1nSDK) this).f8459d.AFLogger);
                aFa1qSDK.AFKeystoreWrapper("uid", AFb1kSDK.valueOf(this.afInfoLog, this.f8458w));
                aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.force);
                aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString(this.f8458w.valueOf("appsFlyerCount", 0)));
                aFa1qSDK.AFKeystoreWrapper(PaymentConstants.Category.SDK, Integer.toString(Build.VERSION.SDK_INT));
                String d10 = this.f8442i.d();
                if (d10 != null) {
                    aFa1qSDK.AFKeystoreWrapper(AppsFlyerProperties.CHANNEL, d10);
                    return;
                }
                return;
            }
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        throw new IllegalStateException("Context is not provided, can't send register request");
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        int i10 = afRDLog + 59;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        int i10 = afErrorLog + 65;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
        super.AFInAppEventType();
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            int i12 = afRDLog + 91;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
            if (responseNetwork.isSuccessful()) {
                int i14 = afErrorLog + 61;
                afRDLog = i14 % 128;
                int i15 = i14 % 2;
                afInfoLog();
                if (i15 != 0) {
                    throw null;
                }
            }
        }
    }
}
