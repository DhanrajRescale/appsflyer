package g6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import nn.d;

/* loaded from: classes.dex */
public final class a implements p0 {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f16637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16638b;

    public a(int i10, String str) {
        this.f16637a = i10;
        this.f16638b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f16637a);
        sb2.append(",url=");
        return d.o(sb2, this.f16638b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16638b);
        parcel.writeInt(this.f16637a);
    }
}
