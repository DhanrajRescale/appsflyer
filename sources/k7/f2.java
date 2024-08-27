package k7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class f2 implements Parcelable {
    public static final Parcelable.Creator<f2> CREATOR = new k6.d(21);

    /* renamed from: a, reason: collision with root package name */
    public int f22348a;

    /* renamed from: b, reason: collision with root package name */
    public int f22349b;

    /* renamed from: c, reason: collision with root package name */
    public int f22350c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f22351d;

    /* renamed from: e, reason: collision with root package name */
    public int f22352e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f22353f;

    /* renamed from: g, reason: collision with root package name */
    public List f22354g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22355h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22356i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22357j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22348a);
        parcel.writeInt(this.f22349b);
        parcel.writeInt(this.f22350c);
        if (this.f22350c > 0) {
            parcel.writeIntArray(this.f22351d);
        }
        parcel.writeInt(this.f22352e);
        if (this.f22352e > 0) {
            parcel.writeIntArray(this.f22353f);
        }
        parcel.writeInt(this.f22355h ? 1 : 0);
        parcel.writeInt(this.f22356i ? 1 : 0);
        parcel.writeInt(this.f22357j ? 1 : 0);
        parcel.writeList(this.f22354g);
    }
}
