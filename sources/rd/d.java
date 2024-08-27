package rd;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.wh;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.Mentions;
import com.assetgro.stockgro.data.model.MentionsInfo;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesActivity;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33614b;

    public /* synthetic */ d(GroupChatFragment groupChatFragment, int i10) {
        this.f33613a = i10;
        this.f33614b = groupChatFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        GroupChatFragment groupChatFragment;
        String str2;
        GroupChatFragment groupChatFragment2;
        ChatMessage message;
        String str3;
        boolean z10;
        String groupId;
        int i10 = this.f33613a;
        int i11 = 4;
        int i12 = 5;
        boolean z11 = false;
        GroupChatFragment this$0 = this.f33614b;
        switch (i10) {
            case 0:
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                if (groupChatViewModel.f9182q0 && !groupChatViewModel.f9180p0) {
                    this$0.J();
                    ((GroupChatViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                    return;
                }
                String message2 = this$0.M();
                if (((GroupChatViewModel) this$0.r()).f9189u == ((GroupChatViewModel) this$0.r()).f9181q) {
                    if (message2.length() > 0 && (message = ((GroupChatViewModel) this$0.r()).f9191v) != null) {
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        Intrinsics.checkNotNullParameter(message, "message");
                        Intrinsics.checkNotNullParameter(message2, "editedMessageString");
                        if (le.c.f24606a != null && !(!r12.a())) {
                            ArrayList t10 = groupChatViewModel2.t(message2);
                            groupChatFragment2 = this$0;
                            Pair[] pairArr = new Pair[8];
                            pairArr[0] = new Pair("message_id", message.getMessageId());
                            pairArr[1] = new Pair("template", message2);
                            pairArr[2] = new Pair("sender_id", message.getSenderId());
                            pairArr[3] = new Pair("sender_name", message.getSenderName());
                            Group group = (Group) groupChatViewModel2.D.getValue();
                            if (group != null) {
                                str3 = group.getGroupId();
                            } else {
                                str3 = null;
                            }
                            pairArr[4] = new Pair("group_id", str3);
                            pairArr[5] = new Pair("token", a3.a.f("Bearer ", groupChatViewModel2.f9176n.getAccessToken()));
                            pairArr[6] = new Pair("client_time_micros", message.getClientTime());
                            pairArr[7] = new Pair("mentions", new Mentions(new ArrayList(), t10));
                            Map payload = p0.g(pairArr);
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            try {
                                fv.e eVar = le.c.f24606a;
                                if (eVar != null) {
                                    fv.g e10 = eVar.e("edit_msg_in", eVar.f16283d, payload);
                                    e10.a("ok", le.a.f24590d);
                                    e10.a("error", le.a.f24591e);
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            message.setMessage(message2);
                            groupChatViewModel2.K.postValue(message);
                            groupChatViewModel2.f9172j0.postValue(Boolean.TRUE);
                            groupChatFragment2.P(null, ((GroupChatViewModel) groupChatFragment2.r()).f9179p);
                            return;
                        }
                    }
                    groupChatFragment2 = this$0;
                    groupChatFragment2.P(null, ((GroupChatViewModel) groupChatFragment2.r()).f9179p);
                    return;
                }
                int i13 = ((GroupChatViewModel) this$0.r()).f9189u;
                GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                le.a aVar = le.a.f24602p;
                le.a aVar2 = le.a.f24601o;
                if (i13 == groupChatViewModel3.f9183r) {
                    if (message2.length() > 0) {
                        ChatMessage parentMessage = ((GroupChatViewModel) this$0.r()).f9191v;
                        if (parentMessage != null) {
                            GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                            Intrinsics.checkNotNullParameter(parentMessage, "parentMessage");
                            Intrinsics.checkNotNullParameter(message2, "message");
                            if (le.c.f24606a == null || (!r12.a())) {
                                groupChatFragment = this$0;
                            } else {
                                ArrayList t11 = groupChatViewModel4.t(message2);
                                ArrayList s7 = groupChatViewModel4.s(message2);
                                groupChatFragment = this$0;
                                String d10 = a3.a.d("toString(...)");
                                long u10 = GroupChatViewModel.u();
                                Pair[] pairArr2 = new Pair[10];
                                pairArr2[0] = new Pair("message_id", d10);
                                pairArr2[1] = new Pair("template", message2);
                                ChatRepository chatRepository = groupChatViewModel4.f9176n;
                                pairArr2[2] = new Pair("sender_id", chatRepository.getUserId());
                                pairArr2[3] = new Pair("sender_name", chatRepository.getUserName());
                                Group group2 = (Group) groupChatViewModel4.D.getValue();
                                if (group2 != null) {
                                    str2 = group2.getGroupId();
                                } else {
                                    str2 = null;
                                }
                                pairArr2[4] = new Pair("group_id", str2);
                                pairArr2[5] = new Pair("replied_to", parentMessage.getMessageId());
                                pairArr2[6] = new Pair("token", a3.a.f("Bearer ", chatRepository.getAccessToken()));
                                pairArr2[7] = new Pair("client_time_micros", Long.valueOf(u10));
                                pairArr2[8] = new Pair("mentions", new Mentions(new ArrayList(), t11));
                                pairArr2[9] = new Pair("mentions_info", new MentionsInfo(s7));
                                Map payload2 = p0.g(pairArr2);
                                Intrinsics.checkNotNullParameter(payload2, "payload");
                                try {
                                    fv.e eVar2 = le.c.f24606a;
                                    if (eVar2 != null) {
                                        fv.g e12 = eVar2.e("new_msg_in", eVar2.f16283d, payload2);
                                        e12.a("ok", aVar2);
                                        e12.a("error", aVar);
                                    }
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                                groupChatViewModel4.f9172j0.postValue(Boolean.TRUE);
                            }
                            groupChatFragment.K();
                        } else {
                            groupChatFragment = this$0;
                        }
                        groupChatFragment.J();
                        groupChatFragment.O();
                        return;
                    }
                    return;
                }
                if (message2.length() > 0) {
                    GroupChatViewModel groupChatViewModel5 = (GroupChatViewModel) this$0.r();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    if (le.c.f24606a != null && !(!r12.a())) {
                        ArrayList t12 = groupChatViewModel5.t(message2);
                        Pair[] pairArr3 = new Pair[9];
                        pairArr3[0] = new Pair("message_id", a3.a.d("toString(...)"));
                        pairArr3[1] = new Pair("template", message2);
                        ChatRepository chatRepository2 = groupChatViewModel5.f9176n;
                        pairArr3[2] = new Pair("sender_id", chatRepository2.getUserId());
                        pairArr3[3] = new Pair("sender_name", chatRepository2.getUserName());
                        Group group3 = (Group) groupChatViewModel5.D.getValue();
                        if (group3 != null) {
                            str = group3.getGroupId();
                        } else {
                            str = null;
                        }
                        pairArr3[4] = new Pair("group_id", str);
                        pairArr3[5] = new Pair("token", a3.a.f("Bearer ", chatRepository2.getAccessToken()));
                        pairArr3[6] = new Pair("client_time_micros", Long.valueOf(GroupChatViewModel.u()));
                        pairArr3[7] = new Pair("mentions", new Mentions(new ArrayList(), t12));
                        pairArr3[8] = new Pair("user_ids", t12);
                        Map payload3 = p0.g(pairArr3);
                        Intrinsics.checkNotNullParameter(payload3, "payload");
                        try {
                            fv.e eVar3 = le.c.f24606a;
                            if (eVar3 != null) {
                                fv.g e14 = eVar3.e("new_msg_in", eVar3.f16283d, payload3);
                                e14.a("ok", aVar2);
                                e14.a("error", aVar);
                            }
                        } catch (Exception e15) {
                            e15.printStackTrace();
                        }
                        groupChatViewModel5.f9172j0.postValue(Boolean.TRUE);
                    }
                    this$0.J();
                    return;
                }
                return;
            case 1:
                PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GroupChatViewModel groupChatViewModel6 = (GroupChatViewModel) this$0.r();
                if (groupChatViewModel6.f9182q0 && !groupChatViewModel6.f9180p0) {
                    this$0.J();
                    ((GroupChatViewModel) this$0.r()).C.postValue(Boolean.TRUE);
                    return;
                }
                GroupChatViewModel groupChatViewModel7 = (GroupChatViewModel) this$0.r();
                if (((GroupChatViewModel) this$0.r()).f9189u == ((GroupChatViewModel) this$0.r()).f9183r) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                groupChatViewModel7.f9198y0 = z10;
                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                    ((GroupChatViewModel) this$0.r()).f9193w = ((GroupChatViewModel) this$0.r()).f9191v;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    new ud.a().show(this$0.getChildFragmentManager(), "GroupChatAssetSelectionBottomSheet");
                    return;
                }
                if (r3.k.checkSelfPermission(this$0.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    if (q3.h.b(this$0.requireActivity(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
                        wo.m g10 = wo.m.g(((wh) this$0.q()).f6532s, "Storage access permissions are required to upload/download files.", 0);
                        String string = this$0.getString(R.string.ok);
                        d dVar = new d(this$0, i12);
                        Button actionView = ((SnackbarContentLayout) g10.f39390i.getChildAt(0)).getActionView();
                        if (!TextUtils.isEmpty(string)) {
                            g10.D = true;
                            actionView.setVisibility(0);
                            actionView.setText(string);
                            actionView.setOnClickListener(new fm.a(1, g10, dVar));
                        } else {
                            actionView.setVisibility(8);
                            actionView.setOnClickListener(null);
                            g10.D = false;
                        }
                        g10.h();
                        return;
                    }
                    dp.b.A1(this$0.requireActivity());
                    return;
                }
                this$0.f9162v.a(new String[]{"image/*", "video/*", "application/pdf"});
                return;
            case 2:
                PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GroupChatViewModel groupChatViewModel8 = (GroupChatViewModel) this$0.r();
                if (groupChatViewModel8.f9197y == null) {
                    yk.g.H(u0.f(groupChatViewModel8), null, null, new x(groupChatViewModel8, null), 3);
                }
                ChatSharedViewModel L = this$0.L();
                RecyclerView rvStickerView = ((wh) this$0.q()).f6533t.D;
                Intrinsics.checkNotNullExpressionValue(rvStickerView, "rvStickerView");
                if (rvStickerView.getVisibility() == 0) {
                    z11 = true;
                }
                L.f9133n = !z11;
                RecyclerView rvStickerView2 = ((wh) this$0.q()).f6533t.D;
                Intrinsics.checkNotNullExpressionValue(rvStickerView2, "rvStickerView");
                if (rvStickerView2.getVisibility() == 0) {
                    RecyclerView rvStickerView3 = ((wh) this$0.q()).f6533t.D;
                    Intrinsics.checkNotNullExpressionValue(rvStickerView3, "rvStickerView");
                    kj.f.a(rvStickerView3, new j(this$0, i11));
                    return;
                } else {
                    RecyclerView rvStickerView4 = ((wh) this$0.q()).f6533t.D;
                    Intrinsics.checkNotNullExpressionValue(rvStickerView4, "rvStickerView");
                    kj.f.a(rvStickerView4, new j(this$0, i12));
                    RecyclerView rvStickerView5 = ((wh) this$0.q()).f6533t.D;
                    Intrinsics.checkNotNullExpressionValue(rvStickerView5, "rvStickerView");
                    this$0.u(rvStickerView5);
                    return;
                }
            case 3:
                PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayoutManager linearLayoutManager = this$0.f9158r;
                if (linearLayoutManager != null) {
                    linearLayoutManager.D0(((wh) this$0.q()).f6533t.B, 0);
                    return;
                } else {
                    Intrinsics.k("linearLayoutManager");
                    throw null;
                }
            case 4:
                PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Group group4 = (Group) ((GroupChatViewModel) this$0.r()).D.getValue();
                if (group4 != null && (groupId = group4.getGroupId()) != null) {
                    Intent intent = new Intent(this$0.requireContext(), (Class<?>) GroupPinnedMessagesActivity.class);
                    intent.putExtra("GROUP_CHAT_ID", groupId);
                    intent.putExtra("MESSAGES_TYPE", "GROUP_PINNED_MESSAGES");
                    this$0.startActivity(intent);
                    return;
                }
                return;
            default:
                PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                dp.b.A1(this$0.requireActivity());
                return;
        }
    }
}
