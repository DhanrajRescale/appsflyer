package rd;

import android.app.Dialog;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.j0;
import ba.wh;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.social.auth.SocialAuthActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements qj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33633b;

    public /* synthetic */ l(GroupChatFragment groupChatFragment, int i10) {
        this.f33632a = i10;
        this.f33633b = groupChatFragment;
    }

    @Override // qj.m
    public final void e(Dialog dialog) {
        switch (this.f33632a) {
            case 0:
            case 1:
                return;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                }
                GroupChatFragment groupChatFragment = this.f33633b;
                if (groupChatFragment.f9153m) {
                    LeagueSharedViewModel leagueSharedViewModel = groupChatFragment.f9147g;
                    if (leagueSharedViewModel != null) {
                        leagueSharedViewModel.f9064o.postValue(Boolean.TRUE);
                        return;
                    } else {
                        Intrinsics.k("leagueSharedViewModel");
                        throw null;
                    }
                }
                j0 activity = groupChatFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void m(Dialog dialog) {
        int i10 = this.f33632a;
        int i11 = 1;
        GroupChatFragment groupChatFragment = this.f33633b;
        switch (i10) {
            case 0:
                ComposeView reportedText = ((wh) groupChatFragment.q()).f6533t.C;
                Intrinsics.checkNotNullExpressionValue(reportedText, "reportedText");
                zq.f.m0(reportedText);
                ComposeView composeView = ((wh) groupChatFragment.q()).f6533t.C;
                k kVar = new k(groupChatFragment, i11);
                Object obj = b1.d.f3079a;
                composeView.setContent(new b1.c(kVar, true, -253763600));
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                ComposeView reportedText2 = ((wh) groupChatFragment.q()).f6533t.C;
                Intrinsics.checkNotNullExpressionValue(reportedText2, "reportedText");
                zq.f.m0(reportedText2);
                ComposeView composeView2 = ((wh) groupChatFragment.q()).f6533t.C;
                k kVar2 = new k(groupChatFragment, 3);
                Object obj2 = b1.d.f3079a;
                composeView2.setContent(new b1.c(kVar2, true, -1364596143));
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                }
                groupChatFragment.f9148h.a(new Intent(groupChatFragment.requireContext(), (Class<?>) SocialAuthActivity.class));
                return;
        }
    }

    @Override // qj.m
    public final void o() {
    }
}
