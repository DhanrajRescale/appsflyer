package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y0 implements Parcelable {
    public static final Parcelable.Creator<y0> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public String f1858a;

    /* renamed from: b, reason: collision with root package name */
    public int f1859b;

    public y0(String str, int i10) {
        this.f1858a = str;
        this.f1859b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1858a);
        parcel.writeInt(this.f1859b);
    }
}
