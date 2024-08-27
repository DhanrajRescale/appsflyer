package da;

import android.content.Context;
import androidx.lifecycle.h1;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.SocialAuthRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.info.bottomSheet.EmptyBottomSheetViewModel;
import com.assetgro.stockgro.ui.drawer.about.AppAboutViewModel;
import com.assetgro.stockgro.ui.drawer.invite.InviteViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import com.assetgro.stockgro.ui.payments.status.PaymentTransactionBottomSheetViewModel;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.list.StockListHostViewModel;
import com.assetgro.stockgro.ui.stock.sort.StockSortViewModel;
import com.assetgro.stockgro.ui.subscription.SubscribeToAccessBottomSheetViewModel;
import ea.b0;
import ea.f0;
import ea.k;
import ea.o;
import ea.r;
import ea.u;
import ea.v;
import gd.h;
import iu.a0;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import w.r0;
import yk.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b f14246a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14247b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14248c = this;

    public /* synthetic */ a(Object obj, b bVar) {
        this.f14246a = bVar;
        this.f14247b = obj;
    }

    public final AppAboutViewModel a() {
        v vVar = (v) this.f14247b;
        kq.e k10 = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(this.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(AppAboutViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 0));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, AppAboutViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(AppAboutViewModel.class, "<this>", AppAboutViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            AppAboutViewModel appAboutViewModel = (AppAboutViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(appAboutViewModel);
            return appAboutViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final ChatSharedViewModel b() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        ChatRepository chatRepository = this.f14246a.b();
        g.i(chatRepository);
        androidx.work.i0 workManager = (androidx.work.i0) this.f14246a.f14273y.get();
        g.i(workManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        ca.c factory = new ca.c(a0.a(ChatSharedViewModel.class), new ea.f(schedulerProvider, compositeDisposable, userRepository, chatRepository, workManager, 0));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, ChatSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ChatSharedViewModel.class, "<this>", ChatSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ChatSharedViewModel chatSharedViewModel = (ChatSharedViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(chatSharedViewModel);
            return chatSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final ContactsRepository c() {
        Context context = (Context) this.f14246a.f14250b.get();
        g.i(context);
        NetworkService networkService = (NetworkService) this.f14246a.f14260l.get();
        g.i(networkService);
        return new ContactsRepository(context, networkService);
    }

    public final EditProfileViewModel d() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        mj.a stockgroRemoteConfig = (mj.a) this.f14246a.B.get();
        g.i(stockgroRemoteConfig);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stockgroRemoteConfig, "stockgroRemoteConfig");
        ca.c factory = new ca.c(a0.a(EditProfileViewModel.class), new r0(schedulerProvider, compositeDisposable, userRepository, stockgroRemoteConfig, 4));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, EditProfileViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(EditProfileViewModel.class, "<this>", EditProfileViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            EditProfileViewModel editProfileViewModel = (EditProfileViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(editProfileViewModel);
            return editProfileViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final EmptyBottomSheetViewModel e() {
        f0 f0Var = (f0) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(EmptyBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 4));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, EmptyBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(EmptyBottomSheetViewModel.class, "<this>", EmptyBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            EmptyBottomSheetViewModel emptyBottomSheetViewModel = (EmptyBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(emptyBottomSheetViewModel);
            return emptyBottomSheetViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final GroupChatViewModel f() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        ChatRepository chatRepository = this.f14246a.b();
        g.i(chatRepository);
        FollowerRepository followerRepository = this.f14246a.f();
        g.i(followerRepository);
        ContactsRepository contactsRepository = c();
        ArenaRepository arenaRepository = this.f14246a.a();
        g.i(arenaRepository);
        androidx.work.i0 workManager = (androidx.work.i0) this.f14246a.f14273y.get();
        g.i(workManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        ca.c factory = new ca.c(a0.a(GroupChatViewModel.class), new ea.h(schedulerProvider, compositeDisposable, chatRepository, followerRepository, contactsRepository, userRepository, arenaRepository, workManager, 0));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupChatViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupChatViewModel.class, "<this>", GroupChatViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupChatViewModel);
            return groupChatViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final GroupCreateViewModel g() {
        v vVar = (v) this.f14247b;
        kq.e k10 = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        FollowerRepository followerRepository = this.f14246a.f();
        g.i(followerRepository);
        ChatRepository chatRepository = this.f14246a.b();
        g.i(chatRepository);
        ContactsRepository contactsRepository = c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(this.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(GroupCreateViewModel.class), new ea.b(k10, compositeDisposable, followerRepository, chatRepository, contactsRepository, userRepository, 1));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, GroupCreateViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupCreateViewModel.class, "<this>", GroupCreateViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupCreateViewModel);
            return groupCreateViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final InviteViewModel h() {
        v vVar = (v) this.f14247b;
        kq.e k10 = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(this.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(InviteViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 12));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, InviteViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(InviteViewModel.class, "<this>", InviteViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            InviteViewModel inviteViewModel = (InviteViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(inviteViewModel);
            return inviteViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final PaymentTransactionBottomSheetViewModel i() {
        f0 f0Var = (f0) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(PaymentTransactionBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 12));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, PaymentTransactionBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PaymentTransactionBottomSheetViewModel.class, "<this>", PaymentTransactionBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PaymentTransactionBottomSheetViewModel paymentTransactionBottomSheetViewModel = (PaymentTransactionBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(paymentTransactionBottomSheetViewModel);
            return paymentTransactionBottomSheetViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final RedemptionHostViewModel j() {
        v vVar = (v) this.f14247b;
        kq.e k10 = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        PaymentRepository paymentRepository = this.f14246a.i();
        g.i(paymentRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(this.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(RedemptionHostViewModel.class), new k(k10, compositeDisposable, paymentRepository, userRepository, 2));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, RedemptionHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RedemptionHostViewModel.class, "<this>", RedemptionHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RedemptionHostViewModel redemptionHostViewModel = (RedemptionHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(redemptionHostViewModel);
            return redemptionHostViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final ReusedBottomSheetViewModel k() {
        f0 f0Var = (f0) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(ReusedBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 2));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, ReusedBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ReusedBottomSheetViewModel.class, "<this>", ReusedBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ReusedBottomSheetViewModel reusedBottomSheetViewModel = (ReusedBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(reusedBottomSheetViewModel);
            return reusedBottomSheetViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final SocialActivityViewModel l() {
        v vVar = (v) this.f14247b;
        kq.e k10 = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        ChatRepository chatRepository = this.f14246a.b();
        g.i(chatRepository);
        FollowerRepository followerRepository = this.f14246a.f();
        g.i(followerRepository);
        SocialAuthRepository socialAuthRepository = (SocialAuthRepository) this.f14246a.D.get();
        g.i(socialAuthRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(this.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(socialAuthRepository, "socialAuthRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(SocialActivityViewModel.class), new d1.b(k10, compositeDisposable, chatRepository, followerRepository, socialAuthRepository, userRepository, 1));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, SocialActivityViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialActivityViewModel.class, "<this>", SocialActivityViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialActivityViewModel socialActivityViewModel = (SocialActivityViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(socialActivityViewModel);
            return socialActivityViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final StockDetailHostViewModel m() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = this.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(StockDetailHostViewModel.class), new o(schedulerProvider, compositeDisposable, userRepository, maintenanceConfigManager, 3));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockDetailHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockDetailHostViewModel.class, "<this>", StockDetailHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockDetailHostViewModel stockDetailHostViewModel = (StockDetailHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockDetailHostViewModel);
            return stockDetailHostViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final StockGyanGroupsViewModel n() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        StockRepository stockRepository = this.f14246a.l();
        g.i(stockRepository);
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = this.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(StockGyanGroupsViewModel.class), new r(schedulerProvider, compositeDisposable, stockRepository, userRepository, maintenanceConfigManager, 1));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockGyanGroupsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockGyanGroupsViewModel.class, "<this>", StockGyanGroupsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockGyanGroupsViewModel stockGyanGroupsViewModel = (StockGyanGroupsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockGyanGroupsViewModel);
            return stockGyanGroupsViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final StockListHostViewModel o() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = this.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(StockListHostViewModel.class), new o(schedulerProvider, compositeDisposable, userRepository, maintenanceConfigManager, 4));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockListHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockListHostViewModel.class, "<this>", StockListHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockListHostViewModel stockListHostViewModel = (StockListHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockListHostViewModel);
            return stockListHostViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final StockSharedViewModel p() {
        v vVar = (v) this.f14247b;
        kq.e k10 = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(this.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockSharedViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 16));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockSharedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockSharedViewModel.class, "<this>", StockSharedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockSharedViewModel stockSharedViewModel = (StockSharedViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockSharedViewModel);
            return stockSharedViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final StockSortViewModel q() {
        f0 f0Var = (f0) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(StockSortViewModel.class), new b0(schedulerProvider, compositeDisposable, 15));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, StockSortViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockSortViewModel.class, "<this>", StockSortViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockSortViewModel stockSortViewModel = (StockSortViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockSortViewModel);
            return stockSortViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final SubscribeToAccessBottomSheetViewModel r() {
        f0 f0Var = (f0) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(a0.a(SubscribeToAccessBottomSheetViewModel.class), new b0(schedulerProvider, compositeDisposable, 17));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, SubscribeToAccessBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscribeToAccessBottomSheetViewModel.class, "<this>", SubscribeToAccessBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SubscribeToAccessBottomSheetViewModel subscribeToAccessBottomSheetViewModel = (SubscribeToAccessBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(subscribeToAccessBottomSheetViewModel);
            return subscribeToAccessBottomSheetViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final UserProfileViewModel s() {
        v vVar = (v) this.f14247b;
        kq.e schedulerProvider = this.f14246a.k();
        ct.a compositeDisposable = this.f14246a.c();
        UserRepository userRepository = this.f14246a.m();
        g.i(userRepository);
        FollowerRepository followerRepository = this.f14246a.f();
        g.i(followerRepository);
        ChatRepository chatRepository = this.f14246a.b();
        g.i(chatRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        ca.c factory = new ca.c(a0.a(UserProfileViewModel.class), new u(schedulerProvider, compositeDisposable, userRepository, followerRepository, chatRepository, 2));
        gd.b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, UserProfileViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UserProfileViewModel.class, "<this>", UserProfileViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UserProfileViewModel userProfileViewModel = (UserProfileViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(userProfileViewModel);
            return userProfileViewModel;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
