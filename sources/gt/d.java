package gt;

import bv.b0;
import bv.m;
import cv.f;
import hv.h;
import hv.p;
import hv.r;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.s;
import lv.k;
import lv.o;
import vt.t;
import yk.g;

/* loaded from: classes2.dex */
public final class d implements et.c, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17568a;

    public /* synthetic */ d(int i10) {
        this.f17568a = i10;
    }

    public static final boolean a(b0 b0Var) {
        b0 b0Var2 = f.f13090e;
        b0Var.getClass();
        m mVar = cv.c.f13081a;
        m mVar2 = b0Var.f7324a;
        int k10 = m.k(mVar2, mVar);
        if (k10 == -1) {
            k10 = m.k(mVar2, cv.c.f13082b);
        }
        if (k10 != -1) {
            mVar2 = m.o(mVar2, k10 + 1, 0, 2);
        } else if (b0Var.g() != null && mVar2.d() == 2) {
            mVar2 = m.f7367d;
        }
        return !s.i(mVar2.q(), ".class", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bv.m c(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.d.c(java.lang.String):bv.m");
    }

    public static m d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (cv.b.a(str.charAt(i11 + 1)) + (cv.b.a(str.charAt(i11)) << 4));
            }
            return new m(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static m e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        m mVar = new m(bytes);
        mVar.f7370c = str;
        return mVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.j] */
    public static b0 f(String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        m mVar = cv.c.f13081a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ?? obj = new Object();
        obj.j0(str);
        return cv.c.d(obj, z10);
    }

    public static b0 g(File file) {
        String str = b0.f7323b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        return f(file2, false);
    }

    public static m i(byte[] bArr) {
        m mVar = m.f7367d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        bv.b.b(bArr.length, 0, length);
        return new m(t.i(bArr, 0, length));
    }

    @Override // et.c
    public final void b(Object obj) {
        g.M(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // lv.o
    public final Object h(k kVar) {
        switch (this.f17568a) {
            case 6:
                return hv.e.m(kVar);
            case 7:
                return h.n(kVar);
            case 8:
                return hv.k.l(kVar);
            case 9:
                return p.l(kVar);
            case 10:
                return hv.t.o(kVar);
            case 11:
                return Boolean.FALSE;
            case 12:
                return (iv.e) kVar.b(this);
            default:
                lv.a aVar = lv.a.OFFSET_SECONDS;
                if (kVar.i(aVar)) {
                    return r.u(kVar.k(aVar));
                }
                return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        this(1);
        this.f17568a = i10;
        int i12 = 2;
        if (i10 == 2) {
            this(i12);
            return;
        }
        int i13 = 3;
        if (i10 == 3) {
            this(i13);
            return;
        }
        int i14 = 4;
        if (i10 == 4) {
            this(i14);
            return;
        }
        int i15 = 5;
        if (i10 != 5) {
        } else {
            this(i15);
        }
    }
}
