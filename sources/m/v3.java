package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v3 extends k4.b {
    public static final Parcelable.Creator<v3> CREATOR = new f3(1);

    /* renamed from: c, reason: collision with root package name */
    public int f25758c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25759d;

    public v3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f25758c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25759d = z10;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f25758c);
        parcel.writeInt(this.f25759d ? 1 : 0);
    }
}
