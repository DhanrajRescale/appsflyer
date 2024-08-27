package k7;

import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes.dex */
public final class r1 extends k4.b {
    public static final Parcelable.Creator<r1> CREATOR = new f3(6);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f22558c;

    public r1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22558c = parcel.readParcelable(classLoader == null ? i1.class.getClassLoader() : classLoader);
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeParcelable(this.f22558c, 0);
    }
}
