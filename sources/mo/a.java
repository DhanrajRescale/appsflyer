package mo;

import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes2.dex */
public final class a extends k4.b {
    public static final Parcelable.Creator<a> CREATOR = new f3(11);

    /* renamed from: c, reason: collision with root package name */
    public boolean f27858c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f27858c = parcel.readInt() == 1;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f27858c ? 1 : 0);
    }
}
