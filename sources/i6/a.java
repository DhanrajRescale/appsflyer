package i6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.m0;
import b5.p0;
import e5.p;
import e5.x;
import java.util.Arrays;
import jr.h;
import kp.e;

/* loaded from: classes.dex */
public final class a implements p0 {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f19684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19685b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19686c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19687d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19690g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f19691h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f19684a = i10;
        this.f19685b = str;
        this.f19686c = str2;
        this.f19687d = i11;
        this.f19688e = i12;
        this.f19689f = i13;
        this.f19690g = i14;
        this.f19691h = bArr;
    }

    public static a a(p pVar) {
        int g10 = pVar.g();
        String s7 = pVar.s(pVar.g(), e.f23431a);
        String s10 = pVar.s(pVar.g(), e.f23433c);
        int g11 = pVar.g();
        int g12 = pVar.g();
        int g13 = pVar.g();
        int g14 = pVar.g();
        int g15 = pVar.g();
        byte[] bArr = new byte[g15];
        pVar.e(bArr, 0, g15);
        return new a(g10, s7, s10, g11, g12, g13, g14, bArr);
    }

    @Override // b5.p0
    public final void H(m0 m0Var) {
        m0Var.a(this.f19684a, this.f19691h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f19684a == aVar.f19684a && this.f19685b.equals(aVar.f19685b) && this.f19686c.equals(aVar.f19686c) && this.f19687d == aVar.f19687d && this.f19688e == aVar.f19688e && this.f19689f == aVar.f19689f && this.f19690g == aVar.f19690g && Arrays.equals(this.f19691h, aVar.f19691h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19691h) + ((((((((h.g(this.f19686c, h.g(this.f19685b, (527 + this.f19684a) * 31, 31), 31) + this.f19687d) * 31) + this.f19688e) * 31) + this.f19689f) * 31) + this.f19690g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f19685b + ", description=" + this.f19686c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19684a);
        parcel.writeString(this.f19685b);
        parcel.writeString(this.f19686c);
        parcel.writeInt(this.f19687d);
        parcel.writeInt(this.f19688e);
        parcel.writeInt(this.f19689f);
        parcel.writeInt(this.f19690g);
        parcel.writeByteArray(this.f19691h);
    }

    public a(Parcel parcel) {
        this.f19684a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f19685b = readString;
        this.f19686c = parcel.readString();
        this.f19687d = parcel.readInt();
        this.f19688e = parcel.readInt();
        this.f19689f = parcel.readInt();
        this.f19690g = parcel.readInt();
        this.f19691h = parcel.createByteArray();
    }
}
