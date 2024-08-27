package z5;

import android.net.Uri;
import b7.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lp.j1;
import lp.l0;
import lp.o0;
import qu.i0;

/* loaded from: classes.dex */
public final class n implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f42110b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final h.c f42111c = new h.c(new j5.d(4));

    /* renamed from: d, reason: collision with root package name */
    public static final h.c f42112d = new h.c(new j5.d(5));

    /* renamed from: a, reason: collision with root package name */
    public j1 f42113a;

    @Override // z5.s
    public final synchronized p[] a() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void b(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new b7.a());
                return;
            case 1:
                arrayList.add(new b7.c());
                return;
            case 2:
                arrayList.add(new b7.e());
                return;
            case 3:
                arrayList.add(new a6.a());
                return;
            case 4:
                p x10 = f42111c.x(0);
                if (x10 != null) {
                    arrayList.add(x10);
                    return;
                } else {
                    arrayList.add(new c6.b());
                    return;
                }
            case 5:
                arrayList.add(new d6.b());
                return;
            case 6:
                arrayList.add(new o6.d(0));
                return;
            case 7:
                arrayList.add(new p6.d());
                return;
            case 8:
                arrayList.add(new q6.k());
                arrayList.add(new q6.n());
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new b7.a0());
                return;
            case 11:
                if (this.f42113a == null) {
                    l0 l0Var = o0.f25025b;
                    this.f42113a = j1.f24998e;
                }
                arrayList.add(new f0(new e5.u(0L), new b7.g(this.f42113a)));
                return;
            case 12:
                arrayList.add(new c7.d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new e6.a());
                return;
            case 15:
                p x11 = f42112d.x(new Object[0]);
                if (x11 != null) {
                    arrayList.add(x11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new b6.b());
                return;
        }
    }

    @Override // z5.s
    public final synchronized p[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f42110b;
            arrayList = new ArrayList(16);
            int A = i0.A(map);
            if (A != -1) {
                b(A, arrayList);
            }
            int B = i0.B(uri);
            if (B != -1 && B != A) {
                b(B, arrayList);
            }
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = iArr[i10];
                if (i11 != A && i11 != B) {
                    b(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (p[]) arrayList.toArray(new p[arrayList.size()]);
    }
}
