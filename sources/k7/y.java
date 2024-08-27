package k7;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.wh;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22623b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f22622a = i10;
        this.f22623b = obj;
    }

    @Override // k7.n1
    public final void a(RecyclerView recyclerView, int i10) {
        Long l10;
        String str;
        switch (this.f22622a) {
            case 2:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                GroupChatFragment groupChatFragment = (GroupChatFragment) this.f22623b;
                LinearLayoutManager linearLayoutManager = groupChatFragment.f9158r;
                if (linearLayoutManager != null) {
                    int R0 = linearLayoutManager.R0();
                    yd.r rVar = groupChatFragment.f9157q;
                    if (rVar != null) {
                        boolean z10 = true;
                        if (R0 == rVar.f41586e.size() - 1) {
                            yd.r rVar2 = groupChatFragment.f9157q;
                            if (rVar2 != null) {
                                ArrayList arrayList = rVar2.f41586e;
                                if (arrayList.size() > 0) {
                                    l10 = Long.valueOf(((ChatMessage) arrayList.get(rVar2.f41586e.size() - 1)).getUpdatedAt());
                                } else {
                                    l10 = null;
                                }
                                if (l10 != null) {
                                    long longValue = l10.longValue();
                                    GroupChatViewModel groupChatViewModel = (GroupChatViewModel) groupChatFragment.r();
                                    if (!groupChatViewModel.K0 && !groupChatViewModel.L0) {
                                        groupChatViewModel.K0 = true;
                                        groupChatViewModel.f9084g.postValue(Boolean.TRUE);
                                        Group group = (Group) groupChatViewModel.D.getValue();
                                        if (group != null) {
                                            str = group.getGroupId();
                                        } else {
                                            str = null;
                                        }
                                        nt.h c10 = groupChatViewModel.f9176n.loadMessages(str, longValue).c(((kq.e) groupChatViewModel.f9079b).J());
                                        jt.d dVar = new jt.d(new id.h(28, new rd.r(groupChatViewModel, 17)), new id.h(29, new rd.r(groupChatViewModel, 18)));
                                        c10.a(dVar);
                                        groupChatViewModel.f9080c.c(dVar);
                                    }
                                }
                            } else {
                                Intrinsics.k("messagesAdapter");
                                throw null;
                            }
                        }
                        LinearLayoutManager linearLayoutManager2 = groupChatFragment.f9158r;
                        if (linearLayoutManager2 != null) {
                            View T0 = linearLayoutManager2.T0(0, linearLayoutManager2.v(), true, false);
                            if (T0 == null || i1.H(T0) <= 1) {
                                z10 = false;
                            }
                            ((wh) groupChatFragment.q()).f6533t.f5169s.setVisibility(el.l.u(z10));
                            return;
                        }
                        Intrinsics.k("linearLayoutManager");
                        throw null;
                    }
                    Intrinsics.k("messagesAdapter");
                    throw null;
                }
                Intrinsics.k("linearLayoutManager");
                throw null;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // k7.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.y.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
