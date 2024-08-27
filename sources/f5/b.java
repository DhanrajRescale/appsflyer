package f5;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import com.airbnb.deeplinkdispatch.MetadataMasks;
import e5.x;
import java.util.Arrays;
import jr.h;
import yk.j;

/* loaded from: classes.dex */
public final class b implements p0 {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15921d;

    public b(String str, byte[] bArr, int i10, int i11) {
        this.f15918a = str;
        this.f15919b = bArr;
        this.f15920c = i10;
        this.f15921d = i11;
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
        if (this.f15918a.equals(bVar.f15918a) && Arrays.equals(this.f15919b, bVar.f15919b) && this.f15920c == bVar.f15920c && this.f15921d == bVar.f15921d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f15919b) + h.g(this.f15918a, 527, 31)) * 31) + this.f15920c) * 31) + this.f15921d;
    }

    public final String toString() {
        String m10;
        boolean z10;
        boolean z11;
        byte[] bArr = this.f15919b;
        int i10 = this.f15921d;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    int i11 = x.f15050a;
                    StringBuilder sb2 = new StringBuilder(bArr.length * 2);
                    for (int i12 = 0; i12 < bArr.length; i12++) {
                        sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                        sb2.append(Character.forDigit(bArr[i12] & 15, 16));
                    }
                    m10 = sb2.toString();
                } else {
                    int i13 = x.f15050a;
                    if (bArr.length == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j.E0(z11);
                    m10 = String.valueOf(bArr[3] | (bArr[1] << MetadataMasks.ComponentParamMask) | (bArr[0] << 24) | (bArr[2] << 8));
                }
            } else {
                int i14 = x.f15050a;
                if (bArr.length == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j.E0(z10);
                m10 = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8)));
            }
        } else {
            m10 = x.m(bArr);
        }
        return v.e.j(new StringBuilder("mdta: key="), this.f15918a, ", value=", m10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15918a);
        parcel.writeByteArray(this.f15919b);
        parcel.writeInt(this.f15920c);
        parcel.writeInt(this.f15921d);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f15918a = readString;
        this.f15919b = parcel.createByteArray();
        this.f15920c = parcel.readInt();
        this.f15921d = parcel.readInt();
    }
}
