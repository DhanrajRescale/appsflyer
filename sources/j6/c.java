package j6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.m0;
import b5.p0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements p0 {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(26);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f21045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21046b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21047c;

    public c(byte[] bArr, String str, String str2) {
        this.f21045a = bArr;
        this.f21046b = str;
        this.f21047c = str2;
    }

    @Override // b5.p0
    public final void H(m0 m0Var) {
        String str = this.f21046b;
        if (str != null) {
            m0Var.f3437a = str;
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
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f21045a, ((c) obj).f21045a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21045a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f21046b, this.f21047c, Integer.valueOf(this.f21045a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f21045a);
        parcel.writeString(this.f21046b);
        parcel.writeString(this.f21047c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f21045a = createByteArray;
        this.f21046b = parcel.readString();
        this.f21047c = parcel.readString();
    }
}
