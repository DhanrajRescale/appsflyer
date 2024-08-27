package ib;

import android.content.Intent;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.n3;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.button.MaterialButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileActivity f19777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(RiaProfileActivity riaProfileActivity, int i10) {
        super(1);
        this.f19776a = i10;
        this.f19777b = riaProfileActivity;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f19776a;
        RiaProfileActivity riaProfileActivity = this.f19777b;
        switch (i10) {
            case 1:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((RiaProfileViewModel) riaProfileActivity.x()).f8803w = jb.a.f21292j;
                    RiaProfileActivity.K(riaProfileActivity, "Following", Integer.valueOf(R.drawable.success_green));
                    return;
                } else {
                    ((RiaProfileViewModel) riaProfileActivity.x()).f8803w = jb.a.f21291i;
                    RiaProfileActivity.K(riaProfileActivity, "+ Follow", null);
                    return;
                }
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = riaProfileActivity.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = riaProfileActivity.f17255c) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    public final void d(String description) {
        int i10 = this.f19776a;
        RiaProfileActivity riaProfileActivity = this.f19777b;
        switch (i10) {
            case 3:
                Intrinsics.c(description);
                int i11 = RiaProfileActivity.f8791m;
                riaProfileActivity.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", riaProfileActivity.getString(R.string.invite_a_friend));
                intent.putExtra("android.intent.extra.TEXT", description);
                riaProfileActivity.startActivity(Intent.createChooser(intent, riaProfileActivity.getString(R.string.game_start_invite_friends_title)));
                return;
            default:
                Intrinsics.checkNotNullParameter(description, "description");
                int i12 = i0.f24733j;
                kq.e.L(new ShowInfoData(riaProfileActivity.getString(R.string.text_about), description, riaProfileActivity.getString(R.string.got_it), 0, 0, false, 24, null)).show(riaProfileActivity.getSupportFragmentManager(), "ShowInfoDataBottomSheetFragment");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Boolean iAmBlocked;
        Boolean iBlocked;
        Boolean iAmBlocked2;
        Boolean iBlocked2;
        switch (this.f19776a) {
            case 0:
                UserBlockStatusDao userBlockStatusDao = (UserBlockStatusDao) obj;
                if (userBlockStatusDao != null && (iBlocked2 = userBlockStatusDao.getIBlocked()) != null) {
                    z10 = iBlocked2.booleanValue();
                } else {
                    z10 = false;
                }
                if (userBlockStatusDao != null && (iAmBlocked2 = userBlockStatusDao.getIAmBlocked()) != null) {
                    z11 = iAmBlocked2.booleanValue();
                } else {
                    z11 = false;
                }
                int i10 = RiaProfileActivity.f8791m;
                RiaProfileActivity riaProfileActivity = this.f19777b;
                if (z10) {
                    MaterialButton followFollowingButton = ((n3) riaProfileActivity.w()).A;
                    Intrinsics.checkNotNullExpressionValue(followFollowingButton, "followFollowingButton");
                    zq.f.M(followFollowingButton);
                    MaterialButton unblockButton = ((n3) riaProfileActivity.w()).V;
                    Intrinsics.checkNotNullExpressionValue(unblockButton, "unblockButton");
                    zq.f.m0(unblockButton);
                } else {
                    RiaProfileViewModel riaProfileViewModel = (RiaProfileViewModel) riaProfileActivity.x();
                    String userId = ((RiaProfileViewModel) riaProfileActivity.x()).f8804x;
                    if (userId == null) {
                        userId = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    if (!Intrinsics.a(userId, riaProfileViewModel.f9081d.getCurrentUserId())) {
                        MaterialButton followFollowingButton2 = ((n3) riaProfileActivity.w()).A;
                        Intrinsics.checkNotNullExpressionValue(followFollowingButton2, "followFollowingButton");
                        zq.f.m0(followFollowingButton2);
                    }
                    MaterialButton unblockButton2 = ((n3) riaProfileActivity.w()).V;
                    Intrinsics.checkNotNullExpressionValue(unblockButton2, "unblockButton");
                    zq.f.M(unblockButton2);
                }
                if (z11) {
                    MaterialButton followFollowingButton3 = ((n3) riaProfileActivity.w()).A;
                    Intrinsics.checkNotNullExpressionValue(followFollowingButton3, "followFollowingButton");
                    zq.f.M(followFollowingButton3);
                    MaterialButton unblockButton3 = ((n3) riaProfileActivity.w()).V;
                    Intrinsics.checkNotNullExpressionValue(unblockButton3, "unblockButton");
                    zq.f.M(unblockButton3);
                }
                if (userBlockStatusDao != null && (iBlocked = userBlockStatusDao.getIBlocked()) != null) {
                    z12 = iBlocked.booleanValue();
                } else {
                    z12 = false;
                }
                if (userBlockStatusDao != null && (iAmBlocked = userBlockStatusDao.getIAmBlocked()) != null) {
                    z13 = iAmBlocked.booleanValue();
                } else {
                    z13 = false;
                }
                if (z12) {
                    ConstraintLayout blockParentLayout = ((n3) riaProfileActivity.w()).f5515t;
                    Intrinsics.checkNotNullExpressionValue(blockParentLayout, "blockParentLayout");
                    zq.f.m0(blockParentLayout);
                    ((n3) riaProfileActivity.w()).f5519x.setImageResource(R.drawable.ic_ria_i_blocked);
                    ((n3) riaProfileActivity.w()).f5518w.setText(riaProfileActivity.getString(R.string.unblock_this_account_to_see_their_profile));
                    ((n3) riaProfileActivity.w()).D.setNestedScrollingEnabled(false);
                    ComposeView composeViewRiaSocials = ((n3) riaProfileActivity.w()).f5517v;
                    Intrinsics.checkNotNullExpressionValue(composeViewRiaSocials, "composeViewRiaSocials");
                    zq.f.M(composeViewRiaSocials);
                    MenuItem menuItem = riaProfileActivity.f8793l;
                    if (menuItem != null) {
                        menuItem.setVisible(false);
                    } else {
                        Intrinsics.k("visibilityToggleBlockItem");
                        throw null;
                    }
                } else if (z13) {
                    ConstraintLayout blockParentLayout2 = ((n3) riaProfileActivity.w()).f5515t;
                    Intrinsics.checkNotNullExpressionValue(blockParentLayout2, "blockParentLayout");
                    zq.f.m0(blockParentLayout2);
                    ((n3) riaProfileActivity.w()).f5519x.setImageResource(R.drawable.ic_no_posts_v3);
                    ((n3) riaProfileActivity.w()).f5518w.setText(riaProfileActivity.getString(R.string.no_data_to_show));
                    ((n3) riaProfileActivity.w()).D.setNestedScrollingEnabled(false);
                    ComposeView composeViewRiaSocials2 = ((n3) riaProfileActivity.w()).f5517v;
                    Intrinsics.checkNotNullExpressionValue(composeViewRiaSocials2, "composeViewRiaSocials");
                    zq.f.M(composeViewRiaSocials2);
                    MenuItem menuItem2 = riaProfileActivity.f8793l;
                    if (menuItem2 != null) {
                        menuItem2.setVisible(false);
                    } else {
                        Intrinsics.k("visibilityToggleBlockItem");
                        throw null;
                    }
                } else {
                    ConstraintLayout blockParentLayout3 = ((n3) riaProfileActivity.w()).f5515t;
                    Intrinsics.checkNotNullExpressionValue(blockParentLayout3, "blockParentLayout");
                    zq.f.M(blockParentLayout3);
                    ((n3) riaProfileActivity.w()).D.setNestedScrollingEnabled(true);
                    ComposeView composeViewRiaSocials3 = ((n3) riaProfileActivity.w()).f5517v;
                    Intrinsics.checkNotNullExpressionValue(composeViewRiaSocials3, "composeViewRiaSocials");
                    zq.f.m0(composeViewRiaSocials3);
                    MenuItem menuItem3 = riaProfileActivity.f8793l;
                    if (menuItem3 != null) {
                        menuItem3.setVisible(true);
                    } else {
                        Intrinsics.k("visibilityToggleBlockItem");
                        throw null;
                    }
                }
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
