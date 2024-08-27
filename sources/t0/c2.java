package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public e1.h f34959a;

    /* renamed from: b, reason: collision with root package name */
    public int f34960b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f34961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f34962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.c f34963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f34964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(f2 f2Var, hu.c cVar, a1 a1Var, yt.a aVar) {
        super(2, aVar);
        this.f34962d = f2Var;
        this.f34963e = cVar;
        this.f34964f = a1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c2 c2Var = new c2(this.f34962d, this.f34963e, this.f34964f, aVar);
        c2Var.f34961c = obj;
        return c2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
