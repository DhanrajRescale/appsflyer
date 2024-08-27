package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39530a;

    /* renamed from: b, reason: collision with root package name */
    public int f39531b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.k1 f39533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f39534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.l f39535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f39536g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y.k1 k1Var, long j10, a0.l lVar, k kVar, yt.a aVar) {
        super(2, aVar);
        this.f39533d = k1Var;
        this.f39534e = j10;
        this.f39535f = lVar;
        this.f39536g = kVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e eVar = new e(this.f39533d, this.f39534e, this.f39535f, this.f39536g, aVar);
        eVar.f39532c = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
