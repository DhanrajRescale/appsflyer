package he;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import ba.kn;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamHostActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m.u3;
import vt.p0;
import yo.k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k, u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f18297a;

    public /* synthetic */ b(e eVar) {
        this.f18297a = eVar;
    }

    @Override // yo.k
    public final void j(yo.g tab, int i10) {
        int i11 = e.f18301m;
        e this$0 = this.f18297a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        View childAt = ((kn) this$0.q()).f5269s.A.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            linearLayout.setShowDividers(2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(r3.k.getColor(this$0.requireContext(), R.color.tabSeparatorColor));
            gradientDrawable.setSize(3, 1);
            linearLayout.setDividerPadding(35);
            linearLayout.setDividerDrawable(gradientDrawable);
        }
        SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
        int i12 = R.string.text_groups;
        if (i10 != 0) {
            if (i10 != 1 || !socialChatListViewModel.F) {
                i12 = R.string.text_social_chat;
            }
        } else if (socialChatListViewModel.F) {
            i12 = R.string.text_feed;
        }
        tab.b(this$0.getString(i12));
    }

    @Override // m.u3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10 = e.f18301m;
        e this$0 = this.f18297a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x(new AnalyticEvent("app_social_threedots_tapped", null, 2, null));
        switch (menuItem.getItemId()) {
            case R.id.menu_option_blocked_users /* 2131363372 */:
                Intrinsics.checkNotNullParameter("blocked_users", "option");
                this$0.x(new AnalyticEvent("app_social_threedots_options", p0.f(new Pair("options", "blocked_users"))));
                this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) BlockedUserListActivity.class));
                return true;
            case R.id.menu_option_saved_posts /* 2131363373 */:
                Intrinsics.checkNotNullParameter("saved_posts", "option");
                this$0.x(new AnalyticEvent("app_social_threedots_options", p0.f(new Pair("options", "saved_posts"))));
                Intent intent = new Intent(this$0.requireContext(), (Class<?>) FeedStreamHostActivity.class);
                intent.putExtras(hl.f.y(new Pair("FEED_STREAM_TYPE", "FEED_STREAM_SAVED"), new Pair("TOOLBAR_TITLE", "Saved Posts")));
                this$0.startActivity(intent);
                return true;
            default:
                return false;
        }
    }
}
