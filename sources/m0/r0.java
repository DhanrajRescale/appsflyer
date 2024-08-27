package m0;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f26706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26710h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f26711i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(g1.o oVar, boolean z10, ArenaGame arenaGame, boolean z11, Function0 function0, Function0 function02, int i10, int i11) {
        super(2);
        this.f26703a = 2;
        this.f26706d = oVar;
        this.f26704b = z10;
        this.f26705c = arenaGame;
        this.f26707e = z11;
        this.f26708f = function0;
        this.f26711i = function02;
        this.f26709g = i10;
        this.f26710h = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26703a;
        int i12 = this.f26709g;
        Object obj = this.f26711i;
        Object obj2 = this.f26708f;
        Object obj3 = this.f26705c;
        switch (i11) {
            case 0:
                u0.a(this.f26704b, (Function1) obj3, this.f26706d, this.f26707e, (a0.l) obj2, (k1) obj, nVar, t0.t.H0(i12 | 1), this.f26710h);
                return;
            case 1:
                f7.a(this.f26704b, (Function1) obj3, this.f26706d, this.f26707e, (a0.l) obj2, (r1) obj, nVar, t0.t.H0(i12 | 1), this.f26710h);
                return;
            default:
                yk.j.Z(this.f26706d, this.f26704b, (ArenaGame) obj3, this.f26707e, (Function0) obj2, (Function0) obj, nVar, t0.t.H0(i12 | 1), this.f26710h);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26703a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(boolean z10, Function1 function1, g1.o oVar, boolean z11, a0.l lVar, Object obj, int i10, int i11, int i12) {
        super(2);
        this.f26703a = i12;
        this.f26704b = z10;
        this.f26705c = function1;
        this.f26706d = oVar;
        this.f26707e = z11;
        this.f26708f = lVar;
        this.f26711i = obj;
        this.f26709g = i10;
        this.f26710h = i11;
    }
}
