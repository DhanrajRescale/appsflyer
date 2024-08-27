package com.assetgro.stockgro.ui.chat.detail.group;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import androidx.work.i0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.StickersDto;
import com.assetgro.stockgro.data.model.UserInfo;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kq.e;
import le.c;
import ni.j;
import okhttp3.HttpUrl;
import pj.a;
import rd.q;
import rd.r;
import rd.s;
import rd.v;
import rd.z;
import vl.b;
import vt.p0;
import vt.y;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/GroupChatViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupChatViewModel extends BaseViewModel {
    public final ArrayList A;
    public int A0;
    public final e0 B;
    public final String B0;
    public final e0 C;
    public String C0;
    public final e0 D;
    public final e0 D0;
    public final e0 E;
    public final e0 E0;
    public final e0 F;
    public final e0 F0;
    public final e0 G;
    public final e0 G0;
    public final e0 H;
    public final e0 H0;
    public final e0 I;
    public final e0 I0;
    public final e0 J;
    public final e0 J0;
    public final e0 K;
    public boolean K0;
    public final e0 L;
    public boolean L0;
    public final e0 M;
    public boolean M0;
    public final e0 N;
    public final e0 O;
    public final e0 P;
    public final ArrayList Q;
    public final e0 R;
    public final e0 S;
    public final e0 T;
    public final e0 U;
    public final e0 V;
    public final e0 W;
    public final e0 X;
    public final e0 Y;
    public final e0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final e0 f9163a0;

    /* renamed from: b0, reason: collision with root package name */
    public final List f9164b0;

    /* renamed from: c0, reason: collision with root package name */
    public final List f9165c0;

    /* renamed from: d0, reason: collision with root package name */
    public final List f9166d0;

    /* renamed from: e0, reason: collision with root package name */
    public final e0 f9167e0;

    /* renamed from: f0, reason: collision with root package name */
    public final e0 f9168f0;

    /* renamed from: g0, reason: collision with root package name */
    public final e0 f9169g0;

    /* renamed from: h0, reason: collision with root package name */
    public final e0 f9170h0;

    /* renamed from: i0, reason: collision with root package name */
    public final e0 f9171i0;

    /* renamed from: j0, reason: collision with root package name */
    public final e0 f9172j0;

    /* renamed from: k0, reason: collision with root package name */
    public final e0 f9173k0;

    /* renamed from: l0, reason: collision with root package name */
    public final e0 f9174l0;

    /* renamed from: m0, reason: collision with root package name */
    public final e0 f9175m0;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9176n;
    public final int n0;

    /* renamed from: o, reason: collision with root package name */
    public final i0 f9177o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f9178o0;

    /* renamed from: p, reason: collision with root package name */
    public final int f9179p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f9180p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f9181q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f9182q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f9183r;

    /* renamed from: r0, reason: collision with root package name */
    public ChatMessage f9184r0;

    /* renamed from: s, reason: collision with root package name */
    public final int f9185s;

    /* renamed from: s0, reason: collision with root package name */
    public final HashSet f9186s0;

    /* renamed from: t, reason: collision with root package name */
    public UUID f9187t;

    /* renamed from: t0, reason: collision with root package name */
    public final HashSet f9188t0;

    /* renamed from: u, reason: collision with root package name */
    public int f9189u;

    /* renamed from: u0, reason: collision with root package name */
    public String f9190u0;

    /* renamed from: v, reason: collision with root package name */
    public ChatMessage f9191v;

    /* renamed from: v0, reason: collision with root package name */
    public String f9192v0;

    /* renamed from: w, reason: collision with root package name */
    public ChatMessage f9193w;

    /* renamed from: w0, reason: collision with root package name */
    public int f9194w0;

    /* renamed from: x, reason: collision with root package name */
    public final String f9195x;

    /* renamed from: x0, reason: collision with root package name */
    public String f9196x0;

    /* renamed from: y, reason: collision with root package name */
    public StickersDto f9197y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f9198y0;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f9199z;

    /* renamed from: z0, reason: collision with root package name */
    public long f9200z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v25, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v26, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v28, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v29, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v30, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v31, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v32, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v33, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v34, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v41, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v42, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v43, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v44, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v45, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v46, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v47, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v48, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v52, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v53, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v54, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v55, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v56, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v57, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v58, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupChatViewModel(i0 workManager, ArenaRepository arenaRepository, ChatRepository chatRepository, ContactsRepository contactsRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f9176n = chatRepository;
        this.f9177o = workManager;
        this.f9179p = 100;
        this.f9181q = 101;
        this.f9183r = 102;
        this.f9185s = 103;
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        this.f9187t = randomUUID;
        this.f9189u = 100;
        this.f9195x = "desi";
        this.f9199z = new ArrayList();
        this.A = new ArrayList();
        this.B = h.i();
        this.C = new LiveData();
        this.D = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData();
        this.G = new LiveData();
        this.H = new LiveData();
        this.I = new LiveData();
        this.J = new LiveData();
        this.K = new LiveData();
        this.L = new LiveData();
        this.M = new LiveData();
        this.N = new LiveData();
        this.O = new LiveData();
        this.P = new LiveData();
        this.Q = new ArrayList();
        this.R = new LiveData();
        this.S = new LiveData();
        this.T = new LiveData();
        this.U = new LiveData();
        this.V = new LiveData();
        this.W = new LiveData();
        this.X = new LiveData();
        this.Y = new LiveData();
        this.Z = new LiveData();
        this.f9163a0 = new LiveData();
        this.f9164b0 = y.g("Social", "League", "Private");
        this.f9165c0 = y.g("Admin", "Moderator");
        this.f9166d0 = y.g("Admin", "Moderator");
        this.f9167e0 = new LiveData();
        this.f9168f0 = new LiveData();
        this.f9169g0 = new LiveData();
        this.f9170h0 = new LiveData();
        this.f9171i0 = new LiveData();
        this.f9172j0 = new LiveData();
        this.f9173k0 = new LiveData();
        ?? liveData = new LiveData();
        this.f9174l0 = liveData;
        this.f9175m0 = liveData;
        this.n0 = 100;
        this.f9178o0 = true;
        this.f9180p0 = true;
        this.f9182q0 = true;
        this.f9186s0 = new HashSet();
        this.f9188t0 = new HashSet();
        this.f9190u0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9192v0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9196x0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.B0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.D0 = new LiveData();
        this.E0 = new LiveData();
        this.F0 = new LiveData();
        this.G0 = new LiveData();
        this.H0 = new LiveData();
        this.I0 = new LiveData();
        this.J0 = new LiveData();
        this.M0 = true;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        nt.h c10 = chatRepository.getListOfAdmin().c(((e) this.f9079b).J());
        d dVar = new d(new q(22, new r(this, 5)), new q(23, new r(this, 6)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public static final ChatMessage h(GroupChatViewModel groupChatViewModel, Map map) {
        LinkedTreeMap linkedTreeMap;
        groupChatViewModel.getClass();
        if (map instanceof LinkedTreeMap) {
            linkedTreeMap = (LinkedTreeMap) map;
        } else {
            linkedTreeMap = null;
        }
        Gson gson = new Gson();
        Object fromJson = gson.fromJson(gson.toJsonTree(linkedTreeMap), (Class<Object>) ChatMessage.class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return (ChatMessage) fromJson;
    }

    public static ArrayList m(List members) {
        Intrinsics.checkNotNullParameter(members, "members");
        ArrayList arrayList = new ArrayList();
        Iterator it = members.iterator();
        while (it.hasNext()) {
            GroupMember groupMember = (GroupMember) it.next();
            String userId = groupMember.getUserId();
            String memberName = groupMember.getMemberName();
            if (memberName != null && memberName.length() != 0) {
                arrayList.add(new sj.d(groupMember.getMemberName(), groupMember.getDisplayPicture(), userId));
            }
        }
        return arrayList;
    }

    public static long u() {
        return System.currentTimeMillis() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
    }

    public final void A(Context context, Uri uri, String str, ChatMessage chatMessage, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String z10 = b.z(context, uri);
        if (z10 != null && !Intrinsics.a(z10, HttpUrl.FRAGMENT_ENCODE_SET)) {
            try {
                String type = context.getContentResolver().getType(uri);
                if (type == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str3 = type;
                }
                B(uri, str, str3, b.I(context, uri), chatMessage, null, str2);
                return;
            } catch (Exception e10) {
                Toast.makeText(context, context.getString(R.string.chat_wrong_file_location), 1).show();
                FirebaseCrashlytics.getInstance().recordException(e10);
                return;
            }
        }
        Toast.makeText(context, context.getString(R.string.chat_wrong_file_location), 1).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0211  */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.work.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.net.Uri r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, com.assetgro.stockgro.data.model.ChatMessage r55, com.assetgro.stockgro.data.uimodel.StickerData r56, java.lang.String r57) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel.B(android.net.Uri, java.lang.String, java.lang.String, java.lang.String, com.assetgro.stockgro.data.model.ChatMessage, com.assetgro.stockgro.data.uimodel.StickerData, java.lang.String):void");
    }

    public final void C(String str, String messageId, boolean z10) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        nt.h c10 = this.f9176n.starMessageForUser(str, messageId, Boolean.valueOf(z10)).c(((e) this.f9079b).J());
        d dVar = new d(new j5.d(12), new id.h(27, z.f33669d));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void D() {
        ChatRepository chatRepository = this.f9176n;
        String userId = chatRepository.getUserId();
        String accessToken = HttpUrl.FRAGMENT_ENCODE_SET;
        if (userId == null) {
            userId = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String groupId = this.f9196x0;
        if (groupId == null) {
            groupId = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String accessToken2 = chatRepository.getAccessToken();
        if (accessToken2 != null) {
            accessToken = accessToken2;
        }
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        c.f24607b = userId;
        c.f24608c = groupId;
        c.f24609d = accessToken;
        androidx.compose.foundation.layout.e output = new androidx.compose.foundation.layout.e(this, 23);
        Intrinsics.checkNotNullParameter(output, "output");
        dp.b.V0(c.f24607b, new le.b(output));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void i(String str, String str2) {
        this.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = this.f9176n.banUnbanGroupMember(str, this.f9196x0, str2).c(((e) this.f9079b).J());
        d dVar = new d(new g(17, this, str2), new q(8, new r(this, 0)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void j() {
        String friendUserId;
        Group group = (Group) this.D.getValue();
        if (group != null && (friendUserId = group.getFriendUserId()) != null) {
            this.f9084g.postValue(Boolean.TRUE);
            yk.g.H(u0.f(this), null, null, new s(this, false, friendUserId, null), 3);
        }
    }

    public final void k(ChatMessage chatMessage) {
        String str;
        if (c.f24606a != null && !(!r0.a())) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("message_id", chatMessage.getMessageId());
            Group group = (Group) this.D.getValue();
            if (group != null) {
                str = group.getGroupId();
            } else {
                str = null;
            }
            pairArr[1] = new Pair("group_id", str);
            pairArr[2] = new Pair("token", a3.a.f("Bearer ", this.f9176n.getAccessToken()));
            Map payload = p0.g(pairArr);
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                fv.e eVar = c.f24606a;
                if (eVar != null) {
                    fv.g e10 = eVar.e("del_msg_in", eVar.f16283d, payload);
                    e10.a("ok", le.a.f24588b);
                    e10.a("error", le.a.f24589c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.O.postValue(chatMessage);
        }
    }

    public final void l() {
        String str;
        this.f9186s0.clear();
        this.K0 = true;
        this.L0 = false;
        this.f9084g.postValue(Boolean.TRUE);
        Group group = (Group) this.D.getValue();
        if (group != null) {
            str = group.getGroupId();
        } else {
            str = null;
        }
        nt.h c10 = this.f9176n.fetchRecentMessages(str).c(((e) this.f9079b).J());
        d dVar = new d(new q(6, new r(this, 3)), new q(7, new r(this, 4)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void n(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        this.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = this.f9176n.getChatGroupById(groupId, true, true).c(((e) this.f9079b).J());
        d dVar = new d(new q(12, new r(this, 7)), new q(13, new r(this, 8)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void o(String str) {
        this.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = this.f9176n.getGroupMembers(str, this.n0, this.A0).c(((e) this.f9079b).J());
        d dVar = new d(new q(14, new r(this, 9)), new q(15, new r(this, 10)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final String p() {
        String type;
        e0 e0Var = this.D;
        Group group = (Group) e0Var.getValue();
        if (group != null && (type = group.getType()) != null) {
            if (!Intrinsics.a(type, "Support") && !Intrinsics.a(type, "1on1")) {
                Group group2 = (Group) e0Var.getValue();
                if (group2 == null) {
                    return null;
                }
                return group2.getGroupName();
            }
            Group group3 = (Group) e0Var.getValue();
            if (group3 == null) {
                return null;
            }
            return group3.getFriendUserName();
        }
        Group group4 = (Group) e0Var.getValue();
        if (group4 == null) {
            return null;
        }
        return group4.getGroupName();
    }

    public final void q(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f9084g.postValue(Boolean.TRUE);
        nt.h c10 = this.f9176n.getGroupPinnedMessages(groupId).c(((e) this.f9079b).J());
        d dVar = new d(new q(18, new r(this, 11)), new q(19, new r(this, 12)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void r(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f9084g.postValue(Boolean.TRUE);
        yk.g.H(u0.f(this), null, null, new v(this, userId, null), 3);
    }

    public final ArrayList s(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            sj.d dVar = (sj.d) it.next();
            String f10 = a3.a.f("@", dVar.f34661a);
            if (kotlin.text.s.r(str, f10, false) || w.s(str, f10, false)) {
                arrayList.add(new UserInfo(dVar.f34663c, dVar.f34661a));
            }
        }
        return arrayList;
    }

    public final ArrayList t(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            sj.d dVar = (sj.d) it.next();
            String f10 = a3.a.f("@", dVar.f34661a);
            if (kotlin.text.s.r(str, f10, false) || w.s(str, f10, false)) {
                arrayList.add(dVar.f34663c);
            }
        }
        return arrayList;
    }

    public final void v(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        e0 e0Var = this.f9084g;
        e0Var.postValue(Boolean.TRUE);
        try {
            yk.g.H(u0.f(this), null, null, new rd.y(this, userId, null), 3);
        } catch (Exception unused) {
            e0Var.postValue(Boolean.FALSE);
        }
    }

    public final boolean w() {
        String str = this.f9190u0;
        List list = this.f9166d0;
        if (!list.contains(str) && !list.contains(this.f9192v0)) {
            return false;
        }
        return true;
    }

    public final boolean x() {
        String type;
        Group group = (Group) this.D.getValue();
        if (group != null && (type = group.getType()) != null) {
            return this.f9164b0.contains(type);
        }
        return false;
    }

    public final void y(String str, Long l10, String str2) {
        this.f9084g.postValue(Boolean.TRUE);
        ChatRepository chatRepository = this.f9176n;
        nt.h c10 = chatRepository.markMessagesAsRead(chatRepository.getUserId(), str, str2, l10).c(((e) this.f9079b).J());
        d dVar = new d(new vc.b(this, 4), new q(20, new r(this, 19)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void z(String searchString) {
        String str;
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        this.f9084g.postValue(Boolean.TRUE);
        Group group = (Group) this.D.getValue();
        if (group != null) {
            str = group.getGroupId();
        } else {
            str = null;
        }
        nt.h c10 = this.f9176n.searchGroupMembers(str, searchString, 100, 0).c(((e) this.f9079b).J());
        d dVar = new d(new q(2, new r(this, 21)), new q(3, new r(this, 22)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }
}
