package zd;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.MessageListDto;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vt.i0;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupPinnedMessagesViewModel f42412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GroupPinnedMessagesViewModel groupPinnedMessagesViewModel, int i10) {
        super(1);
        this.f42411a = i10;
        this.f42412b = groupPinnedMessagesViewModel;
    }

    public final void a(MessageListDto messageListDto) {
        int i10 = this.f42411a;
        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = this.f42412b;
        switch (i10) {
            case 0:
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                e0 e0Var = groupPinnedMessagesViewModel.f9307r;
                e0Var.postValue(i0.f38321a);
                List<ChatMessage> messages = messageListDto.getMessages();
                if (messages != null) {
                    e0Var.postValue(messages);
                    return;
                }
                return;
            default:
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                List<ChatMessage> messages2 = messageListDto.getMessages();
                if (messages2 != null) {
                    groupPinnedMessagesViewModel.f9307r.postValue(messages2);
                    return;
                }
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f42411a;
        GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = this.f42412b;
        switch (i10) {
            case 1:
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
            default:
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 3:
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f42411a) {
            case 0:
                a((MessageListDto) obj);
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                a((MessageListDto) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
