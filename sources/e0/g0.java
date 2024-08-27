package e0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y.q1;

/* loaded from: classes.dex */
public final class g0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14687a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f14689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.g f14691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w.n f14693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, int i10, d0.g gVar, int i11, w.n nVar, yt.a aVar) {
        super(2, aVar);
        this.f14689c = j0Var;
        this.f14690d = i10;
        this.f14691e = gVar;
        this.f14692f = i11;
        this.f14693g = nVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g0 g0Var = new g0(this.f14689c, this.f14690d, this.f14691e, this.f14692f, this.f14693g, aVar);
        g0Var.f14688b = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Type inference failed for: r1v6, types: [iu.w, java.lang.Object] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
