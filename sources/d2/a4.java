package d2;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13354a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iu.z f13356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.f2 f13357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f13358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b4 f13359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f13360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(iu.z zVar, t0.f2 f2Var, androidx.lifecycle.t tVar, b4 b4Var, View view, yt.a aVar) {
        super(2, aVar);
        this.f13356c = zVar;
        this.f13357d = f2Var;
        this.f13358e = tVar;
        this.f13359f = b4Var;
        this.f13360g = view;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        a4 a4Var = new a4(this.f13356c, this.f13357d, this.f13358e, this.f13359f, this.f13360g, aVar);
        a4Var.f13355b = obj;
        return a4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r10.f13354a
            r2 = 0
            d2.b4 r3 = r10.f13359f
            androidx.lifecycle.t r4 = r10.f13358e
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 != r5) goto L1a
            java.lang.Object r0 = r10.f13355b
            qu.o1 r0 = (qu.o1) r0
            ut.n.b(r11)     // Catch: java.lang.Throwable -> L17
            goto L8d
        L17:
            r11 = move-exception
            goto La2
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            ut.n.b(r11)
            java.lang.Object r11 = r10.f13355b
            qu.f0 r11 = (qu.f0) r11
            iu.z r1 = r10.f13356c     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.f20560a     // Catch: java.lang.Throwable -> L5b
            d2.i2 r1 = (d2.i2) r1     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            android.view.View r6 = r10.f13360g     // Catch: java.lang.Throwable -> L5b
            android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L5b
            tu.i1 r6 = d2.e4.a(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L5b
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L5b
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L5b
            t0.k1 r8 = r1.f13459a     // Catch: java.lang.Throwable -> L5b
            r8.j(r7)     // Catch: java.lang.Throwable -> L5b
            d2.z3 r7 = new d2.z3     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L5b
            r1 = 3
            qu.h2 r11 = yk.g.H(r11, r2, r2, r7, r1)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L59:
            r0 = r2
            goto La2
        L5b:
            r11 = move-exception
            goto L59
        L5d:
            r11 = r2
        L5e:
            t0.f2 r1 = r10.f13357d     // Catch: java.lang.Throwable -> La0
            r10.f13355b = r11     // Catch: java.lang.Throwable -> La0
            r10.f13354a = r5     // Catch: java.lang.Throwable -> La0
            r1.getClass()     // Catch: java.lang.Throwable -> La0
            t0.e2 r5 = new t0.e2     // Catch: java.lang.Throwable -> La0
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> La0
            kotlin.coroutines.CoroutineContext r6 = r10.getContext()     // Catch: java.lang.Throwable -> La0
            t0.a1 r6 = dp.b.q1(r6)     // Catch: java.lang.Throwable -> La0
            t0.c2 r7 = new t0.c2     // Catch: java.lang.Throwable -> La0
            r7.<init>(r1, r5, r6, r2)     // Catch: java.lang.Throwable -> La0
            t0.i r1 = r1.f34998a     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = yk.g.e0(r1, r7, r10)     // Catch: java.lang.Throwable -> La0
            if (r1 != r0) goto L82
            goto L84
        L82:
            kotlin.Unit r1 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> La0
        L84:
            if (r1 != r0) goto L87
            goto L89
        L87:
            kotlin.Unit r1 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> La0
        L89:
            if (r1 != r0) goto L8c
            return r0
        L8c:
            r0 = r11
        L8d:
            if (r0 == 0) goto L92
            r0.a(r2)
        L92:
            androidx.lifecycle.o r11 = r4.getLifecycle()
            r11.c(r3)
            kotlin.Unit r11 = kotlin.Unit.f23355a
            return r11
        L9c:
            r9 = r0
            r0 = r11
            r11 = r9
            goto La2
        La0:
            r0 = move-exception
            goto L9c
        La2:
            if (r0 == 0) goto La7
            r0.a(r2)
        La7:
            androidx.lifecycle.o r0 = r4.getLifecycle()
            r0.c(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
