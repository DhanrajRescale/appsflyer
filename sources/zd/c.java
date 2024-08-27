package zd;

import android.content.Intent;
import android.os.Bundle;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesActivity;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupPinnedMessagesActivity f42410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GroupPinnedMessagesActivity groupPinnedMessagesActivity, int i10) {
        super(1);
        this.f42409a = i10;
        this.f42410b = groupPinnedMessagesActivity;
    }

    public final void a(ChatMessage message) {
        int i10 = this.f42409a;
        GroupPinnedMessagesActivity groupPinnedMessagesActivity = this.f42410b;
        switch (i10) {
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                ((GroupPinnedMessagesViewModel) groupPinnedMessagesActivity.x()).f9304o = message;
                if (((GroupPinnedMessagesViewModel) groupPinnedMessagesActivity.x()).f9312w.equals("GROUP_PINNED_MESSAGES")) {
                    GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = (GroupPinnedMessagesViewModel) groupPinnedMessagesActivity.x();
                    if (groupPinnedMessagesViewModel.f9308s.contains(groupPinnedMessagesViewModel.f9311v)) {
                        groupPinnedMessagesActivity.K(true);
                        return;
                    }
                    return;
                }
                groupPinnedMessagesActivity.K(true);
                return;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                String senderId = message.getSenderId();
                String senderName = message.getSenderName();
                int i11 = GroupPinnedMessagesActivity.f9300m;
                String userId = ((GroupPinnedMessagesViewModel) groupPinnedMessagesActivity.x()).f9303n.getUserId();
                if (userId == null || !Intrinsics.a(userId, senderId)) {
                    ((GroupPinnedMessagesViewModel) groupPinnedMessagesActivity.x()).f9305p.postValue(new sj.d(senderName, HttpUrl.FRAGMENT_ENCODE_SET, senderId));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f42409a;
        GroupPinnedMessagesActivity groupPinnedMessagesActivity = this.f42410b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                h hVar = groupPinnedMessagesActivity.f9301k;
                if (hVar != null) {
                    hVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("pinnedMessagesAdapter");
                throw null;
            case 1:
                String str = (String) obj;
                h hVar2 = groupPinnedMessagesActivity.f9301k;
                if (hVar2 != null) {
                    List p10 = hVar2.p();
                    Intrinsics.checkNotNullExpressionValue(p10, "getCurrentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : p10) {
                        if (!Intrinsics.a(((ChatMessage) obj2).getMessageId(), str)) {
                            arrayList.add(obj2);
                        }
                    }
                    h hVar3 = groupPinnedMessagesActivity.f9301k;
                    if (hVar3 != null) {
                        hVar3.u(arrayList);
                        return Unit.f23355a;
                    }
                    Intrinsics.k("pinnedMessagesAdapter");
                    throw null;
                }
                Intrinsics.k("pinnedMessagesAdapter");
                throw null;
            case 2:
                sj.d dVar = (sj.d) obj;
                String str2 = dVar.f34663c;
                int i11 = GroupPinnedMessagesActivity.f9300m;
                groupPinnedMessagesActivity.getClass();
                Intent intent = new Intent(groupPinnedMessagesActivity, (Class<?>) UserProfileActivity.class);
                intent.putExtra("USER_IDENTIFIER", str2);
                intent.putExtra("CALL_FROM_CHAT", true);
                intent.putExtra("USER_NAME", dVar.f34661a);
                groupPinnedMessagesActivity.startActivity(intent);
                return Unit.f23355a;
            case 3:
                int i12 = xd.f.f40182k;
                Bundle bundle = new Bundle();
                xd.f fVar = new xd.f();
                fVar.setArguments(bundle);
                fVar.show(groupPinnedMessagesActivity.getSupportFragmentManager(), "MemberOptionsBottomSheetFragment");
                return Unit.f23355a;
            case 4:
                a((ChatMessage) obj);
                return Unit.f23355a;
            default:
                a((ChatMessage) obj);
                return Unit.f23355a;
        }
    }
}
