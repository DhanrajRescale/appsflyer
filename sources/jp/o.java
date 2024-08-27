package jp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f21550a;

    public o(p pVar) {
        this.f21550a = pVar;
        attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
            return true;
        }
        parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
        String readString = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        p pVar = this.f21550a;
        h.f fVar = pVar.f21552b;
        fVar.sendMessage(fVar.obtainMessage(1, new n(pVar, readString, readStrongBinder)));
        parcel2.writeNoException();
        return true;
    }
}
