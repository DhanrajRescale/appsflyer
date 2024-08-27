package be;

import android.content.Intent;
import androidx.lifecycle.u0;
import ba.gn;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import id.x;
import iu.k;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yk.g;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i10) {
        super(1);
        this.f6952a = i10;
        this.f6953b = cVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f6952a;
        c cVar = this.f6953b;
        switch (i10) {
            case 0:
                gn gnVar = (gn) cVar.q();
                Intrinsics.c(bool);
                gnVar.f4833v.setRefreshing(bool.booleanValue());
                return;
            case 4:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((SocialChatListViewModel) cVar.r()).l();
                    SocialChatListViewModel socialChatListViewModel = (SocialChatListViewModel) cVar.r();
                    if (!Intrinsics.a(socialChatListViewModel.C, "Rogue")) {
                        g.H(u0.f(socialChatListViewModel), null, null, new x(socialChatListViewModel, null), 3);
                        return;
                    }
                    return;
                }
                return;
            default:
                MainSharedViewModel mainSharedViewModel = cVar.f6957g;
                if (mainSharedViewModel != null) {
                    mainSharedViewModel.f9595z.postValue(new j(Unit.f23355a));
                    return;
                } else {
                    Intrinsics.k("mainSharedViewModel");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f6952a;
        c cVar = this.f6953b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                Intrinsics.c(list);
                if (!list.isEmpty()) {
                    ((gn) cVar.q()).f4831t.setVisibility(0);
                    ce.b bVar = cVar.f6959i;
                    if (bVar != null) {
                        bVar.u(list);
                    } else {
                        Intrinsics.k("discoverCategoryAdapter");
                        throw null;
                    }
                } else {
                    ((gn) cVar.q()).f4831t.setVisibility(8);
                }
                return Unit.f23355a;
            case 2:
                Group chatGroup = (Group) obj;
                Intrinsics.c(chatGroup);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(chatGroup, "chatGroup");
                Intent intent = new Intent(cVar.requireActivity(), (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", chatGroup.getGroupId());
                cVar.startActivity(intent);
                return Unit.f23355a;
            case 3:
                String str = (String) obj;
                Intrinsics.c(str);
                int i11 = c.f6956j;
                cVar.getClass();
                Intent intent2 = new Intent(cVar.requireActivity(), (Class<?>) GroupDetailActivity.class);
                intent2.putExtra("GROUP_CHAT_ID", str);
                cVar.startActivity(intent2);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                SocialSharedViewModel socialSharedViewModel = cVar.f6958h;
                if (socialSharedViewModel != null) {
                    if (Intrinsics.a(socialSharedViewModel.f9368p.getValue(), "DiscoverFragment")) {
                        ((gn) cVar.q()).f4832u.v(0);
                    }
                    return Unit.f23355a;
                }
                Intrinsics.k("socialSharedViewModel");
                throw null;
        }
    }
}
