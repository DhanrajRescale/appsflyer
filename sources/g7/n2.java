package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f16937a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16938b;

    /* renamed from: c, reason: collision with root package name */
    public yu.d f16939c;

    /* renamed from: d, reason: collision with root package name */
    public int f16940d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f16941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t2 f16942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(t2 t2Var, yt.a aVar) {
        super(2, aVar);
        this.f16942f = t2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n2 n2Var = new n2(this.f16942f, aVar);
        n2Var.f16941e = obj;
        return n2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((j4) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
