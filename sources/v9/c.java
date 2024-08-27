package v9;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import tr.e;

/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f37801e = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public int f37802a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f37803b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f37804c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f37805d;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f37801e[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f37801e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int H(e eVar);

    public abstract void I();

    public abstract void J();

    public final void R(String str) {
        StringBuilder r10 = da.e.r(str, " at path ");
        r10.append(f());
        throw new IOException(r10.toString());
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final String f() {
        int i10 = this.f37802a;
        int[] iArr = this.f37803b;
        String[] strArr = this.f37804c;
        int[] iArr2 = this.f37805d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public abstract boolean g();

    public abstract boolean j();

    public abstract double l();

    public abstract int n();

    public abstract String v();

    public abstract int x();

    public final void z(int i10) {
        int i11 = this.f37802a;
        int[] iArr = this.f37803b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f37803b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f37804c;
                this.f37804c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f37805d;
                this.f37805d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + f());
            }
        }
        int[] iArr3 = this.f37803b;
        int i12 = this.f37802a;
        this.f37802a = i12 + 1;
        iArr3[i12] = i10;
    }
}
