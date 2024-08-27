package o2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import t0.l3;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class i implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f29489a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f29490b;

    /* renamed from: c, reason: collision with root package name */
    public final m f29491c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f29492d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f29493e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f29494f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29495g = true;

    public i(List list, Object obj, p0 p0Var, m mVar, Function1 function1, g0 g0Var) {
        this.f29489a = list;
        this.f29490b = p0Var;
        this.f29491c = mVar;
        this.f29492d = function1;
        this.f29493e = g0Var;
        this.f29494f = t0.t.n0(obj, o3.f35116a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0030, B:16:0x0062, B:18:0x0073), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:24:0x0096, B:26:0x00a4, B:34:0x00c2, B:46:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:24:0x0096, B:26:0x00a4, B:34:0x00c2, B:46:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:14:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d5 -> B:13:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(yt.a r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.b(yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(o2.q r7, yt.a r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o2.g
            if (r0 == 0) goto L13
            r0 = r8
            o2.g r0 = (o2.g) r0
            int r1 = r0.f29485d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29485d = r1
            goto L18
        L13:
            o2.g r0 = new o2.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f29483b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f29485d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            o2.q r7 = r0.f29482a
            ut.n.b(r8)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L4b
        L2a:
            r8 = move-exception
            goto L4d
        L2c:
            r7 = move-exception
            goto L76
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            ut.n.b(r8)
            o2.h r8 = new o2.h     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f29482a = r7     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f29485d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = pp.b.F(r2, r8, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r4 = r8
            goto L80
        L4d:
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            qu.c0 r2 = qu.c0.f32191a
            kotlin.coroutines.CoroutineContext$Element r1 = r1.g(r2)
            qu.d0 r1 = (qu.d0) r1
            if (r1 == 0) goto L80
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.X(r0, r2)
            goto L80
        L76:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = hl.f.t0(r8)
            if (r8 == 0) goto L81
        L80:
            return r4
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.d(o2.q, yt.a):java.lang.Object");
    }

    @Override // t0.l3
    public final Object getValue() {
        return this.f29494f.getValue();
    }
}
