package com.assetgro.stockgro.ui.profile.report;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.l3;
import ch.c;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import hh.a;
import hh.f;
import hh.i;
import iu.a0;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/report/ReportEntityActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/report/ReportEntityViewModel;", "Lba/l3;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ReportEntityActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10008l = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10009k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_report_account;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((ReportEntityViewModel) x()).f10012p.observe(this, new c(6, new a(this, 0)));
        ((ReportEntityViewModel) x()).f10021y.observe(this, new c(6, new a(this, 1)));
        ((ReportEntityViewModel) x()).f9084g.observe(this, new c(6, new a(this, 2)));
        ((ReportEntityViewModel) x()).f10018v.observe(this, new c(6, new a(this, 3)));
    }

    @Override // gd.b
    public final void I() {
        String str;
        int i10;
        ReportEntityViewModel reportEntityViewModel = (ReportEntityViewModel) x();
        String stringExtra = getIntent().getStringExtra("REPORT_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "User";
        }
        Intrinsics.checkNotNullParameter(stringExtra, "<set-?>");
        reportEntityViewModel.f10013q = stringExtra;
        ReportEntityViewModel reportEntityViewModel2 = (ReportEntityViewModel) x();
        String stringExtra2 = getIntent().getStringExtra("USER_ID_TO_BE_REPORTED");
        if (stringExtra2 == null) {
            stringExtra2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.checkNotNullParameter(stringExtra2, "<set-?>");
        reportEntityViewModel2.f10014r = stringExtra2;
        ((ReportEntityViewModel) x()).f10015s = getIntent().getStringExtra("ENTITY_ID_TO_BE_REPORTED");
        ((ReportEntityViewModel) x()).f10016t = (ReportEntityType) getIntent().getSerializableExtra("ENTITY_TYPE_TO_BE_REPORTED");
        this.f10009k = getIntent().getBooleanExtra("IS_BLOCKED", false);
        Toolbar toolbar = ((l3) w()).f5315t;
        toolbar.f1125l = R.style.RedHatRegular_White;
        AppCompatTextView appCompatTextView = toolbar.f1108b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(this, R.style.RedHatRegular_White);
        }
        if (((ReportEntityViewModel) x()).f10016t == ReportEntityType.User) {
            ((l3) w()).f5315t.setTitle(getString(R.string.report) + " " + ((ReportEntityViewModel) x()).f10013q + " ");
        } else {
            l3 l3Var = (l3) w();
            String string = getString(R.string.report);
            ReportEntityType reportEntityType = ((ReportEntityViewModel) x()).f10016t;
            if (reportEntityType != null) {
                str = reportEntityType.name();
            } else {
                str = null;
            }
            l3Var.f5315t.setTitle(string + " " + str + " ");
        }
        ReportEntityViewModel reportEntityViewModel3 = (ReportEntityViewModel) x();
        ReportEntityType reportEntityType2 = reportEntityViewModel3.f10016t;
        if (reportEntityType2 == null) {
            i10 = -1;
        } else {
            i10 = f.f18466a[reportEntityType2.ordinal()];
        }
        e0 e0Var = reportEntityViewModel3.f9084g;
        ct.a aVar = reportEntityViewModel3.f9080c;
        pj.a aVar2 = reportEntityViewModel3.f9079b;
        ChatRepository chatRepository = reportEntityViewModel3.f10010n;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        g.H(u0.f(reportEntityViewModel3), null, null, new i(reportEntityViewModel3, null), 3);
                    }
                } else {
                    e0Var.postValue(Boolean.TRUE);
                    h c10 = chatRepository.getReasonsToReportMessage().c(((e) aVar2).J());
                    d dVar = new d(new vg.d(23, new hh.g(reportEntityViewModel3, 1)), new vg.d(24, new hh.g(reportEntityViewModel3, 2)));
                    c10.a(dVar);
                    aVar.c(dVar);
                }
            } else {
                g.H(u0.f(reportEntityViewModel3), null, null, new hh.h(reportEntityViewModel3, null), 3);
            }
        } else {
            e0Var.postValue(Boolean.TRUE);
            h c11 = chatRepository.getReasonsToReportUser().c(((e) aVar2).J());
            d dVar2 = new d(new vg.d(19, new hh.g(reportEntityViewModel3, 3)), new vg.d(20, new hh.g(reportEntityViewModel3, 4)));
            c11.a(dVar2);
            aVar.c(dVar2);
        }
        ((l3) w()).f5315t.setNavigationOnClickListener(new p004if.c(this, 26));
        Toolbar toolbar2 = ((l3) w()).f5315t;
        Intrinsics.checkNotNullExpressionValue(toolbar2, "toolbar");
        v(toolbar2);
        l3 l3Var2 = (l3) w();
        be.b bVar = new be.b(this, 13);
        Object obj = b1.d.f3079a;
        l3Var2.f5314s.setContent(new b1.c(bVar, true, -1605648624));
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        g.i(chatRepository);
        FeedRepository feedRepository = (FeedRepository) activityComponent.f14246a.f14272x.get();
        g.i(feedRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        ca.c factory = new ca.c(a0.a(ReportEntityViewModel.class), new z2.e(schedulerProvider, compositeDisposable, userRepository, chatRepository, feedRepository, 3));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, ReportEntityViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ReportEntityViewModel.class, "<this>", ReportEntityViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ReportEntityViewModel reportEntityViewModel = (ReportEntityViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(reportEntityViewModel);
            this.f17254b = reportEntityViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
