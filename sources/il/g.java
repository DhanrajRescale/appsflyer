package il;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.FacebookSdk;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import nl.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f20110a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f20111b;

    public final Intent a(Context context) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && q.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (q.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final f b(d dVar, String str, List list) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            f fVar = f.f20107b;
            Context applicationContext = FacebookSdk.getApplicationContext();
            Intent a10 = a(applicationContext);
            if (a10 != null) {
                e eVar = new e();
                boolean bindService = applicationContext.bindService(a10, eVar, 1);
                f fVar2 = f.f20108c;
                try {
                    if (bindService) {
                        try {
                            eVar.f20104a.await(5L, TimeUnit.SECONDS);
                            IBinder iBinder = eVar.f20105b;
                            if (iBinder != null) {
                                xl.c i10 = xl.b.i(iBinder);
                                Bundle a11 = c.a(dVar, str, list);
                                if (a11 != null) {
                                    xl.a aVar = (xl.a) i10;
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                                        obtain.writeInt(1);
                                        a11.writeToParcel(obtain, 0);
                                        aVar.f40488a.transact(1, obtain, obtain2, 0);
                                        obtain2.readException();
                                        obtain2.readInt();
                                        obtain2.recycle();
                                        obtain.recycle();
                                        n0.F("g", Intrinsics.i(a11, "Successfully sent events to the remote service: "));
                                    } catch (Throwable th2) {
                                        obtain2.recycle();
                                        obtain.recycle();
                                        throw th2;
                                    }
                                }
                                fVar = f.f20106a;
                            }
                            applicationContext.unbindService(eVar);
                            n0.F("g", "Unbound from the remote service");
                            return fVar;
                        } catch (RemoteException e10) {
                            n0.E("g", e10);
                            applicationContext.unbindService(eVar);
                            n0.F("g", "Unbound from the remote service");
                            return fVar2;
                        } catch (InterruptedException e11) {
                            n0.E("g", e11);
                            applicationContext.unbindService(eVar);
                            n0.F("g", "Unbound from the remote service");
                            return fVar2;
                        }
                    }
                    return fVar2;
                } catch (Throwable th3) {
                    applicationContext.unbindService(eVar);
                    n0.F("g", "Unbound from the remote service");
                    throw th3;
                }
            }
            return fVar;
        } catch (Throwable th4) {
            sl.a.a(this, th4);
            return null;
        }
    }
}
