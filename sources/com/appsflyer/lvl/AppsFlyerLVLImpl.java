package com.appsflyer.lvl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.vending.licensing.ILicensingService;
import com.android.vending.licensing.b;
import com.android.vending.licensing.e;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes.dex */
public class AppsFlyerLVLImpl implements ServiceConnection {
    private final long afNounce;
    private Context ctx;
    private ILicensingService lvlService;
    private final String packageName;
    private AppsFlyerLVL.resultListener resultListener;

    /* loaded from: classes.dex */
    public class ResultListener extends b {
        private ResultListener() {
        }

        @Override // com.android.vending.licensing.c
        public void verifyLicense(int i10, String str, String str2) {
            AppsFlyerLVLImpl.this.resultListener.onLvlResult(str, str2);
        }
    }

    public AppsFlyerLVLImpl(long j10, Context context, AppsFlyerLVL.resultListener resultlistener) {
        this.ctx = context;
        this.packageName = context.getPackageName();
        this.afNounce = j10;
        this.resultListener = resultlistener;
    }

    public void getLVLResult() {
        ILicensingService iLicensingService = this.lvlService;
        if (iLicensingService == null) {
            try {
                if (!this.ctx.bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), this, 1)) {
                    this.resultListener.onLvlFailure(new Exception("LVLException: could not bind service"));
                    return;
                }
                return;
            } catch (SecurityException e10) {
                this.resultListener.onLvlFailure(e10);
                return;
            }
        }
        try {
            iLicensingService.d(this.afNounce, this.packageName, new ResultListener());
        } catch (RemoteException e11) {
            this.resultListener.onLvlFailure(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.android.vending.licensing.d] */
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ILicensingService iLicensingService;
        int i10 = e.f8382a;
        if (iBinder == null) {
            iLicensingService = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ILicensingService)) {
                iLicensingService = (ILicensingService) queryLocalInterface;
            } else {
                ?? obj = new Object();
                obj.f8381a = iBinder;
                iLicensingService = obj;
            }
        }
        this.lvlService = iLicensingService;
        try {
            iLicensingService.d(this.afNounce, this.packageName, new ResultListener());
        } catch (RemoteException e10) {
            this.resultListener.onLvlFailure(e10);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.lvlService = null;
    }
}
