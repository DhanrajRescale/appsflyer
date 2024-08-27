package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends k {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(28);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22225b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f22225b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22250a.equals(bVar.f22250a) && Arrays.equals(this.f22225b, bVar.f22225b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22225b) + jr.h.g(this.f22250a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22250a);
        parcel.writeByteArray(this.f22225b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = e5.x.f15050a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f22225b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.b.<init>(android.os.Parcel):void");
    }
}
