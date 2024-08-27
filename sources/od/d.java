package od;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j0;
import androidx.lifecycle.u0;
import ba.ug;
import com.assetgro.stockgro.data.model.DiscoverCategory;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.z;
import yk.g;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f29967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(1);
        this.f29966a = i10;
        this.f29967b = eVar;
    }

    public final void a(Boolean bool) {
        int i10;
        int i11 = this.f29966a;
        e eVar = this.f29967b;
        switch (i11) {
            case 0:
                ug ugVar = (ug) eVar.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                ugVar.A.setVisibility(i10);
                return;
            case 3:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    j0 context = eVar.getActivity();
                    if (context != null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter("Group created", "text");
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c("Group created", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        return;
                    }
                    return;
                }
                j0 context2 = eVar.getActivity();
                if (context2 != null) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter("Error while creating group", "text");
                    Toast makeText2 = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService2 = context2.getSystemService("layout_inflater");
                    Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c("Error while creating group", (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    return;
                }
                return;
            default:
                Group group = (Group) ((GroupCreateViewModel) eVar.r()).f9122u.getValue();
                if (group != null) {
                    Intent intent = new Intent(eVar.requireActivity(), (Class<?>) GroupDetailHostActivity.class);
                    intent.putExtra("GROUP_CHAT_ID", group.getGroupId());
                    eVar.startActivity(intent);
                    j0 activity = eVar.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f29966a;
        e eVar = this.f29967b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                String str = (String) obj;
                Intrinsics.c(str);
                eVar.G(str);
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                ug ugVar = (ug) eVar.q();
                Intrinsics.c(list);
                ArrayList arrayList = new ArrayList(z.k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DiscoverCategory) it.next()).getCategoryName());
                }
                ugVar.f6295s.setDropDownMenu(arrayList);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                Group group = (Group) obj;
                Intrinsics.c(group);
                int i11 = e.f29968k;
                GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) eVar.r();
                String groupId = group.getGroupId();
                groupCreateViewModel.f9084g.postValue(Boolean.TRUE);
                g.H(u0.f(groupCreateViewModel), null, null, new md.c(groupCreateViewModel, groupId, "Admin", null), 3);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
