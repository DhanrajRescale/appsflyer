package rd;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import ba.wh;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.data.uimodel.StickerData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.list.UserGroupListActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import h.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7.k0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.g0;
import vt.p0;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(GroupChatFragment groupChatFragment, int i10) {
        super(1);
        this.f33635a = i10;
        this.f33636b = groupChatFragment;
    }

    public final void a(final ChatMessage message) {
        final int i10 = 1;
        int i11 = this.f33635a;
        final int i12 = 0;
        final GroupChatFragment groupChatFragment = this.f33636b;
        switch (i11) {
            case 14:
                Intrinsics.c(message);
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                j0 activity = groupChatFragment.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: rd.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i10;
                            ChatMessage message2 = message;
                            GroupChatFragment this$0 = groupChatFragment;
                            switch (i13) {
                                case 0:
                                    PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(message2, "$message");
                                    yd.r rVar = this$0.f9157q;
                                    if (rVar != null) {
                                        Intrinsics.checkNotNullParameter(message2, "parentMessage");
                                        ArrayList arrayList = rVar.f41586e;
                                        Iterator it = arrayList.iterator();
                                        int i14 = 0;
                                        int i15 = -1;
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            int i16 = i14 + 1;
                                            if (i14 >= 0) {
                                                if (Intrinsics.a(((ChatMessage) next).getMessageId(), message2.getMessageId())) {
                                                    i15 = i14;
                                                }
                                                i14 = i16;
                                            } else {
                                                vt.y.j();
                                                throw null;
                                            }
                                        }
                                        if (i15 != -1) {
                                            arrayList.remove(i15);
                                            rVar.e(i15);
                                            Intrinsics.checkNotNullParameter(message2, "message");
                                            rVar.f41586e.add(0, message2);
                                            rVar.f22651a.e(0, 1);
                                            return;
                                        }
                                        return;
                                    }
                                    Intrinsics.k("messagesAdapter");
                                    throw null;
                                default:
                                    PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(message2, "$message");
                                    yd.r rVar2 = this$0.f9157q;
                                    if (rVar2 != null) {
                                        Intrinsics.checkNotNullParameter(message2, "message");
                                        rVar2.f41586e.add(0, message2);
                                        rVar2.f22651a.e(0, 1);
                                        LinearLayoutManager linearLayoutManager = this$0.f9158r;
                                        if (linearLayoutManager != null) {
                                            linearLayoutManager.D0(((wh) this$0.q()).f6533t.B, 0);
                                            return;
                                        } else {
                                            Intrinsics.k("linearLayoutManager");
                                            throw null;
                                        }
                                    }
                                    Intrinsics.k("messagesAdapter");
                                    throw null;
                            }
                        }
                    });
                    return;
                }
                return;
            case 15:
                Intrinsics.c(message);
                PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                j0 activity2 = groupChatFragment.getActivity();
                if (activity2 != null) {
                    activity2.runOnUiThread(new Runnable() { // from class: rd.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            ChatMessage message2 = message;
                            GroupChatFragment this$0 = groupChatFragment;
                            switch (i13) {
                                case 0:
                                    PopupWindow popupWindow22 = GroupChatFragment.f9146w;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(message2, "$message");
                                    yd.r rVar = this$0.f9157q;
                                    if (rVar != null) {
                                        Intrinsics.checkNotNullParameter(message2, "parentMessage");
                                        ArrayList arrayList = rVar.f41586e;
                                        Iterator it = arrayList.iterator();
                                        int i14 = 0;
                                        int i15 = -1;
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            int i16 = i14 + 1;
                                            if (i14 >= 0) {
                                                if (Intrinsics.a(((ChatMessage) next).getMessageId(), message2.getMessageId())) {
                                                    i15 = i14;
                                                }
                                                i14 = i16;
                                            } else {
                                                vt.y.j();
                                                throw null;
                                            }
                                        }
                                        if (i15 != -1) {
                                            arrayList.remove(i15);
                                            rVar.e(i15);
                                            Intrinsics.checkNotNullParameter(message2, "message");
                                            rVar.f41586e.add(0, message2);
                                            rVar.f22651a.e(0, 1);
                                            return;
                                        }
                                        return;
                                    }
                                    Intrinsics.k("messagesAdapter");
                                    throw null;
                                default:
                                    PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Intrinsics.checkNotNullParameter(message2, "$message");
                                    yd.r rVar2 = this$0.f9157q;
                                    if (rVar2 != null) {
                                        Intrinsics.checkNotNullParameter(message2, "message");
                                        rVar2.f41586e.add(0, message2);
                                        rVar2.f22651a.e(0, 1);
                                        LinearLayoutManager linearLayoutManager = this$0.f9158r;
                                        if (linearLayoutManager != null) {
                                            linearLayoutManager.D0(((wh) this$0.q()).f6533t.B, 0);
                                            return;
                                        } else {
                                            Intrinsics.k("linearLayoutManager");
                                            throw null;
                                        }
                                    }
                                    Intrinsics.k("messagesAdapter");
                                    throw null;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                yd.r rVar = groupChatFragment.f9157q;
                if (rVar != null) {
                    Intrinsics.c(message);
                    Intrinsics.checkNotNullParameter(message, "message");
                    ArrayList arrayList = rVar.f41586e;
                    int size = arrayList.size();
                    while (i12 < size) {
                        if (Intrinsics.a(((ChatMessage) arrayList.get(i12)).getMessageId(), message.getMessageId())) {
                            arrayList.remove(arrayList.get(i12));
                            rVar.f22651a.f(i12, 1);
                            return;
                        }
                        i12++;
                    }
                    return;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
        }
    }

    public final void d(List stickerData) {
        int i10 = this.f33635a;
        GroupChatFragment groupChatFragment = this.f33636b;
        switch (i10) {
            case 9:
                yd.t tVar = groupChatFragment.f9160t;
                if (tVar != null) {
                    Intrinsics.c(stickerData);
                    Intrinsics.checkNotNullParameter(stickerData, "stickerData");
                    tVar.f41596e.clear();
                    tVar.f41596e = g0.S(stickerData);
                    tVar.d();
                    return;
                }
                Intrinsics.k("stickerAdapter");
                throw null;
            case 10:
            default:
                Intrinsics.c(stickerData);
                yd.r rVar = groupChatFragment.f9157q;
                if (rVar != null) {
                    rVar.f41586e.clear();
                    rVar.d();
                    yd.r rVar2 = groupChatFragment.f9157q;
                    if (rVar2 != null) {
                        Intrinsics.checkNotNullParameter(stickerData, "message");
                        rVar2.f41586e.addAll(stickerData);
                        rVar2.d();
                        return;
                    }
                    Intrinsics.k("messagesAdapter");
                    throw null;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 11:
                Intrinsics.c(stickerData);
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                j0 activity = groupChatFragment.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new m0(20, groupChatFragment, stickerData));
                    return;
                }
                return;
        }
    }

    public final void e(kj.j jVar) {
        String groupId;
        int i10 = this.f33635a;
        GroupChatFragment groupChatFragment = this.f33636b;
        switch (i10) {
            case 0:
                if (vt.y.e(((GroupChatViewModel) groupChatFragment.r()).f9199z).h(0)) {
                    ChatMessage chatMessage = (ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0);
                    Intrinsics.c(chatMessage);
                    if (chatMessage.getMedia() != null) {
                        if (kotlin.text.s.j(chatMessage.getMedia().getType(), "image", false)) {
                            Context applicationContext = groupChatFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "requireContext(...)");
                            j0 activity = groupChatFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            Context context = groupChatFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            String url = chatMessage.getMedia().getUrl();
                            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            Intrinsics.checkNotNullParameter(context, "context");
                            com.bumptech.glide.g j10 = com.bumptech.glide.b.c(context).d(context).j();
                            j10.F = url;
                            j10.J = true;
                            j10.A(new ue.q(applicationContext, context, activity));
                        }
                    } else {
                        j0 activity2 = groupChatFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                        String message = chatMessage.getMessage();
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", message);
                        intent.setType("text/plain");
                        activity2.startActivity(Intent.createChooser(intent, "Share Message"));
                    }
                    GroupChatFragment.H(groupChatFragment, chatMessage.getSenderId(), "share");
                }
                groupChatFragment.O();
                return;
            case 1:
                GroupChatFragment.H(groupChatFragment, ((ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0)).getSenderId(), "report");
                Intent intent2 = new Intent(groupChatFragment.requireContext(), (Class<?>) ReportEntityActivity.class);
                intent2.putExtra("REPORT_USER_NAME", ((ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0)).getSenderName());
                intent2.putExtra("USER_ID_TO_BE_REPORTED", ((ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0)).getSenderId());
                intent2.putExtra("ENTITY_ID_TO_BE_REPORTED", ((ChatMessage) ((GroupChatViewModel) groupChatFragment.r()).f9199z.get(0)).getMessageId());
                intent2.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.Message);
                intent2.putExtra("IS_BLOCKED", Intrinsics.a(groupChatFragment.L().f9138s.getValue(), Boolean.TRUE));
                groupChatFragment.f9150j.a(intent2);
                return;
            case 2:
                final ArrayList messages = ((GroupChatViewModel) groupChatFragment.r()).f9199z;
                final GroupChatViewModel groupChatViewModel = (GroupChatViewModel) groupChatFragment.r();
                Context context2 = groupChatFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(messages, "messages");
                h.i iVar = new h.i(context2, R.style.StockgroDialogTheme);
                iVar.f17693a.f17611f = "Are you sure you want to delete this message?";
                iVar.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: rd.o
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        String str;
                        ArrayList messages2 = messages;
                        Intrinsics.checkNotNullParameter(messages2, "$messages");
                        GroupChatViewModel this$0 = groupChatViewModel;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (i11 == -1) {
                            if (messages2.size() > 1) {
                                this$0.getClass();
                                if (le.c.f24606a != null && !(!r11.a())) {
                                    Iterator it = messages2.iterator();
                                    while (it.hasNext()) {
                                        Pair[] pairArr = new Pair[3];
                                        pairArr[0] = new Pair("message_id", ((ChatMessage) it.next()).getMessageId());
                                        Group group = (Group) this$0.D.getValue();
                                        if (group != null) {
                                            str = group.getGroupId();
                                        } else {
                                            str = null;
                                        }
                                        pairArr[1] = new Pair("group_id", str);
                                        pairArr[2] = new Pair("token", a3.a.f("Bearer ", this$0.f9176n.getAccessToken()));
                                        Map payload = p0.g(pairArr);
                                        Intrinsics.checkNotNullParameter(payload, "payload");
                                        try {
                                            fv.e eVar = le.c.f24606a;
                                            if (eVar != null) {
                                                fv.g e10 = eVar.e("del_msg_in", eVar.f16283d, payload);
                                                e10.a("ok", le.a.f24588b);
                                                e10.a("error", le.a.f24589c);
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    this$0.P.postValue(messages2);
                                }
                            } else {
                                Object obj = messages2.get(0);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                this$0.k((ChatMessage) obj);
                            }
                            this$0.f9168f0.postValue(Boolean.TRUE);
                            dialogInterface.dismiss();
                        }
                    }
                }).setNegativeButton(R.string.cancel, new p(groupChatViewModel, 0)).c();
                return;
            case 3:
                ArrayList arrayList = ((GroupChatViewModel) groupChatFragment.r()).f9199z;
                Group group = (Group) ((GroupChatViewModel) groupChatFragment.r()).D.getValue();
                if (group != null && (groupId = group.getGroupId()) != null) {
                    GroupChatFragment.H(groupChatFragment, HttpUrl.FRAGMENT_ENCODE_SET, "fwded");
                    je.e eVar = UserGroupListActivity.f9394l;
                    Context context3 = groupChatFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(context3, "context");
                    Intent intent3 = new Intent(context3, (Class<?>) UserGroupListActivity.class);
                    intent3.putExtra("GROUP_ID", groupId);
                    intent3.putExtra("CHAT_MESSAGE", arrayList);
                    groupChatFragment.startActivityForResult(intent3, 10011);
                    return;
                }
                return;
            case 4:
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                groupChatFragment.O();
                return;
            default:
                groupChatFragment.L().f9133n = false;
                ((wh) groupChatFragment.q()).f6533t.D.setVisibility(8);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [qj.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        Boolean bool;
        Boolean iBlocked;
        int i10 = this.f33635a;
        int i11 = 0;
        Boolean bool2 = null;
        GroupChatFragment groupChatFragment = this.f33636b;
        switch (i10) {
            case 0:
                e((kj.j) obj);
                return Unit.f23355a;
            case 1:
                e((kj.j) obj);
                return Unit.f23355a;
            case 2:
                e((kj.j) obj);
                return Unit.f23355a;
            case 3:
                e((kj.j) obj);
                return Unit.f23355a;
            case 4:
                e((kj.j) obj);
                return Unit.f23355a;
            case 5:
                UserBlockStatusDao userBlockStatusDao = (UserBlockStatusDao) obj;
                ChatSharedViewModel L = groupChatFragment.L();
                if (userBlockStatusDao != null && (iBlocked = userBlockStatusDao.getIBlocked()) != null) {
                    z10 = iBlocked.booleanValue();
                } else {
                    z10 = false;
                }
                L.i(z10);
                if (userBlockStatusDao != null) {
                    bool = userBlockStatusDao.getIBlocked();
                } else {
                    bool = null;
                }
                if (bool == null) {
                    if (userBlockStatusDao != null) {
                        bool2 = userBlockStatusDao.getIAmBlocked();
                    }
                    if (bool2 == null) {
                        groupChatFragment.L().i(false);
                        ComposeView blockedText = ((wh) groupChatFragment.q()).f6533t.f5170t;
                        Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                        zq.f.M(blockedText);
                        View view = ((wh) groupChatFragment.q()).f6533t.f5175y.f27491e;
                        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                        zq.f.m0(view);
                        return Unit.f23355a;
                    }
                }
                Object value = groupChatFragment.L().f9138s.getValue();
                Boolean bool3 = Boolean.TRUE;
                if (Intrinsics.a(value, bool3) || Intrinsics.a(userBlockStatusDao.getIAmBlocked(), bool3)) {
                    groupChatFragment.L().i(true);
                    ComposeView blockedText2 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                    Intrinsics.checkNotNullExpressionValue(blockedText2, "blockedText");
                    zq.f.m0(blockedText2);
                    if (Intrinsics.a(groupChatFragment.L().f9138s.getValue(), bool3)) {
                        View view2 = ((wh) groupChatFragment.q()).f6533t.f5175y.f27491e;
                        Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                        zq.f.M(view2);
                        groupChatFragment.L().i(true);
                        ComposeView composeView = ((wh) groupChatFragment.q()).f6533t.f5170t;
                        k kVar = new k(groupChatFragment, 6);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(kVar, true, 839377966));
                    } else {
                        ((wh) groupChatFragment.q()).f6533t.f5170t.setContent(c.f33610a);
                    }
                }
                return Unit.f23355a;
            case 6:
                Group group = (Group) obj;
                ((GroupChatViewModel) groupChatFragment.r()).f9196x0 = group.getGroupId();
                ((GroupChatViewModel) groupChatFragment.r()).D();
                yd.r rVar = groupChatFragment.f9157q;
                if (rVar != null) {
                    String userId = ((GroupChatViewModel) groupChatFragment.r()).f9176n.getUserId();
                    boolean x10 = ((GroupChatViewModel) groupChatFragment.r()).x();
                    rVar.f41587f = userId;
                    rVar.f41588g = x10;
                    if (group.getIsUserBlocked()) {
                        groupChatFragment.L().i(true);
                    }
                    if (!group.getIAmBlocked() && !Intrinsics.a(groupChatFragment.L().f9138s.getValue(), Boolean.TRUE)) {
                        groupChatFragment.L().i(false);
                        ComposeView blockedText3 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                        Intrinsics.checkNotNullExpressionValue(blockedText3, "blockedText");
                        zq.f.M(blockedText3);
                        boolean isOpenForAudience = group.getIsOpenForAudience();
                        if (((GroupChatViewModel) groupChatFragment.r()).w()) {
                            ((wh) groupChatFragment.q()).f6533t.f5176z.setVisibility(8);
                            ((wh) groupChatFragment.q()).f6533t.f5175y.f27491e.setVisibility(0);
                        } else {
                            if (isOpenForAudience) {
                                ((wh) groupChatFragment.q()).f6533t.f5176z.setVisibility(8);
                            } else {
                                ((wh) groupChatFragment.q()).f6533t.f5176z.setVisibility(0);
                                groupChatFragment.f9159s = true;
                            }
                            View view3 = ((wh) groupChatFragment.q()).f6533t.f5175y.f27491e;
                            if (!isOpenForAudience) {
                                i11 = 8;
                            }
                            view3.setVisibility(i11);
                        }
                        ((GroupChatViewModel) groupChatFragment.r()).f9178o0 = isOpenForAudience;
                        if (!groupChatFragment.f9159s) {
                            ef.b bVar = groupChatFragment.f9156p;
                            if (bVar != null) {
                                new k0(bVar).j(((wh) groupChatFragment.q()).f6533t.B);
                            } else {
                                Intrinsics.k("messageSwipeController");
                                throw null;
                            }
                        }
                    } else {
                        ((wh) groupChatFragment.q()).f6533t.f5176z.setVisibility(8);
                        ComposeView blockedText4 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                        Intrinsics.checkNotNullExpressionValue(blockedText4, "blockedText");
                        zq.f.m0(blockedText4);
                        View view4 = ((wh) groupChatFragment.q()).f6533t.f5175y.f27491e;
                        Intrinsics.checkNotNullExpressionValue(view4, "getRoot(...)");
                        zq.f.M(view4);
                        ComposeView composeView2 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                        k kVar2 = new k(groupChatFragment, 5);
                        Object obj3 = b1.d.f3079a;
                        composeView2.setContent(new b1.c(kVar2, true, 599612004));
                    }
                    return Unit.f23355a;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 7:
                e.a aVar = (e.a) obj;
                if (aVar != null) {
                    PopupWindow popupWindow = GroupChatFragment.f9146w;
                    groupChatFragment.getClass();
                    Intent intent = aVar.f14611b;
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            bool2 = Boolean.valueOf(extras.getBoolean("BLOCKED", false));
                        }
                        if (Intrinsics.a(bool2, Boolean.TRUE)) {
                            ComposeView blockedText5 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                            Intrinsics.checkNotNullExpressionValue(blockedText5, "blockedText");
                            zq.f.m0(blockedText5);
                            ComposeView composeView3 = ((wh) groupChatFragment.q()).f6533t.f5170t;
                            k kVar3 = new k(groupChatFragment, i11);
                            Object obj4 = b1.d.f3079a;
                            composeView3.setContent(new b1.c(kVar3, true, -75302861));
                        }
                    }
                    ?? obj5 = new Object();
                    Context requireContext = groupChatFragment.requireContext();
                    String string = groupChatFragment.getString(R.string.profile_reported_body);
                    String string2 = groupChatFragment.getString(R.string.report_sent_text);
                    String string3 = groupChatFragment.getString(R.string.ok);
                    l lVar = new l(groupChatFragment, i11);
                    Intrinsics.c(requireContext);
                    Intrinsics.c(string);
                    Intrinsics.c(string3);
                    Intrinsics.c(string2);
                    qj.b.b(obj5, requireContext, string, string3, null, string2, null, false, 0, 0, lVar, 65496);
                }
                return Unit.f23355a;
            case 8:
                StickerData stickerData = (StickerData) obj;
                if (stickerData != null) {
                    ((GroupChatViewModel) groupChatFragment.r()).B(null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, ((GroupChatViewModel) groupChatFragment.r()).f9191v, stickerData, HttpUrl.FRAGMENT_ENCODE_SET);
                    groupChatFragment.K();
                }
                return Unit.f23355a;
            case 9:
                d((List) obj);
                return Unit.f23355a;
            case 10:
                e((kj.j) obj);
                return Unit.f23355a;
            case 11:
                d((List) obj);
                return Unit.f23355a;
            case 12:
                d((List) obj);
                return Unit.f23355a;
            case 13:
                yd.r rVar2 = groupChatFragment.f9157q;
                if (rVar2 != null) {
                    rVar2.f41586e.clear();
                    rVar2.d();
                    return Unit.f23355a;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            case 14:
                a((ChatMessage) obj);
                return Unit.f23355a;
            case 15:
                a((ChatMessage) obj);
                return Unit.f23355a;
            default:
                a((ChatMessage) obj);
                return Unit.f23355a;
        }
    }
}
