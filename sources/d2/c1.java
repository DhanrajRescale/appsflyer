package d2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class c1 implements r2, qu.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f13380a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.d0 f13381b;

    /* renamed from: c, reason: collision with root package name */
    public final qu.f0 f13382c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f13383d = new AtomicReference(null);

    public c1(a0 a0Var, p2.d0 d0Var, qu.f0 f0Var) {
        this.f13380a = a0Var;
        this.f13381b = d0Var;
        this.f13382c = f0Var;
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f13382c.H();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(j0.r r6, yt.a r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d2.a1
            if (r0 == 0) goto L13
            r0 = r7
            d2.a1 r0 = (d2.a1) r0
            int r1 = r0.f13349c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13349c = r1
            goto L18
        L13:
            d2.a1 r0 = new d2.a1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13347a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f13349c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            ut.n.b(r7)
            goto L4e
        L2f:
            ut.n.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f13383d
            c2.e1 r2 = new c2.e1
            r4 = 3
            r2.<init>(r6, r4)
            d2.b1 r6 = new d2.b1
            r4 = 0
            r6.<init>(r5, r4)
            r0.f13349c = r3
            g1.s r3 = new g1.s
            r3.<init>(r7, r4, r2, r6)
            java.lang.Object r6 = hl.f.P(r3, r0)
            if (r6 != r1) goto L4e
            return
        L4e:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.c1.a(j0.r, yt.a):void");
    }
}
