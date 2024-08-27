package jn;

import android.util.Base64;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f21499a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21500b;

    /* renamed from: c, reason: collision with root package name */
    public final gn.c f21501c;

    public i(String str, byte[] bArr, gn.c cVar) {
        this.f21499a = str;
        this.f21500b = bArr;
        this.f21501c = cVar;
    }

    public static x9.c a() {
        x9.c cVar = new x9.c(8);
        cVar.r(gn.c.f17525a);
        return cVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = this.f21499a;
        objArr[1] = this.f21501c;
        byte[] bArr = this.f21500b;
        if (bArr == null) {
            encodeToString = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public final i c(gn.c cVar) {
        x9.c a10 = a();
        a10.q(this.f21499a);
        a10.r(cVar);
        a10.f40139c = this.f21500b;
        return a10.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f21499a.equals(iVar.f21499a) && Arrays.equals(this.f21500b, iVar.f21500b) && this.f21501c.equals(iVar.f21501c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21499a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21500b)) * 1000003) ^ this.f21501c.hashCode();
    }
}
