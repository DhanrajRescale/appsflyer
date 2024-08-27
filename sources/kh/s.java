package kh;

import android.os.Bundle;
import androidx.fragment.app.j0;
import ba.wp;
import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.model.UserReportStatusDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f23173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(y yVar, int i10) {
        super(1);
        this.f23172a = i10;
        this.f23173b = yVar;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        p pVar = p.f23165b;
        p pVar2 = p.f23166c;
        int i10 = this.f23172a;
        y yVar = this.f23173b;
        switch (i10) {
            case 2:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = yVar.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = yVar.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
            case 3:
            case 6:
            default:
                if (!yVar.K()) {
                    Intrinsics.c(bool);
                    if (bool.booleanValue()) {
                        yVar.I(false);
                        return;
                    } else {
                        y.H(yVar);
                        return;
                    }
                }
                return;
            case 4:
                if (!yVar.K()) {
                    Intrinsics.c(bool);
                    if (bool.booleanValue()) {
                        String string = yVar.getString(R.string.cta_following);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        yVar.L(string, pVar2, R.drawable.button_secondary, R.color.secondary_button_text_color);
                        return;
                    } else {
                        String string2 = yVar.getString(R.string.follow);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        yVar.L(string2, pVar, R.drawable.primary_button, R.color.primary_button_text_color);
                        return;
                    }
                }
                return;
            case 5:
                if (!yVar.K()) {
                    Intrinsics.c(bool);
                    if (bool.booleanValue()) {
                        String string3 = yVar.getString(R.string.cta_following);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        yVar.L(string3, pVar2, R.drawable.button_secondary, R.color.secondary_button_text_color);
                        j0 activity = yVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1);
                        }
                        ((UserStatisticsViewModel) yVar.r()).k();
                        return;
                    }
                    String string4 = yVar.getString(R.string.follow);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    yVar.L(string4, pVar, R.drawable.primary_button, R.color.primary_button_text_color);
                    j0 activity2 = yVar.getActivity();
                    if (activity2 != null) {
                        activity2.setResult(-1);
                    }
                    ((UserStatisticsViewModel) yVar.r()).k();
                    return;
                }
                return;
            case 7:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar3 = yVar.f17283a;
                    if (fVar3 != null) {
                        fVar3.d();
                    }
                    ((wp) yVar.q()).f6566y.setRefreshing(false);
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    com.kaopiz.kprogresshud.f fVar4 = yVar.f17283a;
                    if (fVar4 != null) {
                        fVar4.b();
                    }
                    ((wp) yVar.q()).f6566y.setRefreshing(false);
                    return;
                }
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f23172a;
        y yVar = this.f23173b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    Bundle arguments = yVar.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("IS_MAINTENANCE_ON", booleanValue);
                    }
                    wp wpVar = (wp) yVar.q();
                    wpVar.f6563v.setAdapter(yVar.J());
                    ch.h J = yVar.J();
                    J.f8150p = booleanValue;
                    J.e(1);
                    J.e(3);
                    return;
                }
                return;
            default:
                Boolean bool2 = (Boolean) jVar.a();
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    Bundle arguments2 = yVar.getArguments();
                    if (arguments2 != null) {
                        arguments2.putBoolean("IS_PORTFOLIO_MAINTENANCE_ON", booleanValue2);
                    }
                    wp wpVar2 = (wp) yVar.q();
                    wpVar2.f6563v.setAdapter(yVar.J());
                    ch.h J2 = yVar.J();
                    J2.f8151q = booleanValue2;
                    J2.e(2);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        Boolean iAmBlocked;
        int i10 = this.f23172a;
        boolean z11 = false;
        y yVar = this.f23173b;
        switch (i10) {
            case 0:
                d((kj.j) obj);
                return Unit.f23355a;
            case 1:
                d((kj.j) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                ((wp) yVar.q()).G.setText((String) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            case 6:
                ProfileStatsDto profileStatsDto = (ProfileStatsDto) obj;
                nk.a p10 = ((nk.e) ((nk.e) new nk.a().f(ak.p.f555a)).q()).p(new qk.b(String.valueOf(System.currentTimeMillis())));
                Intrinsics.checkNotNullExpressionValue(p10, "signature(...)");
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.g(yVar).m(profileStatsDto.getImageUrl()).w((nk.e) p10).b()).l(R.drawable.ic_placeholder_user)).z(((wp) yVar.q()).E);
                ((wp) yVar.q()).F.setText(a3.a.f("@", profileStatsDto.getUsername()));
                ((wp) yVar.q()).G.setText(profileStatsDto.getDisplayName());
                String bio = profileStatsDto.getBio();
                if (bio != null && bio.length() > 0) {
                    MaterialTextView tvProfileBio = ((wp) yVar.q()).D;
                    Intrinsics.checkNotNullExpressionValue(tvProfileBio, "tvProfileBio");
                    zq.f.m0(tvProfileBio);
                    ((wp) yVar.q()).D.setText(profileStatsDto.getBio().toString());
                    yVar.f23189h = profileStatsDto.getBio();
                }
                return Unit.f23355a;
            case 7:
                a((Boolean) obj);
                return Unit.f23355a;
            case 8:
                UserBlockStatusDao userBlockStatusDao = (UserBlockStatusDao) obj;
                if ((userBlockStatusDao != null && Intrinsics.a(userBlockStatusDao.getIBlocked(), Boolean.TRUE)) || (userBlockStatusDao != null && Intrinsics.a(userBlockStatusDao.getIAmBlocked(), Boolean.TRUE))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!yVar.K()) {
                    if (z10) {
                        UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) yVar.r();
                        String str = yVar.f23190i;
                        Intrinsics.c(str);
                        if (!userStatisticsViewModel.i(str)) {
                            if (userBlockStatusDao != null && (iAmBlocked = userBlockStatusDao.getIAmBlocked()) != null) {
                                z11 = iAmBlocked.booleanValue();
                            }
                            yVar.I(z11);
                        }
                    }
                    y.H(yVar);
                }
                return Unit.f23355a;
            case 9:
                UserReportStatusDto userReportStatusDto = (UserReportStatusDto) obj;
                if (userReportStatusDto != null) {
                    if (userReportStatusDto.getReportThresholdExceeded()) {
                        ((wp) yVar.q()).f6564w.setVisibility(0);
                        String displayStatus = userReportStatusDto.getDisplayStatus();
                        if (displayStatus != null && displayStatus.length() != 0) {
                            ((wp) yVar.q()).f6565x.setText(userReportStatusDto.getDisplayStatus());
                        }
                    } else {
                        ((wp) yVar.q()).f6564w.setVisibility(8);
                    }
                }
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
