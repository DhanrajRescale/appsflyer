package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.o1;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f28417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f28420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, o1 o1Var, int i11, int i12, i iVar, yt.a aVar) {
        super(2, aVar);
        this.f28416b = i10;
        this.f28417c = o1Var;
        this.f28418d = i11;
        this.f28419e = i12;
        this.f28420f = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f28416b, this.f28417c, this.f28418d, this.f28419e, this.f28420f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:5:0x0063). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r7.f28415a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            ut.n.b(r8)
            r1 = r0
            r0 = r7
            goto L63
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            ut.n.b(r8)
            r8 = r7
        L1b:
            int[] r1 = n9.c.f28414a
            int r3 = r8.f28416b
            int r3 = w.k.e(r3)
            r1 = r1[r3]
            int r3 = r8.f28418d
            if (r1 != r2) goto L34
            qu.o1 r1 = r8.f28417c
            boolean r1 = r1.b()
            if (r1 == 0) goto L32
            goto L34
        L32:
            int r3 = r8.f28419e
        L34:
            r8.f28415a = r2
            n9.i r1 = r8.f28420f
            r1.getClass()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r4) goto L4b
            n9.f r4 = new n9.f
            r5 = 0
            r4.<init>(r1, r3, r5)
            java.lang.Object r1 = w.e.A(r4, r8)
            goto L5c
        L4b:
            n9.f r4 = new n9.f
            r4.<init>(r1, r3, r2)
            kotlin.coroutines.CoroutineContext r1 = r8.getContext()
            t0.a1 r1 = dp.b.q1(r1)
            java.lang.Object r1 = r1.U(r4, r8)
        L5c:
            if (r1 != r0) goto L5f
            return r0
        L5f:
            r6 = r0
            r0 = r8
            r8 = r1
            r1 = r6
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6e
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        L6e:
            r8 = r0
            r0 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
