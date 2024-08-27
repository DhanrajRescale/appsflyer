package id;

import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tu.k1;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(SocialChatListViewModel socialChatListViewModel, int i10) {
        super(0);
        this.f19890a = i10;
        this.f19891b = socialChatListViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Object value;
        int i10 = this.f19890a;
        SocialChatListViewModel socialChatListViewModel = this.f19891b;
        switch (i10) {
            case 0:
                return new ue.l(socialChatListViewModel.f9092o);
            default:
                k1 k1Var = socialChatListViewModel.L;
                if (!((o) k1Var.getValue()).f19868a && !socialChatListViewModel.D) {
                    int i11 = ((o) k1Var.getValue()).f19870c + ((o) k1Var.getValue()).f19871d;
                    do {
                        value = k1Var.getValue();
                    } while (!k1Var.l(value, o.a((o) value, false, 0, i11, 0, null, false, false, 123)));
                    socialChatListViewModel.i();
                }
                return Unit.f23355a;
        }
    }
}
