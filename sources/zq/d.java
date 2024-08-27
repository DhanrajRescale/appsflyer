package zq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f42798a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f42799b;

    public d(String str) {
        this.f42798a = str;
        this.f42799b = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42798a);
        parcel.writeLong(this.f42799b.get());
    }

    public d(Parcel parcel) {
        this.f42798a = parcel.readString();
        this.f42799b = new AtomicLong(parcel.readLong());
    }
}
