package w;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public o f38428a;

    /* renamed from: b, reason: collision with root package name */
    public iu.v f38429b;

    /* renamed from: c, reason: collision with root package name */
    public int f38430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f38431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f38433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f38434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f38435h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, j jVar, long j10, Function1 function1, yt.a aVar) {
        super(1, aVar);
        this.f38431d = dVar;
        this.f38432e = obj;
        this.f38433f = jVar;
        this.f38434g = j10;
        this.f38435h = function1;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new b(this.f38431d, this.f38432e, this.f38433f, this.f38434g, this.f38435h, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        iu.v vVar;
        o oVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38430c;
        int i11 = 1;
        d dVar = this.f38431d;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    vVar = this.f38429b;
                    oVar = this.f38428a;
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                dVar.f38453c.f38623c = (t) dVar.f38451a.f38734a.invoke(this.f38432e);
                dVar.f38455e.setValue(this.f38433f.g());
                dVar.f38454d.setValue(Boolean.TRUE);
                o oVar2 = dVar.f38453c;
                o oVar3 = new o(oVar2.f38621a, oVar2.f38622b.getValue(), e.l(oVar2.f38623c), oVar2.f38624d, Long.MIN_VALUE, oVar2.f38626f);
                iu.v vVar2 = new iu.v();
                j jVar = this.f38433f;
                long j10 = this.f38434g;
                a aVar2 = new a(this.f38431d, oVar3, this.f38435h, vVar2, 0);
                this.f38428a = oVar3;
                this.f38429b = vVar2;
                this.f38430c = 1;
                if (e.d(oVar3, jVar, j10, aVar2, this) == aVar) {
                    return aVar;
                }
                vVar = vVar2;
                oVar = oVar3;
            }
            if (!vVar.f20556a) {
                i11 = 2;
            }
            d.b(dVar);
            return new l(oVar, i11);
        } catch (CancellationException e10) {
            d.b(dVar);
            throw e10;
        }
    }
}
