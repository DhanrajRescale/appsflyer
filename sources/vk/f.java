package vk;

import java.util.Arrays;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f38160a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38164e;

    public f(String str, int i10, String str2) {
        this(zq.f.H(str), i10, str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        byte[] bArr = this.f38160a;
        int length = bArr.length;
        byte[] bArr2 = ((f) obj).f38160a;
        if (length != bArr2.length) {
            return false;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f38160a) + 177;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Tag[");
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr = this.f38160a;
        if (bArr == null) {
            stringBuffer.append(HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            for (byte b10 : bArr) {
                stringBuffer.append(String.format("%02x ", Integer.valueOf(b10 & 255)));
            }
        }
        sb2.append(stringBuffer.toString().toUpperCase(Locale.getDefault()).trim());
        sb2.append("] Name=");
        sb2.append(this.f38161b);
        sb2.append(", TagType=");
        sb2.append(nn.d.A(this.f38164e));
        sb2.append(", ValueType=");
        sb2.append(nn.d.B(this.f38162c));
        sb2.append(", Class=");
        sb2.append(v.e.B(this.f38163d));
        return sb2.toString();
    }

    public f(byte[] bArr, int i10, String str) {
        if (bArr != null) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("Param id cannot be empty");
            }
            if (i10 != 0) {
                this.f38160a = bArr;
                this.f38161b = str;
                this.f38162c = i10;
                if (zq.f.a0(bArr[0], 5)) {
                    this.f38164e = 2;
                } else {
                    this.f38164e = 1;
                }
                byte b10 = (byte) ((bArr[0] >>> 6) & 3);
                if (b10 == 1) {
                    this.f38163d = 2;
                    return;
                }
                if (b10 == 2) {
                    this.f38163d = 3;
                    return;
                } else if (b10 != 3) {
                    this.f38163d = 1;
                    return;
                } else {
                    this.f38163d = 4;
                    return;
                }
            }
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
        throw new IllegalArgumentException("Param id cannot be null");
    }
}
