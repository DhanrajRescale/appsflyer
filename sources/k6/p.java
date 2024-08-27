package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;

/* loaded from: classes.dex */
public final class p extends k {
    public static final Parcelable.Creator<p> CREATOR = new d(7);

    /* renamed from: b, reason: collision with root package name */
    public final String f22263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22264c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f22263b = str2;
        this.f22264c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f22250a.equals(pVar.f22250a) && x.a(this.f22263b, pVar.f22263b) && x.a(this.f22264c, pVar.f22264c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = jr.h.g(this.f22250a, 527, 31);
        int i11 = 0;
        String str = this.f22263b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (g10 + i10) * 31;
        String str2 = this.f22264c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": url=" + this.f22264c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22250a);
        parcel.writeString(this.f22263b);
        parcel.writeString(this.f22264c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = e5.x.f15050a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f22263b = r0
            java.lang.String r3 = r3.readString()
            r2.f22264c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.p.<init>(android.os.Parcel):void");
    }
}
