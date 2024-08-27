package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new k6.d(19);

    /* renamed from: a, reason: collision with root package name */
    public int f22510a;

    /* renamed from: b, reason: collision with root package name */
    public int f22511b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22512c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22510a);
        parcel.writeInt(this.f22511b);
        parcel.writeInt(this.f22512c ? 1 : 0);
    }
}
