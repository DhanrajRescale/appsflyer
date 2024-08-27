package he;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import ba.kn;
import com.assetgro.stockgro.data.enums.ChatStates;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.google.android.material.tabs.TabLayout;
import iu.k;
import kj.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i10) {
        super(1);
        this.f18298a = i10;
        this.f18299b = eVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f18298a;
        e eVar = this.f18299b;
        switch (i10) {
            case 3:
                Intrinsics.c(bool);
                eVar.f18304i = bool.booleanValue();
                return;
            case 4:
                Intrinsics.c(bool);
                eVar.f18305j = bool.booleanValue();
                return;
            default:
                Intrinsics.c(bool);
                eVar.f18306k = bool.booleanValue();
                return;
        }
    }

    public final void d(j jVar) {
        int i10 = this.f18298a;
        e eVar = this.f18299b;
        switch (i10) {
            case 0:
                ((kn) eVar.q()).f5269s.f6069t.f(true, true, true);
                return;
            case 8:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    Bundle arguments = eVar.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("IS_HOME_FEED_ENABLED", ((SocialChatListViewModel) eVar.r()).F);
                    }
                    Bundle arguments2 = eVar.getArguments();
                    if (arguments2 != null) {
                        arguments2.putBoolean("IS_MAINTENANCE_ON", booleanValue);
                    }
                    ViewPager2 viewPager2 = ((kn) eVar.q()).f5269s.f6075z;
                    g gVar = eVar.f18307l;
                    if (gVar != null) {
                        viewPager2.setAdapter(gVar);
                        g gVar2 = eVar.f18307l;
                        if (gVar2 != null) {
                            gVar2.f18313n = booleanValue;
                            gVar2.d();
                            eVar.K().f9592w.postValue(Boolean.valueOf(!booleanValue));
                            ((SocialChatListViewModel) eVar.r()).H = booleanValue;
                            return;
                        }
                        Intrinsics.k("socialTabAdapter");
                        throw null;
                    }
                    Intrinsics.k("socialTabAdapter");
                    throw null;
                }
                return;
            case 9:
                Boolean bool2 = (Boolean) jVar.a();
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    Bundle arguments3 = eVar.getArguments();
                    if (arguments3 != null) {
                        arguments3.putBoolean("IS_HOME_FEED_ENABLED", ((SocialChatListViewModel) eVar.r()).F);
                    }
                    Bundle arguments4 = eVar.getArguments();
                    if (arguments4 != null) {
                        arguments4.putBoolean("IS_FEED_MAINTENANCE_ON", booleanValue2);
                    }
                    ViewPager2 viewPager22 = ((kn) eVar.q()).f5269s.f6075z;
                    g gVar3 = eVar.f18307l;
                    if (gVar3 != null) {
                        viewPager22.setAdapter(gVar3);
                        g gVar4 = eVar.f18307l;
                        if (gVar4 != null) {
                            gVar4.f18314o = booleanValue2;
                            gVar4.e(0);
                            return;
                        } else {
                            Intrinsics.k("socialTabAdapter");
                            throw null;
                        }
                    }
                    Intrinsics.k("socialTabAdapter");
                    throw null;
                }
                return;
            default:
                Boolean bool3 = (Boolean) jVar.a();
                if (bool3 != null) {
                    boolean booleanValue3 = bool3.booleanValue();
                    Bundle arguments5 = eVar.getArguments();
                    if (arguments5 != null) {
                        arguments5.putBoolean("IS_HOME_FEED_ENABLED", ((SocialChatListViewModel) eVar.r()).F);
                    }
                    Bundle arguments6 = eVar.getArguments();
                    if (arguments6 != null) {
                        arguments6.putBoolean("IS_CHAT_MAINTENANCE_ON", booleanValue3);
                    }
                    ViewPager2 viewPager23 = ((kn) eVar.q()).f5269s.f6075z;
                    g gVar5 = eVar.f18307l;
                    if (gVar5 != null) {
                        viewPager23.setAdapter(gVar5);
                        g gVar6 = eVar.f18307l;
                        if (gVar6 != null) {
                            gVar6.f18315p = booleanValue3;
                            gVar6.e(1);
                            gVar6.e(2);
                            ((SocialChatListViewModel) eVar.r()).H = booleanValue3;
                            return;
                        }
                        Intrinsics.k("socialTabAdapter");
                        throw null;
                    }
                    Intrinsics.k("socialTabAdapter");
                    throw null;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = this.f18298a;
        TextView textView = null;
        e eVar = this.f18299b;
        switch (i13) {
            case 0:
                d((j) obj);
                return Unit.f23355a;
            case 1:
                Integer num = (Integer) obj;
                Intrinsics.c(num);
                int intValue = num.intValue();
                int i14 = e.f18301m;
                View actionView = ((kn) eVar.q()).f5274x.getMenu().findItem(R.id.menu_item_notifications).getActionView();
                if (actionView != null) {
                    textView = (TextView) actionView.findViewById(R.id.cart_badge_notification);
                }
                if (textView != null) {
                    kj.f.u(textView, intValue);
                }
                return Unit.f23355a;
            case 2:
                Pair pair = (Pair) obj;
                eVar.K().K = ((Boolean) pair.f23354b).booleanValue();
                kn knVar = (kn) eVar.q();
                Boolean bool = (Boolean) pair.f23354b;
                int i15 = 0;
                if (bool.booleanValue()) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                knVar.f5275y.setVisibility(i10);
                kn knVar2 = (kn) eVar.q();
                if (bool.booleanValue()) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                knVar2.f5273w.setVisibility(i11);
                TabLayout tabLayout = ((kn) eVar.q()).f5269s.A;
                if (bool.booleanValue()) {
                    i15 = 8;
                }
                tabLayout.setVisibility(i15);
                eVar.K().f9592w.postValue(Boolean.valueOf(!bool.booleanValue()));
                UserChatGroup userChatGroup = (UserChatGroup) pair.f23353a;
                if (userChatGroup != null) {
                    if (userChatGroup.getIsMuted()) {
                        ((kn) eVar.q()).f5270t.setImageResource(R.drawable.ic_chat_option_unmute);
                    } else {
                        ((kn) eVar.q()).f5270t.setImageResource(R.drawable.ic_chat_option_mute);
                    }
                    if (userChatGroup.getIsPinned()) {
                        ((kn) eVar.q()).f5271u.setImageResource(R.drawable.ic_chat_option_unpin);
                    } else {
                        ((kn) eVar.q()).f5271u.setImageResource(R.drawable.ic_chat_option_pin);
                    }
                }
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            case 6:
                if (((String) obj).equals("SocialFragment")) {
                    int i16 = e.f18301m;
                    eVar.J();
                }
                return Unit.f23355a;
            case 7:
                ChatStates chatStates = (ChatStates) obj;
                if (chatStates == null) {
                    i12 = -1;
                } else {
                    i12 = d.f18300a[chatStates.ordinal()];
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i17 = e.f18301m;
                        eVar.J();
                    }
                } else {
                    eVar.L().f9366n.postValue(new Pair(null, Boolean.FALSE));
                    eVar.L().f9367o.postValue(f.f18308a);
                }
                return Unit.f23355a;
            case 8:
                d((j) obj);
                return Unit.f23355a;
            case 9:
                d((j) obj);
                return Unit.f23355a;
            default:
                d((j) obj);
                return Unit.f23355a;
        }
    }
}
