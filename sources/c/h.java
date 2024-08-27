package c;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7425c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ArenaGame arenaGame, boolean z10, int i10, int i11) {
        super(2);
        this.f7423a = 4;
        this.f7425c = arenaGame;
        this.f7424b = z10;
        this.f7426d = i10;
        this.f7427e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f7423a;
        boolean z10 = this.f7424b;
        int i12 = this.f7427e;
        int i13 = this.f7426d;
        Object obj = this.f7425c;
        switch (i11) {
            case 0:
                iu.j.f(z10, (Function0) obj, nVar, i13 | 1, i12);
                return;
            case 1:
                yk.j.f0(z10, (Function0) obj, nVar, t.H0(i13 | 1), i12);
                return;
            case 2:
                kp.j.g(z10, (Function0) obj, nVar, t.H0(i13 | 1), i12);
                return;
            case 3:
                el.l.m(z10, (Function0) obj, nVar, t.H0(i13 | 1), i12);
                return;
            default:
                yk.j.O((ArenaGame) obj, z10, nVar, t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f7423a) {
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
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z10, Function0 function0, int i10, int i11, int i12) {
        super(2);
        this.f7423a = i12;
        this.f7424b = z10;
        this.f7425c = function0;
        this.f7426d = i10;
        this.f7427e = i11;
    }
}
