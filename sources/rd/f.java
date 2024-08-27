package rd;

import android.widget.PopupWindow;
import ba.wh;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33620b;

    public /* synthetic */ f(GroupChatFragment groupChatFragment, int i10) {
        this.f33619a = i10;
        this.f33620b = groupChatFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f33619a;
        GroupChatFragment this$0 = this.f33620b;
        switch (i10) {
            case 0:
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((wh) this$0.q()).f6533t.B.postDelayed(new f(this$0, 1), 500L);
                return;
            default:
                PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((wh) this$0.q()).f6533t.B.i0(0);
                return;
        }
    }
}
