package ie;

import android.os.Bundle;
import android.widget.PopupWindow;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamComposeFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f19928m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19929n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d1 fragmentManager, androidx.lifecycle.o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f19928m = bundle;
        this.f19929n = bundle.getBoolean("IS_FEED_MAINTENANCE_ON", false);
    }

    @Override // k7.z0
    public final int a() {
        return 2;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        String str;
        boolean z10;
        Bundle bundle = this.f19928m;
        if (i10 == 0) {
            if (this.f19929n) {
                int i11 = qf.c.f31944h;
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("DATA", qf.b.f31930e);
                return de.d.m(bundle2);
            }
            if (bundle != null) {
                str = bundle.getString("GROUP_CHAT_ID");
            } else {
                str = null;
            }
            String str2 = str;
            if (bundle != null) {
                z10 = bundle.getBoolean("CALL_FROM_CHAT");
            } else {
                z10 = true;
            }
            boolean z11 = z10;
            int i12 = FeedStreamComposeFragment.f8829j;
            Bundle a10 = new sb.a("FEED_STREAM_GROUP", str2, null, null, z11, false).a();
            Bundle bundle3 = new Bundle();
            bundle3.putAll(a10);
            FeedStreamComposeFragment feedStreamComposeFragment = new FeedStreamComposeFragment();
            feedStreamComposeFragment.setArguments(bundle3);
            return feedStreamComposeFragment;
        }
        PopupWindow popupWindow = GroupChatFragment.f9146w;
        Bundle bundle4 = new Bundle();
        if (bundle != null) {
            bundle4.putAll(bundle);
        }
        GroupChatFragment groupChatFragment = new GroupChatFragment();
        groupChatFragment.setArguments(bundle4);
        return groupChatFragment;
    }
}
