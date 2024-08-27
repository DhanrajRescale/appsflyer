package td;

import android.view.View;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoV2Fragment f35951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(GroupInfoV2Fragment groupInfoV2Fragment, int i10) {
        super(2);
        this.f35950a = i10;
        this.f35951b = groupInfoV2Fragment;
    }

    public final void a(GroupMember member, View view) {
        int i10 = this.f35950a;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35951b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(view, "view");
                GroupInfoV2Fragment.H(groupInfoV2Fragment, member, view, e0.f35864a);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(view, "view");
                GroupInfoV2Fragment.H(groupInfoV2Fragment, member, view, e0.f35865b);
                return;
            default:
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(view, "view");
                GroupInfoV2Fragment.H(groupInfoV2Fragment, member, view, e0.f35866c);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f35950a) {
            case 0:
                a((GroupMember) obj, (View) obj2);
                return Unit.f23355a;
            case 1:
                a((GroupMember) obj, (View) obj2);
                return Unit.f23355a;
            default:
                a((GroupMember) obj, (View) obj2);
                return Unit.f23355a;
        }
    }
}
