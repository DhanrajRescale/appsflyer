package cd;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.l1;
import b0.o1;
import c2.j;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import d2.w0;
import g1.l;
import g1.o;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n1.s0;
import o2.v;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class c extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueDetailPreJoiningActivity f8103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity, int i10) {
        super(2);
        this.f8102a = i10;
        this.f8103b = leagueDetailPreJoiningActivity;
    }

    public final void a(n nVar, int i10) {
        l lVar = l.f16404b;
        int i11 = this.f8102a;
        LeagueDetailPreJoiningActivity leagueDetailPreJoiningActivity = this.f8103b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                float f10 = 8;
                float f11 = 16;
                o w10 = androidx.compose.foundation.layout.a.w(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, f10, s0.g.f34069a, s0.g.f34069a, 13), w0.e(R.color.purple_light_new_maintainence_background, nVar), s0.f28162a), f11, 12, f11, 24);
                r rVar2 = (r) nVar;
                rVar2.b0(693286680);
                l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar2, 0);
                rVar2.b0(-1323940314);
                int i12 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(w10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t.v0(rVar2, a10, c2.k.f7749e);
                    t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar2, i12, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar2);
                    al.d.z(R.drawable.ic_payment_under_maintainence, null, null, 0L, rVar2, 6, 14);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                    String string = leagueDetailPreJoiningActivity.getString(R.string.payment_systems_under_maintainence);
                    long e12 = yk.j.e1(12);
                    long e10 = w0.e(R.color.black_1A1A1A, rVar2);
                    v vVar = jh.c.f21372a;
                    Intrinsics.c(string);
                    al.d.C(string, null, e10, e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar2);
                    rVar2.s(false);
                    rVar2.s(true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return;
                }
                al.d.v0();
                throw null;
            case 1:
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                ArenaGame arenaGame = (ArenaGame) ((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).f9050q.getValue();
                if (arenaGame != null) {
                    float f12 = 16;
                    yk.j.Z(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), f12, s0.g.f34069a, f12, s0.g.f34069a, 10), ((Boolean) ((LeagueDetailPreJoiningViewModel) leagueDetailPreJoiningActivity.x()).f9057x.getValue()).booleanValue(), arenaGame, false, new d(leagueDetailPreJoiningActivity, 0), new d(leagueDetailPreJoiningActivity, 1), nVar, 518, 8);
                    return;
                }
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    r rVar4 = (r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                ConstraintLayout paymentConfirmationContainer = ((ba.o1) leagueDetailPreJoiningActivity.w()).D;
                Intrinsics.checkNotNullExpressionValue(paymentConfirmationContainer, "paymentConfirmationContainer");
                zq.f.M(paymentConfirmationContainer);
                long e11 = w0.e(R.color.yellow_light_new, nVar);
                String string2 = leagueDetailPreJoiningActivity.getString(R.string.you_re_already_in_two_prepzones);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                yk.j.K(e11, R.drawable.ic_prepzone_finished_yellow, string2, w0.e(R.color.yellow_new, nVar), yk.j.e1(10), jh.c.f21373b, nVar, 221232);
                return;
            default:
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                long e13 = w0.e(R.color.red_light_new, nVar);
                String string3 = leagueDetailPreJoiningActivity.getString(R.string.seats_full_in_prepzone_info);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                yk.j.K(e13, R.drawable.ic_prepzone_finished_red, string3, w0.e(R.color.red_new, nVar), yk.j.e1(10), jh.c.f21373b, nVar, 221232);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f8102a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
