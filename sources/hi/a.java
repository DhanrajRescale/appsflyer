package hi;

import android.os.Handler;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import com.facebook.FacebookSdk;
import h.m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kq.e;
import yk.m;

/* loaded from: classes.dex */
public final class a implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f18484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18485c;

    public /* synthetic */ a(InstallReferrerClient installReferrerClient, Object obj, int i10) {
        this.f18483a = i10;
        this.f18484b = installReferrerClient;
        this.f18485c = obj;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        String installReferrer;
        int i11 = this.f18483a;
        Object obj = this.f18485c;
        InstallReferrerClient installReferrerClient = this.f18484b;
        switch (i11) {
            case 0:
                if (i10 == 0) {
                    try {
                        ReferrerDetails installReferrer2 = installReferrerClient.getInstallReferrer();
                        if (installReferrer2 != null && (installReferrer = installReferrer2.getInstallReferrer()) != null) {
                            SplashActivity splashActivity = (SplashActivity) obj;
                            int i12 = SplashActivity.f10156m;
                            splashActivity.getClass();
                            new Handler(splashActivity.getMainLooper()).post(new m0(22, installReferrer, splashActivity));
                        }
                        SplashActivity splashActivity2 = (SplashActivity) obj;
                        splashActivity2.getPreferences(0).edit().putBoolean(splashActivity2.f10158l, true).apply();
                        installReferrerClient.endConnection();
                        return;
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            default:
                if (!sl.a.b(this)) {
                    try {
                        if (i10 != 0) {
                            if (i10 == 2) {
                                FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean("is_referrer_updated", true).apply();
                            }
                        } else {
                            try {
                                ReferrerDetails installReferrer3 = installReferrerClient.getInstallReferrer();
                                Intrinsics.checkNotNullExpressionValue(installReferrer3, "{\n                      referrerClient.installReferrer\n                    }");
                                String installReferrer4 = installReferrer3.getInstallReferrer();
                                if (installReferrer4 != null) {
                                    if (!w.s(installReferrer4, "fb", false)) {
                                        if (w.s(installReferrer4, "facebook", false)) {
                                        }
                                    }
                                    ((e) obj).getClass();
                                    ek.e eVar = m.f41703c;
                                    FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putString("install_referrer", installReferrer4).apply();
                                }
                                FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean("is_referrer_updated", true).apply();
                            } catch (RemoteException | Exception unused) {
                                return;
                            }
                        }
                        installReferrerClient.endConnection();
                        return;
                    } catch (Throwable th2) {
                        sl.a.a(this, th2);
                        return;
                    }
                }
                return;
        }
    }
}
