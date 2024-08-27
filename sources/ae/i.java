package ae;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.ox;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoListItemViewModel;
import com.assetgro.stockgro.ui.chat.utils.MediaPlayerActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import hv.q;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        super(1);
        this.f391a = i10;
        this.f392b = jVar;
    }

    public final void a(String url) {
        int i10 = this.f391a;
        j jVar = this.f392b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(url, "url");
                Context context = jVar.f22629a.getContext();
                if (context != null) {
                    Intent intent = new Intent(context, (Class<?>) MediaPlayerActivity.class);
                    intent.putExtra("url", url);
                    context.startActivity(intent);
                    return;
                }
                return;
            default:
                ((ox) jVar.f17291u).f5702t.setText(url);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f391a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            default:
                ChatMessage chatMessage = (ChatMessage) obj;
                j jVar = this.f392b;
                ((ox) jVar.f17291u).getClass();
                Intrinsics.c(chatMessage);
                ox oxVar = (ox) jVar.f17291u;
                int i10 = 0;
                oxVar.f5706x.setVisibility(0);
                ImageView imageGroupChatProfile = oxVar.f5703u;
                Intrinsics.checkNotNullExpressionValue(imageGroupChatProfile, "imageGroupChatProfile");
                zq.f.X(imageGroupChatProfile, chatMessage.getSenderPicture(), R.drawable.ic_placeholder_user);
                if (jVar.A != null) {
                    ConstraintLayout layoutChatMessage = oxVar.f5705w;
                    Intrinsics.checkNotNullExpressionValue(layoutChatMessage, "layoutChatMessage");
                    ImageView ivChevron = oxVar.f5704v;
                    Intrinsics.checkNotNullExpressionValue(ivChevron, "ivChevron");
                    ue.h.i(chatMessage, layoutChatMessage, R.drawable.background_chat_message_other_rounded, ivChevron);
                    if (jVar.A != null) {
                        TextView textGroupChatTime = oxVar.f5707y;
                        Intrinsics.checkNotNullExpressionValue(textGroupChatTime, "textGroupChatTime");
                        ue.h.l(chatMessage, textGroupChatTime, R.drawable.rounded_color_primary_rectangle_corner_radius_8dp);
                        ue.h hVar = jVar.A;
                        if (hVar != null) {
                            String currentUserId = ((MessageThreadInfoListItemViewModel) jVar.v()).f9319g.getCurrentUserId();
                            View view = jVar.f22629a;
                            Intrinsics.c(view);
                            hVar.h(chatMessage, view, g.f387a, new h(chatMessage, jVar), new i(jVar, i10), new h(jVar, chatMessage), e.f381c, currentUserId, true);
                            Long serverTime = chatMessage.getServerTime();
                            if (serverTime != null) {
                                String a10 = jv.a.b("dd MMM | HH:mm").a(hv.g.v(hv.e.n(serverTime.longValue() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), q.p()));
                                Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                                textGroupChatTime.setText(a10);
                            }
                            return Unit.f23355a;
                        }
                        Intrinsics.k("chatMessageViewManager");
                        throw null;
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                Intrinsics.k("chatMessageViewManager");
                throw null;
        }
    }
}
