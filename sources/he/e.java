package he;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d1;
import androidx.fragment.app.j0;
import androidx.lifecycle.o;
import androidx.viewpager2.widget.ViewPager2;
import ba.kn;
import ba.se;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.SupportGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListActivity;
import com.assetgro.stockgro.ui.chat.create.GroupCreateHostActivity;
import com.assetgro.stockgro.ui.chat.create_compose.screens.create_group.GroupCreateHostActivityCompose;
import com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel;
import com.assetgro.stockgro.ui.chat.members.contacts.AddFriendsHostActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.m;
import id.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import nt.h;
import r3.k;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhe/e;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/SocialChatListViewModel;", "Lba/kn;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends m<SocialChatListViewModel, kn> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f18301m = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f18302g;

    /* renamed from: h, reason: collision with root package name */
    public SocialSharedViewModel f18303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18304i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18305j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18306k;

    /* renamed from: l, reason: collision with root package name */
    public g f18307l;

    public static final void H(e eVar, int i10, boolean z10) {
        int i11 = 8;
        if (((SocialChatListViewModel) eVar.r()).H) {
            ((kn) eVar.q()).f5269s.f6074y.setVisibility(8);
            return;
        }
        boolean z11 = true;
        if ((!z10 || i10 != 2) && (z10 || i10 != 1)) {
            z11 = false;
        }
        FloatingActionMenu floatingActionMenu = ((kn) eVar.q()).f5269s.f6074y;
        if (z11) {
            i11 = 0;
        }
        floatingActionMenu.setVisibility(i11);
    }

    public static final void I(e eVar, int i10, boolean z10) {
        String eventName = "app_social_groupstab_tapped";
        String str = "social-discover";
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    Intrinsics.checkNotNullParameter("app_social_chatstab_tapped", "eventName");
                    eVar.y(new AnalyticEvent("app_social_chatstab_tapped", null, 2, null));
                    eVar.s().screenNavigated("social-chat");
                    return;
                }
                return;
            }
            if (!z10) {
                str = "social-chat";
            }
            eVar.s().screenNavigated(str);
            if (!z10) {
                eventName = "app_social_chatstab_tapped";
            }
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            eVar.y(new AnalyticEvent(eventName, null, 2, null));
            return;
        }
        if (z10) {
            str = "social-home-feed";
        }
        eVar.s().screenNavigated(str);
        if (z10) {
            eventName = "app_social_feedtab_tapped";
        }
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        eVar.y(new AnalyticEvent(eventName, null, 2, null));
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_social_host;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        L().f9366n.observe(this, new id.a(23, new c(this, 2)));
        SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) r();
        socialChatListViewModel.O.observe(this, new id.a(23, new c(this, 3)));
        SocialChatListViewModel socialChatListViewModel2 = (SocialChatListViewModel) r();
        socialChatListViewModel2.N.observe(this, new id.a(23, new c(this, 4)));
        SocialChatListViewModel socialChatListViewModel3 = (SocialChatListViewModel) r();
        socialChatListViewModel3.P.observe(this, new id.a(23, new c(this, 5)));
        K().f9593x.observe(this, new id.a(23, new c(this, 6)));
        K().E.observe(this, new id.a(23, new c(this, 7)));
        ((SocialChatListViewModel) r()).f9103z.observe(this, new id.a(23, new c(this, 8)));
        ((SocialChatListViewModel) r()).A.observe(this, new id.a(23, new c(this, 9)));
        ((SocialChatListViewModel) r()).B.observe(this, new id.a(23, new c(this, 10)));
        K().B.observe(this, new id.a(23, new c(this, 0)));
        K().P.observe(this, new id.a(23, new c(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(view, "view");
        final int i10 = 1;
        ((kn) q()).f5269s.f6075z.setUserInputEnabled(true);
        setHasOptionsMenu(true);
        kn knVar = (kn) q();
        String string = getString(R.string.text_social_lowercase);
        Toolbar toolbar = knVar.f5274x;
        toolbar.setTitle(string);
        p(toolbar);
        toolbar.n(R.menu.menu_social_fragment);
        final int i11 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: he.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f18296b;

            {
                this.f18296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Intent intent;
                Intent intent2;
                int i12 = i11;
                e this$0 = this.f18296b;
                switch (i12) {
                    case 0:
                        int i13 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        return;
                    case 1:
                        int i14 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18309b);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 2:
                        int i15 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18310c);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 3:
                        int i16 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        this$0.L().f9367o.postValue(f.f18308a);
                        return;
                    case 4:
                        int i17 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar = DeactivatedMembersListActivity.f9104l;
                        Context context = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                        switch (bVar.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        this$0.startActivity(intent);
                        return;
                    case 5:
                        int i18 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                        String d10 = a3.a.d("toString(...)");
                        ChatRepository chatRepository = socialChatListViewModel.f9091n;
                        SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                        socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                        h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                        c10.a(dVar);
                        socialChatListViewModel.f9080c.c(dVar);
                        this$0.J();
                        return;
                    case 6:
                        int i19 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i20 = AddFriendsHostActivity.f9419k;
                        Context context2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                        this$0.J();
                        return;
                    case 7:
                        int i21 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                        Context context3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                        switch (bVar2.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                        this$0.startActivity(intent2);
                        this$0.J();
                        return;
                    case 8:
                        int i22 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i23 = GroupCreateHostActivity.f9114k;
                        Context context4 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context4, "context");
                        Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                        intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                        intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                        this$0.startActivity(intent3);
                        this$0.J();
                        return;
                    case 9:
                        int i24 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i25 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().j();
                        return;
                }
            }
        });
        Menu menu = toolbar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        View actionView = menu.findItem(R.id.menu_item_search).getActionView();
        if (actionView != null && (constraintLayout2 = (ConstraintLayout) actionView.findViewById(R.id.menu_search_layout)) != null) {
            final int i12 = 9;
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i12;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i13 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i14 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i15 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i16 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i17 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i18 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i19 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i20 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
        }
        View actionView2 = menu.findItem(R.id.menu_item_notifications).getActionView();
        if (actionView2 != null && (constraintLayout = (ConstraintLayout) actionView2.findViewById(R.id.menu_notification_layout)) != null) {
            final int i13 = 10;
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i13;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i132 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i14 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i15 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i16 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i17 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i18 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i19 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i20 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
        }
        ((kn) q()).f5274x.setOnMenuItemClickListener(new b(this));
        ((kn) q()).f5270t.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f18296b;

            {
                this.f18296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Intent intent;
                Intent intent2;
                int i122 = i10;
                e this$0 = this.f18296b;
                switch (i122) {
                    case 0:
                        int i132 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        return;
                    case 1:
                        int i14 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18309b);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 2:
                        int i15 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18310c);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 3:
                        int i16 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        this$0.L().f9367o.postValue(f.f18308a);
                        return;
                    case 4:
                        int i17 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar = DeactivatedMembersListActivity.f9104l;
                        Context context = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                        switch (bVar.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        this$0.startActivity(intent);
                        return;
                    case 5:
                        int i18 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                        String d10 = a3.a.d("toString(...)");
                        ChatRepository chatRepository = socialChatListViewModel.f9091n;
                        SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                        socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                        h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                        c10.a(dVar);
                        socialChatListViewModel.f9080c.c(dVar);
                        this$0.J();
                        return;
                    case 6:
                        int i19 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i20 = AddFriendsHostActivity.f9419k;
                        Context context2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                        this$0.J();
                        return;
                    case 7:
                        int i21 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                        Context context3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                        switch (bVar2.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                        this$0.startActivity(intent2);
                        this$0.J();
                        return;
                    case 8:
                        int i22 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i23 = GroupCreateHostActivity.f9114k;
                        Context context4 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context4, "context");
                        Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                        intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                        intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                        this$0.startActivity(intent3);
                        this$0.J();
                        return;
                    case 9:
                        int i24 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i25 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().j();
                        return;
                }
            }
        });
        final int i14 = 2;
        ((kn) q()).f5271u.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f18296b;

            {
                this.f18296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Intent intent;
                Intent intent2;
                int i122 = i14;
                e this$0 = this.f18296b;
                switch (i122) {
                    case 0:
                        int i132 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        return;
                    case 1:
                        int i142 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18309b);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 2:
                        int i15 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18310c);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 3:
                        int i16 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        this$0.L().f9367o.postValue(f.f18308a);
                        return;
                    case 4:
                        int i17 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar = DeactivatedMembersListActivity.f9104l;
                        Context context = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                        switch (bVar.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        this$0.startActivity(intent);
                        return;
                    case 5:
                        int i18 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                        String d10 = a3.a.d("toString(...)");
                        ChatRepository chatRepository = socialChatListViewModel.f9091n;
                        SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                        socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                        h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                        c10.a(dVar);
                        socialChatListViewModel.f9080c.c(dVar);
                        this$0.J();
                        return;
                    case 6:
                        int i19 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i20 = AddFriendsHostActivity.f9419k;
                        Context context2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                        this$0.J();
                        return;
                    case 7:
                        int i21 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                        Context context3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                        switch (bVar2.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                        this$0.startActivity(intent2);
                        this$0.J();
                        return;
                    case 8:
                        int i22 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i23 = GroupCreateHostActivity.f9114k;
                        Context context4 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context4, "context");
                        Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                        intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                        intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                        this$0.startActivity(intent3);
                        this$0.J();
                        return;
                    case 9:
                        int i24 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i25 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().j();
                        return;
                }
            }
        });
        final int i15 = 3;
        ((kn) q()).f5272v.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: he.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f18296b;

            {
                this.f18296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Intent intent;
                Intent intent2;
                int i122 = i15;
                e this$0 = this.f18296b;
                switch (i122) {
                    case 0:
                        int i132 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().f9587r.postValue(Boolean.TRUE);
                        return;
                    case 1:
                        int i142 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18309b);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 2:
                        int i152 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9367o.postValue(f.f18310c);
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        return;
                    case 3:
                        int i16 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                        this$0.L().f9367o.postValue(f.f18308a);
                        return;
                    case 4:
                        int i17 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar = DeactivatedMembersListActivity.f9104l;
                        Context context = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                        switch (bVar.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context, "context");
                                intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        this$0.startActivity(intent);
                        return;
                    case 5:
                        int i18 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                        String d10 = a3.a.d("toString(...)");
                        ChatRepository chatRepository = socialChatListViewModel.f9091n;
                        SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                        socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                        h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                        c10.a(dVar);
                        socialChatListViewModel.f9080c.c(dVar);
                        this$0.J();
                        return;
                    case 6:
                        int i19 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i20 = AddFriendsHostActivity.f9419k;
                        Context context2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                        this$0.J();
                        return;
                    case 7:
                        int i21 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                        Context context3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                        switch (bVar2.f34435a) {
                            case 17:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(context3, "context");
                                intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                break;
                        }
                        intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                        this$0.startActivity(intent2);
                        this$0.J();
                        return;
                    case 8:
                        int i22 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i23 = GroupCreateHostActivity.f9114k;
                        Context context4 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                        Intrinsics.checkNotNullParameter(context4, "context");
                        Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                        intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                        intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                        this$0.startActivity(intent3);
                        this$0.J();
                        return;
                    case 9:
                        int i24 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                            return;
                        }
                        return;
                    default:
                        int i25 = e.f18301m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K().j();
                        return;
                }
            }
        });
        if (((SocialChatListViewModel) r()).f9093p.b(qf.b.f31929d)) {
            K().f9592w.postValue(Boolean.FALSE);
        } else {
            K().f9592w.postValue(Boolean.TRUE);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("IS_HOME_FEED_ENABLED", ((SocialChatListViewModel) r()).F);
        }
        d1 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f18307l = new g(childFragmentManager, lifecycle, getArguments());
        ViewPager2 viewPager2 = ((kn) q()).f5269s.f6075z;
        g gVar = this.f18307l;
        if (gVar != null) {
            viewPager2.setAdapter(gVar);
            new n(((kn) q()).f5269s.A, ((kn) q()).f5269s.f6075z, new b(this)).a();
            final int i16 = 4;
            ((kn) q()).f5269s.A.a(new nc.c(this, i16));
            ((kn) q()).f5269s.f6075z.c(((SocialChatListViewModel) r()).G, false);
            ((kn) q()).f5269s.f6075z.setUserInputEnabled(false);
            SocialSharedViewModel L = L();
            if (((SocialChatListViewModel) r()).F) {
                str = "SocialHomeFeedComposeFragment";
            } else {
                str = "DiscoverFragment";
            }
            L.f9368p.postValue(str);
            ((kn) q()).f5269s.f6073x.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i16;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i132 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i142 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i152 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i162 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i17 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i18 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i19 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i20 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
            ((kn) q()).f5269s.f6074y.setClosedOnTouchOutside(true);
            se seVar = ((kn) q()).f5269s;
            final int i17 = 6;
            seVar.f6074y.setOnMenuButtonClickListener(new bb.a(i17, seVar, this));
            final int i18 = 5;
            FloatingActionButton deactivatedMembersFab = seVar.f6073x;
            Intrinsics.checkNotNullExpressionValue(deactivatedMembersFab, "deactivatedMembersFab");
            FloatingActionButton contactStockgroFab = seVar.f6070u;
            Intrinsics.checkNotNullExpressionValue(contactStockgroFab, "contactStockgroFab");
            FloatingActionButton addFriendFab = seVar.f6068s;
            Intrinsics.checkNotNullExpressionValue(addFriendFab, "addFriendFab");
            FloatingActionButton createPrivateGroupFab = seVar.f6071v;
            Intrinsics.checkNotNullExpressionValue(createPrivateGroupFab, "createPrivateGroupFab");
            FloatingActionButton createSocialGroupFab = seVar.f6072w;
            Intrinsics.checkNotNullExpressionValue(createSocialGroupFab, "createSocialGroupFab");
            FloatingActionButton[] floatingActionButtonArr = {deactivatedMembersFab, contactStockgroFab, addFriendFab, createPrivateGroupFab, createSocialGroupFab};
            while (i11 < 5) {
                floatingActionButtonArr[i11].setLabelTextColor(k.getColor(requireContext(), R.color.black));
                i11++;
            }
            ((kn) q()).f5269s.f6070u.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i18;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i132 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i142 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i152 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i162 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i172 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i182 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i19 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i20 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
            ((kn) q()).f5269s.f6068s.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i17;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i132 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i142 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i152 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i162 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i172 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i182 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i19 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i20 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
            final int i19 = 7;
            ((kn) q()).f5269s.f6071v.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i19;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i132 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i142 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i152 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i162 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i172 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i182 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i192 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i20 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
            final int i20 = 8;
            ((kn) q()).f5269s.f6072w.setOnClickListener(new View.OnClickListener(this) { // from class: he.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f18296b;

                {
                    this.f18296b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent;
                    Intent intent2;
                    int i122 = i20;
                    e this$0 = this.f18296b;
                    switch (i122) {
                        case 0:
                            int i132 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().f9587r.postValue(Boolean.TRUE);
                            return;
                        case 1:
                            int i142 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18309b);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 2:
                            int i152 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9367o.postValue(f.f18310c);
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            return;
                        case 3:
                            int i162 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                            this$0.L().f9367o.postValue(f.f18308a);
                            return;
                        case 4:
                            int i172 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar = DeactivatedMembersListActivity.f9104l;
                            Context context = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            switch (bVar.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    intent = new Intent(context, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            this$0.startActivity(intent);
                            return;
                        case 5:
                            int i182 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) this$0.r();
                            String d10 = a3.a.d("toString(...)");
                            ChatRepository chatRepository = socialChatListViewModel.f9091n;
                            SupportGroup supportGroup = new SupportGroup(d10, chatRepository.getUserId());
                            socialChatListViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = chatRepository.contactStockgroAdmin(supportGroup).c(((kq.e) socialChatListViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new za.e(26, new i(socialChatListViewModel, 1)), new za.e(27, new i(socialChatListViewModel, 2)));
                            c10.a(dVar);
                            socialChatListViewModel.f9080c.c(dVar);
                            this$0.J();
                            return;
                        case 6:
                            int i192 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i202 = AddFriendsHostActivity.f9419k;
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            this$0.startActivity(new Intent(context2, (Class<?>) AddFriendsHostActivity.class));
                            this$0.J();
                            return;
                        case 7:
                            int i21 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            sb.b bVar2 = GroupCreateHostActivityCompose.f9132k;
                            Context context3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                            switch (bVar2.f34435a) {
                                case 17:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) DeactivatedMembersListActivity.class);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    intent2 = new Intent(context3, (Class<?>) GroupCreateHostActivityCompose.class);
                                    break;
                            }
                            intent2.putExtra("GROUP_TYPE", "GROUP_TYPE_PRIVATE");
                            this$0.startActivity(intent2);
                            this$0.J();
                            return;
                        case 8:
                            int i22 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i23 = GroupCreateHostActivity.f9114k;
                            Context context4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) GroupCreateHostActivity.class);
                            intent3.putExtra("GROUP_TYPE", "GROUP_TYPE_SOCIAL");
                            intent3.putExtra("CHAR_LIMIT", (Parcelable) ((SocialChatListViewModel) this$0.r()).f9100w.getValue());
                            this$0.startActivity(intent3);
                            this$0.J();
                            return;
                        case 9:
                            int i24 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j0 activity = this$0.getActivity();
                            if (activity != null) {
                                activity.startActivity(new Intent(this$0.requireContext(), (Class<?>) SocialAdvancedSearchActivity.class));
                                return;
                            }
                            return;
                        default:
                            int i25 = e.f18301m;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.K().j();
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("socialTabAdapter");
        throw null;
    }

    public final void J() {
        K().J = false;
        ((kn) q()).f5269s.f6074y.a(false);
    }

    public final MainSharedViewModel K() {
        MainSharedViewModel mainSharedViewModel = this.f18302g;
        if (mainSharedViewModel != null) {
            return mainSharedViewModel;
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    public final SocialSharedViewModel L() {
        SocialSharedViewModel socialSharedViewModel = this.f18303h;
        if (socialSharedViewModel != null) {
            return socialSharedViewModel;
        }
        Intrinsics.k("socialSharedViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        J();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.j();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        yk.g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        yk.g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        yk.g.i(h10);
        this.f17287e = h10;
        this.f18302g = fragmentComponent.f();
        this.f18303h = fragmentComponent.k();
    }
}
