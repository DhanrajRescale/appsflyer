package b0;

import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.ui.home.homepage.data.HomepageTitleData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut.d f3035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3038g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(g1.o oVar, Object obj, boolean z10, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f3032a = i12;
        this.f3034c = oVar;
        this.f3038g = obj;
        this.f3033b = z10;
        this.f3035d = dVar;
        this.f3036e = i10;
        this.f3037f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f3036e;
        int i12 = this.f3032a;
        ut.d dVar = this.f3035d;
        Object obj = this.f3038g;
        Object obj2 = this.f3034c;
        switch (i12) {
            case 0:
                androidx.compose.foundation.layout.a.a((g1.o) obj2, (g1.d) obj, this.f3033b, (hu.c) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 1:
                pp.b.f(this.f3033b, (Function1) obj, (g1.o) obj2, (hu.c) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 2:
                yk.j.Y(this.f3033b, (ArenaGame) obj2, (Function0) obj, (Function0) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 3:
                yk.j.e((String) obj2, this.f3033b, (Function0) obj, (Function0) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 4:
                yk.j.d0((ReportReason) obj2, this.f3033b, (Function0) obj, (hu.c) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 5:
                kp.j.x((g1.o) obj2, this.f3033b, (CreateGroupUser) obj, (Function0) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 6:
                hf.z.c((g1.o) obj2, (HomepageTitleData) obj, this.f3033b, (Function2) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            case 7:
                dp.b.t(this.f3033b, (Function1) obj2, (List) obj, i11, (Function1) dVar, nVar, t0.t.H0(this.f3037f | 1));
                return;
            case 8:
                al.d.F((g1.o) obj2, (t0.g1) obj, this.f3033b, (Function1) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
            default:
                al.d.A((g1.o) obj2, this.f3033b, (String) obj, (Function0) dVar, nVar, t0.t.H0(i11 | 1), this.f3037f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f3032a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 8:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, boolean z10, Object obj2, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f3032a = i12;
        this.f3034c = obj;
        this.f3033b = z10;
        this.f3038g = obj2;
        this.f3035d = dVar;
        this.f3036e = i10;
        this.f3037f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z10, ArenaGame arenaGame, Function0 function0, Function0 function02, int i10, int i11) {
        super(2);
        this.f3032a = 2;
        this.f3033b = z10;
        this.f3034c = arenaGame;
        this.f3038g = function0;
        this.f3035d = function02;
        this.f3036e = i10;
        this.f3037f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z10, Function1 function1, g1.o oVar, hu.c cVar, int i10, int i11) {
        super(2);
        this.f3032a = 1;
        this.f3033b = z10;
        this.f3038g = function1;
        this.f3034c = oVar;
        this.f3035d = cVar;
        this.f3036e = i10;
        this.f3037f = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z10, Function1 function1, List list, int i10, Function1 function12, int i11) {
        super(2);
        this.f3032a = 7;
        this.f3033b = z10;
        this.f3034c = function1;
        this.f3038g = list;
        this.f3036e = i10;
        this.f3035d = function12;
        this.f3037f = i11;
    }
}
