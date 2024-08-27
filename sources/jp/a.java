package jp;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21532a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a aVar;
        try {
            try {
                aVar = (a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(a.class).newInstance();
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            aVar = new Object();
        }
        f21532a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jp.b, jp.d] */
    public static d a(Activity activity, l lVar) {
        Context context;
        lVar.f();
        if (!lVar.f21544n) {
            try {
                lVar.f();
                h hVar = (h) ((j) lVar.f21553c);
                hVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    hVar.f21537a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (activity != null) {
                        if (readStrongBinder != null) {
                            try {
                                context = activity.createPackageContext(x.a(activity), 3);
                            } catch (PackageManager.NameNotFoundException unused) {
                                context = null;
                            }
                            if (context != null) {
                                try {
                                    IBinder a10 = pn.e.a(context.getClassLoader().loadClass("com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer"), new w(context), new w(activity), readStrongBinder);
                                    int i10 = c.f21534a;
                                    if (a10 == null) {
                                        return null;
                                    }
                                    IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                                    if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                                        return (d) queryLocalInterface;
                                    }
                                    ?? obj = new Object();
                                    obj.f21533a = a10;
                                    return obj;
                                } catch (ClassNotFoundException e10) {
                                    throw new Exception("Unable to find dynamic class ".concat("com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer"), e10);
                                }
                            }
                            throw new Exception("Could not create remote context");
                        }
                        throw new NullPointerException("null reference");
                    }
                    throw new NullPointerException("null reference");
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException(e11);
            }
        }
        throw new IllegalStateException("Connection client has been released");
    }
}
