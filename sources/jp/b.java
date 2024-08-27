package jp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f21533a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21533a;
    }

    public final void i(Configuration configuration) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            if (configuration != null) {
                obtain.writeInt(1);
                configuration.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21533a.transact(32, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final void j(q qVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obtain.writeStrongBinder(qVar);
            this.f21533a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void k(r rVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obtain.writeStrongBinder(rVar);
            this.f21533a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void l(s sVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obtain.writeStrongBinder(sVar);
            this.f21533a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean m(int i10, KeyEvent keyEvent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obtain.writeInt(i10);
            if (keyEvent != null) {
                obtain.writeInt(1);
                keyEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21533a.transact(41, obtain, obtain2, 0);
            obtain2.readException();
            boolean z10 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z10;
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final boolean n(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21533a.transact(40, obtain, obtain2, 0);
            obtain2.readException();
            boolean z10 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z10;
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final void o(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obtain.writeString(str);
            obtain.writeInt(0);
            this.f21533a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean p(int i10, KeyEvent keyEvent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            obtain.writeInt(i10);
            if (keyEvent != null) {
                obtain.writeInt(1);
                keyEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f21533a.transact(42, obtain, obtain2, 0);
            obtain2.readException();
            boolean z10 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z10;
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final Bundle q() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            this.f21533a.transact(39, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jp.u] */
    public final v r() {
        v vVar;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            this.f21533a.transact(43, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            int i10 = w.f21567b;
            if (readStrongBinder == null) {
                vVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
                if (queryLocalInterface != null && (queryLocalInterface instanceof v)) {
                    vVar = (v) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f21566a = readStrongBinder;
                    vVar = obj;
                }
            }
            return vVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
