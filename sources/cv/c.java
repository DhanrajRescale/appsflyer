package cv;

import bv.b0;
import bv.j;
import bv.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;
import vt.y;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final m f13081a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f13082b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f13083c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f13084d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f13085e;

    static {
        m mVar = m.f7367d;
        f13081a = gt.d.e("/");
        f13082b = gt.d.e("\\");
        f13083c = gt.d.e("/\\");
        f13084d = gt.d.e(".");
        f13085e = gt.d.e("..");
    }

    public static final int a(b0 b0Var) {
        if (b0Var.f7324a.d() == 0) {
            return -1;
        }
        m mVar = b0Var.f7324a;
        if (mVar.i(0) != 47) {
            if (mVar.i(0) == 92) {
                if (mVar.d() > 2 && mVar.i(1) == 92) {
                    m other = f13082b;
                    Intrinsics.checkNotNullParameter(other, "other");
                    int f10 = mVar.f(2, other.f7368a);
                    if (f10 == -1) {
                        return mVar.d();
                    }
                    return f10;
                }
            } else {
                if (mVar.d() <= 2 || mVar.i(1) != 58 || mVar.i(2) != 92) {
                    return -1;
                }
                char i10 = (char) mVar.i(0);
                if (('a' > i10 || i10 >= '{') && ('A' > i10 || i10 >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bv.j] */
    public static final b0 b(b0 b0Var, b0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        m c10 = c(b0Var);
        if (c10 == null && (c10 = c(child)) == null) {
            c10 = f(b0.f7323b);
        }
        ?? obj = new Object();
        obj.S(b0Var.f7324a);
        if (obj.f7365b > 0) {
            obj.S(c10);
        }
        obj.S(child.f7324a);
        return d(obj, z10);
    }

    public static final m c(b0 b0Var) {
        m mVar = b0Var.f7324a;
        m mVar2 = f13081a;
        if (m.g(mVar, mVar2) == -1) {
            m mVar3 = f13082b;
            if (m.g(b0Var.f7324a, mVar3) == -1) {
                return null;
            }
            return mVar3;
        }
        return mVar2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, bv.j] */
    public static final b0 d(j jVar, boolean z10) {
        m mVar;
        boolean z11;
        char f10;
        boolean z12;
        m mVar2;
        m e10;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        ?? obj = new Object();
        m mVar3 = null;
        int i10 = 0;
        while (true) {
            if (!jVar.T(0L, f13081a)) {
                mVar = f13082b;
                if (!jVar.T(0L, mVar)) {
                    break;
                }
            }
            byte readByte = jVar.readByte();
            if (mVar3 == null) {
                mVar3 = e(readByte);
            }
            i10++;
        }
        if (i10 >= 2 && Intrinsics.a(mVar3, mVar)) {
            z11 = true;
        } else {
            z11 = false;
        }
        m mVar4 = f13083c;
        if (z11) {
            Intrinsics.c(mVar3);
            obj.S(mVar3);
            obj.S(mVar3);
        } else if (i10 > 0) {
            Intrinsics.c(mVar3);
            obj.S(mVar3);
        } else {
            long P = jVar.P(mVar4);
            if (mVar3 == null) {
                if (P == -1) {
                    mVar3 = f(b0.f7323b);
                } else {
                    mVar3 = e(jVar.f(P));
                }
            }
            if (Intrinsics.a(mVar3, mVar) && jVar.f7365b >= 2 && jVar.f(1L) == 58 && (('a' <= (f10 = (char) jVar.f(0L)) && f10 < '{') || ('A' <= f10 && f10 < '['))) {
                if (P == 2) {
                    obj.write(jVar, 3L);
                } else {
                    obj.write(jVar, 2L);
                }
            }
        }
        if (obj.f7365b > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean p10 = jVar.p();
            mVar2 = f13084d;
            if (p10) {
                break;
            }
            long P2 = jVar.P(mVar4);
            if (P2 == -1) {
                e10 = jVar.e(jVar.f7365b);
            } else {
                e10 = jVar.e(P2);
                jVar.readByte();
            }
            m mVar5 = f13085e;
            if (Intrinsics.a(e10, mVar5)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (z10 && (z12 || (!arrayList.isEmpty() && !Intrinsics.a(g0.C(arrayList), mVar5)))) {
                        if (!z11 || arrayList.size() != 1) {
                            Intrinsics.checkNotNullParameter(arrayList, "<this>");
                            if (!arrayList.isEmpty()) {
                                arrayList.remove(y.f(arrayList));
                            }
                        }
                    } else {
                        arrayList.add(e10);
                    }
                }
            } else if (!Intrinsics.a(e10, mVar2) && !Intrinsics.a(e10, m.f7367d)) {
                arrayList.add(e10);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                obj.S(mVar3);
            }
            obj.S((m) arrayList.get(i11));
        }
        if (obj.f7365b == 0) {
            obj.S(mVar2);
        }
        return new b0(obj.e(obj.f7365b));
    }

    public static final m e(byte b10) {
        if (b10 != 47) {
            if (b10 == 92) {
                return f13082b;
            }
            throw new IllegalArgumentException(jr.h.n("not a directory separator: ", b10));
        }
        return f13081a;
    }

    public static final m f(String str) {
        if (Intrinsics.a(str, "/")) {
            return f13081a;
        }
        if (Intrinsics.a(str, "\\")) {
            return f13082b;
        }
        throw new IllegalArgumentException(a3.a.f("not a directory separator: ", str));
    }
}
