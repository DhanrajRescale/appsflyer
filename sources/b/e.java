package b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(4);

    /* renamed from: a, reason: collision with root package name */
    public b f2810a;

    /* JADX WARN: Type inference failed for: r0v3, types: [b.a, java.lang.Object] */
    public e(Parcel parcel) {
        b bVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = c.f2804b;
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.f2803d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                bVar = (b) queryLocalInterface;
            } else {
                ?? obj = new Object();
                obj.f2802a = readStrongBinder;
                bVar = obj;
            }
        }
        this.f2810a = bVar;
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f2810a == null) {
                    this.f2810a = new c(this);
                }
                parcel.writeStrongBinder(this.f2810a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
