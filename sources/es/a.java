package es;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new zq.c(8);

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f15860a;

    /* renamed from: b, reason: collision with root package name */
    public int f15861b;

    public a() {
        this.f15860a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15860a, i10);
        parcel.writeInt(this.f15861b);
    }

    public a(Parcel parcel) {
        this.f15860a = parcel.readParcelable(Parcelable.class.getClassLoader());
        this.f15861b = parcel.readInt();
    }

    public a(a aVar) {
        this.f15860a = aVar.f15860a;
        this.f15861b = aVar.f15861b;
    }
}
