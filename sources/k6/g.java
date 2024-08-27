package k6;

import android.os.Parcel;
import android.os.Parcelable;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends k {
    public static final Parcelable.Creator<g> CREATOR = new d(2);

    /* renamed from: b, reason: collision with root package name */
    public final String f22241b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22242c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22243d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f22244e;

    public g(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f22241b = str;
        this.f22242c = str2;
        this.f22243d = str3;
        this.f22244e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (x.a(this.f22241b, gVar.f22241b) && x.a(this.f22242c, gVar.f22242c) && x.a(this.f22243d, gVar.f22243d) && Arrays.equals(this.f22244e, gVar.f22244e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f22241b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f22242c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22243d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f22244e) + ((i14 + i12) * 31);
    }

    @Override // k6.k
    public final String toString() {
        return this.f22250a + ": mimeType=" + this.f22241b + ", filename=" + this.f22242c + ", description=" + this.f22243d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22241b);
        parcel.writeString(this.f22242c);
        parcel.writeString(this.f22243d);
        parcel.writeByteArray(this.f22244e);
    }

    public g(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f22241b = readString;
        this.f22242c = parcel.readString();
        this.f22243d = parcel.readString();
        this.f22244e = parcel.createByteArray();
    }
}
