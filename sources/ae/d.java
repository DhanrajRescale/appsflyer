package ae;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.m2;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.utils.MediaPlayerActivity;
import com.assetgro.stockgro.ui.chat.utils.PhotoViewerActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import hk.l;
import hv.q;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import ue.o;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageThreadInfoActivity f379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MessageThreadInfoActivity messageThreadInfoActivity, int i10) {
        super(1);
        this.f378a = i10;
        this.f379b = messageThreadInfoActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [hk.d, java.lang.Object] */
    public final void a(ChatMessage it) {
        int i10 = 1;
        int i11 = this.f378a;
        int i12 = 0;
        MessageThreadInfoActivity context = this.f379b;
        switch (i11) {
            case 5:
                ((GroupChatViewModel) context.x()).A.remove(it);
                f fVar = context.f9317k;
                if (fVar != null) {
                    fVar.u(((GroupChatViewModel) context.x()).A);
                    ((GroupChatViewModel) context.x()).F0.postValue(Integer.valueOf(((GroupChatViewModel) context.x()).A.size()));
                    f fVar2 = context.f9317k;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    } else {
                        Intrinsics.k("messageThreadInfoAdapter");
                        throw null;
                    }
                }
                Intrinsics.k("messageThreadInfoAdapter");
                throw null;
            case 6:
                ((GroupChatViewModel) context.x()).I0.postValue(Boolean.TRUE);
                return;
            case 7:
                int i13 = MessageThreadInfoActivity.f9316m;
                context.getClass();
                if (it != null) {
                    String senderPicture = it.getSenderPicture();
                    ImageView imageView = ((m2) context.w()).C;
                    Intrinsics.checkNotNullExpressionValue(imageView, "parentMessageSenderImage");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(imageView, "imageView");
                    nk.e eVar = (nk.e) new nk.a().r(l.f18542c, new Object());
                    eVar.getClass();
                    nk.a o10 = eVar.o(jk.i.f21456b, Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(o10, "dontAnimate(...)");
                    com.bumptech.glide.g w10 = com.bumptech.glide.b.c(context).d(context).j().w((nk.e) o10);
                    w10.F = senderPicture;
                    w10.J = true;
                    ((com.bumptech.glide.g) w10.l(R.drawable.ic_placeholder_user)).A(new o(imageView, context));
                    ((m2) context.w()).D.setText(it.getSenderName());
                    Long serverTime = it.getServerTime();
                    if (serverTime != null) {
                        long longValue = serverTime.longValue();
                        m2 m2Var = (m2) context.w();
                        String a10 = jv.a.b("dd MMM | HH:mm").a(hv.g.v(hv.e.n(longValue / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), q.p()));
                        Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                        m2Var.A.setText(a10);
                    }
                    Long serverTime2 = it.getServerTime();
                    if (serverTime2 != null) {
                        long longValue2 = serverTime2.longValue();
                        m2 m2Var2 = (m2) context.w();
                        String a11 = jv.a.b("HH:mm").a(hv.g.v(hv.e.n(longValue2 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), q.p()));
                        Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
                        m2Var2.A.setText(a11);
                    }
                    if (context.f9318l != null) {
                        ConstraintLayout layoutChatMessage = ((m2) context.w()).f5427v;
                        Intrinsics.checkNotNullExpressionValue(layoutChatMessage, "layoutChatMessage");
                        ImageView ivChevron = ((m2) context.w()).f5426u;
                        Intrinsics.checkNotNullExpressionValue(ivChevron, "ivChevron");
                        ue.h.i(it, layoutChatMessage, R.drawable.background_chat_message_other_rounded, ivChevron);
                        ue.h hVar = context.f9318l;
                        if (hVar != null) {
                            View view = ((m2) context.w()).f27491e;
                            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                            hVar.h(it, view, new androidx.compose.foundation.layout.e(context, 29), new d(context, i12), new d(context, i10), new zd.g(i10, context, it), e.f380b, ((GroupChatViewModel) context.x()).f9176n.getUserId(), true);
                            return;
                        }
                        Intrinsics.k("chatMessageViewManager");
                        throw null;
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                return;
            case 11:
                ((GroupChatViewModel) context.x()).A.add(it);
                f fVar3 = context.f9317k;
                if (fVar3 != null) {
                    fVar3.u(((GroupChatViewModel) context.x()).A);
                    int size = ((GroupChatViewModel) context.x()).A.size();
                    if (size > 0) {
                        f fVar4 = context.f9317k;
                        if (fVar4 != null) {
                            fVar4.f22651a.e(size - 1, 1);
                            context.runOnUiThread(new androidx.activity.b(context, 26));
                        } else {
                            Intrinsics.k("messageThreadInfoAdapter");
                            throw null;
                        }
                    }
                    ((GroupChatViewModel) context.x()).F0.postValue(Integer.valueOf(size));
                    return;
                }
                Intrinsics.k("messageThreadInfoAdapter");
                throw null;
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                String userId = ((GroupChatViewModel) context.x()).f9176n.getUserId();
                if (userId != null && s.j(it.getSenderId(), userId, false)) {
                    ((GroupChatViewModel) context.x()).G0.postValue(it);
                    return;
                }
                return;
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                String senderId = it.getSenderId();
                String senderName = it.getSenderName();
                int i14 = MessageThreadInfoActivity.f9316m;
                context.L(senderId, senderName);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                MessageThreadInfoActivity.K(context, it);
                return;
        }
    }

    public final void d(Group group) {
        int i10;
        int i11 = this.f378a;
        MessageThreadInfoActivity messageThreadInfoActivity = this.f379b;
        switch (i11) {
            case 4:
                ((GroupChatViewModel) messageThreadInfoActivity.x()).D();
                boolean isOpenForAudience = group.getIsOpenForAudience();
                int i12 = 0;
                if (((GroupChatViewModel) messageThreadInfoActivity.x()).w()) {
                    ((m2) messageThreadInfoActivity.w()).f5431z.setVisibility(8);
                    ((m2) messageThreadInfoActivity.w()).f5429x.f27491e.setVisibility(0);
                    return;
                }
                m2 m2Var = (m2) messageThreadInfoActivity.w();
                if (isOpenForAudience) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                m2Var.f5431z.setVisibility(i10);
                View view = ((m2) messageThreadInfoActivity.w()).f5429x.f27491e;
                if (!isOpenForAudience) {
                    i12 = 8;
                }
                view.setVisibility(i12);
                return;
            default:
                Intrinsics.c(group);
                messageThreadInfoActivity.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intent intent = new Intent(messageThreadInfoActivity, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                messageThreadInfoActivity.startActivity(intent);
                return;
        }
    }

    public final void e(Boolean bool) {
        int i10 = this.f378a;
        MessageThreadInfoActivity messageThreadInfoActivity = this.f379b;
        switch (i10) {
            case 2:
                ((GroupChatViewModel) messageThreadInfoActivity.x()).Q.clear();
                ((m2) messageThreadInfoActivity.w()).f5429x.f4649v.f10752a.clear();
                return;
            case 13:
                int i11 = xd.f.f40182k;
                Bundle bundle = new Bundle();
                xd.f fVar = new xd.f();
                fVar.setArguments(bundle);
                fVar.show(messageThreadInfoActivity.getSupportFragmentManager(), "MemberOptionsBottomSheetFragment");
                return;
            default:
                int i12 = b.f373k;
                Bundle bundle2 = new Bundle();
                b bVar = new b();
                bVar.setArguments(bundle2);
                bVar.show(messageThreadInfoActivity.getSupportFragmentManager(), "MessageOptionsBottomSheetFragment");
                return;
        }
    }

    public final void f(String url) {
        int i10 = this.f378a;
        MessageThreadInfoActivity messageThreadInfoActivity = this.f379b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(url, "url");
                Intent intent = new Intent(messageThreadInfoActivity, (Class<?>) PhotoViewerActivity.class);
                intent.putExtra("url", url);
                intent.putExtra("type", "image");
                messageThreadInfoActivity.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(url, "url");
                Intent intent2 = new Intent(messageThreadInfoActivity, (Class<?>) MediaPlayerActivity.class);
                intent2.putExtra("url", url);
                messageThreadInfoActivity.startActivity(intent2);
                return;
        }
    }

    public final void i(List list) {
        int i10 = this.f378a;
        MessageThreadInfoActivity messageThreadInfoActivity = this.f379b;
        switch (i10) {
            case 3:
                Intrinsics.c(list);
                int i11 = MessageThreadInfoActivity.f9316m;
                ArrayList<sj.d> m10 = GroupChatViewModel.m(list);
                if (!m10.isEmpty()) {
                    ((m2) messageThreadInfoActivity.w()).f5429x.f4649v.setInputList(m10);
                    return;
                }
                return;
            default:
                f fVar = messageThreadInfoActivity.f9317k;
                if (fVar != null) {
                    fVar.u(list);
                    return;
                } else {
                    Intrinsics.k("messageThreadInfoAdapter");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StringBuilder sb2;
        String str;
        int i10 = this.f378a;
        MessageThreadInfoActivity messageThreadInfoActivity = this.f379b;
        switch (i10) {
            case 0:
                f((String) obj);
                return Unit.f23355a;
            case 1:
                f((String) obj);
                return Unit.f23355a;
            case 2:
                e((Boolean) obj);
                return Unit.f23355a;
            case 3:
                i((List) obj);
                return Unit.f23355a;
            case 4:
                d((Group) obj);
                return Unit.f23355a;
            case 5:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 6:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 7:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 8:
                i((List) obj);
                return Unit.f23355a;
            case 9:
                Integer num = (Integer) obj;
                Intrinsics.c(num);
                if (num.intValue() > 1) {
                    sb2 = new StringBuilder();
                    sb2.append(num);
                    str = " Replies";
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(num);
                    str = " Reply";
                }
                sb2.append(str);
                ((m2) messageThreadInfoActivity.w()).B.setText(sb2.toString());
                return Unit.f23355a;
            case 10:
                d((Group) obj);
                return Unit.f23355a;
            case 11:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 12:
                sj.d dVar = (sj.d) obj;
                String str2 = dVar.f34663c;
                int i11 = MessageThreadInfoActivity.f9316m;
                messageThreadInfoActivity.getClass();
                Intent intent = new Intent(messageThreadInfoActivity, (Class<?>) UserProfileActivity.class);
                intent.putExtra("USER_IDENTIFIER", str2);
                intent.putExtra("CALL_FROM_CHAT", true);
                intent.putExtra("USER_NAME", dVar.f34661a);
                messageThreadInfoActivity.startActivity(intent);
                return Unit.f23355a;
            case 13:
                e((Boolean) obj);
                return Unit.f23355a;
            case 14:
                e((Boolean) obj);
                return Unit.f23355a;
            case 15:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 16:
                a((ChatMessage) obj);
                return Unit.f23355a;
            default:
                a((ChatMessage) obj);
                return Unit.f23355a;
        }
    }
}
