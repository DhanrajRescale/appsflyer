package jn;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final gn.b f21509a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21510b;

    public l(gn.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f21509a = bVar;
                this.f21510b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f21509a.equals(lVar.f21509a)) {
            return false;
        }
        return Arrays.equals(this.f21510b, lVar.f21510b);
    }

    public final int hashCode() {
        return ((this.f21509a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21510b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21509a + ", bytes=[...]}";
    }
}
