package rd;

import androidx.compose.ui.platform.ComposeView;
import ba.wh;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(GroupChatFragment groupChatFragment, int i10) {
        super(0);
        this.f33628a = i10;
        this.f33629b = groupChatFragment;
    }

    public final void a() {
        String friendUserId;
        int i10 = this.f33628a;
        GroupChatFragment groupChatFragment = this.f33629b;
        switch (i10) {
            case 0:
                Group group = (Group) ((GroupChatViewModel) groupChatFragment.r()).D.getValue();
                if (group != null && (friendUserId = group.getFriendUserId()) != null) {
                    ((GroupChatViewModel) groupChatFragment.r()).v(friendUserId);
                    return;
                }
                return;
            case 1:
                ComposeView reportedText = ((wh) groupChatFragment.q()).f6533t.C;
                Intrinsics.checkNotNullExpressionValue(reportedText, "reportedText");
                zq.f.M(reportedText);
                return;
            case 2:
                ((GroupChatViewModel) groupChatFragment.r()).v(((GroupChatViewModel) groupChatFragment.r()).B0);
                return;
            case 3:
                ComposeView reportedText2 = ((wh) groupChatFragment.q()).f6533t.C;
                Intrinsics.checkNotNullExpressionValue(reportedText2, "reportedText");
                zq.f.M(reportedText2);
                return;
            case 4:
                ((wh) groupChatFragment.q()).f6533t.D.setVisibility(8);
                return;
            case 5:
                ((wh) groupChatFragment.q()).f6533t.D.setVisibility(0);
                return;
            case 6:
                ((GroupChatViewModel) groupChatFragment.r()).j();
                return;
            case 7:
                ((GroupChatViewModel) groupChatFragment.r()).j();
                return;
            default:
                ((GroupChatViewModel) groupChatFragment.r()).j();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f33628a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
