package jp;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public final String f21541k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21542l;

    /* renamed from: m, reason: collision with root package name */
    public final String f21543m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21544n;

    public l(Context context, String str, String str2, String str3, ip.f fVar, ip.g gVar) {
        super(context, fVar, gVar);
        if (str != null) {
            this.f21541k = str;
            if (!TextUtils.isEmpty(str2)) {
                this.f21542l = str2;
                if (!TextUtils.isEmpty(str3)) {
                    this.f21543m = str3;
                    return;
                }
                throw new IllegalArgumentException("callingAppVersion cannot be null or empty");
            }
            throw new IllegalArgumentException("callingPackage cannot be null or empty");
        }
        throw new NullPointerException("null reference");
    }

    @Override // jp.p
    public final void b(g gVar, o oVar) {
        String str = this.f21542l;
        String str2 = this.f21543m;
        String str3 = this.f21541k;
        e eVar = (e) gVar;
        eVar.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
            obtain.writeStrongBinder(oVar);
            obtain.writeInt(1202);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(0);
            eVar.f21535a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void g(boolean z10) {
        if (this.f21553c != null) {
            try {
                f();
                h hVar = (h) ((j) this.f21553c);
                hVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z10 ? 1 : 0);
                    hVar.f21537a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (RemoteException unused) {
            }
            this.f21544n = true;
        }
    }
}
