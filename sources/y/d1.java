package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d1 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f40657b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f40659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, yt.a aVar) {
        super(aVar);
        this.f40659d = f1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d1 d1Var = new d1(this.f40659d, aVar);
        d1Var.f40658c = obj;
        return d1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r4 = r0.f40659d;
        kotlin.jvm.internal.Intrinsics.c(r4.f40696q);
        r7 = r3.f39891f.f39904t;
        r5 = new m1.c(m1.c.f27233b);
        r15 = r15.f39870a;
        r7 = r15.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r9 = r5.f27237a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r8 >= r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r5 = new m1.c(m1.c.h(r9, ((x1.t) r15.get(r8)).f39918j));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        yk.g.H(r4.E0(), null, null, new y.c1(r4.f40695p, m1.c.i(r9, -r3.c0(64)), null), 3);
        r4 = r15.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r6 >= r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        ((x1.t) r15.get(r6)).a();
        r6 = r6 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[EDGE_INSN: B:17:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:6:0x003f->B:9:0x004f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r14.f40657b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r14.f40658c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r15)
            r3 = r1
            r1 = r0
            r0 = r14
            goto L35
        L14:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1c:
            ut.n.b(r15)
            java.lang.Object r15 = r14.f40658c
            x1.m0 r15 = (x1.m0) r15
            r1 = r15
            r15 = r14
        L25:
            r15.f40658c = r1
            r15.f40657b = r2
            java.lang.Object r3 = androidx.compose.foundation.gestures.a.a(r1, r15)
            if (r3 != r0) goto L30
            return r0
        L30:
            r13 = r0
            r0 = r15
            r15 = r3
            r3 = r1
            r1 = r13
        L35:
            x1.k r15 = (x1.k) r15
            java.util.List r4 = r15.f39870a
            int r5 = r4.size()
            r6 = 0
            r7 = r6
        L3f:
            if (r7 >= r5) goto L52
            java.lang.Object r8 = r4.get(r7)
            x1.t r8 = (x1.t) r8
            boolean r8 = r8.b()
            r8 = r8 ^ r2
            if (r8 != 0) goto L4f
            goto Lb1
        L4f:
            int r7 = r7 + 1
            goto L3f
        L52:
            y.f1 r4 = r0.f40659d
            y.k r5 = r4.f40696q
            kotlin.jvm.internal.Intrinsics.c(r5)
            x1.o0 r5 = r3.f39891f
            long r7 = r5.f39904t
            long r7 = m1.c.f27233b
            m1.c r5 = new m1.c
            r5.<init>(r7)
            java.util.List r15 = r15.f39870a
            int r7 = r15.size()
            r8 = r6
        L6b:
            long r9 = r5.f27237a
            if (r8 >= r7) goto L83
            java.lang.Object r5 = r15.get(r8)
            x1.t r5 = (x1.t) r5
            long r11 = r5.f39918j
            long r9 = m1.c.h(r9, r11)
            m1.c r5 = new m1.c
            r5.<init>(r9)
            int r8 = r8 + 1
            goto L6b
        L83:
            r5 = 64
            float r5 = (float) r5
            float r5 = r3.c0(r5)
            float r5 = -r5
            long r7 = m1.c.i(r9, r5)
            qu.f0 r5 = r4.E0()
            y.c1 r9 = new y.c1
            y.j2 r4 = r4.f40695p
            r10 = 0
            r9.<init>(r4, r7, r10)
            r4 = 3
            yk.g.H(r5, r10, r10, r9, r4)
            int r4 = r15.size()
        La3:
            if (r6 >= r4) goto Lb1
            java.lang.Object r5 = r15.get(r6)
            x1.t r5 = (x1.t) r5
            r5.a()
            int r6 = r6 + 1
            goto La3
        Lb1:
            r15 = r0
            r0 = r1
            r1 = r3
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: y.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
