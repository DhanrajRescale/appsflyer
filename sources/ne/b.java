package ne;

import com.assetgro.stockgro.data.model.PrivacyLayerUserGroup;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f28628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(hu.c cVar, int i10) {
        super(1);
        this.f28627a = i10;
        this.f28628b = cVar;
    }

    public final void a(PrivacyLayerUserGroup group) {
        int i10 = this.f28627a;
        hu.c cVar = this.f28628b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(group, "group");
                cVar.b(group.getGroupId(), group.getFriendName(), a.f28624a);
                return;
            default:
                Intrinsics.checkNotNullParameter(group, "group");
                cVar.b(group.getGroupId(), group.getName(), a.f28625b);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f28627a) {
            case 0:
                a((PrivacyLayerUserGroup) obj);
                return Unit.f23355a;
            default:
                a((PrivacyLayerUserGroup) obj);
                return Unit.f23355a;
        }
    }
}
