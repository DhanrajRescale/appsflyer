package com.assetgro.stockgro.ui.chat.detail.messages.thread;

import ae.d;
import ae.f;
import android.os.Build;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import ba.m2;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.Mentions;
import com.assetgro.stockgro.data.model.MentionsInfo;
import com.assetgro.stockgro.data.model.ThreadInfo;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import el.l;
import gd.b;
import java.util.ArrayList;
import java.util.Map;
import ke.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import m.v2;
import okhttp3.HttpUrl;
import rd.q;
import rd.r;
import rd.w;
import ue.h;
import vt.p0;
import w.k;
import yk.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/messages/thread/MessageThreadInfoActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/group/GroupChatViewModel;", "Lba/m2;", "Lke/a;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MessageThreadInfoActivity extends b implements a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9316m = 0;

    /* renamed from: k, reason: collision with root package name */
    public f f9317k;

    /* renamed from: l, reason: collision with root package name */
    public h f9318l;

    public static final void K(MessageThreadInfoActivity context, ChatMessage chatMessage) {
        String url;
        String text = context.getString(R.string.text_downloading_file);
        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() != 0) {
            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
            Object systemService = context.getSystemService("layout_inflater");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
            k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
        }
        Media media = chatMessage.getMedia();
        if (media != null && (url = media.getUrl()) != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                l.K(context, String.valueOf(chatMessage.getMedia().getFile_name()), "File Desc", url);
            } else {
                l.L(context, context, String.valueOf(chatMessage.getMedia().getFile_name()), "File Desc", url);
            }
        }
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_message_thread_info_detail;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupChatViewModel) x()).G0.observe(this, new id.a(15, new d(this, 6)));
        ((GroupChatViewModel) x()).D0.observe(this, new id.a(15, new d(this, 7)));
        ((GroupChatViewModel) x()).E0.observe(this, new id.a(15, new d(this, 8)));
        ((GroupChatViewModel) x()).F0.observe(this, new id.a(15, new d(this, 9)));
        ((GroupChatViewModel) x()).E.observe(this, new id.a(15, new d(this, 10)));
        ((GroupChatViewModel) x()).H0.observe(this, new id.a(15, new d(this, 11)));
        ((GroupChatViewModel) x()).S.observe(this, new id.a(15, new d(this, 12)));
        ((GroupChatViewModel) x()).f9171i0.observe(this, new id.a(15, new d(this, 13)));
        ((GroupChatViewModel) x()).I0.observe(this, new id.a(15, new d(this, 14)));
        ((GroupChatViewModel) x()).f9172j0.observe(this, new id.a(15, new d(this, 2)));
        ((GroupChatViewModel) x()).M.observe(this, new id.a(15, new d(this, 3)));
        ((GroupChatViewModel) x()).D.observe(this, new id.a(15, new d(this, 4)));
        ((GroupChatViewModel) x()).O.observe(this, new id.a(15, new d(this, 5)));
    }

    @Override // gd.b
    public final void I() {
        this.f9318l = new h(this);
        String messageId = getIntent().getStringExtra("MESSAGE_ID");
        final int i10 = 1;
        final int i11 = 0;
        if (messageId != null) {
            ((GroupChatViewModel) x()).C0 = messageId;
            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) x();
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            groupChatViewModel.f9084g.postValue(Boolean.TRUE);
            nt.h c10 = groupChatViewModel.f9176n.getMessageThreadInfo(messageId).c(((e) groupChatViewModel.f9079b).J());
            jt.d dVar = new jt.d(new q(0, new r(groupChatViewModel, 13)), new q(1, new r(groupChatViewModel, 14)));
            c10.a(dVar);
            groupChatViewModel.f9080c.c(dVar);
        }
        String stringExtra = getIntent().getStringExtra("GROUP_CHAT_ID");
        if (stringExtra != null) {
            ((GroupChatViewModel) x()).f9196x0 = stringExtra;
            ((GroupChatViewModel) x()).n(stringExtra);
        }
        String userId = ((GroupChatViewModel) x()).f9176n.getUserId();
        int i12 = 3;
        if (userId != null) {
            ((GroupChatViewModel) x()).r(userId);
            GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) x();
            g.H(u0.f(groupChatViewModel2), null, null, new w(groupChatViewModel2, null), 3);
        }
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9317k = new f(lifecycle, new d(this, 15), new d(this, 16), new d(this, 17));
        m2 m2Var = (m2) w();
        f fVar = this.f9317k;
        if (fVar != null) {
            m2Var.f5430y.setAdapter(fVar);
            ImageButton buttonGroupChatUpload = ((m2) w()).f5429x.f4648u;
            Intrinsics.checkNotNullExpressionValue(buttonGroupChatUpload, "buttonGroupChatUpload");
            ImageButton addSticker = ((m2) w()).f5429x.f4646s;
            Intrinsics.checkNotNullExpressionValue(addSticker, "addSticker");
            kj.f.r(false, buttonGroupChatUpload, addSticker);
            Toolbar toolbar = ((m2) w()).F;
            toolbar.setTitle("Thread");
            u(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ae.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MessageThreadInfoActivity f377b;

                {
                    this.f377b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i13 = i11;
                    MessageThreadInfoActivity this$0 = this.f377b;
                    switch (i13) {
                        case 0:
                            int i14 = MessageThreadInfoActivity.f9316m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                        default:
                            int i15 = MessageThreadInfoActivity.f9316m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String message = String.valueOf(((m2) this$0.w()).f5429x.f4649v.getEditText().getText());
                            if (kotlin.text.w.X(message).toString().length() > 0) {
                                if (((GroupChatViewModel) this$0.x()).C0 != null) {
                                    GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.x();
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    if (le.c.f24606a != null && !(!r0.a())) {
                                        ArrayList t10 = groupChatViewModel3.t(message);
                                        ArrayList s7 = groupChatViewModel3.s(message);
                                        String d10 = a3.a.d("toString(...)");
                                        long u10 = GroupChatViewModel.u();
                                        Pair[] pairArr = new Pair[9];
                                        pairArr[0] = new Pair("message_id", d10);
                                        pairArr[1] = new Pair("template", message);
                                        ChatRepository chatRepository = groupChatViewModel3.f9176n;
                                        pairArr[2] = new Pair("sender_id", chatRepository.getUserId());
                                        pairArr[3] = new Pair("sender_name", chatRepository.getUserName());
                                        Group group = (Group) groupChatViewModel3.D.getValue();
                                        if (group != null) {
                                            str = group.getGroupId();
                                        } else {
                                            str = null;
                                        }
                                        pairArr[4] = new Pair("group_id", str);
                                        pairArr[5] = new Pair("replied_to", groupChatViewModel3.C0);
                                        pairArr[6] = new Pair("token", a3.a.f("Bearer ", chatRepository.getAccessToken()));
                                        pairArr[7] = new Pair("client_time_micros", Long.valueOf(u10));
                                        pairArr[8] = new Pair("mentions", new Mentions(new ArrayList(), t10));
                                        Map payload = p0.g(pairArr);
                                        ChatMessage chatMessage = new ChatMessage(d10, message, HttpUrl.FRAGMENT_ENCODE_SET, chatRepository.getUserId(), null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, chatRepository.getUserName(), groupChatViewModel3.f9196x0, groupChatViewModel3.C0, new ThreadInfo(null, 0), null, Long.valueOf(u10), Long.valueOf(u10), u10, null, 0, false, null, false, 0, null, new Mentions(new ArrayList(), t10), new MentionsInfo(s7), false, false, 50331648, null);
                                        Intrinsics.checkNotNullParameter(payload, "payload");
                                        try {
                                            fv.e eVar = le.c.f24606a;
                                            if (eVar != null) {
                                                fv.g e10 = eVar.e("new_msg_in", eVar.f16283d, payload);
                                                e10.a("ok", le.a.f24601o);
                                                e10.a("error", le.a.f24602p);
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                        groupChatViewModel3.H0.postValue(chatMessage);
                                        groupChatViewModel3.f9172j0.postValue(Boolean.TRUE);
                                    }
                                }
                                ((m2) this$0.w()).f5429x.f4649v.getEditText().setText(HttpUrl.FRAGMENT_ENCODE_SET);
                                return;
                            }
                            return;
                    }
                }
            });
            v(toolbar);
            ((m2) w()).f5429x.f4649v.getEditText().addTextChangedListener(new v2(this, i12));
            ((m2) w()).f5429x.f4647t.setEnabled(false);
            ((m2) w()).f5429x.f4647t.setOnClickListener(new View.OnClickListener(this) { // from class: ae.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MessageThreadInfoActivity f377b;

                {
                    this.f377b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    int i13 = i10;
                    MessageThreadInfoActivity this$0 = this.f377b;
                    switch (i13) {
                        case 0:
                            int i14 = MessageThreadInfoActivity.f9316m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                        default:
                            int i15 = MessageThreadInfoActivity.f9316m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            String message = String.valueOf(((m2) this$0.w()).f5429x.f4649v.getEditText().getText());
                            if (kotlin.text.w.X(message).toString().length() > 0) {
                                if (((GroupChatViewModel) this$0.x()).C0 != null) {
                                    GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.x();
                                    Intrinsics.checkNotNullParameter(message, "message");
                                    if (le.c.f24606a != null && !(!r0.a())) {
                                        ArrayList t10 = groupChatViewModel3.t(message);
                                        ArrayList s7 = groupChatViewModel3.s(message);
                                        String d10 = a3.a.d("toString(...)");
                                        long u10 = GroupChatViewModel.u();
                                        Pair[] pairArr = new Pair[9];
                                        pairArr[0] = new Pair("message_id", d10);
                                        pairArr[1] = new Pair("template", message);
                                        ChatRepository chatRepository = groupChatViewModel3.f9176n;
                                        pairArr[2] = new Pair("sender_id", chatRepository.getUserId());
                                        pairArr[3] = new Pair("sender_name", chatRepository.getUserName());
                                        Group group = (Group) groupChatViewModel3.D.getValue();
                                        if (group != null) {
                                            str = group.getGroupId();
                                        } else {
                                            str = null;
                                        }
                                        pairArr[4] = new Pair("group_id", str);
                                        pairArr[5] = new Pair("replied_to", groupChatViewModel3.C0);
                                        pairArr[6] = new Pair("token", a3.a.f("Bearer ", chatRepository.getAccessToken()));
                                        pairArr[7] = new Pair("client_time_micros", Long.valueOf(u10));
                                        pairArr[8] = new Pair("mentions", new Mentions(new ArrayList(), t10));
                                        Map payload = p0.g(pairArr);
                                        ChatMessage chatMessage = new ChatMessage(d10, message, HttpUrl.FRAGMENT_ENCODE_SET, chatRepository.getUserId(), null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, chatRepository.getUserName(), groupChatViewModel3.f9196x0, groupChatViewModel3.C0, new ThreadInfo(null, 0), null, Long.valueOf(u10), Long.valueOf(u10), u10, null, 0, false, null, false, 0, null, new Mentions(new ArrayList(), t10), new MentionsInfo(s7), false, false, 50331648, null);
                                        Intrinsics.checkNotNullParameter(payload, "payload");
                                        try {
                                            fv.e eVar = le.c.f24606a;
                                            if (eVar != null) {
                                                fv.g e10 = eVar.e("new_msg_in", eVar.f16283d, payload);
                                                e10.a("ok", le.a.f24601o);
                                                e10.a("error", le.a.f24602p);
                                            }
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                        groupChatViewModel3.H0.postValue(chatMessage);
                                        groupChatViewModel3.f9172j0.postValue(Boolean.TRUE);
                                    }
                                }
                                ((m2) this$0.w()).f5429x.f4649v.getEditText().setText(HttpUrl.FRAGMENT_ENCODE_SET);
                                return;
                            }
                            return;
                    }
                }
            });
            ((m2) w()).f5429x.f4649v.setListener(this);
            ((m2) w()).f5429x.f4649v.getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE)});
            return;
        }
        Intrinsics.k("messageThreadInfoAdapter");
        throw null;
    }

    public final void L(String str, String str2) {
        String userId = ((GroupChatViewModel) x()).f9176n.getUserId();
        if (userId != null && (userId.equals(str) || !((GroupChatViewModel) x()).x())) {
            return;
        }
        ((GroupChatViewModel) x()).R.postValue(new sj.d(str2, HttpUrl.FRAGMENT_ENCODE_SET, str));
        ((GroupChatViewModel) x()).f9171i0.postValue(Boolean.TRUE);
    }

    @Override // ke.a
    public final void a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((GroupChatViewModel) x()).z(text);
    }

    @Override // ke.a
    public final void i(sj.d user) {
        Intrinsics.checkNotNullParameter(user, "user");
        ((GroupChatViewModel) x()).Q.add(user);
        ((m2) w()).f5429x.f4649v.setMentionedUser(user.f34661a);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.f();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
    }
}
