package c2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.FragmentNavigator;
import ba.bb;
import ba.bk;
import ba.j8;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchActivity;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailActivity;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import com.assetgro.stockgro.ui.social.domain.model.CreatorMeta;
import com.google.android.material.imageview.ShapeableImageView;
import d2.l2;
import g7.j4;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import ut.l;

/* loaded from: classes.dex */
public final class e1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, int i10) {
        super(1);
        this.f7671a = i10;
        this.f7672b = obj;
    }

    public final void a(Boolean bool) {
        int i10 = this.f7671a;
        Object obj = this.f7672b;
        switch (i10) {
            case 21:
                MarketOptionSearchViewModel.h((MarketOptionSearchViewModel) ((MarketOptionSearchActivity) obj).x());
                return;
            default:
                bk bkVar = (bk) ((qa.b) obj).q();
                Intrinsics.c(bool);
                bkVar.f4300s.setUserInputEnabled(bool.booleanValue());
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f7671a;
        Object obj = this.f7672b;
        switch (i10) {
            case 14:
                ((tu.p0) ((q.h) obj).f31451c).f(null);
                return;
            case 15:
                ((j4) obj).k(null);
                return;
            case 16:
                l.Companion companion = ut.l.INSTANCE;
                ((qu.h) obj).resumeWith(Unit.f23355a);
                return;
            case 17:
                if (th2 == null) {
                    if (!((androidx.work.p) obj).f2633a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return;
                } else {
                    if (th2 instanceof CancellationException) {
                        ((androidx.work.p) obj).f2633a.cancel(true);
                        return;
                    }
                    l8.j jVar = ((androidx.work.p) obj).f2633a;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    jVar.k(th2);
                    return;
                }
            case 18:
                ((op.a) obj).cancel(false);
                return;
            default:
                MobileLoginViewModel mobileLoginViewModel = (MobileLoginViewModel) obj;
                mobileLoginViewModel.f9084g.postValue(Boolean.FALSE);
                mobileLoginViewModel.f8731q.postValue(new z9.g("Technical Error Occurred"));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i10 = this.f7671a;
        boolean z10 = true;
        Object obj2 = this.f7672b;
        switch (i10) {
            case 0:
                n1.r rVar = (n1.r) obj;
                i1 i1Var = (i1) obj2;
                if (i1Var.f7721k.D()) {
                    t1 snapshotObserver = ((d2.a0) k0.a(i1Var.f7721k)).getSnapshotObserver();
                    n1.u0 u0Var = i1.D;
                    snapshotObserver.a(i1Var, f.f7681j, new x.y0(15, i1Var, rVar));
                    i1Var.B = false;
                } else {
                    i1Var.B = true;
                }
                return Unit.f23355a;
            case 1:
                Boolean D = androidx.compose.ui.focus.a.D((l1.t) obj, ((l1.b) obj2).f23884a);
                return Boolean.valueOf(D != null ? D.booleanValue() : true);
            case 2:
                return new c.c((d2.w1) obj2, 9);
            case 3:
                return new d2.c2((l2) obj2, new w.m0((qu.f0) obj, 1));
            case 4:
                if (d2.a2.f13351b.compareAndSet(false, true)) {
                    ((su.g) obj2).o(Unit.f23355a);
                }
                return Unit.f23355a;
            case 5:
                h2.t.f((h2.v) obj, ((h2.g) obj2).f17821a);
                return Unit.f23355a;
            case 6:
                o2.p0 p0Var = (o2.p0) obj;
                return ((o2.t) obj2).a(new o2.p0(null, p0Var.f29516b, p0Var.f29517c, p0Var.f29518d, p0Var.f29519e)).getValue();
            case 7:
                a3.a.u(obj);
                throw null;
            case 8:
                androidx.fragment.app.d1 d1Var = (androidx.fragment.app.d1) obj2;
                androidx.fragment.app.g0 B = d1Var != null ? d1Var.B(((FragmentContainerView) obj).getId()) : null;
                if (B != null && !d1Var.M()) {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(d1Var);
                    Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction()");
                    aVar.l(B);
                    aVar.i();
                }
                return Unit.f23355a;
            case 9:
                ((androidx.compose.ui.node.a) obj2).W((w2.b) obj);
                return Unit.f23355a;
            case 10:
                n1.f0 f0Var = (n1.f0) obj;
                g3.l lVar = (g3.l) obj2;
                if (!Float.isNaN(lVar.f16517d) || !Float.isNaN(lVar.f16518e)) {
                    ((n1.u0) f0Var).q(androidx.compose.ui.graphics.a.i(Float.isNaN(lVar.f16517d) ? 0.5f : lVar.f16517d, Float.isNaN(lVar.f16518e) ? 0.5f : lVar.f16518e));
                }
                if (!Float.isNaN(lVar.f16519f)) {
                    ((n1.u0) f0Var).e(lVar.f16519f);
                }
                if (!Float.isNaN(lVar.f16520g)) {
                    ((n1.u0) f0Var).f(lVar.f16520g);
                }
                if (!Float.isNaN(lVar.f16521h)) {
                    ((n1.u0) f0Var).g(lVar.f16521h);
                }
                if (!Float.isNaN(lVar.f16522i)) {
                    ((n1.u0) f0Var).r(lVar.f16522i);
                }
                if (!Float.isNaN(lVar.f16523j)) {
                    ((n1.u0) f0Var).z(lVar.f16523j);
                }
                if (!Float.isNaN(lVar.f16524k)) {
                    ((n1.u0) f0Var).l(lVar.f16524k);
                }
                if (!Float.isNaN(lVar.f16525l) || !Float.isNaN(lVar.f16526m)) {
                    n1.u0 u0Var2 = (n1.u0) f0Var;
                    u0Var2.i(Float.isNaN(lVar.f16525l) ? 1.0f : lVar.f16525l);
                    u0Var2.j(Float.isNaN(lVar.f16526m) ? 1.0f : lVar.f16526m);
                }
                if (!Float.isNaN(lVar.f16527n)) {
                    ((n1.u0) f0Var).a(lVar.f16527n);
                }
                return Unit.f23355a;
            case 11:
                androidx.navigation.n entry = (androidx.navigation.n) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return new d4.s(z10 ? 1 : 0, (FragmentNavigator) obj2, entry);
            case 12:
                g7.b it = (g7.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f16657a == ((g7.b1) obj2));
            case 13:
                g7.c0 loadState = (g7.c0) obj;
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                g7.m mVar = (g7.m) obj2;
                if (!((Boolean) mVar.f16902e.getValue()).booleanValue()) {
                    Iterator it2 = mVar.f16907j.iterator();
                    while (it2.hasNext()) {
                        ((Function1) it2.next()).invoke(loadState);
                    }
                } else {
                    Handler handler = (Handler) mVar.f16909l.getValue();
                    m.j jVar = mVar.f16910m;
                    handler.removeCallbacks(jVar);
                    ((AtomicReference) jVar.f25590b).set(loadState);
                    handler.post(jVar);
                }
                return Unit.f23355a;
            case 14:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 15:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 16:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 17:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 18:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 19:
                ((bb) ((ga.f) obj2).f17291u).f4277t.a((ChangeDto) obj);
                return Unit.f23355a;
            case 20:
                if (Intrinsics.a((String) obj, "MarketOptionsListFragment")) {
                    ((MarketOptionsListViewModel) ((ja.i) obj2).r()).i(ja.l.f21280d);
                } else {
                    ((MarketOptionsListViewModel) ((ja.i) obj2).r()).i(ja.l.f21281e);
                }
                return Unit.f23355a;
            case 21:
                a((Boolean) obj);
                return Unit.f23355a;
            case 22:
                Boolean bool = (Boolean) ((kj.j) obj).a();
                if (bool != null) {
                    MarketInsightsDetailActivity marketInsightsDetailActivity = (MarketInsightsDetailActivity) obj2;
                    if (bool.booleanValue()) {
                        int i11 = MarketInsightsDetailActivity.f8659k;
                        marketInsightsDetailActivity.getClass();
                        Intent intent = new Intent(marketInsightsDetailActivity, (Class<?>) MaintenanceWindowActivity.class);
                        intent.putExtra("DATA", qf.b.f31938m);
                        intent.putExtra("SHOW_TOOLBAR", true);
                        intent.putExtra("TOOLBAR_TITLE", marketInsightsDetailActivity.getString(R.string.text_market));
                        marketInsightsDetailActivity.startActivity(intent);
                        marketInsightsDetailActivity.finish();
                    }
                }
                return Unit.f23355a;
            case 23:
                a((Boolean) obj);
                return Unit.f23355a;
            case 24:
                ni.s stockSortItem = (ni.s) obj;
                Intrinsics.checkNotNullParameter(stockSortItem, "sortOption");
                ua.a aVar2 = (ua.a) obj2;
                int i12 = ua.a.f37038k;
                MarketStocksListViewModel marketStocksListViewModel = (MarketStocksListViewModel) aVar2.f37040j.getValue();
                marketStocksListViewModel.getClass();
                Intrinsics.checkNotNullParameter(stockSortItem, "stockSortItem");
                marketStocksListViewModel.D = stockSortItem;
                marketStocksListViewModel.f8679v = 1;
                marketStocksListViewModel.f8681x = 1;
                marketStocksListViewModel.f8678u.clear();
                marketStocksListViewModel.j();
                aVar2.dismiss();
                return Unit.f23355a;
            case 25:
                androidx.lifecycle.e0 e0Var = ((IntroViewModel) obj2).f8719q;
                Unit unit = Unit.f23355a;
                e0Var.postValue(unit);
                return unit;
            case 26:
                String url = ((CountrySelectDto) obj).getFlagUrl().getRectangular();
                ShapeableImageView image = ((j8) ((ab.e) obj2).f17291u).f5118u;
                Intrinsics.checkNotNullExpressionValue(image, "image");
                int i13 = kj.f.f23221a;
                Intrinsics.checkNotNullParameter(image, "<this>");
                Intrinsics.checkNotNullParameter(url, "url");
                com.bumptech.glide.b.e(image.getContext()).m(url).z(image);
                return Unit.f23355a;
            case 27:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 28:
                ((RegistrationOtpVerificationViewModel) obj2).f8784p.postValue((Integer) obj);
                return Unit.f23355a;
            default:
                CommentMetaData it3 = (CommentMetaData) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String senderId = it3.getSenderId();
                if (senderId != null) {
                    Context context = (Context) obj2;
                    Intent intent2 = new Intent(context, (Class<?>) UserProfileActivity.class);
                    intent2.putExtra("USER_IDENTIFIER", senderId);
                    CreatorMeta creatorInfo = it3.getCreatorInfo();
                    if (creatorInfo == null || (str = creatorInfo.getDisplayName()) == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    intent2.putExtra("USER_NAME", str);
                    context.startActivity(intent2);
                }
                return Unit.f23355a;
        }
    }
}
