package ee;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.i0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.MembershipStatus;
import com.assetgro.stockgro.data.model.UserGroupInfo;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import ej.t0;
import iu.k;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.y;
import z9.i;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailActivity f15382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GroupDetailActivity groupDetailActivity, int i10) {
        super(1);
        this.f15381a = i10;
        this.f15382b = groupDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        String status;
        boolean z10;
        Class cls;
        int i10 = this.f15381a;
        GroupDetailActivity context = this.f15382b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = context.f17255c;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = context.f17255c) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            case 1:
                int i11 = GroupDetailActivity.f9324n;
                ((i0) context.w()).f4999x.setVisibility(0);
                ((i0) context.w()).f4999x.setEnabled(true);
                MembershipStatus membershipStatus = ((Group) obj).getMembershipStatus();
                if (membershipStatus != null && (status = membershipStatus.getStatus()) != null) {
                    if (Intrinsics.a(status, "Joined")) {
                        GroupDetailActivity.K(context);
                    } else {
                        ((i0) context.w()).f4999x.setVisibility(0);
                    }
                }
                return Unit.f23355a;
            case 2:
                String status2 = ((UserGroupInfo) obj).getStatus();
                if (status2 != null) {
                    if (Intrinsics.a(status2, "Joined")) {
                        GroupDetailActivity.K(context);
                    } else {
                        ((i0) context.w()).f4999x.setVisibility(0);
                    }
                }
                return Unit.f23355a;
            case 3:
                int i12 = t0.f15547i;
                t0 e10 = ni.g.e((String) obj, new AnalyticEvent("app_social_group_joining_sub_upgrade", null, 2, null));
                e10.setCancelable(false);
                e10.show(context.getSupportFragmentManager(), "SubscriptionUpgradePlanBottomSheetDialogFragment");
                return Unit.f23355a;
            case 4:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    ((i0) context.w()).f4994s.setVisibility(0);
                    List list2 = (List) ((GroupDetailViewModel) context.x()).f9339y.getValue();
                    if (list2 != null) {
                        int i13 = 0;
                        for (Object obj2 : list2) {
                            int i14 = i13 + 1;
                            if (i13 >= 0) {
                                GroupMember groupMember = (GroupMember) obj2;
                                if (y.f(list2) != i13) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                groupMember.setShowDivider(z10);
                                i13 = i14;
                            } else {
                                y.j();
                                throw null;
                            }
                        }
                    }
                    vd.d dVar = context.f9325k;
                    if (dVar != null) {
                        dVar.u(list);
                    } else {
                        Intrinsics.k("groupMemberAdapter");
                        throw null;
                    }
                } else {
                    ((i0) context.w()).f4994s.setVisibility(8);
                }
                return Unit.f23355a;
            case 5:
                if (((Unit) ((j) obj).a()) != null) {
                    int i15 = GroupDetailActivity.f9324n;
                    context.getClass();
                    Intent intent = new Intent(context, (Class<?>) MaintenanceWindowActivity.class);
                    intent.putExtra("DATA", qf.b.f31929d);
                    intent.putExtra("SHOW_TOOLBAR", true);
                    intent.putExtra("TOOLBAR_TITLE", context.getString(R.string.text_social_lowercase));
                    context.startActivity(intent);
                    context.finish();
                }
                return Unit.f23355a;
            case 6:
                String text = ((i) obj).a(context);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            default:
                GroupMember it = (GroupMember) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i16 = GroupDetailActivity.f9324n;
                context.getClass();
                if (it.getIsExpert()) {
                    cls = RiaProfileActivity.class;
                } else {
                    cls = UserProfileActivity.class;
                }
                Intent intent2 = new Intent(context, (Class<?>) cls);
                intent2.putExtra("USER_IDENTIFIER", it.getUserId());
                intent2.putExtra("USER_NAME", it.getMemberName());
                context.startActivity(intent2);
                return Unit.f23355a;
        }
    }
}
