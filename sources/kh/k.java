package kh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.xb;
import com.assetgro.stockgro.data.model.RecentPerformance;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends d7.v {

    /* renamed from: g, reason: collision with root package name */
    public final Function2 f23149g;

    /* renamed from: h, reason: collision with root package name */
    public final hu.c f23150h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [k7.w, java.lang.Object] */
    public k(be.b onProfileViewRequest, v.g onPortfolioViewRequest) {
        super((k7.w) new Object());
        Intrinsics.checkNotNullParameter(onProfileViewRequest, "onProfileViewRequest");
        Intrinsics.checkNotNullParameter(onPortfolioViewRequest, "onPortfolioViewRequest");
        this.f23149g = onProfileViewRequest;
        this.f23150h = onPortfolioViewRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hk.d, java.lang.Object] */
    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        int i11;
        j holder = (j) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        RecentPerformance recentPerformance = (RecentPerformance) q(i10);
        if (recentPerformance != null) {
            xb xbVar = holder.f23146u;
            xbVar.f6642u.setText(recentPerformance.getName());
            long endDate = recentPerformance.getEndDate();
            jv.a b10 = jv.a.b("dd MMM yyyy");
            Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
            int i12 = 0;
            hv.e l10 = hv.e.l(0, endDate);
            hv.q p10 = hv.q.p();
            l10.getClass();
            String a10 = b10.a(hv.t.p(l10, p10));
            Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
            xbVar.f6640s.setText(a10);
            ImageView imageView = xbVar.f6641t;
            ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.f(imageView).m(recentPerformance.getProfileUrl()).r(hk.l.f18542c, new Object())).l(R.drawable.ic_placeholder_league)).z(imageView);
            nk.a p11 = ((nk.e) ((nk.e) new nk.a().f(ak.p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
            Intrinsics.checkNotNullExpressionValue(p11, "signature(...)");
            nk.e eVar = (nk.e) p11;
            ImageView imageView2 = xbVar.f6643v;
            ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.f(imageView2).m(recentPerformance.getUser().getUserImageUrl()).w(eVar).b()).l(R.drawable.ic_placeholder_user)).z(imageView2);
            ImageView imageView3 = xbVar.E;
            ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.f(imageView3).m(recentPerformance.getWinner().getUserImageUrl()).w(eVar).b()).l(R.drawable.ic_placeholder_user)).z(imageView3);
            xbVar.B.setText(a3.a.f("#", recentPerformance.getUser().getRank()));
            xbVar.F.setText(recentPerformance.getWinner().getName());
            xbVar.f6645x.setText(recentPerformance.getUser().getName());
            xbVar.A.a(recentPerformance.getUser().getPortfolio());
            xbVar.I.a(recentPerformance.getWinner().getPortfolio());
            xbVar.f6646y.setText(recentPerformance.getUser().getWinningAmount());
            xbVar.G.setText(recentPerformance.getWinner().getWinningAmount());
            if (Intrinsics.a(recentPerformance.getWinner().getUserId(), recentPerformance.getUser().getUserId())) {
                i12 = 8;
            }
            xbVar.f6644w.setVisibility(i12);
            View view = holder.f22629a;
            Context context = view.getContext();
            Boolean winCash = recentPerformance.getUser().getWinCash();
            Boolean bool = Boolean.TRUE;
            boolean a11 = Intrinsics.a(winCash, bool);
            int i13 = R.drawable.ic_bonus_14dp_new;
            if (a11) {
                i11 = R.drawable.ic_cash_14dp_new;
            } else {
                i11 = R.drawable.ic_bonus_14dp_new;
            }
            xbVar.f6647z.setImageDrawable(r3.k.getDrawable(context, i11));
            Context context2 = view.getContext();
            if (Intrinsics.a(recentPerformance.getWinner().getWinCash(), bool)) {
                i13 = R.drawable.ic_cash_14dp_new;
            }
            xbVar.H.setImageDrawable(r3.k.getDrawable(context2, i13));
        }
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = xb.J;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        xb xbVar = (xb) m4.m.g(from, R.layout.cell_recent_performance, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(xbVar, "inflate(...)");
        return new j(this, xbVar, new be.b(this, 16), new v.g(this, 17));
    }
}
