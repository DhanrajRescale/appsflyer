package jp;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public l f21564a;

    /* renamed from: b, reason: collision with root package name */
    public d f21565b;

    public final void a(boolean z10) {
        try {
            b bVar = (b) this.f21565b;
            bVar.getClass();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                obtain.writeInt(z10 ? 1 : 0);
                bVar.f21533a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                obtain2.recycle();
                obtain.recycle();
                this.f21564a.g(z10);
                l lVar = this.f21564a;
                if (!lVar.f21544n) {
                    lVar.g(true);
                }
                lVar.e();
                lVar.f21560j = false;
                synchronized (lVar.f21558h) {
                    try {
                        int size = lVar.f21558h.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            n nVar = (n) lVar.f21558h.get(i10);
                            synchronized (nVar) {
                                nVar.f21546a = null;
                            }
                        }
                        lVar.f21558h.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lVar.c();
            } catch (Throwable th3) {
                obtain2.recycle();
                obtain.recycle();
                throw th3;
            }
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(int i10) {
        try {
            b bVar = (b) this.f21565b;
            bVar.getClass();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                obtain.writeInt(i10);
                bVar.f21533a.transact(22, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
