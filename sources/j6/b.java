package j6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.m0;
import b5.p0;
import e5.x;
import yk.j;

/* loaded from: classes.dex */
public final class b implements p0 {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f21039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21041c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21042d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21043e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21044f;

    public b(String str, String str2, String str3, int i10, int i11, boolean z10) {
        j.E0(i11 == -1 || i11 > 0);
        this.f21039a = i10;
        this.f21040b = str;
        this.f21041c = str2;
        this.f21042d = str3;
        this.f21043e = z10;
        this.f21044f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j6.b a(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b.a(java.util.Map):j6.b");
    }

    @Override // b5.p0
    public final void H(m0 m0Var) {
        String str = this.f21041c;
        if (str != null) {
            m0Var.E = str;
        }
        String str2 = this.f21040b;
        if (str2 != null) {
            m0Var.C = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f21039a == bVar.f21039a && x.a(this.f21040b, bVar.f21040b) && x.a(this.f21041c, bVar.f21041c) && x.a(this.f21042d, bVar.f21042d) && this.f21043e == bVar.f21043e && this.f21044f == bVar.f21044f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f21039a) * 31;
        int i13 = 0;
        String str = this.f21040b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f21041c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f21042d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f21043e ? 1 : 0)) * 31) + this.f21044f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f21041c + "\", genre=\"" + this.f21040b + "\", bitrate=" + this.f21039a + ", metadataInterval=" + this.f21044f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21039a);
        parcel.writeString(this.f21040b);
        parcel.writeString(this.f21041c);
        parcel.writeString(this.f21042d);
        int i11 = x.f15050a;
        parcel.writeInt(this.f21043e ? 1 : 0);
        parcel.writeInt(this.f21044f);
    }

    public b(Parcel parcel) {
        this.f21039a = parcel.readInt();
        this.f21040b = parcel.readString();
        this.f21041c = parcel.readString();
        this.f21042d = parcel.readString();
        int i10 = x.f15050a;
        this.f21043e = parcel.readInt() != 0;
        this.f21044f = parcel.readInt();
    }
}
