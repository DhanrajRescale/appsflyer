package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;
import x.w1;

/* loaded from: classes.dex */
public final class a extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f28406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j9.i f28407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f28409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f28410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28411i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f28412j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f28413k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, boolean z11, b bVar, j9.i iVar, int i10, boolean z12, float f10, int i11, boolean z13, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f28404b = z10;
        this.f28405c = z11;
        this.f28406d = bVar;
        this.f28407e = iVar;
        this.f28408f = i10;
        this.f28409g = z12;
        this.f28410h = f10;
        this.f28411i = i11;
        this.f28412j = z13;
        this.f28413k = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f28404b, this.f28405c, this.f28406d, this.f28407e, this.f28408f, this.f28409g, this.f28410h, this.f28411i, this.f28412j, this.f28413k, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object obj2 = zt.a.f42823a;
        int i10 = this.f28403a;
        b bVar = this.f28406d;
        g1 g1Var = this.f28413k;
        boolean z11 = this.f28404b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            if (z11 && !((Boolean) g1Var.getValue()).booleanValue() && this.f28405c) {
                this.f28403a = 1;
                i iVar = (i) bVar;
                j9.i iVar2 = (j9.i) iVar.f28450i.getValue();
                a3.a.u(iVar.f28446e.getValue());
                float floatValue = ((Number) iVar.f28447f.getValue()).floatValue();
                float f10 = 1.0f;
                if ((floatValue >= s0.g.f34069a || iVar2 != null) && (iVar2 == null || floatValue >= s0.g.f34069a)) {
                    f10 = 0.0f;
                }
                j9.i iVar3 = (j9.i) iVar.f28450i.getValue();
                if (f10 == ((Number) iVar.f28452k.getValue()).floatValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object b10 = w1.b(iVar.f28455n, new h(iVar, iVar3, f10, 1, !z10, null), this);
                if (b10 != obj2) {
                    b10 = Unit.f23355a;
                }
                if (b10 != obj2) {
                    b10 = Unit.f23355a;
                }
                if (b10 == obj2) {
                    return obj2;
                }
            }
        }
        g1Var.setValue(Boolean.valueOf(z11));
        if (!z11) {
            return Unit.f23355a;
        }
        j9.i iVar4 = this.f28407e;
        int i11 = this.f28408f;
        boolean z12 = this.f28409g;
        float f11 = this.f28410h;
        i iVar5 = (i) bVar;
        float floatValue2 = ((Number) iVar5.f28452k.getValue()).floatValue();
        int i12 = this.f28411i;
        boolean z13 = this.f28412j;
        this.f28403a = 2;
        Object b11 = w1.b(iVar5.f28455n, new e(iVar5, iVar5.f(), i11, z12, f11, iVar4, floatValue2, z13, false, i12, null), this);
        if (b11 != obj2) {
            b11 = Unit.f23355a;
        }
        if (b11 == obj2) {
            return obj2;
        }
        return Unit.f23355a;
    }
}
