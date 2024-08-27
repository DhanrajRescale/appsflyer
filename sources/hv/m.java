package hv;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class m extends iv.c implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final m f18747d = new m();
    private static final long serialVersionUID = -8290556941213247973L;

    /* renamed from: a, reason: collision with root package name */
    public final int f18748a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f18749b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f18750c = 0;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private Object readResolve() {
        return ((this.f18748a | this.f18749b) | this.f18750c) == 0 ? f18747d : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f18748a == mVar.f18748a && this.f18749b == mVar.f18749b && this.f18750c == mVar.f18750c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f18750c, 16) + Integer.rotateLeft(this.f18749b, 8) + this.f18748a;
    }

    public final String toString() {
        if (this == f18747d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f18748a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f18749b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f18750c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
