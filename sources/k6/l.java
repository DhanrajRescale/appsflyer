package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;

/* loaded from: classes.dex */
public final class l extends k {
    public static final Parcelable.Creator<l> CREATOR = new d(3);

    /* renamed from: b, reason: collision with root package name */
    public final String f22251b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22252c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22253d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f22251b = str;
        this.f22252c = str2;
        this.f22253d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (x.a(this.f22252c, lVar.f22252c) && x.a(this.f22251b, lVar.f22251b) && x.a(this.f22253d, lVar.f22253d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f22251b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f22252c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22253d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": domain=" + this.f22251b + ", description=" + this.f22252c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22250a);
        parcel.writeString(this.f22251b);
        parcel.writeString(this.f22253d);
    }

    public l(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22251b = readString;
        this.f22252c = parcel.readString();
        this.f22253d = parcel.readString();
    }
}
