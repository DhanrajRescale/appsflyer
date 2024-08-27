package g7;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final k7.w f16898a;

    /* renamed from: b, reason: collision with root package name */
    public final k7.r0 f16899b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f16900c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f16901d;

    /* renamed from: e, reason: collision with root package name */
    public final tu.k1 f16902e;

    /* renamed from: f, reason: collision with root package name */
    public final i f16903f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f16904g;

    /* renamed from: h, reason: collision with root package name */
    public final tu.f f16905h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f16906i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f16907j;

    /* renamed from: k, reason: collision with root package name */
    public final c2.e1 f16908k;

    /* renamed from: l, reason: collision with root package name */
    public final ut.g f16909l;

    /* renamed from: m, reason: collision with root package name */
    public final m.j f16910m;

    public m(ga.a diffCallback, k7.c updateCallback, CoroutineContext mainDispatcher, CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.f16898a = diffCallback;
        this.f16899b = updateCallback;
        this.f16900c = mainDispatcher;
        this.f16901d = workerDispatcher;
        this.f16902e = tu.l1.a(Boolean.FALSE);
        i iVar = new i(this, mainDispatcher);
        this.f16903f = iVar;
        this.f16904g = new AtomicInteger(0);
        tu.f jVar = new tu.j((Function2) new l(el.l.x(new x(iVar.f16990j, 5), -1), null, this));
        xu.e eVar = qu.r0.f32255a;
        qu.b2 b2Var = vu.u.f38408a;
        if (b2Var.g(qu.c0.f32192b) == null) {
            if (!Intrinsics.a(b2Var, kotlin.coroutines.k.f23369a)) {
                if (jVar instanceof uu.r) {
                    jVar = el.l.a0((uu.r) jVar, b2Var, 0, null, 6);
                } else {
                    jVar = new uu.i(jVar, b2Var, 0, null, 12);
                }
            }
            this.f16905h = jVar;
            this.f16906i = new AtomicReference(null);
            this.f16907j = new CopyOnWriteArrayList();
            this.f16908k = new c2.e1(this, 13);
            this.f16909l = ut.h.a(e.f16716b);
            this.f16910m = new m.j(this);
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + b2Var).toString());
    }
}
