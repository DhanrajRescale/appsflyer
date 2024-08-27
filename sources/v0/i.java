package v0;

import kotlin.jvm.internal.Intrinsics;
import t.d0;
import t.f0;
import t.z;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final z f37656a;

    public i() {
        long[] jArr = f0.f34855a;
        this.f37656a = new z();
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        Object obj3;
        z zVar = this.f37656a;
        int e10 = zVar.e(obj);
        if (e10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj3 = null;
        } else {
            obj3 = zVar.f34933c[e10];
        }
        if (obj3 != null) {
            if (obj3 instanceof d0) {
                ((d0) obj3).d(obj2);
            } else if (obj3 != obj2) {
                d0 d0Var = new d0();
                d0Var.d(obj3);
                d0Var.d(obj2);
                obj2 = d0Var;
            }
            obj2 = obj3;
        }
        if (z10) {
            int i10 = ~e10;
            zVar.f34932b[i10] = obj;
            zVar.f34933c[i10] = obj2;
            return;
        }
        zVar.f34933c[e10] = obj2;
    }

    public final boolean b(Object obj, Object obj2) {
        z zVar = this.f37656a;
        Object f10 = zVar.f(obj);
        if (f10 == null) {
            return false;
        }
        if (f10 instanceof d0) {
            d0 d0Var = (d0) f10;
            boolean j10 = d0Var.j(obj2);
            if (j10 && d0Var.b()) {
                zVar.i(obj);
            }
            return j10;
        }
        if (!Intrinsics.a(f10, obj2)) {
            return false;
        }
        zVar.i(obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r15.b() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        r2.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r15 == r33) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.i.c(java.lang.Object):void");
    }
}
