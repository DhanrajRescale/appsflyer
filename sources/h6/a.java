package h6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import b5.u;
import b5.v;
import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements p0 {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: g, reason: collision with root package name */
    public static final v f18011g;

    /* renamed from: h, reason: collision with root package name */
    public static final v f18012h;

    /* renamed from: a, reason: collision with root package name */
    public final String f18013a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18014b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18015c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18016d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f18017e;

    /* renamed from: f, reason: collision with root package name */
    public int f18018f;

    static {
        u uVar = new u();
        uVar.f3600k = "application/id3";
        f18011g = uVar.a();
        u uVar2 = new u();
        uVar2.f3600k = "application/x-scte35";
        f18012h = uVar2.a();
        CREATOR = new android.support.v4.media.a(22);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f18013a = str;
        this.f18014b = str2;
        this.f18015c = j10;
        this.f18016d = j11;
        this.f18017e = bArr;
    }

    @Override // b5.p0
    public final byte[] I() {
        if (g() != null) {
            return this.f18017e;
        }
        return null;
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
        if (this.f18015c == aVar.f18015c && this.f18016d == aVar.f18016d && x.a(this.f18013a, aVar.f18013a) && x.a(this.f18014b, aVar.f18014b) && Arrays.equals(this.f18017e, aVar.f18017e)) {
            return true;
        }
        return false;
    }

    @Override // b5.p0
    public final v g() {
        String str = this.f18013a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f18012h;
            case 1:
            case 2:
                return f18011g;
            default:
                return null;
        }
    }

    public final int hashCode() {
        int i10;
        if (this.f18018f == 0) {
            int i11 = 0;
            String str = this.f18013a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f18014b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            int i13 = (i12 + i11) * 31;
            long j10 = this.f18015c;
            int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f18016d;
            this.f18018f = Arrays.hashCode(this.f18017e) + ((i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f18018f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f18013a + ", id=" + this.f18016d + ", durationMs=" + this.f18015c + ", value=" + this.f18014b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18013a);
        parcel.writeString(this.f18014b);
        parcel.writeLong(this.f18015c);
        parcel.writeLong(this.f18016d);
        parcel.writeByteArray(this.f18017e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = x.f15050a;
        this.f18013a = readString;
        this.f18014b = parcel.readString();
        this.f18015c = parcel.readLong();
        this.f18016d = parcel.readLong();
        this.f18017e = parcel.createByteArray();
    }
}
