package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;

/* loaded from: classes.dex */
public final class f extends k {
    public static final Parcelable.Creator<f> CREATOR = new d(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f22238b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22239c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22240d;

    public f(String str, String str2, String str3) {
        super("COMM");
        this.f22238b = str;
        this.f22239c = str2;
        this.f22240d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (x.a(this.f22239c, fVar.f22239c) && x.a(this.f22238b, fVar.f22238b) && x.a(this.f22240d, fVar.f22240d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f22238b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f22239c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22240d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": language=" + this.f22238b + ", description=" + this.f22239c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22250a);
        parcel.writeString(this.f22238b);
        parcel.writeString(this.f22240d);
    }

    public f(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22238b = readString;
        this.f22239c = parcel.readString();
        this.f22240d = parcel.readString();
    }
}
