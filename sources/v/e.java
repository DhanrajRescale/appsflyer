package v;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.functions.Function0;
import t0.m2;
import x.f1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "PRIVATE" : "CONTEXT_SPECIFIC" : "APPLICATION" : "UNIVERSAL";
    }

    public static /* synthetic */ String C(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE";
    }

    public static int a(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int c(long j10, int i10, int i11) {
        return (Long.hashCode(j10) + i10) * i11;
    }

    public static int d(boolean z10, int i10, int i11) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static a0.l e(t0.r rVar) {
        a0.l lVar = new a0.l();
        rVar.k0(lVar);
        return lVar;
    }

    public static g1.o f(g1.l lVar, float f10, t0.r rVar, g1.l lVar2, float f11) {
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
        return androidx.compose.foundation.layout.d.e(lVar2, f11);
    }

    public static Object g(t0.r rVar, int i10, int i11) {
        rVar.b0(i10);
        rVar.b0(i11);
        return rVar.Q();
    }

    public static Object h(t0.r rVar, boolean z10, int i10) {
        rVar.s(z10);
        rVar.b0(i10);
        return rVar.Q();
    }

    public static String i(g1.l lVar, float f10, t0.r rVar, int i10, t0.r rVar2) {
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
        return hl.f.c1(i10, rVar2);
    }

    public static String j(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static /* synthetic */ Iterator m() {
        try {
            return Arrays.asList(new ru.b()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static pd.e0 n(Function0 function0, int i10, t0.r rVar) {
        pd.e0 e0Var = new pd.e0(function0, i10);
        rVar.k0(e0Var);
        return e0Var;
    }

    public static t0.d0 o(vu.f fVar, t0.r rVar) {
        t0.d0 d0Var = new t0.d0(fVar);
        rVar.k0(d0Var);
        return d0Var;
    }

    public static f1 p(Function0 function0, int i10, t0.r rVar) {
        f1 f1Var = new f1(function0, i10);
        rVar.k0(f1Var);
        return f1Var;
    }

    public static void q(int i10, int i11, int i12, int i13, int i14) {
        androidx.compose.ui.input.key.a.a(i10);
        androidx.compose.ui.input.key.a.a(i11);
        androidx.compose.ui.input.key.a.a(i12);
        androidx.compose.ui.input.key.a.a(i13);
        androidx.compose.ui.input.key.a.a(i14);
    }

    public static void r(int i10, androidx.lifecycle.e0 e0Var) {
        e0Var.postValue(ni.j.i(new Integer(i10)));
    }

    public static void s(int i10, t0.r rVar, g1.l lVar, t0.r rVar2) {
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(i10, rVar)), rVar2);
    }

    public static void t(long j10, StringBuilder sb2, String str) {
        sb2.append((Object) n1.t.j(j10));
        sb2.append(str);
    }

    public static void u(g1.l lVar, float f10, t0.r rVar, boolean z10, boolean z11) {
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
        rVar.s(z10);
        rVar.s(z11);
    }

    public static void v(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void w(t0.r rVar, b1.c cVar, t0.r rVar2, Integer num, int i10) {
        cVar.b(new m2(rVar), rVar2, num);
        rVar.b0(i10);
    }

    public static void x(t0.r rVar, boolean z10, boolean z11, boolean z12) {
        rVar.s(z10);
        rVar.s(z11);
        rVar.s(z12);
    }

    public static void y(t0.r rVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        rVar.s(z10);
        rVar.s(z11);
        rVar.s(z12);
        rVar.s(z13);
    }

    public static /* synthetic */ Iterator z() {
        try {
            return Arrays.asList(new ru.a()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
