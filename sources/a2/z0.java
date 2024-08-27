package a2;

import c2.r1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class z0 {
    public static final w2.k a(z0 z0Var) {
        j0 j0Var = (j0) z0Var;
        int i10 = j0Var.f89a;
        Object obj = j0Var.f90b;
        switch (i10) {
            case 0:
                return ((c2.u0) obj).getLayoutDirection();
            default:
                return ((d2.a0) ((r1) obj)).getLayoutDirection();
        }
    }

    public static final int b(z0 z0Var) {
        j0 j0Var = (j0) z0Var;
        int i10 = j0Var.f89a;
        Object obj = j0Var.f90b;
        switch (i10) {
            case 0:
                return ((c2.u0) obj).d0();
            default:
                return ((d2.a0) ((r1) obj)).getRoot().f1423x.f7827o.f29a;
        }
    }

    public static void c(a1 a1Var, int i10, int i11, float f10) {
        long j10 = hl.f.j(i10, i11);
        long j11 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, null);
    }

    public static /* synthetic */ void d(z0 z0Var, a1 a1Var, int i10, int i11) {
        z0Var.getClass();
        c(a1Var, i10, i11, s0.g.f34069a);
    }

    public static void e(a1 a1Var, long j10, float f10) {
        long j11 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, null);
    }

    public static /* synthetic */ void f(z0 z0Var, a1 a1Var, long j10) {
        z0Var.getClass();
        e(a1Var, j10, s0.g.f34069a);
    }

    public static void g(z0 z0Var, a1 a1Var, int i10, int i11) {
        z0Var.getClass();
        long j10 = hl.f.j(i10, i11);
        if (a(z0Var) != w2.k.f38799a && b(z0Var) != 0) {
            int b10 = b(z0Var) - a1Var.f29a;
            int i12 = w2.h.f38792c;
            long j11 = hl.f.j(b10 - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            long j12 = a1Var.f33e;
            a1Var.j0(hl.f.j(((int) (j11 >> 32)) + ((int) (j12 >> 32)), ((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L))), s0.g.f34069a, null);
            return;
        }
        long j13 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j13 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j13 & 4294967295L))), s0.g.f34069a, null);
    }

    public static void h(z0 z0Var, a1 a1Var, int i10, int i11) {
        int i12 = b1.f38b;
        x xVar = x.f129c;
        z0Var.getClass();
        long j10 = hl.f.j(i10, i11);
        if (a(z0Var) != w2.k.f38799a && b(z0Var) != 0) {
            int b10 = b(z0Var) - a1Var.f29a;
            int i13 = w2.h.f38792c;
            long j11 = hl.f.j(b10 - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            long j12 = a1Var.f33e;
            a1Var.j0(hl.f.j(((int) (j11 >> 32)) + ((int) (j12 >> 32)), ((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L))), s0.g.f34069a, xVar);
            return;
        }
        long j13 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j13 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j13 & 4294967295L))), s0.g.f34069a, xVar);
    }

    public static void i(z0 z0Var, a1 a1Var, long j10, d0.h hVar, int i10) {
        Function1 function1 = hVar;
        if ((i10 & 4) != 0) {
            int i11 = b1.f38b;
            function1 = x.f129c;
        }
        z0Var.getClass();
        if (a(z0Var) != w2.k.f38799a && b(z0Var) != 0) {
            int b10 = b(z0Var) - a1Var.f29a;
            int i12 = w2.h.f38792c;
            long j11 = hl.f.j(b10 - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            long j12 = a1Var.f33e;
            a1Var.j0(hl.f.j(((int) (j11 >> 32)) + ((int) (j12 >> 32)), ((int) (j11 & 4294967295L)) + ((int) (4294967295L & j12))), s0.g.f34069a, function1);
            return;
        }
        long j13 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j13 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (4294967295L & j13))), s0.g.f34069a, function1);
    }

    public static void j(a1 a1Var, int i10, int i11, float f10, Function1 function1) {
        long j10 = hl.f.j(i10, i11);
        long j11 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, function1);
    }

    public static /* synthetic */ void k(z0 z0Var, a1 a1Var, int i10, int i11, Function1 function1, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = b1.f38b;
            function1 = x.f129c;
        }
        z0Var.getClass();
        j(a1Var, i10, i11, s0.g.f34069a, function1);
    }

    public static void l(a1 a1Var, long j10, float f10, Function1 function1) {
        long j11 = a1Var.f33e;
        a1Var.j0(hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, function1);
    }

    public static /* synthetic */ void m(z0 z0Var, a1 a1Var, long j10, d0.h hVar, int i10) {
        Function1 function1 = hVar;
        if ((i10 & 4) != 0) {
            int i11 = b1.f38b;
            function1 = x.f129c;
        }
        z0Var.getClass();
        l(a1Var, j10, s0.g.f34069a, function1);
    }
}
