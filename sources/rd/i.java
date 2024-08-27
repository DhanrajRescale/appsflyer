package rd;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.j0;
import androidx.work.h0;
import ba.jr;
import ba.wh;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.MessageInteraction;
import com.assetgro.stockgro.data.model.ThreadInfo;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.data.uimodel.StickerData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.social.domain.model.ChatMetaData;
import com.assetgro.stockgro.widget.mentionable_edit_text.CustomEditText;
import d2.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.g0;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(GroupChatFragment groupChatFragment, int i10) {
        super(1);
        this.f33626a = i10;
        this.f33627b = groupChatFragment;
    }

    public final void a(ChatMessage newMessage) {
        String str;
        ChatMessage latestMessage;
        Media media;
        String str2;
        ChatMessage latestMessage2;
        String str3;
        int i10 = this.f33626a;
        int i11 = 0;
        GroupChatFragment groupChatFragment = this.f33627b;
        ChatMessage parentMessage = null;
        switch (i10) {
            case 5:
                yd.r rVar = groupChatFragment.f9157q;
                if (rVar != null) {
                    Intrinsics.c(newMessage);
                    Intrinsics.checkNotNullParameter(newMessage, "newMessage");
                    Iterator it = rVar.f41586e.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            ChatMessage chatMessage = (ChatMessage) next;
                            if (Intrinsics.a(chatMessage.getMessageId(), newMessage.getMessageId())) {
                                Media media2 = chatMessage.getMedia();
                                if (media2 != null) {
                                    Media media3 = newMessage.getMedia();
                                    if (media3 != null) {
                                        str3 = media3.getUrl();
                                    } else {
                                        str3 = null;
                                    }
                                    media2.setUrl(str3);
                                }
                                rVar.e(i11);
                            }
                            ThreadInfo threadInfo = chatMessage.getThreadInfo();
                            if (threadInfo != null && (latestMessage2 = threadInfo.getLatestMessage()) != null) {
                                str = latestMessage2.getMessageId();
                            } else {
                                str = null;
                            }
                            if (Intrinsics.a(str, newMessage.getMessageId())) {
                                ThreadInfo threadInfo2 = chatMessage.getThreadInfo();
                                if (threadInfo2 != null && (latestMessage = threadInfo2.getLatestMessage()) != null && (media = latestMessage.getMedia()) != null) {
                                    Media media4 = newMessage.getMedia();
                                    if (media4 != null) {
                                        str2 = media4.getUrl();
                                    } else {
                                        str2 = null;
                                    }
                                    media.setUrl(str2);
                                }
                                rVar.e(i11);
                            }
                            i11 = i12;
                        } else {
                            vt.y.j();
                            throw null;
                        }
                    }
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 10:
                yd.r rVar2 = groupChatFragment.f9157q;
                if (rVar2 != null) {
                    Intrinsics.c(newMessage);
                    Intrinsics.checkNotNullParameter(newMessage, "message");
                    try {
                        String parentMessageId = newMessage.getParentMessageId();
                        if (parentMessageId != null) {
                            Iterator it2 = rVar2.f41586e.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (Intrinsics.a(((ChatMessage) next2).getMessageId(), parentMessageId)) {
                                    parentMessage = (ChatMessage) next2;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    if (parentMessage != null) {
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) groupChatFragment.r();
                        Intrinsics.checkNotNullParameter(parentMessage, "parentMessage");
                        Intrinsics.checkNotNullParameter(newMessage, "childMessage");
                        HashSet hashSet = groupChatViewModel.f9188t0;
                        if (!hashSet.contains(newMessage.getMessageId())) {
                            hashSet.add(newMessage.getMessageId());
                            ThreadInfo threadInfo3 = parentMessage.getThreadInfo();
                            if (threadInfo3 != null) {
                                threadInfo3.setLatestMessage(newMessage);
                                threadInfo3.setNoOfReplies(threadInfo3.getNoOfReplies() + 1);
                            } else {
                                parentMessage.setThreadInfo(new ThreadInfo(newMessage, 1));
                            }
                            groupChatViewModel.J.postValue(parentMessage);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            default:
                yd.r rVar3 = groupChatFragment.f9157q;
                if (rVar3 != null) {
                    Intrinsics.c(newMessage);
                    Intrinsics.checkNotNullParameter(newMessage, "editedMessage");
                    ArrayList arrayList = rVar3.f41586e;
                    Iterator it3 = arrayList.iterator();
                    int i13 = -1;
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        int i14 = i11 + 1;
                        if (i11 >= 0) {
                            if (Intrinsics.a(((ChatMessage) next3).getMessageId(), newMessage.getMessageId())) {
                                i13 = i11;
                            }
                            i11 = i14;
                        } else {
                            vt.y.j();
                            throw null;
                        }
                    }
                    if (i13 != -1) {
                        arrayList.set(i13, newMessage);
                        rVar3.e(i13);
                        return;
                    }
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [qj.b, java.lang.Object] */
    public final void d(Boolean bool) {
        String str;
        int i10 = this.f33626a;
        int i11 = 4;
        GroupChatFragment groupChatFragment = this.f33627b;
        switch (i10) {
            case 3:
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                groupChatFragment.O();
                return;
            case 6:
                j0 activity = groupChatFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            case 12:
                int i12 = vd.v.f38018k;
                Bundle bundle = new Bundle();
                vd.v vVar = new vd.v();
                vVar.setArguments(bundle);
                vVar.show(groupChatFragment.getChildFragmentManager(), "MemberMenuOptionsBottomSheetFragment");
                return;
            case 13:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    jr jrVar = ((wh) groupChatFragment.q()).f6533t;
                    View view = jrVar.f5175y.f27491e;
                    Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                    zq.f.M(view);
                    ComposeView blockedText = jrVar.f5170t;
                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                    zq.f.m0(blockedText);
                    k kVar = new k(groupChatFragment, i11);
                    Object obj = b1.d.f3079a;
                    blockedText.setContent(new b1.c(kVar, true, -107268089));
                    return;
                }
                View view2 = ((wh) groupChatFragment.q()).f6533t.f5175y.f27491e;
                Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                zq.f.m0(view2);
                ComposeView blockedText2 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                Intrinsics.checkNotNullExpressionValue(blockedText2, "blockedText");
                zq.f.M(blockedText2);
                return;
            case 14:
                ((GroupChatViewModel) groupChatFragment.r()).Q.clear();
                ((wh) groupChatFragment.q()).f6533t.f5175y.f4649v.f10752a.clear();
                return;
            case 20:
                PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                ?? obj2 = new Object();
                Context requireContext = groupChatFragment.requireContext();
                String string = groupChatFragment.getString(R.string.text_social_auth);
                String string2 = groupChatFragment.getString(R.string.text_verification_required);
                String string3 = groupChatFragment.getString(R.string.text_get_verified);
                String string4 = groupChatFragment.getString(R.string.cancel);
                l lVar = new l(groupChatFragment, 2);
                Intrinsics.c(requireContext);
                Intrinsics.c(string);
                Intrinsics.c(string3);
                Intrinsics.c(string4);
                Intrinsics.c(string2);
                qj.b.b(obj2, requireContext, string, string3, string4, string2, null, false, 0, 0, lVar, 65488);
                return;
            case 22:
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) groupChatFragment.r();
                groupChatViewModel.f9177o.b(((GroupChatViewModel) groupChatFragment.r()).f9187t).observe(groupChatFragment, new id.a(4, new i(groupChatFragment, 21)));
                return;
            default:
                Intent intent = new Intent(groupChatFragment.requireContext(), (Class<?>) ReportEntityActivity.class);
                intent.putExtra("REPORT_USER_NAME", ((GroupChatViewModel) groupChatFragment.r()).p());
                Group group = (Group) ((GroupChatViewModel) groupChatFragment.r()).D.getValue();
                if (group != null) {
                    str = group.getFriendUserId();
                } else {
                    str = null;
                }
                intent.putExtra("ENTITY_ID_TO_BE_REPORTED", str);
                intent.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.User);
                intent.putExtra("IS_BLOCKED", Intrinsics.a(groupChatFragment.L().f9138s.getValue(), Boolean.TRUE));
                groupChatFragment.f9151k.a(intent);
                return;
        }
    }

    public final void e(String text) {
        int i10 = this.f33626a;
        GroupChatFragment groupChatFragment = this.f33627b;
        switch (i10) {
            case 15:
                Context context = groupChatFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
            case 19:
                Intrinsics.c(text);
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                groupChatFragment.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", text);
                intent.putExtra("android.intent.extra.TEXT", text);
                groupChatFragment.startActivity(Intent.createChooser(intent, groupChatFragment.getString(R.string.game_start_invite_friends_title)));
                return;
            default:
                String str = ((GroupChatViewModel) groupChatFragment.r()).f9196x0;
                if (str != null) {
                    ((GroupChatViewModel) groupChatFragment.r()).n(str);
                    return;
                }
                return;
        }
    }

    public final void f(List messageList) {
        int i10 = this.f33626a;
        GroupChatFragment groupChatFragment = this.f33627b;
        switch (i10) {
            case 4:
                Intrinsics.c(messageList);
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                ArrayList<sj.d> m10 = GroupChatViewModel.m(messageList);
                if (!m10.isEmpty()) {
                    ((wh) groupChatFragment.q()).f6533t.f5175y.f4649v.setInputList(m10);
                    return;
                }
                return;
            case 8:
                if (messageList.isEmpty()) {
                    ((wh) groupChatFragment.q()).f6533t.A.setVisibility(8);
                    return;
                }
                ((wh) groupChatFragment.q()).f6533t.A.setVisibility(0);
                TextView textView = ((wh) groupChatFragment.q()).f6533t.f5171u;
                String string = groupChatFragment.getString(R.string.pinned_messages_label);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(messageList.size())}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView.setText(format);
                return;
            default:
                yd.r rVar = groupChatFragment.f9157q;
                if (rVar != null) {
                    Intrinsics.c(messageList);
                    Intrinsics.checkNotNullParameter(messageList, "messageList");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = messageList.iterator();
                    while (it.hasNext()) {
                        ChatMessage chatMessage = (ChatMessage) it.next();
                        ArrayList arrayList2 = rVar.f41586e;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                break;
                            }
                            if (Intrinsics.a(((ChatMessage) arrayList2.get(i11)).getMessageId(), chatMessage.getMessageId())) {
                                arrayList2.remove(chatMessage);
                                arrayList.add(Integer.valueOf(i11));
                            } else {
                                i11++;
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Integer num = (Integer) it2.next();
                        Intrinsics.c(num);
                        rVar.f22651a.f(num.intValue(), 1);
                    }
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
        }
    }

    public final void i(kj.j jVar) {
        Object obj;
        int i10 = this.f33626a;
        int i11 = 0;
        GroupChatFragment groupChatFragment = this.f33627b;
        switch (i10) {
            case 24:
                ChatMessage chatMessage = (ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0);
                groupChatFragment.P(chatMessage, ((GroupChatViewModel) groupChatFragment.r()).f9183r);
                GroupChatFragment.H(groupChatFragment, chatMessage.getSenderId(), "reply");
                groupChatFragment.O();
                return;
            case 25:
            default:
                groupChatFragment.P((ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0), ((GroupChatViewModel) groupChatFragment.r()).f9181q);
                groupChatFragment.O();
                return;
            case 26:
                ChatMessage chatMessage2 = (ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0);
                if (chatMessage2.getMessageInteraction() != null) {
                    MessageInteraction messageInteraction = chatMessage2.getMessageInteraction();
                    if (messageInteraction != null) {
                        boolean isPinned = true ^ messageInteraction.getIsPinned();
                        ((GroupChatViewModel) groupChatFragment.r()).C(chatMessage2.getGroupId(), chatMessage2.getMessageId(), isPinned);
                        yd.r rVar = groupChatFragment.f9157q;
                        if (rVar != null) {
                            rVar.q(chatMessage2, isPinned);
                        } else {
                            Intrinsics.k("messagesAdapter");
                            throw null;
                        }
                    }
                } else {
                    ((GroupChatViewModel) groupChatFragment.r()).C(chatMessage2.getGroupId(), chatMessage2.getMessageId(), true);
                    yd.r rVar2 = groupChatFragment.f9157q;
                    if (rVar2 != null) {
                        rVar2.q(chatMessage2, true);
                    } else {
                        Intrinsics.k("messagesAdapter");
                        throw null;
                    }
                }
                GroupChatFragment.H(groupChatFragment, chatMessage2.getSenderId(), "star");
                groupChatFragment.O();
                return;
            case 27:
                ChatMessage chatMessage3 = (ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0);
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) groupChatFragment.r();
                String senderId = chatMessage3.getSenderId();
                String groupId = chatMessage3.getGroupId();
                String messageId = chatMessage3.getMessageId();
                boolean z10 = !chatMessage3.isPinned();
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                groupChatViewModel.f9084g.postValue(Boolean.TRUE);
                nt.h c10 = groupChatViewModel.f9176n.pinMessageToGroup(senderId, groupId, messageId, Boolean.valueOf(z10)).c(((kq.e) groupChatViewModel.f9079b).J());
                jt.d dVar = new jt.d(new q(4, new y0(28, groupChatViewModel, groupId)), new q(5, new r(groupChatViewModel, 20)));
                c10.a(dVar);
                groupChatViewModel.f9080c.c(dVar);
                yd.r rVar3 = groupChatFragment.f9157q;
                if (rVar3 != null) {
                    boolean z11 = !chatMessage3.isPinned();
                    Intrinsics.checkNotNullParameter(chatMessage3, "chatMessage");
                    Iterator it = rVar3.f41586e.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            ChatMessage chatMessage4 = (ChatMessage) next;
                            if (Intrinsics.a(chatMessage4.getMessageId(), chatMessage3.getMessageId())) {
                                chatMessage4.setPinned(z11);
                                rVar3.e(i11);
                            }
                            i11 = i12;
                        } else {
                            vt.y.j();
                            throw null;
                        }
                    }
                    GroupChatFragment.H(groupChatFragment, chatMessage3.getSenderId(), "pin");
                    groupChatFragment.O();
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 28:
                ChatMessage chatMessage5 = (ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0);
                String message = chatMessage5.getMessage();
                j0 activity = groupChatFragment.getActivity();
                if (activity != null) {
                    obj = activity.getSystemService("clipboard");
                } else {
                    obj = null;
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", message));
                GroupChatFragment.H(groupChatFragment, chatMessage5.getSenderId(), "copy");
                groupChatFragment.O();
                Context context = groupChatFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                String text = groupChatFragment.getString(R.string.text_message_copied);
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String type;
        ArrayList<ChatMessage> messages;
        List message;
        Media media;
        int i10 = this.f33626a;
        boolean z10 = false;
        Group group = null;
        GroupChatFragment groupChatFragment = this.f33627b;
        switch (i10) {
            case 0:
                ((Boolean) obj).booleanValue();
                groupChatFragment.K();
                return Unit.f23355a;
            case 1:
                StickerData stickerData = (StickerData) obj;
                Intrinsics.checkNotNullParameter(stickerData, "stickerData");
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) groupChatFragment.r();
                Context context = groupChatFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(stickerData, "stickerData");
                Intrinsics.checkNotNullParameter(context, "context");
                com.bumptech.glide.g j10 = com.bumptech.glide.b.c(context).d(context).j();
                j10.F = stickerData.getUrl();
                j10.J = true;
                j10.A(new c0(groupChatViewModel, stickerData));
                return Unit.f23355a;
            case 2:
                ChatMetaData chatMetaData = (ChatMetaData) obj;
                if (chatMetaData != null && (messages = chatMetaData.getMessages()) != null && (message = g0.R(messages)) != null && (true ^ message.isEmpty())) {
                    yd.r rVar = groupChatFragment.f9157q;
                    if (rVar != null) {
                        rVar.f41586e.clear();
                        rVar.d();
                        yd.r rVar2 = groupChatFragment.f9157q;
                        if (rVar2 != null) {
                            Intrinsics.checkNotNullParameter(message, "message");
                            rVar2.f41586e.addAll(message);
                            rVar2.d();
                        } else {
                            Intrinsics.k("messagesAdapter");
                            throw null;
                        }
                    } else {
                        Intrinsics.k("messagesAdapter");
                        throw null;
                    }
                }
                CustomEditText editText = ((wh) groupChatFragment.q()).f6533t.f5175y.f4649v.getEditText();
                if (chatMetaData != null) {
                    str = chatMetaData.getDraftMessage();
                } else {
                    str = null;
                }
                editText.setText(str);
                yd.r rVar3 = groupChatFragment.f9157q;
                if (rVar3 != null) {
                    String userId = ((GroupChatViewModel) groupChatFragment.r()).f9176n.getUserId();
                    GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) groupChatFragment.r();
                    if (chatMetaData != null) {
                        group = chatMetaData.getGroupInfo();
                    }
                    if (group != null && (type = group.getType()) != null) {
                        z10 = groupChatViewModel2.f9164b0.contains(type);
                    }
                    rVar3.f41587f = userId;
                    rVar3.f41588g = z10;
                    return Unit.f23355a;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 3:
                d((Boolean) obj);
                return Unit.f23355a;
            case 4:
                f((List) obj);
                return Unit.f23355a;
            case 5:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 6:
                d((Boolean) obj);
                return Unit.f23355a;
            case 7:
                Group group2 = (Group) obj;
                Intrinsics.c(group2);
                groupChatFragment.getClass();
                Intrinsics.checkNotNullParameter(group2, "group");
                Intent intent = new Intent(groupChatFragment.requireContext(), (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", group2.getGroupId());
                groupChatFragment.startActivity(intent);
                return Unit.f23355a;
            case 8:
                f((List) obj);
                return Unit.f23355a;
            case 9:
                sj.d dVar = (sj.d) obj;
                Intrinsics.c(dVar);
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                groupChatFragment.getClass();
                Intent intent2 = new Intent(groupChatFragment.requireContext(), (Class<?>) UserProfileActivity.class);
                intent2.putExtra("USER_IDENTIFIER", dVar.f34663c);
                intent2.putExtra("CALL_FROM_CHAT", true);
                intent2.putExtra("USER_NAME", dVar.f34661a);
                groupChatFragment.startActivity(intent2);
                return Unit.f23355a;
            case 10:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 11:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 12:
                d((Boolean) obj);
                return Unit.f23355a;
            case 13:
                d((Boolean) obj);
                return Unit.f23355a;
            case 14:
                d((Boolean) obj);
                return Unit.f23355a;
            case 15:
                e((String) obj);
                return Unit.f23355a;
            case 16:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                    groupChatFragment.O();
                } else if (num != null && num.intValue() == 1) {
                    PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                    groupChatFragment.L().C.postValue((ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0));
                } else {
                    PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                    groupChatFragment.L().D.postValue(new kj.j(Unit.f23355a));
                }
                return Unit.f23355a;
            case 17:
                ArrayList admins = (ArrayList) obj;
                yd.r rVar4 = groupChatFragment.f9157q;
                if (rVar4 != null) {
                    Intrinsics.c(admins);
                    Intrinsics.checkNotNullParameter(admins, "admins");
                    ArrayList arrayList = rVar4.f41590i;
                    arrayList.clear();
                    arrayList.addAll(admins);
                    return Unit.f23355a;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 18:
                f((List) obj);
                return Unit.f23355a;
            case 19:
                e((String) obj);
                return Unit.f23355a;
            case 20:
                d((Boolean) obj);
                return Unit.f23355a;
            case 21:
                h0 h0Var = (h0) obj;
                if (h0Var.f2577b == androidx.work.g0.f2567c) {
                    String b10 = h0Var.f2578c.b("uri");
                    ((GroupChatViewModel) groupChatFragment.r()).Y.postValue(b10);
                    GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) groupChatFragment.r();
                    String url = String.valueOf(b10);
                    Intrinsics.checkNotNullParameter(url, "url");
                    ChatMessage chatMessage = groupChatViewModel3.f9184r0;
                    if (chatMessage != null && (media = chatMessage.getMedia()) != null) {
                        media.setUrl(url);
                        groupChatViewModel3.L.postValue(groupChatViewModel3.f9184r0);
                    }
                    groupChatViewModel3.f9184r0 = null;
                }
                return Unit.f23355a;
            case 22:
                d((Boolean) obj);
                return Unit.f23355a;
            case 23:
                d((Boolean) obj);
                return Unit.f23355a;
            case 24:
                i((kj.j) obj);
                return Unit.f23355a;
            case 25:
                e((String) obj);
                return Unit.f23355a;
            case 26:
                i((kj.j) obj);
                return Unit.f23355a;
            case 27:
                i((kj.j) obj);
                return Unit.f23355a;
            case 28:
                i((kj.j) obj);
                return Unit.f23355a;
            default:
                i((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
