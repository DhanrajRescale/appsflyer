package cd;

import ba.o1;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPreJoiningActivity f8105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity, int i10) {
        super(0);
        this.f8104a = i10;
        this.f8105b = leagueDetailPreJoiningActivity;
    }

    public final void a() {
        int i10 = this.f8104a;
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity = this.f8105b;
        switch (i10) {
            case 0:
                new xc.b().show(leagueDetailPreJoiningActivity.getSupportFragmentManager(), "LeagueDetailPaymentBottomSheetFragment");
                return;
            case 1:
                ((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).i();
                return;
            default:
                ((o1) leagueDetailPreJoiningActivity.w()).f5640y.setRotation(s0.g.f34069a);
                o1 o1Var = (o1) leagueDetailPreJoiningActivity.w();
                o1Var.A.v((((o1) leagueDetailPreJoiningActivity.w()).f5641z.getTop() - ((o1) leagueDetailPreJoiningActivity.w()).f5641z.getHeight()) + 18);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f8104a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
