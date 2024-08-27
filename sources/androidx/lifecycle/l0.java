package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public iu.z f1934a;

    /* renamed from: b, reason: collision with root package name */
    public iu.z f1935b;

    /* renamed from: c, reason: collision with root package name */
    public Function2 f1936c;

    /* renamed from: d, reason: collision with root package name */
    public int f1937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f1939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f1940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f1941h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o oVar, n nVar, qu.f0 f0Var, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f1938e = oVar;
        this.f1939f = nVar;
        this.f1940g = f0Var;
        this.f1941h = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l0(this.f1938e, this.f1939f, this.f1940g, this.f1941h, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            zt.a r0 = zt.a.f42823a
            int r2 = r1.f1937d
            r3 = 0
            androidx.lifecycle.o r4 = r1.f1938e
            r5 = 1
            if (r2 == 0) goto L22
            if (r2 != r5) goto L1a
            iu.z r2 = r1.f1935b
            iu.z r5 = r1.f1934a
            ut.n.b(r17)     // Catch: java.lang.Throwable -> L17
            goto L87
        L17:
            r0 = move-exception
            goto L9e
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L22:
            ut.n.b(r17)
            androidx.lifecycle.n r2 = r4.b()
            androidx.lifecycle.n r6 = androidx.lifecycle.n.f1947a
            if (r2 != r6) goto L30
            kotlin.Unit r0 = kotlin.Unit.f23355a
            return r0
        L30:
            iu.z r2 = new iu.z
            r2.<init>()
            iu.z r13 = new iu.z
            r13.<init>()
            androidx.lifecycle.n r6 = r1.f1939f     // Catch: java.lang.Throwable -> L9c
            qu.f0 r8 = r1.f1940g     // Catch: java.lang.Throwable -> L9c
            kotlin.jvm.functions.Function2 r12 = r1.f1941h     // Catch: java.lang.Throwable -> L9c
            r1.f1934a = r2     // Catch: java.lang.Throwable -> L9c
            r1.f1935b = r13     // Catch: java.lang.Throwable -> L9c
            r1.f1936c = r12     // Catch: java.lang.Throwable -> L9c
            r1.f1937d = r5     // Catch: java.lang.Throwable -> L9c
            qu.i r14 = new qu.i     // Catch: java.lang.Throwable -> L9c
            yt.a r7 = zt.f.b(r16)     // Catch: java.lang.Throwable -> L9c
            r14.<init>(r5, r7)     // Catch: java.lang.Throwable -> L9c
            r14.s()     // Catch: java.lang.Throwable -> L9c
            androidx.lifecycle.k r5 = androidx.lifecycle.m.Companion     // Catch: java.lang.Throwable -> L9c
            r5.getClass()     // Catch: java.lang.Throwable -> L9c
            androidx.lifecycle.m r7 = androidx.lifecycle.k.c(r6)     // Catch: java.lang.Throwable -> L9c
            androidx.lifecycle.m r9 = androidx.lifecycle.k.a(r6)     // Catch: java.lang.Throwable -> L9c
            yu.d r11 = yu.e.a()     // Catch: java.lang.Throwable -> L9c
            androidx.lifecycle.k0 r15 = new androidx.lifecycle.k0     // Catch: java.lang.Throwable -> L9c
            r5 = r15
            r6 = r7
            r7 = r2
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            r13.f20560a = r15     // Catch: java.lang.Throwable -> L9c
            r4.a(r15)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r5 = r14.p()     // Catch: java.lang.Throwable -> L9c
            if (r5 != r0) goto L82
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)     // Catch: java.lang.Throwable -> L9c
            goto L82
        L7f:
            r5 = r2
            r2 = r13
            goto L9e
        L82:
            if (r5 != r0) goto L85
            return r0
        L85:
            r5 = r2
            r2 = r13
        L87:
            java.lang.Object r0 = r5.f20560a
            qu.o1 r0 = (qu.o1) r0
            if (r0 == 0) goto L90
            r0.a(r3)
        L90:
            java.lang.Object r0 = r2.f20560a
            androidx.lifecycle.r r0 = (androidx.lifecycle.r) r0
            if (r0 == 0) goto L99
            r4.c(r0)
        L99:
            kotlin.Unit r0 = kotlin.Unit.f23355a
            return r0
        L9c:
            r0 = move-exception
            goto L7f
        L9e:
            java.lang.Object r5 = r5.f20560a
            qu.o1 r5 = (qu.o1) r5
            if (r5 == 0) goto La7
            r5.a(r3)
        La7:
            java.lang.Object r2 = r2.f20560a
            androidx.lifecycle.r r2 = (androidx.lifecycle.r) r2
            if (r2 == 0) goto Lb0
            r4.c(r2)
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
