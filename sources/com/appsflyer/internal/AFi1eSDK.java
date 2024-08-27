package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AFi1eSDK extends AFi1rSDK {
    public AFi1eSDK(AFd1sSDK aFd1sSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1sSDK, runnable);
    }

    private boolean AFInAppEventType() {
        if (!valueOf()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFg1aSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        if (!AFInAppEventType()) {
            return;
        }
        this.f8508e = System.currentTimeMillis();
        this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        addObserver(new AFi1hSDK.AnonymousClass1());
        final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
        build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFi1eSDK.3
            public final void onGetAppsReferrerSetupFinished(int i10) {
                AFi1eSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, "com.xiaomi.mipicks")));
                AFi1eSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, "com.xiaomi.mipicks"));
                if (i10 != -1) {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "responseCode not found.");
                                    } else {
                                        AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                                        AFi1eSDK.this.AFInAppEventParameterName.put("response", "PERMISSION_ERROR");
                                    }
                                } else {
                                    AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                                    AFi1eSDK.this.AFInAppEventParameterName.put("response", "DEVELOPER_ERROR");
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                AFi1eSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFi1eSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "XiaomiInstallReferrer not supported");
                        }
                    } else {
                        AFi1eSDK aFi1eSDK = AFi1eSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFi1eSDK.AFInAppEventParameterName.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
                            aFLogger.d(aFg1aSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFi1eSDK.AFInAppEventParameterName.put("referrer", installReferrer2);
                                }
                                aFi1eSDK.AFInAppEventParameterName.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFi1eSDK.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFi1eSDK.AFInAppEventParameterName.put("xiaomi_custom", hashMap);
                            } else {
                                aFLogger.w(aFg1aSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th2) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1aSDK aFg1aSDK2 = AFg1aSDK.REFERRER;
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th2.getMessage());
                            aFLogger2.w(aFg1aSDK2, sb2.toString());
                        }
                    }
                } else {
                    AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                    AFi1eSDK.this.AFInAppEventParameterName.put("response", "SERVICE_DISCONNECTED");
                }
                AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                AFi1eSDK.this.values();
                build.endConnection();
            }

            public final void onGetAppsServiceDisconnected() {
            }
        });
    }
}
