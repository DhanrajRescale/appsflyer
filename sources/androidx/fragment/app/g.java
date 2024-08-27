package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.MenuItem;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.data.model.AuthUiModel;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import com.assetgro.stockgro.ui.social.domain.model.User;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.remote.SignInKickstarter;
import com.firebase.ui.auth.ui.email.CheckEmailHandler;
import com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.firebase.ui.auth.viewmodel.email.RecoverPasswordHandler;
import com.firebase.ui.auth.viewmodel.email.WelcomeBackPasswordHandler;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m.p2;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements y3.f, e5.j, e5.k, u5.m, r7.j, p2, et.c, gl.h, OnSuccessListener, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1705c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f1703a = i10;
        this.f1704b = obj;
        this.f1705c = obj2;
    }

    @Override // y3.f
    public void a() {
        Animator animator = (Animator) this.f1704b;
        f2 operation = (f2) this.f1705c;
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // et.c
    public void b(Object obj) {
        AuthType authType;
        int i10 = this.f1703a;
        String str = "User Unbanned";
        Object obj2 = this.f1705c;
        Object obj3 = this.f1704b;
        switch (i10) {
            case 17:
                GroupChatViewModel this$0 = (GroupChatViewModel) obj3;
                String role = (String) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(role, "$role");
                this$0.f9084g.postValue(Boolean.FALSE);
                if (Intrinsics.a(role, "Rogue")) {
                    str = "User Banned";
                }
                this$0.V.postValue(str);
                this$0.A0 = 0;
                String str2 = this$0.f9196x0;
                if (str2 != null) {
                    this$0.o(str2);
                    return;
                }
                return;
            case 18:
            case 21:
            case 22:
            default:
                SocialActivityViewModel this$02 = (SocialActivityViewModel) obj3;
                AuthUiModel uiState = (AuthUiModel) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(uiState, "$uiState");
                this$02.f9084g.postValue(Boolean.FALSE);
                this$02.f10111u.postValue(uiState);
                return;
            case 19:
                GroupMemberListViewModel this$03 = (GroupMemberListViewModel) obj3;
                String role2 = (String) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(role2, "$role");
                this$03.f9084g.postValue(Boolean.FALSE);
                if (role2.equals("Rogue")) {
                    str = "User Banned";
                }
                this$03.f9292t.postValue(str);
                this$03.H = 0;
                this$03.m();
                return;
            case 20:
                GroupPinnedMessagesViewModel this$04 = (GroupPinnedMessagesViewModel) obj3;
                String messageId = (String) obj2;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(messageId, "$messageId");
                this$04.f9084g.postValue(Boolean.FALSE);
                this$04.f9309t.postValue(messageId);
                return;
            case 23:
                EditProfileViewModel this$05 = (EditProfileViewModel) obj3;
                String platform = (String) obj2;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(platform, "$platform");
                this$05.f9084g.postValue(Boolean.FALSE);
                androidx.lifecycle.e0 e0Var = this$05.f10040x;
                if (Intrinsics.a(platform, "linkedin")) {
                    authType = AuthType.LINKEDIN;
                } else {
                    authType = AuthType.FACEBOOK;
                }
                e0Var.postValue(new AuthUiModel(new xh.a(new Pair(authType, HttpUrl.FRAGMENT_ENCODE_SET)), true));
                return;
        }
    }

    @Override // gl.h
    public void c(File file) {
        hl.d slave = (hl.d) this.f1704b;
        hl.b bVar = (hl.b) this.f1705c;
        Intrinsics.checkNotNullParameter(slave, "$slave");
        Intrinsics.checkNotNullParameter(file, "file");
        slave.f18609g = bVar;
        slave.f18608f = file;
        Runnable runnable = slave.f18610h;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    @Override // u5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lp.j1 d(int r22, b5.j1 r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.d(int, b5.j1, int[]):lp.j1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c2  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5, types: [b5.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // e5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.lang.Object r26, b5.t r27) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.e(java.lang.Object, b5.t):void");
    }

    @Override // r7.j
    public void i() {
        int i10 = this.f1703a;
        Object obj = this.f1705c;
        Object obj2 = this.f1704b;
        switch (i10) {
            case 14:
                OptionChainFragment this$0 = (OptionChainFragment) obj2;
                FnoOption fnoOption = (FnoOption) obj;
                int i11 = OptionChainFragment.f8581h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(fnoOption, "$fnoOption");
                ((OptionChainViewModel) this$0.r()).h(fnoOption.getIdentifier());
                return;
            default:
                zc.i this$02 = (zc.i) obj2;
                ArenaGame it = (ArenaGame) obj;
                int i12 = zc.i.f42383n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "$it");
                ((LeagueLeaderBoardViewModel) this$02.r()).f9021r.postValue(it);
                return;
        }
    }

    @Override // e5.j
    public void invoke(Object obj) {
        switch (this.f1703a) {
            case 1:
                ((j5.c) obj).getClass();
                return;
            case 2:
                ((j5.c) obj).getClass();
                return;
            case 3:
                ((j5.c) obj).getClass();
                return;
            case 4:
                ((j5.c) obj).getClass();
                return;
            case 5:
                ((j5.c) obj).getClass();
                return;
            case 6:
            default:
                b5.p1 p1Var = (b5.p1) this.f1705c;
                j5.a0 a0Var = (j5.a0) ((j5.c) obj);
                l0.j jVar = a0Var.f20951o;
                if (jVar != null) {
                    b5.v vVar = (b5.v) jVar.f23774b;
                    if (vVar.f3658r == -1) {
                        b5.u a10 = vVar.a();
                        a10.f3605p = p1Var.f3568a;
                        a10.f3606q = p1Var.f3569b;
                        a0Var.f20951o = new l0.j(new b5.v(a10), jVar.f23773a, (String) jVar.f23775c);
                    }
                }
                int i10 = p1Var.f3568a;
                return;
            case 7:
                ((j5.c) obj).getClass();
                return;
            case 8:
                ((j5.c) obj).getClass();
                return;
            case 9:
                ((j5.c) obj).getClass();
                return;
            case 10:
                ((j5.c) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        am.d a10;
        int i10 = this.f1703a;
        Object obj = this.f1705c;
        Object obj2 = this.f1704b;
        switch (i10) {
            case 0:
                FirebaseAuth auth = (FirebaseAuth) obj2;
                EditProfileViewModel this$0 = (EditProfileViewModel) obj;
                Intrinsics.checkNotNullParameter(auth, "$auth");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(task, "task");
                boolean isSuccessful = task.isSuccessful();
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (isSuccessful) {
                    zp.h hVar = auth.f11632f;
                    if (hVar != null) {
                        String currentUserId = this$0.f9081d.getCurrentUserId();
                        if (currentUserId != null) {
                            str = currentUserId;
                        }
                        this$0.k(new SocialDataDto(str, hVar), "facebook");
                        return;
                    }
                    return;
                }
                Pair pair = new Pair("platform", AuthType.FACEBOOK);
                String currentUserId2 = this$0.f9081d.getCurrentUserId();
                if (currentUserId2 != null) {
                    str = currentUserId2;
                }
                new AnalyticEvent("social_auth_error", vt.p0.f(pair, new Pair("userId", str), new Pair("EVENT_TYPE", "ERROR_FIREBASE")));
                EditProfileViewModel.j();
                return;
            case 1:
                ir.b mFirebaseRemoteConfig = (ir.b) obj2;
                mj.b this$02 = (mj.b) obj;
                Intrinsics.checkNotNullParameter(mFirebaseRemoteConfig, "$mFirebaseRemoteConfig");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(task, "task");
                if (task.isSuccessful()) {
                    mFirebaseRemoteConfig.a().addOnCompleteListener(new b3.t(this$02, 2));
                    return;
                } else {
                    this$02.getClass();
                    return;
                }
            case 2:
                CheckEmailHandler checkEmailHandler = (CheckEmailHandler) obj2;
                String str2 = (String) obj;
                checkEmailHandler.getClass();
                if (task.isSuccessful()) {
                    checkEmailHandler.h(am.d.c(new am.e((String) task.getResult(), str2, null, null, null)));
                    return;
                } else {
                    checkEmailHandler.h(am.d.a(task.getException()));
                    return;
                }
            case 3:
                EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) obj2;
                String str3 = (String) obj;
                emailLinkSignInHandler.getClass();
                if (task.isSuccessful()) {
                    if (!TextUtils.isEmpty(str3)) {
                        emailLinkSignInHandler.h(am.d.a(new FirebaseUiException(10)));
                        return;
                    } else {
                        emailLinkSignInHandler.h(am.d.a(new FirebaseUiException(9)));
                        return;
                    }
                }
                emailLinkSignInHandler.h(am.d.a(new FirebaseUiException(7)));
                return;
            case 4:
                RecoverPasswordHandler recoverPasswordHandler = (RecoverPasswordHandler) obj2;
                String str4 = (String) obj;
                recoverPasswordHandler.getClass();
                if (task.isSuccessful()) {
                    a10 = am.d.c(str4);
                } else {
                    a10 = am.d.a(task.getException());
                }
                recoverPasswordHandler.h(a10);
                return;
            case 5:
                WelcomeBackPasswordHandler welcomeBackPasswordHandler = (WelcomeBackPasswordHandler) obj2;
                zp.d dVar = (zp.d) obj;
                welcomeBackPasswordHandler.getClass();
                if (task.isSuccessful()) {
                    welcomeBackPasswordHandler.i(dVar);
                    return;
                } else {
                    welcomeBackPasswordHandler.h(am.d.a(task.getException()));
                    return;
                }
            case 6:
                LinkingSocialProviderResponseHandler linkingSocialProviderResponseHandler = (LinkingSocialProviderResponseHandler) obj2;
                zl.d dVar2 = (zl.d) obj;
                linkingSocialProviderResponseHandler.getClass();
                if (task.isSuccessful()) {
                    linkingSocialProviderResponseHandler.j(dVar2, (zp.e) task.getResult());
                    return;
                } else {
                    linkingSocialProviderResponseHandler.h(am.d.a(task.getException()));
                    return;
                }
            default:
                int i11 = com.google.firebase.messaging.g.f11746a;
                ((com.google.firebase.messaging.g) obj2).a((Intent) obj);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [qj.b, java.lang.Object] */
    @Override // m.p2
    public boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        String memberName;
        int i10 = this.f1703a;
        String str2 = LogSubCategory.Action.USER;
        String str3 = "User";
        String str4 = null;
        int i11 = 1;
        Object obj = this.f1705c;
        Object obj2 = this.f1704b;
        int i12 = 0;
        switch (i10) {
            case 16:
                DeactivatedMembersListActivity this$0 = (DeactivatedMembersListActivity) obj2;
                GroupMember member = (GroupMember) obj;
                sb.b bVar = DeactivatedMembersListActivity.f9104l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(member, "$member");
                if (menuItem.getItemId() == R.id.menu_options_activate_user) {
                    DeactivatedMembersListViewModel deactivatedMembersListViewModel = (DeactivatedMembersListViewModel) this$0.x();
                    String userId = member.getUserId();
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    Intrinsics.checkNotNullParameter("User", "role");
                    deactivatedMembersListViewModel.f9084g.postValue(Boolean.TRUE);
                    yk.g.H(androidx.lifecycle.u0.f(deactivatedMembersListViewModel), null, null, new jd.d(deactivatedMembersListViewModel, userId, "User", null), 3);
                }
                return false;
            case 18:
                GroupInfoV2Fragment this$02 = (GroupInfoV2Fragment) obj2;
                GroupMember member2 = (GroupMember) obj;
                int i13 = GroupInfoV2Fragment.f9216r;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(member2, "$member");
                int itemId = menuItem.getItemId();
                if (itemId != R.id.menu_options_person_info) {
                    switch (itemId) {
                        case 100:
                            this$02.N(member2);
                            break;
                        case 101:
                            ((GroupInfoViewModel) this$02.r()).j(member2.getUserId(), "User");
                            break;
                        case 102:
                            String userId2 = member2.getUserId();
                            ?? obj3 = new Object();
                            Context requireContext = this$02.requireContext();
                            String string = this$02.getString(R.string.text_remove_user_description);
                            String string2 = this$02.getString(R.string.text_remove_user);
                            String string3 = this$02.getString(R.string.text_yes);
                            String string4 = this$02.getString(R.string.cancel);
                            td.z zVar = new td.z(this$02, userId2, 2);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string4);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext, string, string3, string4, string2, null, false, 0, 0, zVar, 65488);
                            break;
                        case 103:
                            String userId3 = member2.getUserId();
                            ?? obj4 = new Object();
                            Context requireContext2 = this$02.requireContext();
                            String string5 = this$02.getString(R.string.text_block_user_description);
                            String string6 = this$02.getString(R.string.text_block_user);
                            String string7 = this$02.getString(R.string.text_yes);
                            String string8 = this$02.getString(R.string.cancel);
                            td.z zVar2 = new td.z(this$02, userId3, i12);
                            Intrinsics.c(requireContext2);
                            Intrinsics.c(string5);
                            Intrinsics.c(string7);
                            Intrinsics.c(string8);
                            Intrinsics.c(string6);
                            qj.b.b(obj4, requireContext2, string5, string7, string8, string6, null, false, 0, 0, zVar2, 65488);
                            break;
                        case 104:
                            String username = member2.getUsername();
                            if (username != null) {
                                String userId4 = member2.getUserId();
                                ?? obj5 = new Object();
                                Context requireContext3 = this$02.requireContext();
                                String string9 = this$02.getString(R.string.text_are_you_sure_report_user);
                                String string10 = this$02.getString(R.string.text_report_user);
                                String string11 = this$02.getString(R.string.text_yes);
                                String string12 = this$02.getString(R.string.cancel);
                                td.a0 a0Var = new td.a0(username, userId4, i12, this$02);
                                Intrinsics.c(requireContext3);
                                Intrinsics.c(string9);
                                Intrinsics.c(string11);
                                Intrinsics.c(string12);
                                Intrinsics.c(string10);
                                qj.b.b(obj5, requireContext3, string9, string11, string12, string10, null, false, 0, 0, a0Var, 65488);
                                break;
                            }
                            break;
                        case 105:
                            ((GroupInfoViewModel) this$02.r()).j(member2.getUserId(), "Rogue");
                            break;
                        case 106:
                            ((GroupInfoViewModel) this$02.r()).j(member2.getUserId(), "Seeder");
                            break;
                        case 107:
                            ((GroupInfoViewModel) this$02.r()).A = member2;
                            this$02.f9222l = td.i.f35887a;
                            Group group = (Group) ((GroupInfoViewModel) this$02.r()).f9246q.getValue();
                            if (group != null) {
                                str = group.getGroupName();
                            } else {
                                str = null;
                            }
                            GroupMember groupMember = ((GroupInfoViewModel) this$02.r()).A;
                            if (groupMember != null && (memberName = groupMember.getMemberName()) != null) {
                                str2 = memberName;
                            }
                            GroupMember groupMember2 = ((GroupInfoViewModel) this$02.r()).A;
                            if (groupMember2 != null) {
                                str4 = groupMember2.getUsername();
                            }
                            String string13 = this$02.getString(R.string.text_are_you_sure_to_add_admin);
                            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                            String m10 = a3.a.m(new Object[]{str2, str4, str}, 3, string13, "format(...)");
                            int length = str2.length() + 20;
                            SpannableString spannableString = new SpannableString(m10);
                            spannableString.setSpan(new StyleSpan(1), 20, length, 33);
                            String string14 = this$02.getString(R.string.text_add_as_admin);
                            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                            String string15 = this$02.getString(R.string.text_yes);
                            Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                            String string16 = this$02.getString(R.string.cancel);
                            Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                            ci.c socialBottomSheetData = new ci.c(R.drawable.ic_add_admin, string14, spannableString, string15, string16);
                            Intrinsics.checkNotNullParameter(socialBottomSheetData, "socialBottomSheetData");
                            Bundle bundle = new Bundle();
                            ci.b bVar2 = new ci.b();
                            bundle.putSerializable("DATA", socialBottomSheetData);
                            bVar2.setArguments(bundle);
                            bVar2.show(this$02.getChildFragmentManager(), "SocialActionConfirmationBottomSheet");
                            break;
                        case 108:
                            ((GroupInfoViewModel) this$02.r()).j(member2.getUserId(), "Moderator");
                            break;
                        case 109:
                            String userId5 = member2.getUserId();
                            ?? obj6 = new Object();
                            Context requireContext4 = this$02.requireContext();
                            String string17 = this$02.getString(R.string.text_deactivate_user_description);
                            String string18 = this$02.getString(R.string.text_deactivate_user);
                            String string19 = this$02.getString(R.string.text_yes);
                            String string20 = this$02.getString(R.string.cancel);
                            td.z zVar3 = new td.z(this$02, userId5, i11);
                            Intrinsics.c(requireContext4);
                            Intrinsics.c(string17);
                            Intrinsics.c(string19);
                            Intrinsics.c(string20);
                            Intrinsics.c(string18);
                            qj.b.b(obj6, requireContext4, string17, string19, string20, string18, null, false, 0, 0, zVar3, 65488);
                            break;
                        case 110:
                            ((GroupInfoViewModel) this$02.r()).i(member2.getUserId(), "User");
                            break;
                        case 111:
                            ((GroupInfoViewModel) this$02.r()).j(member2.getUserId(), "User");
                            break;
                    }
                } else {
                    this$02.O(member2);
                }
                return false;
            case 22:
                BannedMembersListActivity this$03 = (BannedMembersListActivity) obj2;
                GroupMember member3 = (GroupMember) obj;
                int i14 = BannedMembersListActivity.f9417l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(member3, "$member");
                if (menuItem.getItemId() == R.id.menu_options_unban_user) {
                    BannedMemberListViewModel bannedMemberListViewModel = (BannedMemberListViewModel) this$03.x();
                    String userId6 = member3.getUserId();
                    Intrinsics.checkNotNullParameter(userId6, "userId");
                    Intrinsics.checkNotNullParameter("User", "role");
                    bannedMemberListViewModel.f9084g.postValue(Boolean.TRUE);
                    nt.h c10 = bannedMemberListViewModel.f9407n.banUnbanGroupMember(userId6, bannedMemberListViewModel.f9414u, "User").c(((kq.e) bannedMemberListViewModel.f9079b).J());
                    jt.d dVar = new jt.d(new ie.n(i11, bannedMemberListViewModel, str3, userId6), new ge.q(9, new me.a(bannedMemberListViewModel, i12)));
                    c10.a(dVar);
                    bannedMemberListViewModel.f9080c.c(dVar);
                }
                return false;
            default:
                BlockedUserListActivity this$04 = (BlockedUserListActivity) obj2;
                User user = (User) obj;
                int i15 = BlockedUserListActivity.f10120l;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(user, "$user");
                if (menuItem.getItemId() == 1) {
                    BlockedUserListViewModel blockedUserListViewModel = (BlockedUserListViewModel) this$04.x();
                    Intrinsics.checkNotNullParameter(user, "user");
                    blockedUserListViewModel.f9084g.postValue(Boolean.TRUE);
                    yk.g.H(androidx.lifecycle.u0.f(blockedUserListViewModel), null, null, new bi.f(blockedUserListViewModel, false, user, null), 3);
                }
                return false;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task;
        boolean z10;
        KickoffActivity kickoffActivity = (KickoffActivity) this.f1704b;
        if (((Bundle) this.f1705c) != null) {
            int i10 = KickoffActivity.f10897g;
            kickoffActivity.getClass();
            return;
        }
        SignInKickstarter signInKickstarter = kickoffActivity.f10898f;
        if (!TextUtils.isEmpty(((am.b) signInKickstarter.f10961d).f748h)) {
            signInKickstarter.h(am.d.a(new IntentRequiredException(106, cm.c.v(signInKickstarter.e(), EmailLinkCatcherActivity.class, (am.b) signInKickstarter.f10961d))));
            return;
        }
        aq.p pVar = signInKickstarter.f10958g.f11643q.f2759a;
        pVar.getClass();
        if (DefaultClock.getInstance().currentTimeMillis() - pVar.f2752c < 3600000) {
            task = pVar.f2750a;
        } else {
            task = null;
        }
        if (task != null) {
            task.addOnSuccessListener(new bm.f(signInKickstarter)).addOnFailureListener(new bm.f(signInKickstarter));
            return;
        }
        boolean z11 = false;
        if (el.l.d0("password", ((am.b) signInKickstarter.f10961d).f742b) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((am.b) signInKickstarter.f10961d).f742b.iterator();
        while (it.hasNext()) {
            String str = ((zl.b) it.next()).f42555a;
            if (str.equals("google.com")) {
                arrayList.add(el.l.x0(str));
            }
        }
        if (z10 || arrayList.size() > 0) {
            z11 = true;
        }
        if (((am.b) signInKickstarter.f10961d).f750j && z11) {
            signInKickstarter.h(am.d.b());
            hm.b.a(signInKickstarter.e()).request(new CredentialRequest.Builder().setPasswordLoginSupported(z10).setAccountTypes((String[]) arrayList.toArray(new String[arrayList.size()])).build()).addOnCompleteListener(new b3.t(signInKickstarter, 3));
        } else {
            signInKickstarter.m();
        }
    }
}
