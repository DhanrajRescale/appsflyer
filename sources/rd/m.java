package rd;

import android.content.Intent;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.compose.ChatMediaViewerActivity;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33634a;

    public /* synthetic */ m(GroupChatFragment groupChatFragment) {
        this.f33634a = groupChatFragment;
    }

    public void a(ChatMessage message, String imageType) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        GroupChatFragment groupChatFragment = this.f33634a;
        Intent intent = new Intent(groupChatFragment.requireContext(), (Class<?>) ChatMediaViewerActivity.class);
        intent.putExtra("CHAT_MESSAGE", message);
        groupChatFragment.f9149i.a(intent);
    }

    public void b(ChatMessage message, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this.f33634a.r();
        String messageId = message.getMessageId();
        boolean z11 = !z10;
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Group group = (Group) groupChatViewModel.D.getValue();
        if (group != null) {
            str = group.getGroupId();
        } else {
            str = null;
        }
        nt.h c10 = groupChatViewModel.f9176n.messageInteraction(messageId, z11, str).c(((kq.e) groupChatViewModel.f9079b).J());
        jt.d dVar = new jt.d(new j5.d(13), new q(21, z.f33668c));
        c10.a(dVar);
        groupChatViewModel.f9080c.c(dVar);
    }

    public void c(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        GroupChatFragment.I(this.f33634a, message.getSenderId(), message.getSenderName());
    }

    public void d(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        GroupChatFragment groupChatFragment = this.f33634a;
        Intent intent = new Intent(groupChatFragment.requireContext(), (Class<?>) ChatMediaViewerActivity.class);
        intent.putExtra("CHAT_MESSAGE", message);
        groupChatFragment.f9149i.a(intent);
    }

    public void e(ChatMessage message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        GroupChatFragment groupChatFragment = this.f33634a;
        Intent intent = new Intent(groupChatFragment.requireContext(), (Class<?>) MessageThreadInfoActivity.class);
        Group group = (Group) ((GroupChatViewModel) groupChatFragment.r()).D.getValue();
        if (group != null) {
            str = group.getGroupId();
        } else {
            str = null;
        }
        intent.putExtra("GROUP_CHAT_ID", str);
        intent.putExtra("MESSAGE_ID", message.getMessageId());
        groupChatFragment.startActivity(intent);
    }
}
