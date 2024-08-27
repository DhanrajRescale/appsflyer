package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public iu.z f40741a;

    /* renamed from: b, reason: collision with root package name */
    public int f40742b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu.z f40744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f40745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(iu.z zVar, j jVar, yt.a aVar) {
        super(2, aVar);
        this.f40744d = zVar;
        this.f40745e = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = new h(this.f40744d, this.f40745e, aVar);
        hVar.f40743c = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((Function1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:5:0x0058). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r7.f40742b
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            iu.z r1 = r7.f40741a
            java.lang.Object r3 = r7.f40743c
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            ut.n.b(r8)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L58
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            ut.n.b(r8)
            java.lang.Object r8 = r7.f40743c
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r3 = r8
            r8 = r7
        L28:
            iu.z r1 = r8.f40744d
            java.lang.Object r4 = r1.f20560a
            boolean r5 = r4 instanceof y.c0
            if (r5 != 0) goto L5e
            boolean r5 = r4 instanceof y.z
            if (r5 != 0) goto L5e
            boolean r5 = r4 instanceof y.a0
            if (r5 == 0) goto L3b
            y.a0 r4 = (y.a0) r4
            goto L3c
        L3b:
            r4 = 0
        L3c:
            if (r4 == 0) goto L41
            r3.invoke(r4)
        L41:
            y.j r4 = r8.f40745e
            su.c r4 = r4.f40789z
            r8.f40743c = r3
            r8.f40741a = r1
            r8.f40742b = r2
            java.lang.Object r4 = r4.f(r8)
            if (r4 != r0) goto L52
            return r0
        L52:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L58:
            r3.f20560a = r8
            r8 = r0
            r0 = r1
            r3 = r4
            goto L28
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
