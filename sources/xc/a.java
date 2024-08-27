package xc;

import androidx.fragment.app.j0;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f40171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(0);
        this.f40170a = i10;
        this.f40171b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity;
        b bVar = this.f40171b;
        int i10 = this.f40170a;
        switch (i10) {
            case 0:
                j0 activity = bVar.getActivity();
                if (activity instanceof LeagueDetailPreJoiningActivity) {
                    leagueDetailPreJoiningActivity = (LeagueDetailPreJoiningActivity) activity;
                } else {
                    leagueDetailPreJoiningActivity = null;
                }
                if (leagueDetailPreJoiningActivity == null) {
                    return null;
                }
                return (LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x();
            case 1:
                switch (i10) {
                    case 1:
                        bVar.dismiss();
                        break;
                    default:
                        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel = (LeagueDetailPreJoiningViewModel) bVar.f40172i.getValue();
                        if (leagueDetailPreJoiningViewModel != null) {
                            leagueDetailPreJoiningViewModel.i();
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 1:
                        bVar.dismiss();
                        break;
                    default:
                        LeagueDetailPreJoiningViewModel leagueDetailPreJoiningViewModel2 = (LeagueDetailPreJoiningViewModel) bVar.f40172i.getValue();
                        if (leagueDetailPreJoiningViewModel2 != null) {
                            leagueDetailPreJoiningViewModel2.i();
                            break;
                        }
                        break;
                }
                return Unit.f23355a;
        }
    }
}
