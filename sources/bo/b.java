package bo;

import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes2.dex */
public final class b extends k4.b {
    public static final Parcelable.Creator<b> CREATOR = new f3(10);

    /* renamed from: c, reason: collision with root package name */
    public boolean f7208c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f7208c = parcel.readInt() == 1;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f7208c ? 1 : 0);
    }
}
