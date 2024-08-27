package com.webengage.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;

/* loaded from: classes2.dex */
public class p implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    private Context f12639a;

    /* renamed from: b, reason: collision with root package name */
    private InstallReferrerClient f12640b;

    public p(Context context) {
        this.f12639a = context;
    }

    public void a() {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f12639a).build();
        this.f12640b = build;
        build.startConnection(this);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        Logger.w("WebEngage", "onInstallReferrerService Disconnected");
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i10) {
        String str;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "Install referrer Connection couldn't be established";
            } else if (i10 != 2) {
                return;
            } else {
                str = "Install referrer API not available on the current Play Store app";
            }
            Logger.d("WebEngage", str);
            return;
        }
        try {
            String installReferrer = this.f12640b.getInstallReferrer().getInstallReferrer();
            Logger.d("WebEngage", "Referrer Url: " + installReferrer);
            Intent intent = new Intent();
            intent.putExtra("referrer", installReferrer);
            WebEngage.get().analytics().installed(intent);
        } catch (RemoteException e10) {
            Logger.d("WebEngage", "Exception while getting install-referrer " + e10);
        }
        this.f12640b.endConnection();
    }
}
