package n9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import qu.d2;
import t0.n1;

/* loaded from: classes.dex */
public final class e extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f28421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f28422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f28425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f28426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j9.i f28427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f28428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f28429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f28430j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f28431k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i10, int i11, boolean z10, float f10, j9.i iVar2, float f11, boolean z11, boolean z12, int i12, yt.a aVar) {
        super(1, aVar);
        this.f28422b = iVar;
        this.f28423c = i10;
        this.f28424d = i11;
        this.f28425e = z10;
        this.f28426f = f10;
        this.f28427g = iVar2;
        this.f28428h = f11;
        this.f28429i = z11;
        this.f28430j = z12;
        this.f28431k = i12;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new e(this.f28422b, this.f28423c, this.f28424d, this.f28425e, this.f28426f, this.f28427g, this.f28428h, this.f28429i, this.f28430j, this.f28431k, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28421a;
        i iVar = this.f28422b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                iVar.g(this.f28423c);
                int i11 = this.f28424d;
                iVar.f28444c.setValue(Integer.valueOf(i11));
                iVar.f28445d.setValue(Boolean.valueOf(this.f28425e));
                float f10 = this.f28426f;
                iVar.f28447f.setValue(Float.valueOf(f10));
                iVar.f28446e.setValue(null);
                n1 n1Var = iVar.f28450i;
                j9.i iVar2 = this.f28427g;
                n1Var.setValue(iVar2);
                iVar.h(this.f28428h);
                iVar.f28448g.setValue(Boolean.valueOf(this.f28429i));
                if (!this.f28430j) {
                    iVar.f28453l.setValue(Long.MIN_VALUE);
                }
                n1 n1Var2 = iVar.f28442a;
                if (iVar2 == null) {
                    n1Var2.setValue(Boolean.FALSE);
                    return Unit.f23355a;
                }
                if (Float.isInfinite(f10)) {
                    iVar.h(iVar.e());
                    n1Var2.setValue(Boolean.FALSE);
                    iVar.g(i11);
                    return Unit.f23355a;
                }
                n1Var2.setValue(Boolean.TRUE);
                int e10 = w.k.e(this.f28431k);
                if (e10 != 0) {
                    if (e10 == 1) {
                        coroutineContext = d2.f32198b;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    coroutineContext = kotlin.coroutines.k.f23369a;
                }
                d dVar = new d(this.f28431k, hl.f.j0(getContext()), this.f28424d, this.f28423c, this.f28422b, null);
                this.f28421a = 1;
                if (yk.g.e0(coroutineContext, dVar, this) == aVar) {
                    return aVar;
                }
            }
            hl.f.W(getContext());
            i.d(iVar, false);
            return Unit.f23355a;
        } catch (Throwable th2) {
            i.d(iVar, false);
            throw th2;
        }
    }
}
