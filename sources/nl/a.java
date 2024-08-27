package nl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f28826a;

    public a(IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f28826a = binder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28826a;
    }

    public final String i() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f28826a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean j() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z10 = true;
            obtain.writeInt(1);
            this.f28826a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z10 = false;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
