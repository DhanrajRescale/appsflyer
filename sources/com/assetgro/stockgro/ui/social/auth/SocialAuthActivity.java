package com.assetgro.stockgro.ui.social.auth;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.g;
import ba.t3;
import ch.c;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.model.AuthUiModel;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.social.auth.SocialAuthActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.f;
import jt.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import nh.k;
import nt.h;
import okhttp3.HttpUrl;
import wh.e;
import xh.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/social/auth/SocialAuthActivity;", "Lgd/f;", "Lcom/assetgro/stockgro/ui/social/auth/SocialActivityViewModel;", "Lba/t3;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialAuthActivity extends f {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f10113o = 0;

    /* renamed from: n, reason: collision with root package name */
    public EditProfileViewModel f10114n;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_social_auth;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((SocialActivityViewModel) x()).f10111u.observe(this, new c(21, new e(this, 0)));
        EditProfileViewModel editProfileViewModel = this.f10114n;
        if (editProfileViewModel != null) {
            editProfileViewModel.f10040x.observe(this, new c(21, new e(this, 1)));
            ((SocialActivityViewModel) x()).f10106p.observe(this, new c(21, new e(this, 2)));
        } else {
            Intrinsics.k("editProfileViewModel");
            throw null;
        }
    }

    @Override // gd.b
    public final void I() {
        t3 t3Var = (t3) w();
        final int i10 = 0;
        t3Var.f6140s.setOnClickListener(new View.OnClickListener(this) { // from class: wh.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SocialAuthActivity f39076b;

            {
                this.f39076b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                SocialAuthActivity this$0 = this.f39076b;
                switch (i11) {
                    case 0:
                        int i12 = SocialAuthActivity.f10113o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i13 = SocialAuthActivity.f10113o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        final int i11 = 1;
        ((RelativeLayout) ((t3) w()).f6141t.findViewById(R.id.linkedin_auth_container)).setOnClickListener(new View.OnClickListener(this) { // from class: wh.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SocialAuthActivity f39076b;

            {
                this.f39076b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                SocialAuthActivity this$0 = this.f39076b;
                switch (i112) {
                    case 0:
                        int i12 = SocialAuthActivity.f10113o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.FACEBOOK);
                        return;
                    default:
                        int i13 = SocialAuthActivity.f10113o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K(AuthType.LINKEDIN);
                        return;
                }
            }
        });
        this.f17266k.d(this.f17267l, new eb.f(this, 1));
    }

    @Override // gd.f
    public final void L() {
    }

    @Override // gd.f
    public final String M() {
        return ((SocialActivityViewModel) x()).h();
    }

    @Override // gd.f
    public final void N() {
        finish();
    }

    @Override // gd.f
    public final void O() {
        if (this.f10114n != null) {
            EditProfileViewModel.j();
        } else {
            Intrinsics.k("editProfileViewModel");
            throw null;
        }
    }

    @Override // gd.f
    public final void P(SocialDataDto socialDataDto) {
        Intrinsics.checkNotNullParameter(socialDataDto, "socialDataDto");
        Intrinsics.checkNotNullParameter("linkedin", "platform");
        SocialActivityViewModel socialActivityViewModel = (SocialActivityViewModel) x();
        AuthUiModel uiState = new AuthUiModel(new a(new Pair(AuthType.LINKEDIN, HttpUrl.FRAGMENT_ENCODE_SET)), true);
        Intrinsics.checkNotNullParameter(socialDataDto, "socialDataDto");
        Intrinsics.checkNotNullParameter("linkedin", "platform");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        socialActivityViewModel.f9084g.postValue(Boolean.TRUE);
        h c10 = socialActivityViewModel.f10104n.saveUserSocialData(socialDataDto, "linkedin").c(((kq.e) socialActivityViewModel.f9079b).J());
        d dVar = new d(new g(24, socialActivityViewModel, uiState), new k(27, new qg.a(socialActivityViewModel, 13)));
        c10.a(dVar);
        socialActivityViewModel.f9080c.c(dVar);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.l();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        yk.g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        yk.g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        yk.g.i(h10);
        this.f17258f = h10;
        this.f10114n = activityComponent.d();
    }
}
