package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public su.o f13697a;

    /* renamed from: b, reason: collision with root package name */
    public su.b f13698b;

    /* renamed from: c, reason: collision with root package name */
    public int f13699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su.g f13700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(su.g gVar, yt.a aVar) {
        super(2, aVar);
        this.f13700d = gVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new z1(this.f13700d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:9:0x003d, B:11:0x0045, B:18:0x005c), top: B:8:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:9:0x003d, B:11:0x0045, B:18:0x005c), top: B:8:0x003d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0037 -> B:8:0x003d). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r7.f13699c
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            su.b r1 = r7.f13698b
            su.o r3 = r7.f13697a
            ut.n.b(r8)     // Catch: java.lang.Throwable -> L15
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L3d
        L15:
            r8 = move-exception
            goto L65
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            ut.n.b(r8)
            su.g r3 = r7.f13700d
            su.b r8 = r3.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r8
            r8 = r7
        L2a:
            r8.f13697a = r3     // Catch: java.lang.Throwable -> L15
            r8.f13698b = r1     // Catch: java.lang.Throwable -> L15
            r8.f13699c = r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r4 = r1.b(r8)     // Catch: java.lang.Throwable -> L15
            if (r4 != r0) goto L37
            return r0
        L37:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L3d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L59
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r3.c()     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r8 = (kotlin.Unit) r8     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicBoolean r8 = d2.a2.f13351b     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L59
            yq.b.m()     // Catch: java.lang.Throwable -> L59
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2a
        L59:
            r8 = move-exception
            r3 = r4
            goto L65
        L5c:
            kotlin.Unit r8 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L59
            r8 = 0
            el.l.z(r4, r8)
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        L65:
            throw r8     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            el.l.z(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
