package k6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.m0;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends k {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(27);

    /* renamed from: b, reason: collision with root package name */
    public final String f22221b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22222c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22223d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f22224e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f22221b = str;
        this.f22222c = str2;
        this.f22223d = i10;
        this.f22224e = bArr;
    }

    @Override // b5.p0
    public final void H(m0 m0Var) {
        m0Var.a(this.f22223d, this.f22224e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22223d == aVar.f22223d && x.a(this.f22221b, aVar.f22221b) && x.a(this.f22222c, aVar.f22222c) && Arrays.equals(this.f22224e, aVar.f22224e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.f22223d) * 31;
        int i12 = 0;
        String str = this.f22221b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f22222c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f22224e) + ((i13 + i12) * 31);
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": mimeType=" + this.f22221b + ", description=" + this.f22222c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22221b);
        parcel.writeString(this.f22222c);
        parcel.writeInt(this.f22223d);
        parcel.writeByteArray(this.f22224e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22221b = readString;
        this.f22222c = parcel.readString();
        this.f22223d = parcel.readInt();
        this.f22224e = parcel.createByteArray();
    }
}
