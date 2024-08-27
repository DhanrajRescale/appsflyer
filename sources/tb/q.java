package tb;

import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.n1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35763a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f35764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut.d f35766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ArenaGame arenaGame, boolean z10, Function0 function0, Function0 function02) {
        super(2);
        this.f35765c = arenaGame;
        this.f35764b = z10;
        this.f35766d = function0;
        this.f35767e = function02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0316, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r7.Q(), java.lang.Integer.valueOf(r13)) == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(t0.n r69, int r70) {
        /*
            Method dump skipped, instructions count: 2198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q.a(t0.n, int):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f35763a) {
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
    public q(g1 g1Var, Function1 function1, boolean z10, Function1 function12) {
        super(2);
        this.f35765c = g1Var;
        this.f35766d = function1;
        this.f35764b = z10;
        this.f35767e = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z10, String str, Function1 function1, n1 n1Var) {
        super(2);
        this.f35764b = z10;
        this.f35765c = str;
        this.f35766d = function1;
        this.f35767e = n1Var;
    }
}
