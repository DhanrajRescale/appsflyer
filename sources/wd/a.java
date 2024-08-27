package wd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import okhttp3.HttpUrl;
import rd.q;
import vt.z;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddMembersHostComposeActivity f39012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(AddMembersHostComposeActivity addMembersHostComposeActivity, int i10) {
        super(1);
        this.f39011a = i10;
        this.f39012b = addMembersHostComposeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39011a;
        AddMembersHostComposeActivity context = this.f39012b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    context.setResult(-1);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("Members added", "text");
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    ((TextView) inflate.findViewById(R.id.message)).setText("Members added".toString());
                    makeText.setView(inflate);
                    makeText.show();
                    context.finish();
                }
                return Unit.f23355a;
            default:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AddMembersViewModel addMembersViewModel = (AddMembersViewModel) context.x();
                ArrayList selectedMembers = new ArrayList(z.k(it));
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    selectedMembers.add(((CreateGroupUser) it2.next()).getUserId());
                }
                Intrinsics.checkNotNullParameter(selectedMembers, "selectedMembers");
                addMembersViewModel.f9084g.postValue(Boolean.TRUE);
                h c10 = addMembersViewModel.f9264n.addMembersToGroup(addMembersViewModel.f9267q, selectedMembers, "User").c(((kq.e) addMembersViewModel.f9079b).J());
                jt.d dVar = new jt.d(new q(29, new vd.b(addMembersViewModel, 0)), new vd.a(0, new vd.b(addMembersViewModel, 1)));
                c10.a(dVar);
                addMembersViewModel.f9080c.c(dVar);
                return Unit.f23355a;
        }
    }
}
