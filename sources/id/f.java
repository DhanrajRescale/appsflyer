package id;

import android.content.Context;
import android.content.Intent;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.message_invites.MessageInvitesActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f19853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(0);
        this.f19852a = i10;
        this.f19853b = gVar;
    }

    public final void a() {
        int i10 = this.f19852a;
        g gVar = this.f19853b;
        switch (i10) {
            case 0:
                ((SocialChatListViewModel) gVar.r()).o(new m(true));
                return;
            case 1:
                int i11 = MessageInvitesActivity.f9420l;
                Context context = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                gVar.startActivity(new Intent(context, (Class<?>) MessageInvitesActivity.class));
                return;
            default:
                ((SocialChatListViewModel) gVar.r()).o(new m(true));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f19852a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
