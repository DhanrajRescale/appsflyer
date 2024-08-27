package no;

import android.os.Parcel;
import android.os.Parcelable;
import mo.u;

/* loaded from: classes2.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.material.datepicker.a(3);

    /* renamed from: a, reason: collision with root package name */
    public int f29057a;

    /* renamed from: b, reason: collision with root package name */
    public u f29058b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f29057a);
        parcel.writeParcelable(this.f29058b, 0);
    }
}
