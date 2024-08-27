package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.material.datepicker.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f11555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11557c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11558d;

    public g(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f11556b = readInt;
        this.f11557c = readInt2;
        this.f11558d = readInt3;
        this.f11555a = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f11556b == gVar.f11556b && this.f11557c == gVar.f11557c && this.f11555a == gVar.f11555a && this.f11558d == gVar.f11558d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11555a), Integer.valueOf(this.f11556b), Integer.valueOf(this.f11557c), Integer.valueOf(this.f11558d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11556b);
        parcel.writeInt(this.f11557c);
        parcel.writeInt(this.f11558d);
        parcel.writeInt(this.f11555a);
    }
}
