package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d1 implements Comparable, Parcelable, k {
    public static final Parcelable.Creator<d1> CREATOR = new android.support.v4.media.a(17);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3253d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3254e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f3255f;

    /* renamed from: a, reason: collision with root package name */
    public final int f3256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3258c;

    static {
        int i10 = e5.x.f15050a;
        f3253d = Integer.toString(0, 36);
        f3254e = Integer.toString(1, 36);
        f3255f = Integer.toString(2, 36);
    }

    public d1(int i10, int i11, int i12) {
        this.f3256a = i10;
        this.f3257b = i11;
        this.f3258c = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int i10 = this.f3256a - d1Var.f3256a;
        if (i10 == 0) {
            int i11 = this.f3257b - d1Var.f3257b;
            if (i11 == 0) {
                return this.f3258c - d1Var.f3258c;
            }
            return i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f3256a == d1Var.f3256a && this.f3257b == d1Var.f3257b && this.f3258c == d1Var.f3258c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f3256a * 31) + this.f3257b) * 31) + this.f3258c;
    }

    public final String toString() {
        return this.f3256a + "." + this.f3257b + "." + this.f3258c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3256a);
        parcel.writeInt(this.f3257b);
        parcel.writeInt(this.f3258c);
    }

    public d1(Parcel parcel) {
        this.f3256a = parcel.readInt();
        this.f3257b = parcel.readInt();
        this.f3258c = parcel.readInt();
    }
}
