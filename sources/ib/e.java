package ib;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBinderMapperImpl;
import ba.dc;
import ba.ec;
import ba.fc;
import ba.gc;
import ba.gy;
import ba.hc;
import ba.ic;
import ba.n3;
import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedStreamDto;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.feature_social.widget.ExpertTradeViewWidget;
import com.assetgro.stockgro.feature_social.widget.RiaBasicInfoWidget;
import com.assetgro.stockgro.feature_social.widget.RiaExpertiseWidget;
import com.assetgro.stockgro.feature_social.widget.RiaOutlineWidget;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import vt.i0;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RiaProfileActivity riaProfileActivity) {
        super(1);
        this.f19773a = riaProfileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        i0 i0Var;
        ArrayList arrayList;
        RiaProfileResponseDto.Group group;
        List<RiaProfileResponseDto.ExpertMeta.BasicInfo> list;
        List<RiaProfileResponseDto.ExpertMeta.Outline> list2;
        List<RiaProfileResponseDto.ExpertMeta.Expertise> list3;
        Boolean bool;
        Boolean bool2;
        jb.a aVar;
        String str5;
        String text;
        List<RiaProfileResponseDto.TradeViewsPerformance.Stocks.Analysis> analysis;
        List<RiaProfileResponseDto.TradeViews.Post> posts;
        List<FeedStreamDto.FeedStreamElementDto> elements;
        RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) obj;
        RiaProfileActivity riaProfileActivity = this.f19773a;
        RiaProfileResponseDto.ExpertMeta expertMeta = riaProfileResponseDto.getExpertMeta();
        if (expertMeta == null || (str = expertMeta.getName()) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i10 = RiaProfileActivity.f8791m;
        riaProfileActivity.getClass();
        List d10 = new Regex("\\s+").d(kotlin.text.w.X(str).toString());
        String str6 = (String) vt.g0.u(d10);
        String B = vt.g0.B(vt.g0.r(d10, 1), " ", null, null, null, 62);
        if (str6 != null) {
            TextView textView = ((n3) this.f19773a.w()).Q;
            if (str6.length() > 18) {
                str6 = jr.h.r(kotlin.text.y.a0(18, str6), "...");
            }
            textView.setText(str6);
        }
        if (B != null) {
            ((n3) this.f19773a.w()).R.setText(B);
        }
        TextView textView2 = ((n3) this.f19773a.w()).P;
        RiaProfileResponseDto.ExpertMeta expertMeta2 = riaProfileResponseDto.getExpertMeta();
        ViewGroup viewGroup = null;
        if (expertMeta2 != null) {
            str2 = expertMeta2.getName();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        RiaProfileActivity riaProfileActivity2 = this.f19773a;
        com.bumptech.glide.h f10 = com.bumptech.glide.b.c(riaProfileActivity2).f(riaProfileActivity2);
        RiaProfileResponseDto.ExpertMeta expertMeta3 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta3 != null) {
            str3 = expertMeta3.getSgImageUrl();
        } else {
            str3 = null;
        }
        f10.m(str3).z(((n3) this.f19773a.w()).N);
        RiaProfileActivity riaProfileActivity3 = this.f19773a;
        com.bumptech.glide.h f11 = com.bumptech.glide.b.c(riaProfileActivity3).f(riaProfileActivity3);
        RiaProfileResponseDto.ExpertMeta expertMeta4 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta4 != null) {
            str4 = expertMeta4.getSgImageUrl();
        } else {
            str4 = null;
        }
        f11.m(str4).z(((n3) this.f19773a.w()).M);
        RiaProfileActivity riaProfileActivity4 = this.f19773a;
        RiaProfileResponseDto.TradeViews tradeViews = riaProfileResponseDto.getTradeViews();
        if (tradeViews != null) {
            tradeViews.getHasTradeViews();
        }
        FeedStreamDto posts2 = riaProfileResponseDto.getPosts();
        boolean z10 = false;
        if (posts2 != null && (elements = posts2.getElements()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                hb.u feedCategoryElement = ((FeedStreamDto.FeedStreamElementDto) it.next()).toFeedCategoryElement(false);
                if (feedCategoryElement != null) {
                    arrayList2.add(feedCategoryElement);
                }
            }
            i0Var = arrayList2;
        } else {
            i0Var = i0.f38321a;
        }
        RiaProfileResponseDto.TradeViews tradeViews2 = riaProfileResponseDto.getTradeViews();
        if (tradeViews2 != null && (posts = tradeViews2.getPosts()) != null) {
            ArrayList arrayList3 = new ArrayList(vt.z.k(posts));
            Iterator<T> it2 = posts.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((RiaProfileResponseDto.TradeViews.Post) it2.next()).getTradeViews());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<RiaProfileResponseDto.Group> groups = riaProfileResponseDto.getGroups();
        if (groups != null) {
            group = (RiaProfileResponseDto.Group) vt.g0.w(groups);
        } else {
            group = null;
        }
        ComposeView composeView = ((n3) riaProfileActivity4.w()).f5517v;
        x xVar = new x(arrayList, i0Var, group, riaProfileActivity4, composeView);
        Object obj2 = b1.d.f3079a;
        composeView.setContent(new b1.c(xVar, true, 316278449));
        if (riaProfileResponseDto.isBlocked()) {
            Group riaData = ((n3) this.f19773a.w()).K;
            Intrinsics.checkNotNullExpressionValue(riaData, "riaData");
            zq.f.M(riaData);
            ConstraintLayout footerContainer = ((n3) this.f19773a.w()).B;
            Intrinsics.checkNotNullExpressionValue(footerContainer, "footerContainer");
            zq.f.M(footerContainer);
        } else {
            Group riaData2 = ((n3) this.f19773a.w()).K;
            Intrinsics.checkNotNullExpressionValue(riaData2, "riaData");
            zq.f.m0(riaData2);
            ConstraintLayout footerContainer2 = ((n3) this.f19773a.w()).B;
            Intrinsics.checkNotNullExpressionValue(footerContainer2, "footerContainer");
            zq.f.m0(footerContainer2);
        }
        RiaBasicInfoWidget riaBasicInfoWidget = ((n3) this.f19773a.w()).J;
        RiaProfileResponseDto.ExpertMeta expertMeta5 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta5 != null) {
            list = expertMeta5.getBasicInfo();
        } else {
            list = null;
        }
        LinearLayout linearLayout = riaBasicInfoWidget.f8851t.f4987s;
        linearLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(riaBasicInfoWidget.f8850s);
        if (list != null) {
            for (RiaProfileResponseDto.ExpertMeta.BasicInfo basicInfo : list) {
                int i11 = dc.f4475u;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                dc dcVar = (dc) m4.m.g(from, R.layout.cell_ria_basic_info, null, false, null);
                Intrinsics.checkNotNullExpressionValue(dcVar, "inflate(...)");
                ec ecVar = (ec) dcVar;
                ecVar.f4477t = basicInfo;
                synchronized (ecVar) {
                    ecVar.f4593w |= 1;
                }
                ecVar.a(6);
                ecVar.m();
                linearLayout.addView(dcVar.f27491e);
            }
        }
        RiaOutlineWidget riaOutlineWidget = ((n3) this.f19773a.w()).S;
        RiaProfileResponseDto.ExpertMeta expertMeta6 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta6 != null) {
            list2 = expertMeta6.getOutlines();
        } else {
            list2 = null;
        }
        LinearLayout linearLayout2 = riaOutlineWidget.f8856t.f5410s;
        linearLayout2.removeAllViews();
        LayoutInflater from2 = LayoutInflater.from(riaOutlineWidget.f8855s);
        if (list2 != null) {
            for (RiaProfileResponseDto.ExpertMeta.Outline outline : list2) {
                int i12 = hc.f4929w;
                DataBinderMapperImpl dataBinderMapperImpl2 = m4.d.f27474a;
                hc hcVar = (hc) m4.m.g(from2, R.layout.cell_ria_outline, null, false, null);
                Intrinsics.checkNotNullExpressionValue(hcVar, "inflate(...)");
                ic icVar = (ic) hcVar;
                icVar.f4933v = outline;
                synchronized (icVar) {
                    icVar.f5027x |= 1;
                }
                icVar.a(6);
                icVar.m();
                linearLayout2.addView(hcVar.f27491e);
            }
        }
        ExpertTradeViewWidget expertTradeViewWidget = ((n3) this.f19773a.w()).f5520y;
        RiaProfileResponseDto.TradeViewsPerformance tradeViewsPerformance = riaProfileResponseDto.getTradeViewsPerformance();
        gy gyVar = (gy) expertTradeViewWidget.f8848t;
        gyVar.E = tradeViewsPerformance;
        synchronized (gyVar) {
            gyVar.J |= 1;
        }
        gyVar.a(6);
        gyVar.m();
        if (tradeViewsPerformance != null) {
            expertTradeViewWidget.f8849u = tradeViewsPerformance;
        }
        if (tradeViewsPerformance != null) {
            if (tradeViewsPerformance.isEmpty()) {
                expertTradeViewWidget.f8848t.f27491e.setVisibility(8);
            }
            TabLayout tabLayout = expertTradeViewWidget.f8848t.D;
            RiaProfileResponseDto.TradeViewsPerformance.Stocks stocks = tradeViewsPerformance.getStocks();
            if (stocks != null && (analysis = stocks.getAnalysis()) != null && !analysis.isEmpty()) {
                expertTradeViewWidget.m((RiaProfileResponseDto.TradeViewsPerformance.Stocks.Analysis) vt.g0.u(stocks.getAnalysis()));
                tabLayout.l();
                int i13 = 0;
                for (Object obj3 : stocks.getAnalysis()) {
                    int i14 = i13 + 1;
                    if (i13 >= 0) {
                        yo.g j10 = tabLayout.j();
                        j10.b(((RiaProfileResponseDto.TradeViewsPerformance.Stocks.Analysis) obj3).getTradeType());
                        j10.f41759h = i13;
                        yo.j jVar = j10.f41758g;
                        if (jVar != null) {
                            jVar.setId(i13);
                        }
                        tabLayout.b(j10);
                        i13 = i14;
                    } else {
                        vt.y.j();
                        throw null;
                    }
                }
            }
        }
        RiaExpertiseWidget riaExpertiseWidget = ((n3) this.f19773a.w()).f5521z;
        RiaProfileResponseDto.ExpertMeta expertMeta7 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta7 != null) {
            list3 = expertMeta7.getExpertise();
        } else {
            list3 = null;
        }
        LinearLayout linearLayout3 = riaExpertiseWidget.f8854t.f5186s;
        linearLayout3.removeAllViews();
        LayoutInflater from3 = LayoutInflater.from(riaExpertiseWidget.f8853s);
        if (list3 != null) {
            int i15 = 0;
            for (Object obj4 : list3) {
                int i16 = i15 + 1;
                if (i15 >= 0) {
                    RiaProfileResponseDto.ExpertMeta.Expertise expertise = (RiaProfileResponseDto.ExpertMeta.Expertise) obj4;
                    int i17 = fc.f4699t;
                    DataBinderMapperImpl dataBinderMapperImpl3 = m4.d.f27474a;
                    fc fcVar = (fc) m4.m.g(from3, R.layout.cell_ria_expertise, viewGroup, z10, viewGroup);
                    Intrinsics.checkNotNullExpressionValue(fcVar, "inflate(...)");
                    gc gcVar = (gc) fcVar;
                    gcVar.f4700s = expertise;
                    synchronized (gcVar) {
                        gcVar.f4794v |= 1;
                    }
                    gcVar.a(6);
                    gcVar.m();
                    View view = fcVar.f27491e;
                    Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                    view.setOnClickListener(new ha.h(1, expertise, riaExpertiseWidget, linearLayout3));
                    if (i15 == list3.size() - 1) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins(0, 0, kj.f.j(16), 0);
                        view.setLayoutParams(layoutParams);
                    }
                    linearLayout3.addView(view);
                    i15 = i16;
                    z10 = false;
                    viewGroup = null;
                } else {
                    vt.y.j();
                    throw null;
                }
            }
        }
        RiaProfileResponseDto.ExpertMeta expertMeta8 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta8 != null && expertMeta8.isSebiVerified()) {
            ((n3) this.f19773a.w()).C.setImageResource(R.drawable.ic_ria_verified);
            bool = null;
        } else {
            bool = null;
            ((n3) this.f19773a.w()).C.setImageDrawable(null);
        }
        RiaProfileViewModel riaProfileViewModel = (RiaProfileViewModel) this.f19773a.x();
        RiaProfileResponseDto.ExpertMeta expertMeta9 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta9 != null) {
            bool2 = expertMeta9.isFollowing();
        } else {
            bool2 = bool;
        }
        if (Intrinsics.a(bool2, Boolean.TRUE)) {
            aVar = jb.a.f21292j;
        } else if (Intrinsics.a(bool2, Boolean.FALSE)) {
            aVar = jb.a.f21291i;
        } else if (bool2 == null) {
            aVar = jb.a.f21291i;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        riaProfileViewModel.f8803w = aVar;
        TextView textView3 = ((n3) this.f19773a.w()).W;
        RiaProfileResponseDto.ExpertMeta expertMeta10 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta10 == null || (str5 = expertMeta10.getSgHandle()) == null) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        textView3.setText("@".concat(str5));
        RiaProfileResponseDto.ExpertMeta expertMeta11 = riaProfileResponseDto.getExpertMeta();
        if (expertMeta11 == null || (text = expertMeta11.getDescription()) == null) {
            text = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        TextView riaDescription = ((n3) this.f19773a.w()).L;
        Intrinsics.checkNotNullExpressionValue(riaDescription, "riaDescription");
        Intrinsics.checkNotNullParameter(riaDescription, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        riaDescription.setText(text);
        riaDescription.setVisibility(8);
        riaDescription.post(new defpackage.a(riaDescription, 4, text, 0));
        ((n3) this.f19773a.w()).L.setOnClickListener(new bb.a(4, this.f19773a, text));
        return Unit.f23355a;
    }
}
