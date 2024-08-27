package k4;

import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f22040a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f22039b = new b();
    public static final Parcelable.Creator<b> CREATOR = new f3(4);

    public b() {
        this.f22040a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f22040a = parcelable == f22039b ? null : parcelable;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f22040a = readParcelable == null ? f22039b : readParcelable;
    }
}
