package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f16889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f16890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c3 f16891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(j1 j1Var, o3 o3Var, c3 c3Var, yt.a aVar) {
        super(2, aVar);
        this.f16889b = j1Var;
        this.f16890c = o3Var;
        this.f16891d = c3Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l3(this.f16889b, this.f16890c, this.f16891d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
